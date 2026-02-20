package exercicios.metodos;

import java.util.List;

public class MenorDeTres {
	
	// Construtor (opcional)
	public MenorDeTres() {
		
	}
	
	protected Integer menorDaLista(List<Integer> lista) {

	    if (lista == null || lista.isEmpty()) {
	        return null;
	    }

	    Integer menor = lista.get(0);

	    for (Integer i : lista) {
	        if (i < menor) {
	            menor = i;
	        }
	    }

	    return menor;
	}

}
