package ui;

import model.Elevator;
import model.Mansion;

import java.util.concurrent.Semaphore;

public class ElevatorSimulator {
    static Mansion mansion;
    static Semaphore semaphore = new Semaphore(1);


    public ElevatorSimulator() {
        mansion = new Mansion();
        runSimulator();

    }

    public void runSimulator() {
        Thread elevator1 = new Thread(new ElevatorThread1());
        Thread elevator2 = new Thread(new ElevatorThread2());
        elevator1.start();
        elevator2.start();
    }

    class ElevatorThread1 implements Runnable {

        @Override
        public void run() {

            while (true) {
                try {
                    semaphore.acquire();
                    if(mansion.getElevator1().getDirection() == 1) {
                        if(!mansion.getRequiringUpwardFloors().isEmpty()) {
                            for(int i = mansion.getElevator1().getFloor() + 1; i <= Elevator.MAXFLOOR; i++) {
                                if(mansion.getRequiringUpwardFloors().contains(i)) {
                                    mansion.getRequiringUpwardFloors().remove(i);
                                    mansion.getElevator1().setCurrentDispatchTarget(i);
                                    break;
                                }
                            }
                        } else {
                            if (!mansion.getRequiringDownwardFloors().isEmpty()) {

                            }

                        }

                    }






                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }



            }
        }
    }

    class ElevatorThread2 implements Runnable {
        @Override
        public void run() {
            while (true) {
                try {
                    semaphore.acquire();




                } catch (InterruptedException e) {
                    e.printStackTrace();
                } finally {
                    semaphore.release();
                }
            }
        }
    }
}
