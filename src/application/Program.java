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
		 * Total area vai funcionar somente com myShapes. Ao criarmos uma lista de
		 * Circles, não consegue buscar a total area de myCircles, pois Shape (totalArea(List<Shape> list))não é um
		 * super tipo de Circle.Portanto, total area vai funcionar somente pra lista de Shape. Para funcionar vai precisar de um tipo Curinga
		 */

		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
		System.out.println("Total area: " + totalArea(myCircle));
	}

	public static double totalArea(List<Shape> list) {
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}