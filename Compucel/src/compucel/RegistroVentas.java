
package compucel;

public class RegistroVentas {
    public static void main(String[] args) {
        
        ProductoCam VentCamara = new ProductoCam();
     String cabecera="\n\tESCOGER UN MODELO DE TELEVISOR\n";
     
         //cabecera = cabecera + "XXXX";

    cabecera += "\n\tCodigo\tModelo\n";
    cabecera += "\t------\t------\n";

     

    String menu="\t 1\tLED TV\n";
    menu+="\t 2\tAndroid TV\n";
    menu+="\t 3\tOLED TV\n";
    menu+="\t 4\tQLED TV\n";
    menu+="\t 5\tSalir\n";
    
    System.out.println(cabecera + menu);
    System.out.println("Escoger una de las opciones:");
    }
}
