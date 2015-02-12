/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package calcu;

import java.util.Vector;

/**
 *
 * @author USUARIO
 */
public class Calcu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float res;
        System.out.println("Didite operacion");
        res = binariaa(5,3,2);
        System.out.println(res);
    
//Arraylist<Int>    nombreArraylist = Array     
        
        
        
        
        
        
        
        
        
    }

    public Calcu() {
    }
    
    
    
    public static float binariaa(float a, float b,  int operacion){
    float x=0;
    
    
    switch (operacion){
        case 1://suma
            x = a + b;
            break;
        case 2://resta
            x = a - b;
            break;
        case 3://multi
            x = a * b;
            break;
        case 4://divi
            x = a / b;
            break;
        case 5://expon
            x = (float) Math.pow(a, b); //7^2 = 49
            break;
     
            
    }
    return x;
    }
    
    public static float unitaria(float a, int operacion){
    float y=0;
        switch (operacion){
        case 6://raiz
            y = (float) Math.sqrt(a);
            break;
        case 7://log
            y = (float) Math.log10(a);
            break;
        case 8://sin
            y = (float) Math.sin(a);
            break;
        case 9://cos
            y = (float) Math.cos(a);
            break;
        case 10://tan
            y = (float) Math.tan(a);
            break;
        case 11://euler'
            y = (float) Math.pow(2.7182818284,a); //7^2 = 49
            break;
            
    }
    return y;
    }
    
    
}
