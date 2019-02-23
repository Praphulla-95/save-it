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
    private void setamount(double amount)
    {
        this.amount=amount;
    }
   private double getamount()
   {
       return amount;
   }
    private void setdate(Date date)
    {
        this.date=date;
    }
    private Date getdate()
    {
        return date;
    }
    public void Transfers(double amount,Date date){
        this.amount=amount;
        this.date=date;
    }
   
    
}
