/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/*
This example gives how to override toString() method with enum constants. 
By default the enum toString() method returns the constant name itself. 
You can change return value by overriding toString() method.
 */
public class MyEnumtoString {
    enum Fruit {
        GRAPE{
            @Override
            public String toString(){
                return "A grape is a non-climacteric fruit.";
            }
        }, 
        APPLE{
            @Override
            public String toString(){
                return "The apple is the pomaceous fruit.";
            }
        }, 
        MANGO{
            @Override
            public String toString(){
                return "The mango is a fleshy stone fruit.";
            }
        }, 
        LEMON{
            @Override
            public String toString(){
                return "Lemons are slow growing varieties of citrus.";
            }
        } 
    }
     
    public static void main(String a[]){
        System.out.println(Fruit.GRAPE);
        System.out.println(Fruit.APPLE);
        System.out.println(Fruit.MANGO);
    }
}
