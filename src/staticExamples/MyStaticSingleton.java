/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticExamples;

/**
 *
 * @author Goutam
 */

//Since static blocks will be called only once, we can use static blocks to develop singleton class. 
//Below example shows how to create singleton classes using static block. 
//To create singleton class, make constructor as private, so that you cannot create object outside of the class.
//Create a private static variable of same class type, so that created object will be pointed to this reference.
//Now create static block, and create object inside static block.
//Since static block will be called only once, the object will be created only once.
public class MyStaticSingleton {
    public static void main(String[] args){
         mySingleton ms = mySingleton.getSingleton();
         mySingleton ms1 = mySingleton.getSingleton();
        ms.testSingleton();
        ms1.testSingleton();
    }
}

class mySingleton{
    private static mySingleton singleton;
    
    static{
        singleton = new mySingleton();
    }
    
    //constructor is private

    private mySingleton() {
        System.out.println("Creating MySingleton object...");
    }

    public static mySingleton getSingleton() {
        return singleton;
    }
    public void testSingleton(){
        System.out.println("Hey.... singleton got created...");
    }
    
}
