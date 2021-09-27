package com.owen.util;

import org.jasypt.util.text.BasicTextEncryptor;

public class JasyptUtil {

    public static void main(String[] args) {

        BasicTextEncryptor encyptor = new BasicTextEncryptor();
        encyptor.setPassword("1234565!@#$%");
        String username = encyptor.encrypt("root");
        String password = encyptor.encrypt("admin");
        System.out.println(username);
        System.out.println(password);
    }
}
