/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Annotation;

/**
 *
 * @author Goutam
 */
public @interface MyAnnTest{
    String name();
    String desc();
}

class MySampleAnn {
     @MyAnnTest(name = "test1", desc = "testing annotations")
    public void myTestMethod(){
        //method implementation
    }
}
