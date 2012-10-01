package poo;
/**
 * clase adstracta de materiales bibliotecarios la cual implementa clase comparable
 * @author Freddy y Ricardo
 *
 */

public abstract class MaterialesBibliograficos implements Comparable {
	
	protected String titulo;
	protected int estaPrestado;
	/**
	 * constructor de clase materiales bibliotecarios
	 * @param titulo
	 */
	public MaterialesBibliograficos(String titulo){
		this.titulo=titulo;
	}
	/**
	 * metodo tipo int la cual ordena los ArrayList
	 * @return los elementos del ArrayList ordenados
	 */
	public int compareTo(Object otherObject)
	   {  
	      MaterialesBibliograficos other = (MaterialesBibliograficos)otherObject;
	      return titulo.compareTo(other.titulo);
	   }
}
