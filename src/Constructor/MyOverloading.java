/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Constructor;

/*
Like method overloading we can overload constructors also.
Along with default constructor, we can have constructors with parameters. 
The no of parameters can be same, and it can have different datatypes.
Below example gives sample code for constructors overloading.
 */
public class MyOverloading {
    public MyOverloading(){
        System.out.println("Inside default constructor");
    }
    public MyOverloading(int i){
        System.out.println("Inside single parameter constructor with int value");
    }
    public MyOverloading(String str){
        System.out.println("Inside single parameter constructor with String object");
    }
    public MyOverloading(int i, int j){
        System.out.println("Inside double parameter constructor");
    }
     
    public static void main(String a[]){
        MyOverloading mco = new MyOverloading();
        MyOverloading spmco = new MyOverloading(10);
        MyOverloading dpmco = new MyOverloading(10,20);
        MyOverloading dpmco2 = new MyOverloading("java2novice");
    }
}
