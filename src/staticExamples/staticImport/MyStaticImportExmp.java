/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package staticExamples.staticImport;
import static staticExamples.staticImport.MyStaticMembClass.INCREMENT;
import static staticExamples.staticImport.MyStaticMembClass.InrementNumber;
/**
 *
 * @author Goutam
 */
public class MyStaticImportExmp {
    public static void main(String a[]){
        //with static import we dont have to write static fields followed by class name
        System.out.println("Increment value: "+INCREMENT);
        int count = 10;
        System.out.println("Increment count: "+InrementNumber(count));
        System.out.println("Increment count: "+InrementNumber(count));
    }
}
