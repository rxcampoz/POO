package poo;

import javax.swing.JOptionPane;

public class English implements Idioma  {

	public String iNombre(){
		String n=
		JOptionPane.showInputDialog("Enter name");
		return n;
	}
	public String iApellido(){
		String n=
		JOptionPane.showInputDialog("Enter surname");
		return n;
	}
	@Override
	public int menuInicial() {
		int op=6,ok=1;
		do{
		try {
			String option = JOptionPane
					.showInputDialog("*******WELCOME*******\n\n You want to do:\n1.- Enter a new user\n2.-Record new material\n3.-Loan\n4.-Drop\n5.-Consult catalog\n6.-Change Language\n7.-Out");
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
			String option = JOptionPane
					.showInputDialog("Enter type of material:\n1.-Book\n2.-Magazine\n3.-Article\n4.-CD Rom");
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
			s = JOptionPane.showInputDialog("Choose language:\n1.-Spanish\n2.-English\n3.-Frances\n4.-Italian");
			d = Integer.parseInt(s);
			if(d<1||d>4)ok=0;
		} catch (Exception e){
			ok=0;
		}
		}while(ok==0);	
		
		return d;
	}
	@Override
	public String iAutores() {
		String s=JOptionPane.showInputDialog("Enter author");
		return s;
	}
	@Override
	public String iMateria() {
		String s=JOptionPane.showInputDialog("Enter field");
		return s;
	}
	@Override
	public int iNPaginas() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Enter number of pages");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public String iTitulo() {
		String s=JOptionPane.showInputDialog("Enter Title");
		return s;
	}
	@Override
	public String pClaves() {
		String s=JOptionPane.showInputDialog("Enter keywords");
		return s;
	}
	@Override
	public int ingreseID() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Enter ID");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public void errorCode() {
		JOptionPane.showMessageDialog(null, "Invalid code");
		
	}
	@Override
	public int ingreseCode() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Enter Code");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public int menuMostrar() {
		String s;
		int d=-1;
		int ok;
		do{ 
		try {
			s = JOptionPane.showInputDialog("You want to find:\n1.-Books\n2.-Magazine\n3.-Articles\n4.- CD ROM\n5.- All");
			d = Integer.parseInt(s);
			ok=1;
			if(d<1||d>5) ok=0;
		} catch (Exception e){
			ok=0;
		}}while(ok==0);	
		
		return d;
	}
	@Override
	public void errorDevolucion() {
		JOptionPane.showMessageDialog(null, "The material has not been paid");
		
	}
	@Override
	public void mDevolucion() {
		 JOptionPane.showMessageDialog(null, "Successful drop");
		
	}
	@Override
	public void mPrestamo() {
		JOptionPane.showMessageDialog(null, "Successful loan");
		
	}
	@Override
	public void errorPrestamo() {
		JOptionPane.showMessageDialog(null, "Excuse, the material already provided");
		
	}
	@Override
	public String iEditorial() {
		String s=JOptionPane.showInputDialog("Enter Publishing house");
		return s;
	}
	@Override
	public String iRevista() {
		String s=JOptionPane.showInputDialog("Enter magazine wrapper");
		return s;
	}
	@Override
	public void errorUser() {
		JOptionPane.showMessageDialog(null, "User not found");
		
	}
	@Override
	public void barraT() {
		System.out.println("TITLE/NAME(Magazine)		TYPE	CODE	Magazine Wrapper(Article)	AVAILABLE(1.-Yes  0.-No)");
		
	}
}
