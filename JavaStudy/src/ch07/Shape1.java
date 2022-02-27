package ch07;

abstract class Shape1 {
 private int x,y;
 
 public void move(int x , int y) {
	 this.x=x;
	 this.y=y;
 }
 
 public abstract void draw();
 
 }
