/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab8p2_jesusrodriguez;
import java.io.EOFException;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ADN {
    private ArrayList< Nadadores> nad = new ArrayList();
    private File archivo = null;

    public ADN(String path) {
        archivo = new File(path);
    }

    public ArrayList<Nadadores> getnad() {
        return nad;
    }

    public void setCountry(ArrayList<Nadadores> nad) {
        this.nad = nad;
    }

    public File getArchivo() {
        return archivo;
    }

    public void setArchivo(File archivo) {
        this.archivo = archivo;
    }
    
    public void binNad(){
             File archivo= new File("./Datos.nad");
            FileOutputStream fw = null;
        ObjectOutputStream bw = null;
        try {
            fw = new FileOutputStream(archivo);
            bw = new ObjectOutputStream(fw);
            for (Nadadores t : nad) {
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
    
    public void leerN(){
            try {            
            File ar= new File("./Datos.nad");
            Nadadores temp;
            if (ar.exists()) {
                FileInputStream entrada
                    = new FileInputStream(ar);
                ObjectInputStream objeto
                    = new ObjectInputStream(entrada);
                try {
                    while ((temp = (Nadadores) objeto.readObject()) != null) {
                        nad.add(temp);
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
