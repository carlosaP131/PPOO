package preexamen;

public class Profesor extends Persona {
  private String clave;

public String getClave() {
	return clave;
}

public void setClave(String clave) {
	this.clave = clave;
}
@Override
	public void enseña() {
		System.out.println("el profesor enseÃ±a a los alumnos");
	}  
}
