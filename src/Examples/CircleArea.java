/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

import java.util.Scanner;

/**
 *
 * @author Goutam
 */
public class CircleArea {
    
    private int Radius;
    private final double PI = 3.14;
    private float area;
    
    public void Calculation(){
        System.out.println("Please enter the radius of the circle: ");
        Scanner input = new Scanner(System.in);
        Radius = input.nextInt();
        area = (float) (PI*Radius*Radius);
        System.out.println("Radius of the circle: "+area);
    }
    
    public static void main(String a[]){
        CircleArea  ca = new CircleArea();
        ca.Calculation();
    }
}
