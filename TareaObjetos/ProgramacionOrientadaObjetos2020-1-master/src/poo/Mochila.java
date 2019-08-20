
package poo;

public class Mochila {
    
 //Define los datos
    public String marca;
    public int alto;
    public String tela;
    
    
    public Mochila(){
  //Valores Iniciales
    marca="N/A";
    alto=0;
    tela="N/A";
    }

    
     public Mochila(String marca, int alto, String tela)
     {
       //iguala los datos con las variables del metodo
      this.alto=alto;
      this.marca=marca;
      this.tela=tela;
     }
    
    
}