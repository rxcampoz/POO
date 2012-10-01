package poo;

public class Usuario {
	private String nombre;
	private String apellido;
        private int edad;
	private int codigo;
	
	public Usuario(){
		nombre="nombre";
		apellido="apellido";
		codigo=0000001;
	}
	
	public Usuario(String nombre,String apellido,int edad){
		this.nombre=nombre;
		this.apellido=apellido;
                this.edad=edad;
		codigo=(int)(Math.random()*100000);
	}
	
	public String toString(){
		return nombre+" "+apellido+"  codigo ID: "+codigo;
		
	}
	//////

	public int getCodigo() {
		return codigo;
	}

        public String getName(){
            return nombre;
        }

	
	
	
}
