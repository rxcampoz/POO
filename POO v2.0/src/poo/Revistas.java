package poo;

public class Revistas extends MaterialesBibliograficos {
	int codigo;
	String nombre;
	String materia;
	
	public Revistas(String titulo,String nombre,String materia){
		super(titulo);
		this.nombre=nombre;
		this.materia=materia;
		codigo=(int)(Math.random()*100000);
		estaPrestado=0;
	}
	
	public int estaPrestado(){
		return estaPrestado;
	}
	
	public int getCode(){
		return codigo;
	}
	
	public String toString(){
		return(nombre+"   	"+"Revista  "+codigo+ "			"+estaPrestado);
	}
	
	public String getNombre(){
		return nombre;
	}
	
	public int compareTo(Object otherO){
		Revistas r=(Revistas)otherO;
		return nombre.compareTo(r.nombre);
	}
	
	
}
