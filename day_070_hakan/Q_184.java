package day_070_hakan;

public class Q_184 {
    private double length;
    private double height;
    private double area;

    public void setLength(double length) {
        this.length = length;
      //  setArea(); // C
    }

    public void setHeight(double height) {
        this.height = height;
      //  setArea();  // A
    }

    public void setArea() {
        area = length* height;
    }
}

/**
 * Which two changes would encapsulate this class and ensure that the area field is
 * always equal to length * height whenever the Rectangle class is used?
 */
