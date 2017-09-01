/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Enum;

/*
 they are implicitly final subclasses of java.lang.Enum. Enum constants are by default public static final fields.
 If you declare Enum is a member of your class, then by default it is static. We should not use new operator 
 with enum type at anytime.
 This example defines a basic enum type called Fruits. It contains few constants representing fruits. 
 The switch case uses these constants to execute conditions.
 */
public class MyBasicEnum {

    private Fruits myFruit;

    public MyBasicEnum(Fruits fruit) {
        this.myFruit = fruit;
    }

    public void getFruitDesc() {

        switch (myFruit) {
            case GRAPE:
                System.out.println("A grape is a non-climacteric fruit.");
                break;

            case APPLE:
                System.out.println("The apple is the pomaceous fruit.");
                break;

            case MANGO:
                System.out.println("The mango is a fleshy stone fruit.");
                break;

            case LEMON:
                System.out.println("Lemons are slow growing varieties of citrus.");
                break;

            default:
                System.out.println("No desc available.");
                break;
        }
    }

    public static void main(String a[]) {
        MyBasicEnum grape = new MyBasicEnum(Fruits.GRAPE);
        grape.getFruitDesc();
        MyBasicEnum apple = new MyBasicEnum(Fruits.APPLE);
        apple.getFruitDesc();
        MyBasicEnum lemon = new MyBasicEnum(Fruits.LEMON);
        lemon.getFruitDesc();
        MyBasicEnum guava = new MyBasicEnum(Fruits.GUAVA);
        guava.getFruitDesc();
    }
}

enum Fruits {
    GRAPE, APPLE, MANGO, LEMON, GUAVA
}
