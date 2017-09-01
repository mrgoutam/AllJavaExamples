package staticExamples;

/**
 *
 * @author Goutam
 */

//Java static blocks will be called when JVM loads the class into memory, means it will be called only once.
//But constructor will be called everytime when you create an object.
//The below example can give you an idea about execution.
public class MyStaticVsConstructor {
   
    static {
        System.out.println("I am in static block");
        System.out.println("Static block will be called first than constructor!!!");
        System.out.println("Static block will be called only once.");
    }
    
    public MyStaticVsConstructor(){
        System.out.println("I am in constructor");
    }
    
    public static void main(String a[]){
        MyStaticVsConstructor ksv1 = new MyStaticVsConstructor();
        MyStaticVsConstructor ksv2 = new MyStaticVsConstructor();
        MyStaticVsConstructor ksv3 = new MyStaticVsConstructor();
        MyStaticVsConstructor ksv4 = new MyStaticVsConstructor();
    }
}
