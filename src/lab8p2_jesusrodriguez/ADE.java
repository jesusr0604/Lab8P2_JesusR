/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jesusrodriguez;

import java.io.File;
import java.util.ArrayList;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;


public class ADE {
     private ArrayList< Evento> evts = new ArrayList();
    private File archivo = null;

    public ADE(String path) {
        archivo = new File(path);
    }

    public ArrayList<Evento> getEvts() {
        return evts;
    }

    public void setEvts(ArrayList<Evento> evts) {
        this.evts = evts;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
     public void binEVT(){
            File archivo= new File("./Datos.evt");
            FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for ( Evento t : evts) {
                bw.writeObject(t);
            }
            bw.flush();
        } catch (Exception ex) {
        } finally {
            try {
                bw.close();
                fw.close();
            } catch (Exception ex) {
            }
        } 
        }
     
     
     public void leerEVT(){
            try {            
            File ar= new File("./Datos.evt");
            Evento temp;
            if (ar.exists()) {
                FileInputStream entrada
                    = new FileInputStream(ar);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Evento) objeto.readObject()) != null) {
                        evts.add(temp);
                    }
                } catch (EOFException e) {
                    //encontro el final del archivo
                }
                objeto.close();
                entrada.close();
            }            
        } catch (Exception ex) {
            ex.printStackTrace();
        }
         }
}
