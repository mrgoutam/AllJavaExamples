/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticExamples;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Goutam
 */

/*  
In java, static belongs to class. You can create static variables and static methods.
You can call these directly by using class name, without creating instance. 

Java static variables:
Static variables are belongs to the class and not to the object. These are only once,
at the starting of the execution. Static variables are not part of object state, means there 
is only one copy of the values will be served to all instances. You can call static variable with 
reference to class name without creating an object. Below example shows how to create and call static variables. 

Java static methods:
Static methods are also similar to static variables, you can access them with reference to class name, without creating object. Inside static methods, you cannot access instance variables or instance methods. You can only access static variables or static methods.


*/
public class MyStaticBlock {
    private static List<String> list;
    
    static{
        list = new ArrayList<String>();
        list.add("Goutam");
        list.add("Mousam");
        list.add("Diya");
    }
    public void testList(){
        System.out.println(list);
    }
    
    public static void main(String[] args){
        MyStaticBlock myStaticBlock = new MyStaticBlock();
        myStaticBlock.testList();
    }
}
