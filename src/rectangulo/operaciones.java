
package rectangulo;


public class operaciones {
    
    public int largo;
    public int ancho;
    
    
   public operaciones(int num1, int num2)       
   {
    largo=num1;
    ancho=num2;
       
   }
 
   public int area(){
       int area;
       area=(largo*ancho);
       return area;
   }
   
   public int perimetro(){
       int perimetro;
       perimetro=(largo+ancho*2);
       return perimetro;
       
   }

}
