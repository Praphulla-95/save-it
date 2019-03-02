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
 * @author temp
 */
public class Account {
    int account_No;
    String name;
    String card_Details;
    String id;
    public void setaccount_No(int account_No)
    {
        this.account_No=account_No;
        
    }
    public int getaccount_No()
    {
        return account_No;
        
    }
    public void setname(String name)
    {
        this.name=name;
    }
    public String getname()
    {
        return name;
    }
    public void setcard_Details(String card_Details)
    {
        this.card_Details=card_Details;
    }
    public String getcard_Details()
    {
        return card_Details;
    }
    public void setid(String id)
    {
        this.id=id;
    }
    public String getid()
    {
        return id;
    }
    public Account(Date newId,int account_No,String name,String card_Details,String id)
    {
        this.account_No=account_No;
        this.name=name;
        this.card_Details=card_Details;
        this.id=generateid(newId,name);
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
        System.out.println("\n id is:"+id+"\n account number is:"+account_No+"\n name is:"+name+"\n card_Details is:"+card_Details);
    }
    
}

    
