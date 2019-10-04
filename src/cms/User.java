/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cms;

/**
 *
 * @author Tanjil
 */
class User {
    
    private int PoliceId;
    String FirstName,Designation,Email;
    
    public User(int PoliceId, String FirstName,String Designation,String Email)
    {
        this.PoliceId=PoliceId;
        this.FirstName=FirstName;
        
        this.Designation=Designation;
        this.Email=Email;
    }
    
    
    public int getPId(){
        return PoliceId;
    }
    
    public String getFirstName()
    {
        return FirstName;
    }
    
    public String getDesignation()
    {
        return Designation;
    }
    
    public String getEmail()
    {
        return Email;
    }
}
