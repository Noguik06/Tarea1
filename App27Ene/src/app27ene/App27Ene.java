/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app27ene;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.LinkedList;

/**
 *
 * @author juannoguera
 */
public class App27Ene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws FileNotFoundException, IOException {
        // TODO code application logic here
        LinkedList lista = LeerArchivos.getLista("prueba.txt");
        if(lista.isEmpty()){
            System.out.println("Su lista no tiene ningún dato válido");
        }else{
            double media = Funciones.media(lista);
            if(lista.size() == 1){
                System.out.println("La media de su lista es " + media);
                System.out.println("No se puede calcular la desviación estándar ");
            }else{
                System.out.println("La media de su lista es " + media);
                System.out.println("La desviacion estandar de su lista es " + Funciones.desviacion(lista, media));
            }
        }
    }

}
