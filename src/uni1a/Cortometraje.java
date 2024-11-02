package uni1a;

public class Cortometraje extends ContenidoAudiovisual {
	
	//Atributos
	private String director;

	//Constructor
	public Cortometraje(String titulo, int duracionEnMinutos, String genero, String director) {
		super(titulo, duracionEnMinutos, genero);
		this.director = director;
	}
	
	//Getters and setters
	public String getDirector() {
		return director;
	}

	public void setDirector(String director) {
		this.director = director;
	}

	//Metodos
	public void mostrarDetalles() {
		System.out.println("----------------------");//aumento de un espacio
		System.out.println("Detalles del cortometraje: ");
		System.out.println("ID: " + getId());
        System.out.println("Título: " + getTitulo());
        System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
        System.out.println("director: " + getDirector());
        System.out.println();
		
	}

	
	
	

}


