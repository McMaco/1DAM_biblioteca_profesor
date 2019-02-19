package biblioteca_profesor;

public class libro {
	
	//ATRIBUTO DE CLASE
	public static int numero = 0;
	
	//ATRIBUTOS
	private String titulo;
	private String subtitulo;
	private String autor;
	private String autores;
	private String editorial;
	private int edicion;
	private String isbn;
	private String categoria;
	private String idioma;
	private String codigo;
	private int estado;
	private int[] fecha_prestamo;
	
	//CONTRUCTORES
	public libro() {
		numero++;
	}
	
	public libro(String[] datos, int edic) {
		titulo = datos[0];
		subtitulo = datos[1];
		autor = datos[2];
		autores = datos[3];
		editorial = datos[4];
		isbn = datos[5];
		categoria = datos[6];
		idioma= datos[7];
		codigo = setCodigo();
		estado = 0;
		fecha_prestamo[0] = 0;
		fecha_prestamo[1] = 0;
		fecha_prestamo[2] = 0;
		
		numero++;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String tit) {
		this.titulo = titulo;
	}

	public String getSubtitulo() {
		return subtitulo;
	}

	public void setSubtitulo(String subtit) {
		this.subtitulo = subtit;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String aut) {
		this.autor = aut;
	}

	public String getAutores() {
		return autores;
	}

	public void setAutores(String auts) {
		this.autores = auts;
	}

	public String getEditorial() {
		return editorial;
	}

	public void setEditorial(String edit) {
		this.editorial = edit;
	}

	public int getEdicion() {
		return edicion;
	}

	public void setEdicion(int edic) {
		this.edicion = edic;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn1) {
		this.isbn = isbn1;
	}

	public String getCategoria() {
		return categoria;
	}

	public void setCategoria(String cat) {
		this.categoria = cat;
	}

	public String getIdioma() {
		return idioma;
	}

	public void setIdioma(String idi) {
		this.idioma = idi;
	}

	public String getCodigo() {
		return codigo;
	}

	public String setCodigo() {
		char[] cat = this.categoria.toUpperCase().toCharArray();
		char[] aut = this.autor.toLowerCase().toCharArray();
		String codg = null;
		
		for(int i = 0; i < 3; i++) {
			codg += cat[i];
		}
		
		codg += Integer.toString(numero);
		
		for(int i = 0; i < 3; i++) {
			codg += aut[i];
		}
		
		return codg;
	}

	public int getEstado() {
		return estado;
	}

	public void setEstado(int est) {
		this.estado = est;
	}

	public int[] getFecha_prestamo() {
		return fecha_prestamo;
	}

	public void setFecha_prestamo(int[] f_prest) {
		this.fecha_prestamo = f_prest;
	}
	
	
	//OTROS METODOS
	public static void prestar(String dato, libro[] check) {
		
		for(int i = 0; i < check.length; i++){
			if(dato.equals(check[i].isbn)) {
				check[i].estado = 1;
			}
		}
	}
	
	public void vencido(String dato, int[] f_prest) {
		
		if(dato.equals(this.isbn)) {
			if(this.estado == 1) {
				if(this.fecha_prestamo[0] == f_prest[0]) {
					if(this.fecha_prestamo[1] == f_prest[1]) {
						if(this.fecha_prestamo[2] == f_prest[2]) {
							this.estado = 2;
						}
					}
				}
			}
		}
	}
	
	public static void devolver(String isbn1, libro[] check){
		
		for(int i = 0; i < check.length; i++){
			if(isbn1.equals(check[i].isbn)) {
				check[i].estado = 0;
			}
		}
	}
	
	public void eliminar(String isbn1){
		
		if(isbn1.equals(this.isbn)) {
			
		}
	}
}