/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package inventory;

import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author compu malek
 */
class client  {

    

    private Object clients;
    private Object fclient;
    private String fname;
    private String Lname;
    private String username;
    private String phone;
    private String role;
    private String password;
    
    private final String clientName ="‪E:\\fclient.txt";
    
    public static ArrayList<client> client1 =new ArrayList<client>();
    
    public void setfname(String fname) {
        this.fname =fname;
    }
    public String getfname(){
        return fname;
    }
    public void setlname(String Lname) {
        this.Lname =Lname;
    }
    public String getLname(){
        return Lname;
    }

    public void setusername(String username) {
        this.username =username;
    }
    public String getusername(){
        return username;
    }

    public void setphone(String phone) {
        this.phone =phone;
    }
    public String getphone(){
        return phone;
    }
    public void setrole(String role) {
        this.role =role;
    }
    public String getrole(){
        return role;
    }
    public void setpassword(String password) {
        this.password =password;
    }
    public String getpassword(){
        return password;
    }
    
   
    
   
}
