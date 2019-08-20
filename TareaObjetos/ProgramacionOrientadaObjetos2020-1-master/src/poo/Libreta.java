
package poo;

public class Libreta{
    
 //Define los datos
    public String material;
    public int altura;
    public double paginas;
    
    
    public Libreta(){
  //Valores Iniciales
    material="N/A";
    altura=0;
    paginas=0;
    }

    
     public Libreta(String material, int altura, double paginas)
     {
       //iguala los datos con las variables del metodo
         this.material=material;
         this.altura=altura;
         this.paginas=paginas;
      
     }
    
    
}
