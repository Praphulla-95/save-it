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
    String name;
    Date date_Of_Birth;
    String sex;
    String address;
    String card_Details;
    private void setname(String name)
    {
        this.name=name;
    }
    private String getname()
    {
        return name;
    }
    private void setdate_Of_Birth(Date date_Of_Birth)
    {
        this.date_Of_Birth=date_Of_Birth;
    }
    private Date getdate_Of_Birth()
    {
        return date_Of_Birth;
    }
    private void setsex(String sex)
    {
        this.sex=sex;
    }
    private String getsex()
    {
        return sex;
    }
    private void setaddress(String address)
    {
        this.address=address;
    }
    private String getaddress()
    {
        return address;
    }
    private void setcard_Details(String card_Details)
    {
        this.card_Details=card_Details;
    }
    private String getcard_Details()
    {
        return card_Details;
    }
    public void PersonalInfo(String name,Date date_Of_Birth,String sex,String address,String card_Details)
    {
        this.name=name;
        this.date_Of_Birth=date_Of_Birth;
        this.sex=sex;
        this.address=address;
        this.card_Details=card_Details;
    }
}
