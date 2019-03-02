/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

import java.util.Date;

/**
 *
 * @author 1895915
 */
public class Transfers {
    double amount;
    Date date;
    String id;
    public void setamount(double amount)
    {
        this.amount=amount;
    }
   public double getamount()
   {
       return amount;
   }
    public void setdate(Date date)
    {
        this.date=date;
    }
    public Date getdate()
    {
        return date;
    }
    public void setid(String id){
        this.id=id;
    }
    public String getid(){
        return id;
    }
    public void Transfers(double amount,Date date,String id){
        this.amount=amount;
        this.date=date;
        this.id=id;
    }
   
    
}
