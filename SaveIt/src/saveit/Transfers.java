/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author 1895915
 */
public class Transfers {
    double amount;
    String date;
    String id;
    public void setamount(double amount)
    {
        this.amount=amount;
    }
   public double getamount()
   {
       return amount;
   }
    public void setdate(String date)
    {
        this.date=date;
    }
    public String getdate()
    {
        return date;
    }
    public void setid(String id){
        this.id=id;
    }
    public String getid(){
        return id;
    }
    public Transfers(Date newId,double amount,String date,String id){
        this.amount=amount;
        this.date=date;
        this.id=generateid(newId,"");
    }
    public static String generateid(Date id,String fname)
    {
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MMM-dd");
        String d=sdf.format(id);
        String[] datesplit=d.split("-");
        String formateddate=datesplit[0].substring(2);
        formateddate =formateddate+"-" + datesplit[1];
        if(Integer.parseInt(datesplit[2])%2==0)
        {
            formateddate += "-" + "E";
        }
        else
        {
            formateddate += "-" + "O";
        }
        if(fname.equals(""))
        {
            formateddate += "-" + "XX";
        }
        else if(fname.length()==1)
        {
            formateddate += "-" + fname.toUpperCase() + "X";
        }
        else if(fname.length()==2)
        {
            formateddate += "-" + fname.toUpperCase();
        }
        else
        {
            formateddate += "-" +fname.substring(0,1).toUpperCase()+fname.substring(fname.length()-1).toUpperCase();
        }
        return formateddate;
    } 
    public void display()
    {
        System.out.println("\n id is:"+ id +"\n amount is:"+ amount+"\n date :"+date);
    }
   
    
}
