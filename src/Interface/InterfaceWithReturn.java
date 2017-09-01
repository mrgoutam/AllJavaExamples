/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Interface;

/**
 *
 * @author Goutam
 */
public class InterfaceWithReturn {
    public static void main(String a[]){
        SBI sbi = new SBI();
        PNB pnb = new PNB();
        
        System.out.println("SBI interest : "+sbi.Interest());
        System.out.println("PNB interest : "+pnb.Interest());
    }
}

interface BankInterest{
    float Interest();
}

class SBI implements BankInterest{

    @Override
    public float Interest() {
        return 15.5f;
    }
    
}

class PNB implements BankInterest{

    @Override
    public float Interest() {
        return 12.5f;
    }
    
}