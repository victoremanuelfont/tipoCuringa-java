package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		/*
		 * Adicionou-se duas figuras (rectangle e circle) na lista de Shape. Total area
		 * vai somar o valor da area do rectangle e a area do circle.
		 * 
		 */
		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		System.out.println("Total area: " + totalArea(myShapes));
	}

	/*
	 * o método totalArea vai receber uma lista de shape, e fazer a soma.
	 */
	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}