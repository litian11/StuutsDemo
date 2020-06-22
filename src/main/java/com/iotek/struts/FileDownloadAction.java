package com.iotek.struts;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.InputStream;

public class FileDownloadAction extends ActionSupport {
    //代表下载文件的资源路径
    private String inputPath;
    //代表下载文件的文件路径
    private String contentType;
    //代表下载文件的文件名
    private String downFileName;
    //inputPath的setter和getter方法
    public void setInputPath(String inputPath) throws Exception{
        //处理请求参数的解码
        this.inputPath = new String(inputPath.getBytes("iso-8859-1"),"gbk");
    }
    public String getInputPath(){
        return inputPath;
    }
    public void setContentType(String contentType){
        this.contentType = contentType;
    }
    public String getContentType(){
        return this.contentType;
    }
    public void setDownFileName(String downFileName) throws Exception{
        //处理请求参数的解码
        this.downFileName = new String(downFileName.getBytes("iso-8859-1"),"gbk");
    }
    public String getDownFileName(){
        return this.downFileName;
    }
    /*
    定义一个返回InputStream的方法
    该方法将作为被下载文件的入口
    且需要配置stream类型结果是指定inputName参数
    inputName参数的值就是方法去掉get前缀、首字母小写的字符串
     */
    public InputStream getTargetFile() throws Exception{
        //ServletContext提供getResourceAsStream()方法返回指定文件对应的输入流
        return ServletActionContext.getServletContext().getResourceAsStream(inputPath);
    }
}
