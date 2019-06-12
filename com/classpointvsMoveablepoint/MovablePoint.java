package com.classpointvsMoveablepoint;

public class MovablePoint extends Point {
    private float xSpeed =0.0f;
    private float ySpeed =0.0f;

    public MovablePoint(float x, float y, float xSpeed, float ySpeed){
        super(x,y);
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed;
        this.ySpeed=ySpeed;
    }

    public MovablePoint(){}

    public float getxSpeed() {
        return xSpeed;
    }

    public float getySpeed() {
        return ySpeed;
    }

    public void setxSpeed(float xSpeed) {
        this.xSpeed = xSpeed;
    }

    public void setySpeed(float ySpeed) {
        this.ySpeed = ySpeed;
    }

    public void setSpeed(float xSpeed, float ySpeed){
        this.xSpeed=xSpeed; this.ySpeed=ySpeed;
    }

    public float[] getSpeed(){
        float[] Speed={xSpeed,ySpeed};
        return Speed;
    }

    @Override
    public String toString() {
        return super.toString()
                + " Speed= ("+getxSpeed()+","+getySpeed()+")";
    }

    public String move(){
       super.x+=getxSpeed();
       super.y+=getySpeed();
       return "(x= "+super.x+ ", y= "+ super.y+")";
    }
}
