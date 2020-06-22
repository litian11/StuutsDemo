package com.iotek.struts;

import java.lang.annotation.ElementType;

public class LoginAction {
    private  String  name;
    private  String password;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
    public  String execute(){
        if (getName().equals("iotek")&&getPassword().equals("1234")){
            return "success";
        }else {
            return  "input";
        }

    }

    }

