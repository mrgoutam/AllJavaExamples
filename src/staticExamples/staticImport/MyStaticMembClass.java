/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticExamples.staticImport;

/*
In general, any class from same package can be called without importing it.
Incase, if the class is not part of the same package, we need to provide the import statement to access the class.
We can access any static fields or methods with reference to the class name. Here comes the use of static imports.
Static imports allow us to import all static fields and methods into a class and you can access them without class
name reference. 

The syntax for static imports are given below:
package com.java2novice.staticimport;
// To access all static members of a class
import static package-name.class-name.*;
//To access specific static variable of a class
import static package-name.class-name.static-variable;
//To access specific static method of a class
import static package-name.class-name.static-method;

Here we have two classes. The class MyStaticMembClass has one static variable and one static method.
And anther class MyStaticImportExmp imports these two static members.
 */

public class MyStaticMembClass {
    public static final int INCREMENT = 2;
    
    public static int InrementNumber(int number){
        return number + INCREMENT;
    }
}
