/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package app27ene;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author juannoguera
 */
public class Funciones {
    public static double media(LinkedList lista){
        Iterator it = lista.iterator();
        double suma = 0;
        while(it.hasNext()){
            suma += Double.parseDouble(it.next().toString());
        }
        return suma/lista.size();
    }
    
      public static double desviacion(LinkedList lista, double media){
        Iterator it = lista.iterator();
        double suma = 0;
        while(it.hasNext()){
            suma += Math.pow(Double.parseDouble(it.next().toString()) - media, 2);
        }
        return Math.sqrt(suma/(lista.size()-1));
    }
}
