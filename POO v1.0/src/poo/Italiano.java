package poo;

import javax.swing.JOptionPane;

public class Italiano implements Idioma {
	public String iNombre(){
		String n=
		JOptionPane.showInputDialog("Inserisci il nome");
		return n;
	}
	public String iApellido(){
		String n=
		JOptionPane.showInputDialog("Inserire il cognome");
		return n;
	}
	
	public int menuInicial() {
		int op=6,ok=1;
		do{
		try {
			String option = JOptionPane
					.showInputDialog("******WELCOME*******\n\nsi vuole fare:\n1.-utente Definire nuovi\n2.-Inserisci Nuovo materiale\n3.-Loan\n4.-Return\n5.-query catalogo\n6.-Language Change\n7.-Out");
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
					.showInputDialog("Inserisci il tipo di materiale:\n1.-Book\n2.-Journals\n3.-articoli\n4. CD-Rom");
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
			s = JOptionPane.showInputDialog("Scegli la lingua: \n1.-Spagnolo \n2.-Inglese \n3.-Frances \n4.-Italiano");
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
		String s=JOptionPane.showInputDialog("Inserisci Autore");
		return s;
	}
	@Override
	public String iMateria() {
		String s=JOptionPane.showInputDialog("Inserisci Oggetto");
		return s;
	}
	@Override
	public int iNPaginas() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Inserire il numero di pagine");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public String iTitulo() {
		String s=JOptionPane.showInputDialog("Inserisci Titolo");
		return s;
	}
	@Override
	public String pClaves() {
		String s=JOptionPane.showInputDialog("Inserire le parole chiave");
		return s;
	}
	@Override
	public int ingreseID() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Inserisci ID");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public void errorCode() {
		JOptionPane.showMessageDialog(null, "Codice non valido");
		
	}
	@Override
	public int ingreseCode() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Inserisci il codice");
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
			s = JOptionPane.showInputDialog("Per cercare: \n1.-Books \n2.-Journals \n3.-Articoli \n4 .- CD ROM \n5 .- Tutti");
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
		JOptionPane.showMessageDialog(null, "Il materiale non è stata pagata");
		
	}
	@Override
	public void mDevolucion() {
		 JOptionPane.showMessageDialog(null, "Ritorno di successo");
		
	}
	@Override
	public void mPrestamo() {
		JOptionPane.showMessageDialog(null, "Prestito di successo");
		
	}
	@Override
	public void errorPrestamo() {
		JOptionPane.showMessageDialog(null, "Il materiale viene fornito");
		
	}
	@Override
	public String iEditorial() {
		String s=JOptionPane.showInputDialog("Inserisci Editoriale");
		return s;
	}
	@Override
	public String iRevista() {
		String s=JOptionPane.showInputDialog("Inserisci il nome della rivista wrapper");
		return s;
	}
	@Override
	public void errorUser() {
		JOptionPane.showMessageDialog(null, "Utente non trovato");
		
	}
	@Override
	public void barraT() {
		System.out.println("Titolo/Nome(Magazine)   TIPO 	CODICE 	Origine(articolo)	DISPONIBILE(1.-Se 0.-No)");
		
	}

}
