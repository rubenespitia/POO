
package poo;

public class Manuales{
    
 //Define los datos
    public String material;
    public int altura;
    public double paginas;
    public String editorial;
    
    
    public Manuales(){
  //Valores Iniciales
    material="N/A";
    altura=0;
    paginas=0;
    editorial="N/A";
    }

    
     public Manuales(String material, int altura, double paginas, String editorial)
     {
       //iguala los datos con las variables del metodo
         this.material=material;
         this.altura=altura;
         this.paginas=paginas;
         this.editorial=editorial;
     }
    
    
}
