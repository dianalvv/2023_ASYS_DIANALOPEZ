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
public class ComplexNumbers {
    private float a;
    private float b;
    
    public ComplexNumbers(){
        
    }
    
    public ComplexNumbers(float a, float b){
        this.a = a;
        this.b = b;
    }

    public float getA() {
        return a;
    }

    public void setA(float a) {
        this.a = a;
    }

    public float getB() {
        return b;
    }

    public void setB(float b) {
        this.b = b;
    }
    
    public ComplexNumbers conj(){
        return new ComplexNumbers(this.a, -this.b);
    }
    public static ComplexNumbers conj(ComplexNumbers z){
        return new ComplexNumbers(z.a, -z.b);
    }
    
    
    public ComplexNumbers add(ComplexNumbers z){
        return new ComplexNumbers(this.a + z.a, this.b + z.b);
    }
    
    public ComplexNumbers subs(ComplexNumbers z){
        return new ComplexNumbers(this.a - z.a, this.b - z.b);
    }
    
    public ComplexNumbers mult(ComplexNumbers z){
        return new ComplexNumbers(
                this.a * z.a - this.b * z.b,
                this.a * z.b + z.a * this.b);
    }
    
    public ComplexNumbers div(ComplexNumbers z){
        ComplexNumbers aux = mult(conj(z));
        float den = z.a*z.a + z.b*z.b;
        return new ComplexNumbers(aux.a/den, aux.b/den);
    }
    
    public static float mod(ComplexNumbers z){
        return (float) Math.sqrt(z.a*z.a + z.b*z.b);
    }
    
    public float mod(){
        return (float) Math.sqrt(this.a*this.a + this.b*this.b );
    }
    public float angle(){
        return (float) Math.atan2(this.b, this.a);
    }
    
    public float angle(ComplexNumbers z){
        return(float) Math.atan2(z.b, z.a);
    }
    
    public ComplexNumbers toN(int n ){
        float m = mod();
        float angle = angle();
        
        return new ComplexNumbers(
        (float)(Math.pow(m, n)* Math.cos(n*angle)),
        (float)(Math.pow(m, n) * Math.sin(n*angle)));
    }
    
    
            
    
}
