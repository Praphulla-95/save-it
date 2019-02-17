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
    private void setrole()
    {
        this.role=role;
    }
    private String getrole()
    {
        return role;
    }
    public void Administrator(String role)
    {
        this.role=role;
    }
}
