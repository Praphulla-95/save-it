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
public class User extends PersonalInfo {
    String user_Id;
    String password;
    public void setuser_Id(String user_Id)
    {
        this.user_Id=user_Id;
    }
    public String getuser_Id()
    {
        return user_Id;
    }
    public void setpassword(String password)
    {
        this.password=password;
    }
    public String getpassword()
    {
        return password;
    }
    public void User(String user_Id,String password)
    {
        this.user_Id=user_Id;
        this.password=password;
    }
   MyPlan my=new MyPlan();
}