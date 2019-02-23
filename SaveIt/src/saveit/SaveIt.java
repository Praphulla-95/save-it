/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author 1894438
 */
public class SaveIt {

    /**
     * @param args the command line arguments
     */
   
    static String id;
    
    public static String generateid(String d,String fname,String lname)
    {
        char today;
        String[] datesplit=d.split(" ");
        
        String year=datesplit[5].substring(2,4);
       
        String month=datesplit[1].toUpperCase();
        
        String date=datesplit[2];
        int currentdate=Integer.parseInt(date);
       
            if(currentdate%2==0)
            {
                 today='E';
            }
            else
            {
                 today='O';
            }
           
        fname=fname;
        char fn=fname.charAt(0);
        lname=lname;
        char ln=lname.charAt(0);
        id=year+"-"+month+"-"+today+"-"+fn+ln;
        return id;
    } 

     public static void main(String[] args) 
    {
        // TODO code application logic here\
        PersonalInfo pi=new PersonalInfo();
        String fname="Sai";
        String lname="Krishna";
        Date dt=new Date();
        String d=dt.toString();
        String id=generateid(d,fname,lname);
        System.out.println(id);
    }
    
}