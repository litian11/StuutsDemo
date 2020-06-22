package com.iotek.struts;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.util.UUID;


public class UploadAction extends ActionSupport {
    //封装文件标题请求字段
    private String title;
    //封装上传文件域的字段
    private File upload;
    //封装上传文件类型的字段
    private String uploadContentType;
    //封装上传文件名的字段
    private String uploadFileName;
    //在struts.xml文件中配置上传文件的保存位置的字段
    private String savePath;
    //接受struts.xml文件配置的方法
    public void setSavePath(String value){
        this.savePath = value;
    }
    //返回上传文件的保存位置
    private String getSavePath() throws Exception{
        return ServletActionContext.getRequest().getRealPath(savePath);
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public File getUpload() {
        return upload;
    }

    public void setUpload(File upload) {
        this.upload = upload;
    }

    public String getUploadContentType() {
        return uploadContentType;
    }

    public void setUploadContentType(String uploadContentType) {
        this.uploadContentType = uploadContentType;
    }

    public String getUploadFileName() {
        return uploadFileName;
    }

    public void setUploadFileName(String uploadFileName) {
        this.uploadFileName = uploadFileName;
    }

    public String execute() throws Exception{
        String newName = UUID.randomUUID() + uploadFileName.substring(uploadFileName.lastIndexOf("."));
        //以服务器的文件保存地址和随机文件名建立上传文件输出流
        FileOutputStream fos = new FileOutputStream(getSavePath()+"\\"+newName);
        FileInputStream fis = new FileInputStream(getUpload());
        byte[] buffer = new byte[1024];
        int len = 0;
        while((len = fis.read(buffer))>0){
            fos.write(buffer , 0 , len);
        }
        setUploadFileName(newName);
        return SUCCESS;
    }
}
