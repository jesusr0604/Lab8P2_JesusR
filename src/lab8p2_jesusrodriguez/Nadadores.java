
package lab8p2_jesusrodriguez;


public class Nadadores {
    private String nombre;
    private Pais nacion;
    private String nacional;
    private int edad;
    private double height;
    private String nadar;
    private int dis;
    private int rap;
    private int medals;

    public Nadadores(String nombre, Pais nacion, int edad, double height, String nadar, int dis, int rap, int medals) {
        this.nombre = nombre;
        this.nacional =nacion.getName() ;
        this.edad = edad;
        this.height = height;
        this.nadar = nadar;
        this.dis = dis;
        this.rap = rap;
        this.medals = medals;
        this.nacion= nacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Pais getNacion() {
        return nacion;
    }

    public void setNacion(Pais nacion) {
        this.nacion = nacion;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getNadar() {
        return nadar;
    }

    public void setNadar(String nadar) {
        this.nadar = nadar;
    }

    public int getDis() {
        return dis;
    }

    public void setDis(int dis) {
        this.dis = dis;
    }

    public int getRap() {
        return rap;
    }

    public void setRap(int rap) {
        this.rap = rap;
    }

    public int getMedals() {
        return medals;
    }

    public void setMedals(int medals) {
        this.medals = medals;
    }

    @Override
    public String toString() {
        return nombre;
    }
    
    
    
}
