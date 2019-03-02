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
public class Administrator extends PersonalInfo {
    String role;
    
   
    public void setrole(String role)
    {
        this.role=role;
    }
    public String getrole()
    {
        return role;
    }
   
    
    public void Administrator(String role,String id)
    {
        this.role=role;
        this.id=id;
    }
}
