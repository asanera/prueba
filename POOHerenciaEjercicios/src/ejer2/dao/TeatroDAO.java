package ejer2.dao;

import ejercicios2.Funcion;
import ejercicios2.Teatro;

public interface TeatroDAO {
	public void listarFunciones(Teatro t);
	public void anadirFuncion(Teatro t, Funcion f);
}
