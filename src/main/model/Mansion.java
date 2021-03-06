package model;

import java.util.ArrayList;
import java.util.List;

public class Mansion {

    private List<Elevator> ElevatorStates = new ArrayList<>();
    private List<Integer> requiringUpwardFloors = new ArrayList<>();
    private List<Integer> requiringDownwardFloors = new ArrayList<>();

    public Mansion() {
        ElevatorStates.add(new Elevator());
        ElevatorStates.add(new Elevator());

    }

    public void setRequiringUpwardFloors(Integer floor) {
        if (!requiringUpwardFloors.contains(floor)) {
            requiringUpwardFloors.add(floor);
        }

    }

    public void setRequiringDownwardFloors(Integer floor) {
        if (!requiringDownwardFloors.contains(floor)) {
            requiringDownwardFloors.add(floor);
        }
    }

    public Elevator getElevator1() {
        return ElevatorStates.get(0);
    }

    public Elevator getElevator2() {
        return ElevatorStates.get(1);
    }

    public List<Integer> getRequiringDownwardFloors() {
        return requiringDownwardFloors;
    }

    public List<Integer> getRequiringUpwardFloors() {
        return requiringUpwardFloors;
    }
}
