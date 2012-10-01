package poo;
/**
 * Esta clase CDROMs contiene los datos de CDROMs y algunos metodos para ser utilizados posteriormente
 *ademas extiende de Materiales Bibliograficos
 * @author Freddy y Ricardo
 *
 */

public class CDROMs extends MaterialesBibliograficos {
	int codigo;
	String materia;
	String editorial;
	/**
	 * constructor of class CDROMs
	 * @param titulo
	 * @param materia
	 * @param editorial
	 */
	public CDROMs(String titulo,String materia,String editorial){
		super(titulo);
		this.materia=materia;
		this.editorial=editorial;
		codigo=(int)(Math.random()*100000);
		estaPrestado=0;
	}
	/**
	 * @return valor que indica si  esta prestado el CDROMs
	 */
	public int estaPrestado(){
		return estaPrestado;
	}
	/**
	 * 
	 * @return codigo generado
	 */
	public int getCode(){
		return codigo;
	}
	/**
	 * imprime datos del CDROMs
	 */
	public String toString(){
		return(titulo+"		"+"CD ROM  "+codigo+"			"+estaPrestado);
	}
}
