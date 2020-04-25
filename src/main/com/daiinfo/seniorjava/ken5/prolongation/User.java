package com.daiinfo.seniorjava.ken5.prolongation;

import java.util.Date;  
import java.util.List;
import java.util.Set;

public class User {  
    private String name;  
    private String password;  
    private Date birthday;  
    private String email; 
    private List<User> friends;
      
    public String getName() {  
        return name;  
    }  
    
    public void setName(String name) {  
        this.name = name;  
    }  
        
    public Date getBirthday() {  
        return birthday;  
    }  
    
    public void setBirthday(Date birthday) {  
        this.birthday = birthday;  
    }  
      
    public String getEmail() {  
        return email;  
    } 
    
    public void setEmail(String email) {  
        this.email = email;  
    }
    
	public String getPassword() {
		return password;
	}
	
	public void setPassword(String password) {
		this.password = password;
	}
	
	public List<User> getFriends() {
		return friends;
	}
	
	public void setFriends(List<User> friends) {
		this.friends = friends;
	}  
	
	public String toString(){
		return "姓名："+name+"\n"+"密码："+password+"\n"+"出生日期："+birthday+"\n"+"邮箱："+email+""+"朋友"+friends;
	}
}