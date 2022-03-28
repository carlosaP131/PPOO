package preexamen;

public class Alumno extends Persona {
 private String matricula;

public String getMatricula() {
	return matricula;
}

public void setMatricula(String matricula) {
	this.matricula = matricula;
}

@Override
	public void enseña() {
		System.out.println("el alumno enseña a sus demas compañeros");
		
	}
}
