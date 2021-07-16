package com.dipak.problem.fan;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static com.dipak.problem.fan.CeilingFan.OFF;


import static org.junit.jupiter.api.Assertions.assertEquals;

public class CeilingFanTest {

    private CeilingFan ceilingFan;

    @BeforeEach
    void setUp(){
        ceilingFan = new CeilingFan();
    }

    @Test
    void testIncreaseSpeed() {
        assertEquals(Directions.FORWARD, ceilingFan.getDirection());
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(SpeedName.OFF, ceilingFan.getSpeedName());
        System.out.println(ceilingFan.toString());

        ceilingFan.increaseSpeed();
        assertEquals(1, ceilingFan.getSpeed());
        assertEquals(SpeedName.LOW, ceilingFan.getSpeedName());
        assertEquals(Directions.FORWARD, ceilingFan.getDirection());
        System.out.println(ceilingFan.toString());

        ceilingFan.increaseSpeed();
        assertEquals(2, ceilingFan.getSpeed());
        assertEquals(SpeedName.MEDIUM, ceilingFan.getSpeedName());
        assertEquals(Directions.FORWARD, ceilingFan.getDirection());
        System.out.println(ceilingFan.toString());

        ceilingFan.increaseSpeed();
        assertEquals(3, ceilingFan.getSpeed());
        assertEquals(SpeedName.HIGH, ceilingFan.getSpeedName());
        assertEquals(Directions.FORWARD, ceilingFan.getDirection());
        System.out.println(ceilingFan.toString());

        ceilingFan.increaseSpeed();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(SpeedName.OFF, ceilingFan.getSpeedName());
        assertEquals(Directions.FORWARD, ceilingFan.getDirection());
        System.out.println(ceilingFan.toString());
    }

    @Test
    void testReverseDirection() {
        assertEquals(Directions.FORWARD, ceilingFan.getDirection());
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(SpeedName.OFF, ceilingFan.getSpeedName());

        ceilingFan.reverseDirection();
        assertEquals(Directions.BACKWARD, ceilingFan.getDirection());
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(SpeedName.OFF, ceilingFan.getSpeedName());

        ceilingFan.increaseSpeed();
        assertEquals(1, ceilingFan.getSpeed());
        assertEquals(SpeedName.LOW, ceilingFan.getSpeedName());
        assertEquals(Directions.BACKWARD, ceilingFan.getDirection());

        ceilingFan.increaseSpeed();
        assertEquals(2, ceilingFan.getSpeed());
        assertEquals(SpeedName.MEDIUM, ceilingFan.getSpeedName());
        assertEquals(Directions.BACKWARD, ceilingFan.getDirection());

        ceilingFan.increaseSpeed();
        assertEquals(3, ceilingFan.getSpeed());
        assertEquals(SpeedName.HIGH, ceilingFan.getSpeedName());
        assertEquals(Directions.BACKWARD, ceilingFan.getDirection());

        ceilingFan.increaseSpeed();
        assertEquals(OFF, ceilingFan.getSpeed());
        assertEquals(SpeedName.OFF, ceilingFan.getSpeedName());
        assertEquals(Directions.BACKWARD, ceilingFan.getDirection());
    }
}
