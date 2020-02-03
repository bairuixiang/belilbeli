package com.bai;

public class Beliuser {

    private Integer id;

    private String userPhone;

    private String userWxnum;

    private String userPass;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(String userPhone) {
        this.userPhone = userPhone == null ? null : userPhone.trim();
    }

    public String getUserWxnum() {
        return userWxnum;
    }

    public void setUserWxnum(String userWxnum) {
        this.userWxnum = userWxnum == null ? null : userWxnum.trim();
    }

    public String getUserPass() {
        return userPass;
    }

    public void setUserPass(String userPass) {
        this.userPass = userPass == null ? null : userPass.trim();
    }
}