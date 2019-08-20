
package poo;

public class Juguete{
    
 //Define los datos
    public String material;
    public int altura;
    public String color;
    
    
    public Juguete(){
  //Valores Iniciales
    material="N/A";
    altura=0;
    color="N/A";
    }

    
     public Juguete(String material, int altura, String color)
     {
       //iguala los datos con las variables del metodo
         this.material=material;
         this.altura=altura;
         this.color=color;
     }
    
    
}