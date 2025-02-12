package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
/*
create a test class for Pyramid.java
 */
public class PyramidTest {

    private Pyramid pyramid;

    @BeforeEach
    public void setUp() {
        pyramid = new Pyramid(4.0, 1.0);
    }

    @Test
    public void testGetWidth() {
        assertEquals(4.0, pyramid.getWidth());
    }

    @Test
    public void testSetWidth() {
        pyramid.setWidth(5.0);
        assertEquals(5.0, pyramid.getWidth());
    }

    @Test
    public void testGetHeight() {
        assertEquals(1.0, pyramid.getHeight());
    }

    @Test
    public void testSetHeight() {
        pyramid.setHeight(2.0);
        assertEquals(2.0, pyramid.getHeight());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(33.88854381999832, pyramid.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(5.333333333333333, pyramid.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Pyramid {width=4.0, height=1.0, surface area=33.88854381999832, volume=5.333333333333333}";
        assertEquals(expected, pyramid.toString());
    }
}