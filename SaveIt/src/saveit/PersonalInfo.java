/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

import java.util.Date;

/**
 *
 * @author temp
 */
public class PersonalInfo {
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
    public void PersonalInfo(String fname,String lname,Date date_Of_Birth,String sex,String address,String card_Details)
    {
        this.fname=fname;
        this.lname=lname;
        this.date_Of_Birth=date_Of_Birth;
        this.sex=sex;
        this.address=address;
        this.card_Details=card_Details;
    }
}
