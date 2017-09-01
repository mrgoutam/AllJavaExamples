/*
Constructors are required to create objects for a class. 
Constructors are used to initialize the instance variables of an object.
Constructor declaration looks like method declaration. It must have the same name as that 
of the class and have no return type.
Constructors can be classified into two types, default constructors and parametarized constructors.
If you don't define a constructor, then the compiler creates a default constructor.
Default constructors do not contain any parameters. Default constructors are created 
only if there are no constructors defined by us.
Prametarized constructors are required to pass parameters on creation of objects.
We can overload constructors with different datatypes as its parameters.
Use 'this()' to communicate from one constructor to another constructor in the same class.
Use 'super()' to communicate with super class constructor.
*/
package Constructor;

/*
Default constructor refers to a constructor that is automatically created by compiler in
the absence of explicit constructors.
You can also call a constructor without parameters as default constructor because all of
its class instance variables are set to default values.
 */
public class MyDefaultConstructor {

    public MyDefaultConstructor() {
        System.out.println("I am inside default constructor...");
    }
    public static void main(String [] a){
        MyDefaultConstructor mdc = new MyDefaultConstructor();
        MyDefaultConstructor mdc1 = new MyDefaultConstructor();
    }
}
