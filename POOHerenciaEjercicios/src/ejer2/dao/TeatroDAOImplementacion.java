package ejer2.dao;

import ejercicios2.Funcion;
import ejercicios2.Teatro;

public class TeatroDAOImplementacion implements TeatroDAO{

	@Override
	public void listarFunciones(Teatro t) {
		for (Funcion valor : t.getFunciones()) {
			System.out.println(valor);
		}
		
	}

	@Override
	public void anadirFuncion(Teatro t, Funcion f) {
		t.getFunciones().add(f);
		
	}

}
