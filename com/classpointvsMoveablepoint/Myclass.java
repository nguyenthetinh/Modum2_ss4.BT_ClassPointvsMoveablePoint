package com.classpointvsMoveablepoint;

public class Myclass {
    public static void main(String[] args) {
        Point point=new Point();
        MovablePoint movablePoint=new MovablePoint();

        point=new Point(2.7f,6.9f);
        System.out.println(point);

        movablePoint=new MovablePoint(3.5f,4.6f);
        System.out.println(movablePoint);

        movablePoint=new MovablePoint(3.5f,2.5f,4.5f,6.8f);
        System.out.println(movablePoint);

        System.out.println(movablePoint.move());
    }
}
