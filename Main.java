/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package konstruktor;

/**
 *
 * @author Acer
 */
public class Main {
int a=100;

    public Main (){

        System.out.println("Nilai");
      
    }
    public void hello (){
        System.out.println("TUGAS JAVA");
     }
      public void PAP (){
        System.out.println("METHOD");
      }
public static void main(String[] args) {
Main objeck1 = new Main();
        System.out.println(objeck1.a);
     objeck1.hello();
     objeck1.PAP();
    }
    
}
