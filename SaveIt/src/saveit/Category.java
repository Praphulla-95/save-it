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
    Double id;
    
    private void setname(){
        
        this.name = name;
    }
    private String getname(String name){
        
        return name;
    }
    private void setdescription(String description){
        
        this.description = description;
        
    }
    private String getdescription(Double id){
        
        return description;
    }
    private void id(){
        
        this.id = id;
        
    }
    private Double getid(){
        
        return id;
    }

    public void Category(String name, String description, Double id){
        
        this.name = name;
        this.description = description;
        this.id = id;
    }
}
