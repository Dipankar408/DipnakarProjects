package com.simple.app;
public class Circle {
	double r;
	public Circle(double r)
	{
		this.r=r;
	}
	
	double getArea()
	{
		return 3.14*r*r;
	}
	
	double getCircum()
	{
		return 2*3.143*r;
	}
	
	public void circleInfo()
	{
		System.out.println("Radius: "+r);
		System.out.println("Area: "+getArea());
		System.out.println("Circumpherence: "+getCircum());
	}
}
