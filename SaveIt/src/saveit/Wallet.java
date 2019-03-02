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
 * @author 1894438
 */
public class Wallet {
    Double bill, round_off_Amount, total_Amount;
    String id;


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
    public void setid(String id){
        
        this.id = id; 
    }
    public String getid(){
        return id;
    }
    public Wallet(Date newId,Double bill, Double round_off_Amount, Double total_Amount, String id){
        
        this.bill = bill;
        this.round_off_Amount = round_off_Amount;
        this.total_Amount = total_Amount;
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
        System.out.println("\n id is:"+ id +"\n bill is:"+ bill+"\n round_of_amount is:"+round_off_Amount+"\n total_Amount is:"+total_Amount+"\n id is:"+id);
    }
    
}
