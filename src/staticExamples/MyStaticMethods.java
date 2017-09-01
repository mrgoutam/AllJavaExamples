/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticExamples;

/*
 Static blocks are nothing but a normal block of code, enclosed in braces { },
preceded with static keyword. These static blocks will be called when JVM loads the class into memory.
Incase a class has multiple static blocks across the class, then JVM combines all these blocks
as a single block of code and executes it. Static blocks will be called only once, when it is loaded
into memory. These are also called initialization blocks.
 */


public class MyStaticMethods {
    private String name;
    private static String staticStr = "STATIC_STRING";

    public MyStaticMethods(String name) {
        this.name = name;
    }
    
    public static void testStaticMethod(){
        System.out.println("Hey....Im in static method.");
        //you can call static variable here.
        System.out.println(MyStaticMethods.staticStr);
        //you cannot call instance variable here.
    }
    
    public void testObjectMethod(){
        System.out.println("Hey....Im not in static method.");
        //you can call static variable here.
        System.out.println(MyStaticMethods.staticStr);
        //you can call instance variable here.
        System.out.println(this.name);
    }
    
    public static void main(String[] args){
        //By using class name we can call static method
        MyStaticMethods.testStaticMethod();
        MyStaticMethods myStaticMethods = new MyStaticMethods("Goutam");
        myStaticMethods.testObjectMethod();
    }
}
