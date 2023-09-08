
package lab8p2_jesusrodriguez;

import java.io.Serializable;
import java.util.ArrayList;


public class Pais implements Serializable{
    private String name;
    private ArrayList<Nadadores> nadador= new ArrayList();
    private int medallas;
    private static final long SerialVersionUID=555L;


    public Pais(String name, int medallas) {
        this.name = name;
        this.medallas = medallas;
    }

    public Pais(String name, ArrayList<Nadadores> nadador, int medallas) {
        this.name = name;
        this.nadador = nadador;
        this.medallas = medallas;
    }

    
    
    
    
    
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Nadadores> getNadador() {
        return nadador;
    }

    public void setNadador(ArrayList<Nadadores> nadador) {
        this.nadador = nadador;
    }

    public int getMedallas() {
        return medallas;
    }

    public void setMedallas(int medallas) {
        this.medallas = medallas;
    }

    @Override
    public String toString() {
        return name;
    }
    
    
    
    
    
}
