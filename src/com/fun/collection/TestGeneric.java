package com.fun.collection;

import java.util.ArrayList;
import java.util.List;

public class TestGeneric {

	public void drawAll(List<Shape> shapes){
		for(Shape s : shapes) {
			s.draw();
		}
		shapes.add(new Circle());
	}

	public void drawAllShapes(List<? extends Shape> shapes){
		for(Shape s : shapes) {
			s.draw();
		}
		//shapes.add(new Circle()); //Compilation Error!!!
	}

	public static void main(String[] args) {

		Circle c1 = new Circle();
		List<Circle> circles = new ArrayList<Circle>();
		circles.add(c1);

		Triangle t1 = new Triangle();
		Rectangle r1 = new Rectangle();

		List<Shape> shapes = new ArrayList<Shape>();
		shapes.add(c1);
		shapes.add(t1);
		shapes.add(r1);

		TestGeneric obj = new TestGeneric();
		
		//obj.drawAll(circles); //Compilation Error!!!
		
		System.out.println("\nPrinting list of circles...");
		obj.drawAllShapes(circles);
		System.out.println("\nPrinting list of shapes using drawAll...");
		obj.drawAll(shapes);
		System.out.println("\nPrinting list of shapes using drawAllShapes...");
		obj.drawAllShapes(shapes);
	}

}

abstract class Shape {
	abstract void draw();
}

class Circle extends Shape {
	public void draw() {
		System.out.println("Drawing a Circle!");
	}
}

class Triangle extends Shape {
	public void draw() {
		System.out.println("Drawing a Triangle!");
	}
}

class Rectangle extends Shape {
	public void draw() {
		System.out.println("Drawing a Rectangle!");
	}
}