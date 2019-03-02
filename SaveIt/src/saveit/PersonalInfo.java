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
public class PersonalInfo {
    String id;
    String fname;
    String lname;
    Date date_Of_Birth;
    String sex;
    String address;
    String card_Details;
    public void setfname(String fname)
    {
        this.fname=fname;
    }
    public String getfname()
    {
        return fname;
    }
    public void setlname(String lname)
    {
        this.lname=lname;
    }
    public String getlname()
    {
        return lname;
    }
    public void setdate_Of_Birth(Date date_Of_Birth)
    {
        this.date_Of_Birth=date_Of_Birth;
    }
    public Date getdate_Of_Birth()
    {
        return date_Of_Birth;
    }
    public void setsex(String sex)
    {
        this.sex=sex;
    }
    public String getsex()
    {
        return sex;
    }
    public void setaddress(String address)
    {
        this.address=address;
    }
    public String getaddress()
    {
        return address;
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
    public void PersonalInfo(Date newId, String fname,String lname,Date date_Of_Birth,String sex,String address,String card_Details,String id)
    {
        this.fname=fname;
        this.lname=lname;
        this.date_Of_Birth=date_Of_Birth;
        this.sex=sex;
        this.address=address;
        this.card_Details=card_Details;
        this.id=id;
        id=generateid(newId, fname);
    }
    public static String generateid(Date id,String fname)
    {
        
        SimpleDateFormat sdf=new SimpleDateFormat("yyyy-mmm-dd");
        String d=sdf.format(id);
        String[] datesplit=d.split("-");
        String formateddate=datesplit[0].substring(2);
        formateddate +="-" + datesplit[1];
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
            formateddate += "-" + "xx";
        }
        else if(fname.length()==1)
        {
            formateddate += "-" + fname.toUpperCase() + "x";
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
        System.out.println("id is:"+ id +"\n fname is:"+ fname+"\n date_Of_Birth is:"+date_Of_Birth+"\n sex is:"+sex+"/n card_Details is:"+card_Details);
    }
    
}
