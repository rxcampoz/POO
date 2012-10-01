package poo;

import javax.swing.JOptionPane;

public class Frances implements Idioma {
	public String iNombre(){
		String n=
		JOptionPane.showInputDialog("Entrez le nom de");
		return n;
	}
	public String iApellido(){
		String n=
		JOptionPane.showInputDialog("Entrer le nom");
		return n;
	}
	@Override
	public int menuInicial() {
		int op=6,ok=1;
		do{
		try {
			String option = JOptionPane
					.showInputDialog("*******BIENVENUE*******\n \nVous voulez faire:\n1.- Définir un nouvel utilisateur\n2.-Enter New material\n3.-Loan\n4.-Return \n5.-Requêtes catalog\n6.-Changer la langue\n7.-Out");
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
					.showInputDialog("Entrez le type de matériau:\n1.-Book\n2. Revues\n3.-Articles\n4.-CD Rom");
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
			s = JOptionPane.showInputDialog("Choisir la langue: \n1.-espagnol \n2.-Anglais \n3.-Frances \n4.-Italien");
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
		String s=JOptionPane.showInputDialog("Entrez Auteur");
		return s;
	}
	@Override
	public String iMateria() {
		String s=JOptionPane.showInputDialog("Introduire le sujet");
		return s;
	}
	@Override
	public int iNPaginas() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Entrez le nombre de pages");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public String iTitulo() {
		String s=JOptionPane.showInputDialog("Saisissez le Titre");
		return s;
	}
	@Override
	public String pClaves() {
		String s=JOptionPane.showInputDialog("Entrez les mots-clés");
		return s;
	}
	@Override
	public int ingreseID() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Entrez ID");
		n=Integer.parseInt(s);
		}catch(Exception e){
			ok=0;
		}}while(ok==0);
		return n;
	}
	@Override
	public void errorCode() {
		JOptionPane.showMessageDialog(null, "Erreur de code");
		
	}
	@Override
	public int ingreseCode() {
		int ok,n=0;
		do{ok=1;
		try{
		String s=JOptionPane.showInputDialog("Entrez code");
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
			s = JOptionPane.showInputDialog("Pour rechercher:\n1.-Livres\n2. Revues\n3.-Articles\n4.- CD ROM\n5 .- Tous les");
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
		JOptionPane.showMessageDialog(null, "Le matériel n'a pas été payée");
		
	}
	@Override
	public void mDevolucion() {
		 JOptionPane.showMessageDialog(null, "Retour réussi");
		
	}
	@Override
	public void mPrestamo() {
		JOptionPane.showMessageDialog(null, "Succès de prêt");
		
	}
	@Override
	public void errorPrestamo() {
		JOptionPane.showMessageDialog(null, "Le matériel est fourni");
		
	}
	@Override
	public String iEditorial() {
		String s=JOptionPane.showInputDialog("Entrez Editorial");
		return s;
	}
	@Override
	public String iRevista() {
		String s=JOptionPane.showInputDialog("Entrez le nom de l'enveloppe Magazine");
		return s;
	}
	@Override
	public void errorUser() {
		JOptionPane.showMessageDialog(null, "Utilisateur non trouvé");
		
	}
	@Override
	public void barraT() {
		System.out.println("TITRE/NOM(Revues)	 Type	 de code 	source(les articles)     stock(1.-Oui 0.-no)");
		
	}

}
