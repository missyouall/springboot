package com.springboot.entity;

import java.util.Date;

/**
 * @Auther: Administrator
 * @Date: 2019/5/5 16:33
 * @Description:
 */
public class User {
    private Integer id;

    private String userName;

    private String password;

    private Date createDate;

    private String email;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName == null ? null : userName.trim();
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password == null ? null : password.trim();
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }
    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder ();
        sb.append (this.getClass ().getSimpleName ());
        sb.append (" [");
        sb.append ("Hash = ").append (this.hashCode ());
        sb.append(",id=").append(this.id);
        sb.append(",userName=").append(this.userName);
        sb.append(",password=").append(this.password);
        sb.append(",createDate=").append(this.createDate);
        sb.append(",email=").append(this.email);
        return sb.toString();
    }
}
