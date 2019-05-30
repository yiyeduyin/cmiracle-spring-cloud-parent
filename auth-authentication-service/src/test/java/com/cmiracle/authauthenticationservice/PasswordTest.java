package com.cmiracle.authauthenticationservice;

import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

public class PasswordTest {

    public static final PasswordEncoder encoder = new BCryptPasswordEncoder();

    public static void main(String[] args) {
        String password = createPassword("123456");
        System.out.println(password);
        System.out.println(isPasswordInvalid("123456",password));
    }


    /**
     * 加密密码
     *
     * @param password
     * @return
     */
    public static String createPassword(String password) {
        String encode = encoder.encode(password.trim());
        return encode;
    }


    /**
     * 验证密码
     *
     * @param rawPass 加密密码
     * @param encPass 原始密码
     * @return
     */
    public static boolean isPasswordInvalid(String encPass, String rawPass) {
        boolean matches = encoder.matches(encPass, rawPass);
        return matches;
    }
}
