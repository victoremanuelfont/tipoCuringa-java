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

		List<Circle> myCircle = new ArrayList<>();
		myCircle.add(new Circle(2.0));
		myCircle.add(new Circle(3.0));
		System.out.println("Total area: " + totalArea(myCircle));
	}

	/*
	 * Isso quer dizer que a list pode ser do tipo shape ou de qualquer outro
	 * subtipo de shape. Desse modo, aceita myCircle. Porém, desse modo, não da para
	 * adicionar.
	 */

	public static double totalArea(List<? extends Shape> list) {
		/*
		 * list.add(new Rectangle(3.0,4.0) Não da para fazer isso pois pode ser um
		 * subtipo de shape PORÉM incompatível com Rectangle
		 */
		double sum = 0.0;
		for (Shape s : list) {
			sum += s.area();
		}
		return sum;
	}
}