
package poo;

public class Figuras{
    
 //Define los datos
    public String material;
    public int altura;
    public String color;
    
    
    public Figuras(){
  //Valores Iniciales
    material="N/A";
    altura=0;
    color="N/A";
    }

    
     public Figuras(String material, int altura, String color)
     {
       //iguala los datos con las variables del metodo
         this.material=material;
         this.altura=altura;
         this.color=color;
     }
    
    
}