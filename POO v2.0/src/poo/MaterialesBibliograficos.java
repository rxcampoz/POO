package poo;

public abstract class MaterialesBibliograficos implements Comparable {
	protected String titulo;
	protected int estaPrestado;
	
	public MaterialesBibliograficos(String titulo){
		this.titulo=titulo;
	}
	
	public int compareTo(Object otherObject)
	   {  
	      MaterialesBibliograficos other = (MaterialesBibliograficos)otherObject;
	      return titulo.compareTo(other.titulo);
	   }
}
