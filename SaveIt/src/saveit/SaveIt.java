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
   
    public static void main(String[] args) 
    {
        // TODO code application logic here\
        PersonalInfo pi=new PersonalInfo(new Date(),"sai", "krishna", "11-04-1995", "male","hyderabad", "1223454","123");
        pi.display();
        Administrator a=new Administrator(new Date(),"lucas", "teja","11-05-1996","male", "hyd","45645","456","head");
        a.display();
    }
    
}