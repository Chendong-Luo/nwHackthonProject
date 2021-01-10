package model;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int floor;
    public static final int MAXFLOOR = 10;
    private int direction;
    private int currentDispatchTarget;
    private int dispatchTargetDirection;
    private List<Integer> reservedTargetFloors;

    public Elevator() {
        floor = 1;
        direction = 0;
        currentDispatchTarget = 0;
        dispatchTargetDirection = 0;
        reservedTargetFloors = new ArrayList<>();
    }

    public Integer goUp() throws InterruptedException {
        if (floor + 1 <= MAXFLOOR) {
            Thread.sleep(4000);
            floor += 1;
        }
        return floor;
    }


    public Integer goDown() throws InterruptedException {
        if (floor - 1 >= 0) {
            Thread.sleep(4000);
            floor -= 1;
        }
        return floor;
    }

    public void reserveFloor(Integer floor) {
        if (!reservedTargetFloors.contains(floor)) {
            reservedTargetFloors.add(floor);
        }
    }

    public int getFloor() {
        return floor;
    }

    public void setFloor(Integer floor) throws InterruptedException {
        if (this.floor >= floor) {
            for(int i = 0; i < this.floor - floor; i++) {
                goUp();
            }
        } else {
            for(int i = 0; i < floor - this.floor; i++) {
                goDown();
            }
        }

    }

    public int getDirection() {
        return direction;
    }

    public void setDirection(Integer direction) {
        this.direction = direction;
    }

    public int getCurrentDispatchTarget() {
        return currentDispatchTarget;
    }

    public void setCurrentDispatchTarget(Integer currentDispatchTarget) {
        this.currentDispatchTarget = currentDispatchTarget;
    }

    public int getDispatchTargetDirection() {
        return dispatchTargetDirection;
    }

    public void setDispatchTargetDirection(Integer dispatchTargetDirection) {
        this.dispatchTargetDirection = dispatchTargetDirection;
    }

    public List<Integer> getReservedTargetFloors() {
        return reservedTargetFloors;
    }
}
