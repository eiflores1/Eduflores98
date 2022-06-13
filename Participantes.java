// Tarea 1 BIM II
// Traduzca el modelo de clases a código Java, respetando la sintaxis, de-finiendo sus constructores, atributos y métodos.

public class Participantes{
    
    //Variables
    private String Luchadores; 
    
    //Constructores
    public Participantes(){
        
    }

    // Metodos
    public void setLuchadores(String Luchadores){
        this.Luchadores = Luchadores;
    }
    
    public String getLuchadores(){
        return this.Luchadores;
	}
	
	public static void main(String[] args) {
    	System.out.println("usar la clase Participantes");
	}
}