package poo;

public class Libros extends MaterialesBibliograficos {
	private int ISBN;
	private String autor;
	private String materia;
	private String editorial;
	
	public Libros(String titulo,String autor,String materia,String editorial){
		super(titulo);
		ISBN=(int)(Math.random()*100000);
		this.setAutor(autor);
		this.materia=materia;
		this.setEditorial(editorial);
		estaPrestado=0;
	}
	
	public int estaPrestado(){
		return estaPrestado;
	}
	
	public int getCode(){
		return ISBN;
	}
	
	public String toString(){
		return(titulo+"			"+"Libro  "+ISBN+"			"+estaPrestado);
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getAutor() {
		return autor;
	}

	public void setEditorial(String editorial) {
		this.editorial = editorial;
	}

	public String getEditorial() {
		return editorial;
	}
	
	
}
