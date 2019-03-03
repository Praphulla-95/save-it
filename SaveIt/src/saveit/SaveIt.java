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
        User u=new User(new Date(),"abc","def","21-30-1563","female","canada","55455454","126","jhhv","jhkhjv");
        u.display();
        Account ac=new Account(new Date(),15454564,"sai","hyderabad","128");
        ac.display();
        Transfers t=new Transfers(new Date(),1000.00, "11-04-1995","152");
        t.display();
        Category c=new Category(new Date(), "pc","Type of store","156");
        c.display();
        Wallet w=new Wallet(new Date(), 987265.0, 9.0, 10.0,"165");
        w.display();
        Store s=new Store(new Date(), "walmart", 987265.30,"148");
        s.display();
        MyPlan mp=new MyPlan(new Date(),"basic plan","basic plan","189");
        mp.display();
    }
    
    
}