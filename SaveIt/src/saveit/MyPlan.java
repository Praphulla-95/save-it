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
 * @author 1893716
 */
public class MyPlan {
    String plan_name,plan_type,id;
    public void MyPlan(){
        this.plan_name=plan_name;
        this.plan_type=plan_type;
        
    }
    public String getplan_name(){
        return plan_name;
        
    }
    public String getplan_type(){
        return plan_type;
    }
    public void setplan_name(String plan_name)
    {
        this.plan_name=plan_name;
        
    }
    public void setplan_type(String plan_type)
    {
        this.plan_type=plan_type;
   }
    public String setid(){
        this.id=id;
        return null;
    }
    public String getid(){
        return id;
    }
    public MyPlan(Date newId,String plan_name,String plan_type,String id){
        this.plan_name=plan_name;
        this.plan_type=plan_type;
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
        System.out.println("\n id is:"+ id +"\n plan_name is:"+ plan_name+"\n plan_type is:"+plan_type);
    }
    
    
    

}
