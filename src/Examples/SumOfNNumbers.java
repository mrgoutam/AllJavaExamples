/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Examples;

/**
 *
 * @author Goutam
 */
public class SumOfNNumbers {
    int sum = 0;
    int n = 50;
    public static void main(String []args){
        SumOfNNumbers sumOfNNumbers =  new SumOfNNumbers();
        System.out.println(sumOfNNumbers.SumMethod());
    }
    
    private int SumMethod(){
        for(int i=0; i<=n; i++){
            sum  += i;
        }
        return sum;
    }
}
