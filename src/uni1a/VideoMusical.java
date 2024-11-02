package uni1a;

public class VideoMusical extends ContenidoAudiovisual{
	
	//Atributos
	private String cantante; //autor de la cancion
	
	//Constructor
	public VideoMusical(String titulo, int duracionEnMinutos, String genero, String cantante) {
		super(titulo, duracionEnMinutos, genero);
		this.cantante = cantante;
	}
	
	//Getters and Setters
	public String getCantante() {
		return cantante;
	}

	public void setCantante(String cantante) {
		this.cantante = cantante;
	}

	//Metodos
	public void mostrarDetalles() {
		System.out.println("----------------------");//aumento de un espacio
		System.out.println("Detalles del vídeo musical: ");
		System.out.println("ID: " + getId());
		System.out.println("Título: " + getTitulo());
		System.out.println("Duración en minutos: " + getDuracionEnMinutos());
        System.out.println("Género: " + getGenero());
		System.out.println("autor: " + getCantante());
		System.out.println();
	}
	
	
	

}
