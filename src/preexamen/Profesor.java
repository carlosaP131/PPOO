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
	public void ense�a() {
		System.out.println("el profesor enseña a los alumnos");
	}  
}
