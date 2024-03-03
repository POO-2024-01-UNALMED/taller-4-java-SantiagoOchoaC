package classroom;

public enum Tipo {
	DISCIPLINAR(10),FUNDAMENTACION(20),ELECTIVA(30);
	
	private int codigo;
	
	Tipo(int codigo) { // Cambiamos la visibilidad y eliminamos el otro parametro que no es necesario. 
		this.codigo = codigo;

	}
	

}