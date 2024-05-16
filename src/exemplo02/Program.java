package exemplo02;

import java.util.ArrayList;
import java.util.List;

public class Program {

	/*
	 * Covariância é quando a de GET é permitida mas a de PUT (add) não da certo
	 */
	public static void main(String[] args) {

		List<Integer> intList = new ArrayList<Integer>();
		intList.add(10);
		intList.add(5);
		/*
		 * List<? extends Number> significa que pode ser qualquer tipo. Esta sendo
		 * atribuido um "intList" que é Integer numa list que pode ser de qualquer tipo.
		 */
		List<? extends Number> list = intList;
		Number x = list.get(0); // Permite acessar os elementos
		list.add(20); // Não permite adicionar mais elementos, pois pode ser incompativel
	}

}
