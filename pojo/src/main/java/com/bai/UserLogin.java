package com.bai;

import lombok.Data;

@Data
public class UserLogin {
    private int id;
    private String phone;
    private String wxNum;
    private String password;
}
