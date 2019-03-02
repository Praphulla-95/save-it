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
public class Administrator extends PersonalInfo {
    String role;
    String id;
    
    public Administrator(Date newId, String fname, String lname, String date_Of_Birth, String sex, String address, String card_Details, String id,String role) {
        super(newId, fname, lname, date_Of_Birth, sex, address, card_Details, id);
        this.id=generateid(newId, lname);
        this.role=role;
    }
    
   
    public void setrole(String role)
    {
        this.role=role;
    }
    public String getrole()
    {
        return role;
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
        System.out.println("\n id is:"+ id +"\n fname is:"+ fname+"\n date_Of_Birth is:"+date_Of_Birth+"\n sex is:"+sex+"\n card_Details is:"+card_Details+"\n role is:"+role);
    }
}
