package poo;

public class CDROMs extends MaterialesBibliograficos {
	int codigo;
	String materia;
	String editorial;
	
	public CDROMs(String titulo,String materia,String editorial){
		super(titulo);
		this.materia=materia;
		this.editorial=editorial;
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
		return(titulo+"		"+"CD ROM  "+codigo+"			"+estaPrestado);
	}
}
