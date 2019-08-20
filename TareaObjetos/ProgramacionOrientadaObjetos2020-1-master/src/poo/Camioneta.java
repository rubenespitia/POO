
package poo;

public class Camioneta{
    
 //Define los datos
    public String modelo;
    public int velocidades;
    public String tipomotor;
    
    
    public Camioneta(){
  //Valore0s Iniciales
    modelo="N/A";
    velocidades=0;
    tipomotor="N/A";
    }

    
     public Camioneta(String modelo, int velocidades, String tipomotor)
     {
       //iguala los datos con las variables del metodo
    this.modelo=modelo;
    this.tipomotor=tipomotor;
    this.velocidades=velocidades;
     }
    
    
}
