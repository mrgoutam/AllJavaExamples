/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Generics;

/**
 *
 * @author Goutam
 */
public class Gen<T> {
    T obj;

    public Gen(T obj) {
        this.obj = obj;
    }
    
    public void show(){
        System.out.println("The type of Object:"+obj.getClass().getName());
    }
    
    public T getObj(){
        return obj;
    }
}


class GenDemo{
    public static void main(String args[]){
        Gen<String> gen = new Gen<String>("Durga");
        gen.show();
        System.out.println(gen.getObj());
    }
}
