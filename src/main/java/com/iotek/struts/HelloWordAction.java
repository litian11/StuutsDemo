package com.iotek.struts;

public class HelloWordAction {
    public  String helloWord(){
        System.out.println("成功访问HelloWord  Action");
        System.out.println("调用Service");
        return "success";
    }
}
