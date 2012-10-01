package poo;
import javax.swing.JOptionPane;

public class Spanish implements Idioma{
	
	public String iNombre(){
		String n=JOptionPane.showInputDialog("ingrese nombre");
		return n;
	}
	
	public String iApellido(){
		String n=JOptionPane.showInputDialog("ingrese apellido");
		return n;
	}
	
	public int menuInicial() {
		int op=6,ok=1;
		do{
		try {
			String option = JOptionPane.showInputDialog("********BIENVENIDO*******\n\n  Que desea hacer:\n1.- Definir nuevo usuario\n2.-Registrar nuevo material\n3.-Prestamo\n4.-Devolucion\n5.-Consulta de catalogo\n6.-Cambiar idioma\n7.-Salir\n\n");
			op = Integer.parseInt(option);
			ok=1;
			if(op<1||op>7)ok=0;
		} catch (Exception e) {
			ok=0;
		}}while(ok==0);
		return op;
	}
	
	public int tipoMaterial(){
		int op=0,ok=1;
		do{
		try {
			String option = JOptionPane.showInputDialog("Ingrese Tipo de material:\n1.-Libro\n2.-Revistas\n3.-Articulos\n4.-CD Rom");
			op = Integer.parseInt(option);
			ok=1;
			if(op<1||op>4)ok=0;
		} catch (Exception e) {
			ok=0;
		}}while(ok==0);
		return op;
		
	}
	
	public int cambiarIdioma() {
		String s;
		int d=-1;
		int ok;
		do{ ok=1;
		try {
			s = JOptionPane.showInputDialog("Escoja idioma:\n1.-Español\n2.-Ingles\n3.-Frances\n4.-Italiano");
			d = Integer.parseInt(s);
			if(d<1||d>4)ok=0;
		} catch (Exception e){
			ok=0;
		}
		}while(ok==0);	
		
		return d;
	}

	public String iAutores() {
		String s=JOptionPane.showInputDialog("Ingrese Autor");
		return s;
	}
	
	public String iMateria() {
		String s=JOptionPane.showInputDialog("Ingrese Materia");
		return s;
	}
    
	public int iNPaginas() {
		int ok,n=0;
		do{
			ok=1;
		try{
		String s=JOptionPane.showInputDialog("Ingrese Numero de paginas");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	
	public String iTitulo() {
		String s=JOptionPane.showInputDialog("Ingrese Titulo");
		return s;
	}
	
	public String pClaves() {
		String s=JOptionPane.showInputDialog("Ingrese palabras clave");
		return s;
	}
   
	public int ingreseID() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Ingrese ID");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	
	public void errorCode() {
		JOptionPane.showMessageDialog(null, "codigo invalido");
		
	}
	
	public int ingreseCode() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Ingrese Codigo");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	
	public int menuMostrar() {
		String s;
		int d=-1;
		int ok;
		do{ 
		try {
			s = JOptionPane.showInputDialog("*****Que desea buscar:*****\n1.-Libros\n2.-Revistas\n3.-Articulos\n4.- CD ROM\n5.- Todo");
			d = Integer.parseInt(s);
			ok=1;
			if(d<1||d>5) ok=0;
		} catch (Exception e){
			ok=0;
		}}while(ok==0);	
		
		return d;
	}

	public void errorDevolucion() {
		JOptionPane.showMessageDialog(null, "El material no ha sido prestado");
		
	}
	
	public void mDevolucion() {
		 JOptionPane.showMessageDialog(null, "El material no ha sido prestado");
		
	}

	public void mPrestamo() {
		JOptionPane.showMessageDialog(null, "Prestamo exitoso");
		
	}

	public void errorPrestamo() {
		JOptionPane.showMessageDialog(null, "El material se encuentra prestado");
		
	}
	
	public String iEditorial() {
		String s=JOptionPane.showInputDialog("Ingrese Editorial");
		return s;
	}
	
	public String iRevista() {
		String s=JOptionPane.showInputDialog("Ingrese el nombre de la revista contenedora");
		return s;
	}
	
	public void errorUser() {
		JOptionPane.showMessageDialog(null, "Usuario no encontrado");
		
	}

	public void barraT() {
		System.out.println("TITULO/NOMBRE(Revistas)		TIPO	CODIGO	ORIGEN(Articulos)	DISPONIBLE(1.-Si  0.-No)");
		
	}

}
