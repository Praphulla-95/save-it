/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

/**
 *
 * @author 1894438
 */
public class Wallet {
    Double bill, round_off_Amount, total_Amount;


     private void bill(){
        
        this.bill = bill;
    }
    private Double getbill(){
        
        return bill ;
    }
   
    private void round_off_Amount(){
        
        this.round_off_Amount = round_off_Amount;
    }
    private Double getround_off_Amount(){
        
        return round_off_Amount ;
    }
    private void total_Amount(){
        
        this.total_Amount = total_Amount;
    }
    private Double gettotal_Amount(){
        
        return total_Amount ;
    }
    public void Wallet(Double bill, Double round_off_Amount, Double total_Amount){
        
        this.bill = bill;
        this.round_off_Amount = round_off_Amount;
        this.total_Amount = total_Amount;
    }
    Store s = new Store();
}
