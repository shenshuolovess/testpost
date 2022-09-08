package com.demo.pojo;

import java.util.Date;

public class UserInfo {

    private Integer userId;         //用户标识id
    private String userName;        //用户姓名
    private String userAccount;         //用户账号
    private String userPassword;        //用户密码
    private Date createTime = new Date(System.currentTimeMillis());     //创建时间
    public UserInfo() {
    }
    public UserInfo(Object userAccount, Object userName) {
    }
    public UserInfo(String userAccount, String userName) {
        this.userName = userName;
        this.userAccount = userAccount;
    }
    public UserInfo(String userAccount, String userName, String userPassword) {
        this.userName = userName;
        this.userAccount = userAccount;
        this.userPassword = userPassword;
    }
    public Integer getUserId() {
        return userId;
    }
    public void setUserId(Integer userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public String getUserAccount() {
        return userAccount;
    }
    public void setUserAccount(String userAccount) {
        this.userAccount = userAccount;
    }
    public String getUserPassword() {
        return userPassword;
    }
    public void setUserPassword(String userPassword) {
        this.userPassword = userPassword;
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    @Override
    public String toString() {
        return "UserInfo{" +
                "userId=" + userId +
                ", userName='" + userName + '\'' +
                ", userAccount='" + userAccount + '\'' +
                ", userPassword='" + userPassword + '\'' +
                ", createTime=" + createTime +
                '}';
    }
}
