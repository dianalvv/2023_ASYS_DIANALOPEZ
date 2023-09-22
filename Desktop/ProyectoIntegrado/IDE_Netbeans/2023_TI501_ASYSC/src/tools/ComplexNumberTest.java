/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

/**
 *
 * @author Diana
 */
public class ComplexNumberTest {
    public static void main(String[]args){
        //TP01 P1
        
        ComplexNumbers a0= new ComplexNumbers(-1,2);
        ComplexNumbers a1 = new ComplexNumbers(4,0);
        ComplexNumbers a2 = new ComplexNumbers(1,-1);
        ComplexNumbers a3= new ComplexNumbers(2,-1);
        ComplexNumbers a4 = new ComplexNumbers(1,1);
        
        ComplexNumbers a0_2 = a0.toN(2);
        ComplexNumbers div0 = a1.div(a2);
        ComplexNumbers div1 = a3.div(a4);
        ComplexNumbers suma = div0.add(div1);
        ComplexNumbers TP01_P1 = a0_2.mult(suma);
        
        System.out.println("TP01_P1: " + TP01_P1.getA()+ "+" + TP01_P1.getB()+"i");
    }
    
}
