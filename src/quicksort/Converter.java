/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package quicksort;

/**
 *
 * @author LCS
 * Metodo static não precisa instanciar para chama-lo
 */
public class Converter {
    public static int[] converter (String [] valores){
        int values[] = new int[valores.length];
        for(int i=0; i < valores.length; i++) {
            values[i] = Integer.parseInt(valores[i]);
        }
        return values;
    } 
}
