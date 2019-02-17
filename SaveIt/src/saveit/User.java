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
    private void setuser_Id()
    {
        this.user_Id=user_Id;
    }
    private String getuser_Id()
    {
        return user_Id;
    }
    private void setpassword()
    {
        this.password=password;
    }
    private String getpassword()
    {
        return password;
    }
    public void User(String user_Id,String password)
    {
        this.user_Id=user_Id;
        this.password=password;
    }
}
