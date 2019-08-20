
package poo;

public class Guitarra{
    
 //Define los datos
    public String material;
    public int altura;
    public String cuerdas;
    
    
    public Guitarra(){
  //Valores Iniciales
    material="N/A";
    altura=0;
    cuerdas="N/A";
    }

    
     public Guitarra(String material, int altura, String cuerdas)
     {
       //iguala los datos con las variables del metodo
         this.material=material;
         this.altura=altura;
         this.cuerdas=cuerdas;
     }
    
    
}