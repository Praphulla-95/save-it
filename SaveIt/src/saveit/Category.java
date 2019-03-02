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
public class Category {
    String name;
    String description;
    String id;
    
    public void setname(String name){
        
        this.name = name;
    }
    public String getname(){
        
        return name;
    }
    public void setdescription(String description){
        
        this.description = description;
        
    }
    public String getdescription(){
        
        return description;
    }
    public void setid(String id){
        
        this.id = id;
        
    }
    public String getid(){
        
        return id;
    }

    public Category(Date newId,String name, String description, String id){
        
        this.name = name;
        this.description = description;
        this.id=generateid(newId, name);
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
        System.out.println("\n id is:"+ id +"\n name is:"+ name+"\n description is:"+description+"\n id is:"+id);
    }
}
