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

    public void requireUpwardFloors(Integer floor) {
        if (!requiringUpwardFloors.contains(floor)) {
            requiringUpwardFloors.add(floor);
        }

    }

    public void setRequiringDownwardFloors(Integer floor) {
        if (!requiringDownwardFloors.contains(floor)) {
            requiringDownwardFloors.add(floor);
        }
    }

}
