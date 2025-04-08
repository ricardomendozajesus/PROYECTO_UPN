
package compucel;

public class ProductoCam {
    //atributos
    private boolean encendido;
    private int canal;
    private int volumen;
    private int brillo;
    private String modelo;
    private double versionAndroid;
  
    
    private int tamano;
    private double precioVenta;
    //creacion de metodos get y set

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getTamano() {
        return tamano;
    }

    public void setTamano(int tamano) {
        this.tamano = tamano;
    }
    
    public int getCanal() {
        return canal;
    }

    public void setCanal(int canal) {
        this.canal = canal;
    }

    public int getBrillo() {
        return brillo;
    }

    public void setBrillo(int brillo) {
        this.brillo = brillo;
    }
    
    
    //creacion de metodos 
    public void encender(){
        this.encendido=true;
        System.out.println("La tv esta encendida");
    }
    public void apagar(){
        this.encendido=true;
        System.out.println("La tv esta apagada");
    }
    public  void dirigirse_al_canal(int nuevo_canal){
        this.canal = nuevo_canal;
        System.out.println("el nuevo canal es " + this.canal);
    }
    
  public void actualizar_android(double nueva_version) {
    if(this.versionAndroid>=nueva_version)
      System.out.println("Ya se encuentra actualizado");
    else {
      this.versionAndroid = nueva_version;
      System.out.println("Nueva versión de Android: " + this.versionAndroid);
    }
  }

    public void CalcularPrecio(int nmodelo){
        switch(nmodelo){
            case 1:
                this.precioVenta=100 * this.tamano;
                break;
            case 2:
                this.precioVenta=125 * this.tamano;
                break;       
            case 3:
                this.precioVenta=150 * this.tamano;
                break;
            case 4:
                this.precioVenta=200 * this.tamano;
                break;
            default:
                this.precioVenta=0;
                break;                
        }
        System.out.println("SUBTOTAL DE VENTA: " + this.precioVenta);
    }   
}

    