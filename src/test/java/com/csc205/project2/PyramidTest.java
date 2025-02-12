package com.csc205.project2;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class PyramidTest {

    private Pyramid pyramid;

    @BeforeEach
    public void setUp() {
        pyramid = new Pyramid(4.0, 1.0);
    }

    @Test
    public void testGetHeight() {
        assertEquals(4.0, pyramid.getHeight());
    }

    @Test
    public void testSetHeight() {
        pyramid.setHeight(5.0);
        assertEquals(5.0, pyramid.getHeight());
    }

    @Test
    public void testSurfaceArea() {
        assertEquals(31.41592653589793, pyramid.surfaceArea(), 0.0001);
    }

    @Test
    public void testVolume() {
        assertEquals(12.566370614359172, pyramid.volume(), 0.0001);
    }

    @Test
    public void testToString() {
        String expected = "Pyramid {height=4.0, radius=1.0, surface area=31.41592653589793, volume=12.566370614359172}";
        assertEquals(expected, pyramid.toString());
    }
}