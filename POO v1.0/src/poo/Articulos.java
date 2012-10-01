package poo;
/**
 * Esta clase Articulos contiene los datos de revista y algunos metodos para ser utilizados posteriormente
 *ademas extiende de Materiales Bibliograficos
 * @author Freddy y Ricardo
 *
 */

public class Articulos extends MaterialesBibliograficos{
	int codigo;
	String autor;
	int nPaginas;
	String palabrasClave;
	Revistas revista;
	/**
	 * constructor de la clase revista con parametros y tambien llama al super de materiales bibliograficos
	 * @param titulo
	 * @param autor
	 * @param nPaginas
	 * @param palabrasClave
	 * @param revista
	 */
	public Articulos(String titulo,String autor,int nPaginas,String palabrasClave,Revistas revista){
		super(titulo);
		this.autor=autor;
		this.nPaginas=nPaginas;
		this.palabrasClave=palabrasClave;
		this.revista=revista;
		codigo=(int)(Math.random()*100000);
	}
	/**
	 * metodo para devolver el codigo de revista
	 * @return gffdgd
	 */
	public int getCode(){
		return codigo;
	}
	/**
	 * metodo que devuelve un valor para ver si articulo esta prestado
	 * @return revista.estaprestado
	 */
	public int estaPrestado(){
		return(revista.estaPrestado());
	}
	
	/**
	 * devuelve los datos de Articulo
	 */
	public String toString(){
		return(titulo+"  	 "+"Articulo  "+codigo+"   "+revista.nombre+"   "+estaPrestado());
	}
	

}
