/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab10;

/**
 *
 * @author acer
 */
public class q4 {
    public static void Meathod1(int x){
        if(x<0)
            throw new IllegalArgumentException("age cannot be less than 0");
        else
            System.out.println("Age is "+x);
    } 
    public static void main(String[] args) {
        try{
            Meathod1(-15);
        }
        catch(IllegalArgumentException e){
            throw new RuntimeException("it may generaqte Runtime Exception "+e.getMessage());
        }
    }
}
