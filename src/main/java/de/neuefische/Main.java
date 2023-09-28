package de.neuefische;

import java.util.List;

public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(2);
        Square square = new Square(2);

        Area[] areas = new Area[2];
        areas[1] = circle;
        areas[2] = square;

        for (Area a : areas) {
            System.out.println(a.area());
        }
    }
}