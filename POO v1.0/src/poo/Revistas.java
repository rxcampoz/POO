package poo;
/**
 * esta clase Revista contiene los datos de revista y extiende de materiales bibliotecarios
 * @author Freddy y Ricardo
 *
 */

public class Revistas extends MaterialesBibliograficos {
	int codigo;
	String nombre;
	String materia;
	/**
	 * constructor de la clase revista 
	 * @param titulo
	 * @param nombre
	 * @param materia
	 */
	public Revistas(String titulo,String nombre,String materia){
		super(titulo);
		this.nombre=nombre;
		this.materia=materia;
		codigo=(int)(Math.random()*100000);
		estaPrestado=0;
	}
	/**
	 *  devuelve valor si esta prestada
	 * @return esta prestado
	 */
	public int estaPrestado(){
		return estaPrestado;
	}
	/**
	 * metodo para el codigo de revista
	 * @return codigo
	 */
	public int getCode(){
		return codigo;
	}
	/**
	 * retorna datos de revista
	 */
	public String toString(){
		return("Nombre: "+nombre+"   	"+"Revista  "+codigo+ "			"+estaPrestado);
	}
	/**
	 * 
	 * @return nombre
	 */
	public String getNombre(){
		return nombre;
	}
	/**
	 * compara y ordena las revistas
	 * @return revistas
	 */
	
	public int compareTo(Object otherO){
		Revistas r=(Revistas)otherO;
		return nombre.compareTo(r.nombre);
	}
	
	
}
