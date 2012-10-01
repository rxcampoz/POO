package poo;

public class Articulos extends MaterialesBibliograficos{
	int codigo;
	String autor;
	int nPaginas;
	String palabrasClave;
	Revistas revista;
	
	public Articulos(String titulo,String autor,int nPaginas,String palabrasClave,Revistas revista){
		super(titulo);
		this.autor=autor;
		this.nPaginas=nPaginas;
		this.palabrasClave=palabrasClave;
		this.revista=revista;
		codigo=(int)(Math.random()*100000);
	}
	
	public int getCode(){
		return codigo;
	}
	
	public int estaPrestado(){
		return(revista.estaPrestado());
	}
	
    @Override
	public String toString(){
		return(titulo+"  	 "+"Articulo  "+codigo+"   "+revista.nombre+"   "+estaPrestado());
	}
	

}
