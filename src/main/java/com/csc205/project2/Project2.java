package com.csc205.project2;

import java.util.ArrayList;
import java.util.List;
/*
Thomas Castro
CSC 205
2/9/2025
 */

/**
 * Driver for project 2.
 *
 * Modify the driver as needed to demonstrate your classes.
 *
 */
public abstract class Project2 implements ThreeDimensionalShape{

    public static void main(String[] args) {

        /*
        The following code works with the example design given.
         */

        //ThreeDimensionalShape sphere = new Sphere(2.0);
        //ThreeDimensionalShape cube = new Cube(5.0);
        //ThreeDimensionalShape cylinder = new Cylinder(4.0, 1.0);
        /*
        // We'll cover this stuff in module 4
        List<ThreeDimensionalShape> shapes = new ArrayList<>();
        shapes.add(sphere);
        shapes.add(cube);
        shapes.add(cylinder);

        shapes.forEach(System.out::println);*/

        /*
        The following code works with the code given.
         */

        Sphere sphere = new Sphere(2.0);
        System.out.println(sphere);
    }

}

