package pl.example.data;

import static java.lang.Math.*;

public class Line {

    private Point p1;
    private Point p2;

    public Line(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }

    public Point getP1() {
        return p1;
    }

    public void setP1(Point p1) {
        this.p1 = p1;
    }

    public Point getP2() {
        return p2;
    }

    public void setP2(Point p2) {
        this.p2 = p2;
    }

    public double length(){
        double x1 = this.getP1().getX();
        double y1 = this.getP1().getY();
        double x2 = this.getP2().getX();
        double y2 = this.getP2().getY();

        double length = sqrt(pow(x1 - x2,2) + pow(y1-y2, 2));
        return length;

    }

    public void showInfo(){
        System.out.println("Początek odcinka: (" +this.getP1().getX()+ ", " +this.getP1().getY() +")");
        System.out.println("Koniec odcinka: (" +this.getP2().getX()+ ", " +this.getP2().getY() +")");
        System.out.println("Jego długość: " + this.length());
    }
}
