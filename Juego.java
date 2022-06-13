// Tarea 1 BIM II
// Traduzca el modelo de clases a código Java, respetando la sintaxis, de-finiendo sus constructores, atributos y métodos.

public class Juego{
    
    //Variables
    private String Principiante; 
    
    //Constructores
    public Juego(){
        
    }

    // Metodos
    public void setPrincipiante (String Principiante){
        this.Principiante = Principiante;
    }
    
    public String getPrincipiante(){
        return this.Principiante;
	}
	
	public static void main(String[] args) {
    	System.out.println("usar la clase Juego");
	}
}