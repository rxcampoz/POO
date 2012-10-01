package poo;
import java.util.ArrayList;


public class PruebaBiblioteca  {


	    public static void main(String[] args) {
	    ArrayList<Usuario> user=new ArrayList<Usuario>();
		ArrayList<Libros> l=new ArrayList<Libros>();
		ArrayList<Revistas> r=new ArrayList<Revistas>();
		ArrayList<Articulos> art=new ArrayList<Articulos>();
		ArrayList<CDROMs> cd=new ArrayList<CDROMs>();
		ArrayList<MaterialesBibliograficos> mb=new ArrayList<MaterialesBibliograficos>();
		
		int idiomaOption=1,option;
				
		Idioma i=new Spanish();
		
		
	do{
		
		switch(idiomaOption){
			case 1: i=new Spanish();break;
			case 2: i=new English();break;
			case 3: i=new Frances();break;
			case 4: i=new Italiano();break;
		}
		option=i.menuInicial();
				
		if(option==1){
			String nombre=i.iNombre();
			String apellido=i.iApellido();
			user.add(new Usuario (nombre,apellido));
			int j=user.size()-1;
				System.out.println(user.get(j)+"   ");
		}
		
		if(option==2){
			int tipo;
			tipo=i.tipoMaterial();
						
		switch(tipo){
			case 1:
				l.add(new Libros(i.iTitulo(),i.iAutores(),i.iMateria(),i.iEditorial()));
				mb.add(l.get(l.size()-1));
				break;
			case 2:
				r.add(new Revistas(i.iTitulo(),i.iNombre(),i.iMateria()));
				break;
			case 3:
				String rev=i.iRevista();
				Revistas revistaNueva=existeRevista(rev,r);
				art.add(new Articulos(i.iTitulo(), i.iAutores(), i.iNPaginas(),i.pClaves() , revistaNueva));
				mb.add(art.get(art.size()-1));
				break;
			case 4:
				
				cd.add(new CDROMs(i.iTitulo(),i.iMateria(),i.iEditorial()));
				mb.add(cd.get(cd.size()-1));
				break;
		}}
		
		if(option==3){
			int idU=0,idOk=0,tp=0,code,codeOk=0;
			idU=i.ingreseID();
			for(int j=0;j<user.size();j++){
				if(user.get(j).getCodigo()==idU)		idOk=1;
			}
			
			if(idOk==1){
				tp=i.tipoMaterial();
				code=i.ingreseCode(); 
				switch(tp){
					case 1: 
						for(int j=0;j<l.size();j++){
							if(l.get(j).getCode()==code){
								if(l.get(j).estaPrestado==0){
									l.get(j).estaPrestado=1;
									i.mPrestamo();
								}else i.errorPrestamo();
								codeOk=1;
							}
						}if(codeOk==0)i.errorCode();
						break;
					case 2: 
						for(int j=0;j<r.size();j++){
							if(r.get(j).getCode()==code){
								if(r.get(j).estaPrestado==0){
									r.get(j).estaPrestado=1;
									i.mPrestamo();
								}else i.errorPrestamo();
								codeOk=1;
							}
						}if(codeOk==0) i.errorCode();break;
					case 3: 
						for(int j=0;j<art.size();j++){
							if(art.get(j).getCode()==code){
								if(art.get(j).revista.estaPrestado==0){
								art.get(j).revista.estaPrestado=1;
								i.mPrestamo();
								}else i.errorPrestamo();
								codeOk=1;
							}
						}if(codeOk==0)i.errorCode();break;
					case 4: 
						for(int j=0;j<cd.size();j++){
							if(cd.get(j).getCode()==code){
								if(cd.get(j).estaPrestado==0){
								cd.get(j).estaPrestado=1;
								i.mPrestamo();
								}else i.errorPrestamo();
								codeOk=1;}
						}if(codeOk==0)i.errorCode();break;
				}
			}else i.errorUser();
			
		}
		
		if(option==4){
			int tp,code,codeOk=0;
			tp=i.tipoMaterial();
			code=i.ingreseCode();
			switch(tp){
					case 1: 
						for(int j=0;j<l.size();j++){
							if(l.get(j).getCode()==code){
							if(l.get(j).estaPrestado==1){
								l.get(j).estaPrestado=0;
								i.mDevolucion();
							}
							else i.errorDevolucion();
							codeOk=1;}
						}if(codeOk==0)i.errorCode();
						break;
					case 2: 
						for(int j=0;j<r.size();j++){
							if(r.get(j).getCode()==code){
							if(r.get(j).estaPrestado==1){
								r.get(j).estaPrestado=0;
								i.mDevolucion();
							}
							else i.errorDevolucion();
							codeOk=1;
							}
						}if(codeOk==0) i.errorCode();break;
					case 3: 
						for(int j=0;j<art.size();j++){
							if(art.get(j).getCode()==code){
							if(art.get(j).revista.estaPrestado==1){
								art.get(j).revista.estaPrestado=0;
								i.mDevolucion();
							}
							else i.errorDevolucion();
							codeOk=1;
							}
						}if(codeOk==0)i.errorCode();break;
					case 4: 
						for(int j=0;j<cd.size();j++){
							if(cd.get(j).getCode()==code){
							if(cd.get(j).estaPrestado==1){
								cd.get(j).estaPrestado=1;
								i.mDevolucion();
							}
							codeOk=1;
							}
						}if(codeOk==0)i.errorCode();break;
				}
		}
		
		if(option==5){
			int op=i.menuMostrar();
			i.barraT();
			switch(op){
				case 1:
					java.util.Collections.sort(l);
					for(int j=0;j<l.size();j++)
						System.out.println(l.get(j));break;
				case 2:
					java.util.Collections.sort(r);
					for(int j=0;j<r.size();j++)
						System.out.println(r.get(j));break;
				case 3:
					java.util.Collections.sort(art);
					for(int j=0;j<art.size();j++)
						System.out.println(art.get(j));break;
				case 4:
					java.util.Collections.sort(cd);
					for(int j=0;j<cd.size();j++)
						System.out.println(cd.get(j));break;
				case 5:
					java.util.Collections.sort(mb);
					for(int j=0;j<mb.size();j++)
						System.out.println(mb.get(j));break;
			}
		}
		
		if(option==6) idiomaOption=i.cambiarIdioma();
		}while(option!=7);
	
		System.exit(0);
	}
	
	
	public static Revistas existeRevista(String nombre,ArrayList <Revistas> l){
		int existe=0;
		Revistas r = null;
		for(int i=0;i<l.size();i++){
			if(l.get(i).getNombre()==nombre){
				existe=1;
				r=l.get(i);
			}
		}
		if(existe==0){
			r=new Revistas(nombre,nombre,"Varios");
			l.add(r);
		}
		
		return r;
	}
}
