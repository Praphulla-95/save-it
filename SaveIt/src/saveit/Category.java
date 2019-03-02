/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

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

    public void Category(String name, String description, String id){
        
        this.name = name;
        this.description = description;
        this.id = id;
    }
}
