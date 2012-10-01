package poo;
/**
 * metodos que seran heredados por todas las clases que implementen esta interface y que tendran el mismo objetivo en todas las que se aplique
 * @author Ricardo y Freddy
 */
public interface Idioma {
	/**
	 * metodo tipo String que captura el nombre de usuario 
	 * @return nombre
	 */
	public String iNombre();
	/**
	 * metodo tipo String que captura el apellido de usuario 
	 * @return apellido
	 */
	public String iApellido();
	/**
	 * Pide la opcion del menu inicial y la valida que este entre 1 y 7 y tambien se le agrega un catch para
	 * validar que los ingresados solo sean numeros
	 * @return una opcion del menu inicial
	 */
	public int menuInicial();
	/**
	 * metodo tipo int para retornar la opcion de  material capturada el cual tambien es validado con excepcion
	 *@return tipo de material
	 */
	public int tipoMaterial();
	
	/** 
	 * metodo que captura la opcion del idioma
	 * @return idioma seleccionado
	 */
	public int cambiarIdioma();
	
	public String iTitulo();
	/**
	 * metodo tipo String que captura una cadena
	 * @return titulo
	 */
	public String iAutores();
	/**
	 * especifica la materia a registrar y la retorna
	 * @return materia
	 */
	public String iMateria();
	/**
	 * 
	 * 
	 */
	public int iNPaginas();
	/**
	 * metodo que captura la palabras claves ingresadas por el usuario
	 * @return palabras clavas
	 */
	public String pClaves();
	/**
	 * captura el ID (codigo) de un libro
	 * @return ID
	 */
	public int ingreseID();
	/**
	 * pide el codido del libro prestado
	 * @return codigo de libro
	 */
	public int ingreseCode();
	/**
	 * imprime "codigo invalido"
	 */
	public void errorCode();
	/**
	 * muestra un menu de las opciones de los materiales de la biblioteca
	 * @return  dato capturado como int
	 */
	public int menuMostrar();
	/**
	 * imprime  "El material no ha sido prestado"
	 */
	public void errorDevolucion();
	/**
	 * imprime "Prestamo exitoso"
	 */
	public void mPrestamo();
    /**
    * "El material no ha sido prestado"
    */
	public void mDevolucion();
	/**
	 *imprime "El material se encuentra prestado"
	 */
	public void errorPrestamo();
	/**
	 * recibe el editorial de un libro
	 *@return editorial
	 */
	public String iEditorial();
	/**
	 * captura el nombre de la revista
	 * @return nombre de la revista
	 */
	public String iRevista();
	/**
	 * imprime "Usuario no encontrado"
	 */
	public void errorUser();
	/**
	 *imprime "TITULO/NOMBRE(Revistas)		TIPO	CODIGO	ORIGEN(Articulos)	DISPONIBLE  (1.-Si  0.-No)");
	 */
	public void barraT();
}
