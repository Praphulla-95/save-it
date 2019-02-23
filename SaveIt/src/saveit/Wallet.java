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


     public void setbill(Double bill){
        
        this.bill = bill;
    }
    public Double getbill(){
        
        return bill ;
    }
   
    public void setround_off_Amount(Double round_off_Amount){
        
        this.round_off_Amount = round_off_Amount;
    }
    public Double getround_off_Amount(){
        
        return round_off_Amount ;
    }
    public void settotal_Amount(Double total_Amount){
        
        this.total_Amount = total_Amount;
    }
    public Double gettotal_Amount(){
        
        return total_Amount ;
    }
    public void Wallet(Double bill, Double round_off_Amount, Double total_Amount){
        
        this.bill = bill;
        this.round_off_Amount = round_off_Amount;
        this.total_Amount = total_Amount;
    }
    Store s = new Store();
}
