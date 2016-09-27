/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swap;

/**
 *
 * @author user2
 */
public class Swap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int x=5;
        int y=10;
        
        //before Swap
        System.out.println("Before Swapping x :" +x);
        System.out.println("Before Swapping y :" +y);
        
        //Swapping
        x=x+y; //5+10=15
        y=x-y; //15-10=5
        x=x-y; //15-5=10
        
        //After Swapping
        System.out.println("After Swapping x :" +x);
        System.out.println("After Swapping y :" +y);
    }
    
}
