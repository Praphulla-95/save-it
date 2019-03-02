/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

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
    public void Account(int account_No,String name,String card_Details,String id)
    {
        this.account_No=account_No;
        this.name=name;
        this.card_Details=card_Details;
        this.id=id;
    }
}

    
