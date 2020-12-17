/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebafecha;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author ALEJO
 */
public class PruebaFecha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Date fecha = new Date();
        SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/YYYY");
        
        String fecha2 = formatoFecha.format(fecha);
        System.out.println(fecha2);
        
        String dia = fecha2.substring(0, 2);
        String mes = fecha2.substring(3, 5);
        String anio = fecha2.substring(6, 10);
        
        System.out.println(dia);
        System.out.println(mes);
        System.out.println(anio);
        
        
    }
    
}
