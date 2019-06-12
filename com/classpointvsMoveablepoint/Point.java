package com.classpointvsMoveablepoint;

public class Point {
    protected float x = 0.0f;
    protected float y = 0.0f;

    public Point(){}

    public Point(float x,float y){
        this.x=x;
        this.y=y;
    }

    public float getX() {
        return x;
    }

    public void setX(float x) {
        this.x = x;
    }

    public float getY() {
        return y;
    }

    public void setY(float y) {
        this.y = y;
    }

    public void seXY(float x,float y){
        this.x=x; this.y=y;
    }

    public float[] getXY(){
        float[]Array= new float[]{getX(),getY()};
        return Array;
    }

    @Override
    public String toString() {
        return "(" + getX()+ ","+getY()+")  ";
    }
}
