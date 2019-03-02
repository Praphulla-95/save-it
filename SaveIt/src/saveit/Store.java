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
public class Store {
    String store_Name;
    Double bill_ID;
    String id;

    public void setstore_Name(String store_Name){
        
        this.store_Name = store_Name;
    }
    public String getstore_Name(){
        
        return store_Name;
    }
    public void setbill_ID(Double bill_ID){
        
        this.bill_ID = bill_ID;
    }
    public Double getbill_ID(){
        
        return bill_ID ;
    }
    public void setid(String id){
        
        this.id = id;
    }
    public String getid(){
        
        return id;
    }
    
    public Store(Date newId,String store_Name, Double bill_ID, String id){
    
    this.store_Name = store_Name;
    this.bill_ID = bill_ID;
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
        System.out.println("\n id is:"+ id +"\n billid is:"+ bill_ID+"\n store_Name is:"+store_Name);
    }
}
