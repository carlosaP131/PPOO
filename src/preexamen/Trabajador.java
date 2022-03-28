package preexamen;

public class Trabajador extends Persona {
 private int numertrab;

public int getNumertrab() {
	return numertrab;
}

public void setNumertrab(int numertrab) {
	this.numertrab = numertrab;
}
 @Override
	public void enseña() {
		System.out.println("el trabajador enseña a los nuevos trabajadores");
	}
}
