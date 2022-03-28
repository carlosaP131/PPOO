package polimorfismo;

public class Principal {
	static Animal Caballo = new Caballo();
	static Animal Perro = new Perro();
	static Animal Gato = new Gato();

	public static void main(String[] args) {

		Caballo.sonido();
		Perro.sonido();
		Gato.sonido();

	}

}
