public class Punto3D extends PuntoTiempo { 
    
    private int z;
    public Punto3D (int x, int y, int z, int t) {

        
        super (x, y, t);
        this.z=z;
    
    };
    
    
    public int getz() {
        return this.z;
    }
    
    public final void setz (int z) {

        this.z = z;
    }
    
    @Override
    public void multiplicacion() {
    System.out.println(this.getX() * this.getX()*this.gett()*this.z);
    }
} 
    