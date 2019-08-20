
package poo;

public class Computadora {
    
 //Define los datos
    public String procesador;
    public int precio;
    public String envio;
    
    
    public Computadora(){
  //Valores Iniciales
  procesador="Ninguno";
  precio=0;
  envio="Sin destino";
    }

    
     public Computadora(String procesador, int precio, String envio)
     {
       //iguala los datos con las variables del metodo
    this.procesador=procesador;
    this.precio=precio;
    this.envio= envio;
     }
    
    
}