// Tarea 1 BIM II
// Traduzca el modelo de clases a código Java, respetando la sintaxis, de-finiendo sus constructores, atributos y métodos.

public class Niveles{
    
    //Variables
    private String Mayor; 
    
    //Constructores
    public Niveles(){
        
    }

    // Metodos
    public void setMayor(String Mayor){
        this.Mayor = Mayor;
    }
    
    public String getMayor(){
        return this.Mayor;
	}
	
	public static void main(String[] args) {
    	System.out.println("usar la clase Niveles");
	}
}
