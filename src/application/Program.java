package application;

import java.util.ArrayList;
import java.util.List;

import entities.Circle;
import entities.Rectangle;
import entities.Shape;

public class Program {

	public static void main(String[] args) {

		List<Shape> myShapes = new ArrayList<>();
		myShapes.add(new Rectangle(3.0, 2.0));
		myShapes.add(new Circle(2.0));

		/*
		 * Para funcionar vai precisar de um tipo Curinga:
		 */

		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
		System.out.println("Total area: " + totalArea(myCircle));
	}

	/*
	 * Se colocar somente "?", list da erro ( for (Shape s : list) { ) pois pode
	 * ser que nem todos da lista são do tipo shape. 
	 */
	public static double totalArea(List<?> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}