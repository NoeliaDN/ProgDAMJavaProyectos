package T9.FICHEROS.Serializable;

import java.io.*;

public class GuardarObjeto {
    public static void main(String[] args) {

        T9.FICHEROS.Binario.Persona[] personas = {
                new T9.FICHEROS.Binario.Persona("Aaron", 18),
                new T9.FICHEROS.Binario.Persona("Jose", 23),
                new T9.FICHEROS.Binario.Persona("Marcos", 18)
        };
        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("persona.ser"))) {
            oos.writeObject(personas);
            System.out.println("Persona guardado");
        } catch (IOException ioe) {
            ioe.printStackTrace();
        }


        //Leemos
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("persona.ser"))) {
            T9.FICHEROS.Binario.Persona[] p2;
            p2 = (T9.FICHEROS.Binario.Persona[]) ois.readObject();

        } catch (IOException | ClassNotFoundException e){
            e.printStackTrace();
        }
    }
}
