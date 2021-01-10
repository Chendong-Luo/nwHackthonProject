package model;

import java.util.ArrayList;
import java.util.List;

public class Elevator {
    private int floor;
    private final int MAXFLOOR = 10;
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

    public Integer goUp() {
        if (floor + 1 <= MAXFLOOR) {
            floor += 1;
        }
        return floor;
    }

    public Integer goDown() {
        if (floor - 1 >= 0) {
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

    public void setFloor(Integer floor) {
        this.floor = floor;
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


}
