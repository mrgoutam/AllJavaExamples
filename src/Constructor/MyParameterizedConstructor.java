/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/*
Parameterized constructors are required to pass parameters on creation of objects.
If we define only parameterized constructors, then we cannot create an object with default constructor.
This is because compiler will not create default constructor. You need to create default constructor explicitly.
 */
public class MyParameterizedConstructor {
    private String name;

    public MyParameterizedConstructor(String name) {
        this.name = name;
        System.out.println("I am inside parameterized constructor.");
        System.out.println("The parameter value is: "+name);
    }
    public static void main(String a[]){
        MyParameterizedConstructor mpc = new MyParameterizedConstructor("Goutam Das");
    }
    
}
