package poo;
/**
 *  Esta clase garda los datos del usuario que son: nombre, apellido y codigo generado
 * @author Ricardo y Freddy
 *
 *
 */
public class Usuario {
	private String nombre;
	private String apellido;
	private int codigo;
	/**
	 * costructor de usuario 
	 */
	public Usuario(){
		nombre="nombre";
		apellido="apellido";
		codigo=0000001;
	}
	/**
	 * constructor de usuario con parametros
	 * @param nombre
	 * @param apellido
	 */
	public Usuario(String nombre,String apellido){
		this.nombre=nombre;
		this.apellido=apellido;
		codigo=(int)(Math.random()*100000);
	}
	/**
	 * imprime los datos del usuario 
	 */
	public String toString(){
		return "Nombre: "+nombre+"     "+"Apellido: "+apellido+"   " +" CODIGO ID: "+codigo;
		
	}
	/**
	 * metodo para codigo del usuario
	 * @return codigo
	 */
	public int getCodigo() {
		return codigo;
	}

	
	
	
}
