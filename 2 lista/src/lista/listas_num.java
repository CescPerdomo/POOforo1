package lista;

import java.util.List;
import java.util.ArrayList;

public class listas_num {

	public static void main(String[] args) {
		
		List<Integer> miNumero;
		miNumero=new ArrayList<Integer>();
		
		miNumero.add(1);
		miNumero.add(3);
		miNumero.add(5);
		
		miNumero.remove(1);
		
		System.out.print(miNumero.size());

	}

}
