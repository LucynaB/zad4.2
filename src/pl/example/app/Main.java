package pl.example.app;

import pl.example.data.Point;
import pl.example.data.Line;

import java.util.Scanner;
import java.util.Locale;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        scanner.useLocale(Locale.US);

        System.out.println("Podaj współrzędne początku odcinka1: ");
        double x1 = scanner.nextDouble();
        double y1 = scanner.nextDouble();

        System.out.println("Podaj współrzędne końca odcinka1: ");
        double x2 = scanner.nextDouble();
        double y2 = scanner.nextDouble();

        Point p1 = new Point(x1, y1);
        Point p2 = new Point(x2, y2);

        Line line1 = new Line(p1, p2);


        System.out.println("Podaj współrzędne początku odcinka2: ");
        double x3 = scanner.nextDouble();
        double y3 = scanner.nextDouble();

        System.out.println("Podaj współrzędne końca odcinka2: ");
        double x4 = scanner.nextDouble();
        double y4 = scanner.nextDouble();

        Point p3 = new Point(x3, y3);
        Point p4 = new Point(x4, y4);

        Line line2 = new Line(p3, p4);
        
        Longer longer = new Longer();
        Line longerLine = longer.isLonger(line1,line2);
        longerLine.showInfo();

    }
}
