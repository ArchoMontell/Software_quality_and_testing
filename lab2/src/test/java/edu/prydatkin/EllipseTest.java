package edu.prydatkin;

import org.junit.Test;

import static org.junit.Assert.*;

/*
    @author lilbl
    @project lab2
    @class EllipseTest
    @version 1.0.0
    @since 29.03.2025 - 11.04
*/


public class EllipseTest {

    @Test
    public void whenMajorAxis_5_AndMinorAxis_3_ThenArea_47_Point_1() {
        assertEquals(Math.PI * 5 * 3, 47.1, 0.1);
    }

    @Test
    public void whenGettingAreaOfUnitEllipseThenPi_3_Point_14() {
        Ellipse ellipse = new Ellipse(1, 1);
        assertEquals(Math.PI, 3.14, 0.01);
    }

    @Test
    public void whenValidAxesThenCorrectPerimeter() {
        Ellipse ellipse = new Ellipse(5, 3);
        double h = Math.pow((5.0 - 3.0) / (5.0 + 3.0), 2);
        double expected = Math.PI * (5 + 3) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
        assertEquals(expected, ellipse.getPerimeter(), 0.0001);
    }

    @Test
    public void whenSemiAxesAreEqualThenEllipseIsCircle() {
        Ellipse ellipse = new Ellipse(4, 4);
        assertEquals(0, ellipse.getEccentricity(), 0.0001);
        assertEquals(Math.PI * 4 * 4, ellipse.getArea(), 0.0001);
    }

    @Test
    public void whenValidAxesThenCorrectFocalDistance() {
        Ellipse ellipse = new Ellipse(5, 3);
        double expected = Math.sqrt(5 * 5 - 3 * 3);
        assertEquals(expected, ellipse.getFocalDistance(), 0.0001);
    }

    @Test
    public void whenValidAxesThenCorrectEccentricity() {
        Ellipse ellipse = new Ellipse(5, 3);
        double expected = Math.sqrt(5 * 5 - 3 * 3) / 5;
        assertEquals(expected, ellipse.getEccentricity(), 0.0001);
    }

    @Test
    public void whenPointInsideThenTrue() {
        Ellipse ellipse = new Ellipse(5, 3);
        assertTrue(ellipse.isInside(2, 1));
    }

    @Test
    public void whenPointFarFromCenterThenFalse() {
        Ellipse ellipse = new Ellipse(6, 4);
        assertFalse(ellipse.isInside(10, 10));
    }

    @Test
    public void whenPointOnBoundaryThenTrue() {
        Ellipse ellipse = new Ellipse(5, 3);
        assertTrue(ellipse.isInside(5, 0));
    }

    @Test
    public void whenPointOutsideThenFalse() {
        Ellipse ellipse = new Ellipse(5, 3);
        assertFalse(ellipse.isInside(6, 3));
    }
}