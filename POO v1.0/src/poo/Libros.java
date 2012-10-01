package poo;
/**
 * Clase de libros la cual extiende de materiales bibliotecarios
 * @author Freddy y Ricardo
 *
 */

public class Libros extends MaterialesBibliograficos {
	private int ISBN;
	private String autor;
	private String materia;
	private String editorial;
	
	/**
	 * costructor de la clase libro la cual tambien llama a super con variable del padre
	 * @param titulo
	 * @param autor
	 * @param materia
	 * @param editorial
	 */
	public Libros(String titulo,String autor,String materia,String editorial){
		super(titulo);
		ISBN=(int)(Math.random()*100000);
		this.setAutor(autor);
		this.materia=materia;
		this.setEditorial(editorial);
		estaPrestado=0;
	}
	/**
	 * metodo que retorna valor para ver si el libro esta prestado
	 * @return  esta prestado
	 */
	public int estaPrestado(){
		return estaPrestado;
	}
	/**
	 * metodo que contiene el ISBN 
	 * @return ISBN
	 */
	public int getCode(){
		return ISBN;
	}
	/**
	 * cadena que retorna los datos del libro
	 */
	public String toString(){
		return(titulo+"			"+"Libro  "+ISBN+"			"+estaPrestado);
	}
    /**
    * mtodo que validar la variable privada autor
    * @param autor
    */
	public void setAutor(String autor) {
		this.autor = autor;
	}
    /**
    * metodo para obtener autor
    * 
    */
	public String getAutor() {
		return autor;
	}
	/**
	 * metodo para validar editorial
	 * @param editorial
	 */

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	/**
	 * metodo para obtener la variable editorial
	 * 
	 */
	public String getEditorial() {
		return editorial;
	}
	
	
}
