
package rectangulo;
import java.util.Scanner;
import rectangulo.operaciones;

public class Rectangulo {

    
   
    public static void main(String[] args) {
        Scanner RT=new Scanner (System.in);
        int largo;
        int ancho;
        double resul;
        
       System.out.println("Dijite longitud de largo: ");
       largo=RT.nextInt();
       System.out.println("Dijite longitud de ancho: ");
       ancho=RT.nextInt();
        
       
       
       operaciones w = new operaciones(largo,ancho);
        
       resul=w.area();
       resul=w.perimetro();
       
       System.out.println("el area es :"+w.area()+"cm^2");
       System.out.println("el perimetro es:"+w.perimetro()+"cm");
    }
    
}
