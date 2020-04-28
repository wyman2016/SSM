package com.admin.ssm;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

public class BCryptPasswordEncoderUtils {

    private static final BCryptPasswordEncoder bCryptPasswordEncoder = new BCryptPasswordEncoder();

    public static void main(String[] args) {
        String password = "123456";
        String pwd = bCryptPasswordEncoder.encode(password);
        System.out.println(pwd);
    }
}
