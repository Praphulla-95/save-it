/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saveit;

/**
 *
 * @author 1893716
 */
public class MyPlan {
    String plan_name,plan_type,id;
    public void MyPlan(){
        this.plan_name=plan_name;
        this.plan_type=plan_type;
        
    }
    public String getplan_name(){
        return plan_name;
        
    }
    public String getplan_type(){
        return plan_type;
    }
    public void setplan_name(String plan_name)
    {
        this.plan_name=plan_name;
        
    }
    public void setplan_type(String plan_type)
    {
        this.plan_type=plan_type;
   }
    public String setid(){
        this.id=id;
        return null;
    }
    public String getid(){
        return id;
    }
    public void Myplan(String plan_name,String plan_type,String id){
        this.plan_name=plan_name;
        this.plan_type=plan_type;
        this.id=id;
    }
    

}
