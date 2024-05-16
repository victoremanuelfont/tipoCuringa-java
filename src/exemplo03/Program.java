package exemplo03;

import java.util.ArrayList;
import java.util.List;

public class Program {

	/*
	 * Contravariância = Permite adicionar PUT, mas não permite acessar GET
	 */
	public static void main(String[] args) {

		List<Object> myObjs = new ArrayList<Object>();
		myObjs.add("Maria");
		myObjs.add("Alex");

		/*
		 * <? super Number> = Qualquer tipo super Number, que pode ser Number ou
		 * qualquer super tipo number. 
		 * supertipo number = object
		 */
		List<? super Number> myNums = myObjs;
		myNums.add(10);// permite adicionar
		myNums.add(3.14);
		Number x = myNums.get(0);// Não permite acessar

	}

}
