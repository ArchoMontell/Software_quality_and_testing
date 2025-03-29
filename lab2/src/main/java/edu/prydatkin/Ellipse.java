package edu.prydatkin;


/*
    @author lilbl
    @project lab2
    @class Ellipse
    @version 1.0.0
    @since 28.03.2025 - 20.54
*/
    

public class Ellipse {
    private double majorAxis;
    private double minorAxis;

    public Ellipse(double majorAxis, double minorAxis) {
        if (majorAxis <= 0 || minorAxis <= 0) {
            throw new IllegalArgumentException("Півосі мають бути більше нуля");
        }

        this.majorAxis = majorAxis;
        this.minorAxis = minorAxis;
    }

    public double getMajorAxis() {
        return majorAxis;
    }

    public void setMajorAxis(double majorAxis) {
        this.majorAxis = majorAxis;
    }

    public double getMinorAxis() {
        return minorAxis;
    }

    public void setMinorAxis(double minorAxis) {
        this.minorAxis = minorAxis;
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Ellipse ellipse)) return false;

        return Double.compare(getMajorAxis(), ellipse.getMajorAxis()) == 0 && Double.compare(getMinorAxis(), ellipse.getMinorAxis()) == 0;
    }

    @Override
    public int hashCode() {
        int result = Double.hashCode(getMajorAxis());
        result = 31 * result + Double.hashCode(getMinorAxis());
        return result;
    }

    @Override
    public String toString() {
        return "Ellipse{" +
                "majorAxis=" + majorAxis +
                ", minorAxis=" + minorAxis +
                '}';
    }

    // Обчислення площі еліпса
    public double getArea() {
        return Math.PI * majorAxis * minorAxis;
    }

    // Обчислення периметра еліпса (наближена формула Рамануджана)
    public double getPerimeter() {
        double h = Math.pow((majorAxis - minorAxis) / (majorAxis + minorAxis), 2);
        return Math.PI * (majorAxis + minorAxis) * (1 + (3 * h) / (10 + Math.sqrt(4 - 3 * h)));
    }

    // Обчислення фокусної відстані (відстань від центру до фокусів)
    public double getFocalDistance() {
        return Math.sqrt(Math.abs(majorAxis * majorAxis - minorAxis * minorAxis));
    }

    // Обчислення ексцентриситету еліпса
    public double getEccentricity() {
        return getFocalDistance() / majorAxis;
    }

    // Перевірка, чи є точка (x, y) всередині еліпса
    public boolean isInside(double x, double y) {
        return (Math.pow(x / majorAxis, 2) + Math.pow(y / minorAxis, 2)) <= 1;
    }
}
