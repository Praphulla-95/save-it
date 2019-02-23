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
public class Store {
    String store_Name;
    Double bill_ID;

    public void setstore_Name(String store_Name){
        
        this.store_Name = store_Name;
    }
    public String getstore_Name(){
        
        return store_Name;
    }
    public void setbill_ID(Double bill_ID){
        
        this.bill_ID = bill_ID;
    }
    public Double getbill_ID(){
        
        return bill_ID ;
    }
    
    public void Store(String store_Name, Double bill_ID){
    
    this.store_Name = store_Name;
    this.bill_ID = bill_ID;
    }
     Category c = new Category();
}
