package com.dipak.problem.fan;

public class CeilingFan {
    public static final int OFF = 0;
    private int speed = 0;
    private SpeedName speedName = SpeedName.LOW;
    private Directions direction = Directions.FORWARD;

    public int getSpeed() {
        return speed;
    }

    public SpeedName getSpeedName() {
        if (speed == 1) {
            speedName = SpeedName.LOW;
        } else if (speed == 2) {
            speedName = SpeedName.MEDIUM;
        } else if (speed == 3) {
            speedName = SpeedName.HIGH;
        } else {
            speedName = SpeedName.OFF;
        }
        return speedName;
    }

    public Directions getDirection() {
        return direction;
    }

    public void increaseSpeed() {
        if (speed == 3) {
            speed = OFF;
        } else {
            speed++;
        }
    }
    public void reverseDirection() {
        if (direction == Directions.FORWARD) {
            direction = Directions.BACKWARD;
        } else {
            direction = Directions.FORWARD;
        }
    }

    @Override
    public String toString() {
        return "Fan is in " + getSpeedName() + " speed(" + speed + ")" + " and " + direction + " direction";
    }
}
