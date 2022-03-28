package herencia;

public class Principal {
	static Pnúmerico bits = new Pnúmerico();
	static Pnúmerico corto = new Pnúmerico();
	static Pnúmerico   entero = new Pnúmerico();
	static Pnúmerico largo = new Pnúmerico();
	
	public static void main(String[] args) {
		//bits.setNombre("byte");
		
		bits.setNombre("byte");
		bits.setLongitud("0-127");
		bits.setDescripcion("es el entero mas corto");
		bits.setPrimitivo("si");
		bits.setBits((byte)10);
		System.out.println(" nombre: "+bits.getNombre()+" \n su longitud es: " +bits.getLongitud()+ "\n es primitivo:"+bits.getPrimitivo()+"\n descripcion: " + bits.getDescripcion());
		System.out.println("*********************************************************************************");
		corto.setNombre("short");
		corto.setLongitud("16");
		corto.setPrimitivo("si");
		corto.setDescripcion("");
		System.out.println(" nombre: "+corto.getNombre()+" \n su longitud es: " +corto.getLongitud()+ "\n es primitivo:"+corto.getPrimitivo()+"\n descripcion: " + corto.getDescripcion());
		
	}

}
