package org.ssm.entity;


import java.sql.Timestamp;

/**
 * Created by xwy_brh on 2017/9/1.
 */
public class User {

    private String userName;
    private String userNo;
    private String userPass;
    private String tel;
    private Timestamp dateTime;


    public User(String userName, String userNo, String userPass, String tel, Timestamp dateTime) {
        this.userName = userName;
        this.userNo = userNo;
        this.userPass = userPass;
        this.tel = tel;
        this.dateTime = dateTime;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", userNo='" + userNo + '\'' +
                ", userPass='" + userPass + '\'' +
                ", tel='" + tel + '\'' +
                ", dateTime=" + dateTime +
                '}';
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getUserNo() {
        return userNo;
    }

    public void setUserNo(String userNo) {
        this.userNo = userNo;
    }

    public String getTel() {
        return tel;
    }

    public void setTel(String tel) {
        this.tel = tel;
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass;
    }

    public Timestamp getDateTime() {
        return dateTime;
    }

    public void setDateTime(Timestamp dateTime) {
        this.dateTime = dateTime;
    }
}
