package com.cmiracle.authresourceservice;

import org.springframework.security.jwt.Jwt;
import org.springframework.security.jwt.JwtHelper;
import org.springframework.security.jwt.crypto.sign.MacSigner;

/**
 * @Authoor: cmiracle
 * @Date: 2019/6/16 16 39
 * @Description:
 */
public class TokenTest {
    private static String signKey = "2WAsbgZrWPO9qIOl71VhHhAZIh2Pzxv4";

    private static String token = "eyJhbGciOiJIUzI1NiIsInR5cCI6IkpXVCJ9.eyJpc19hZG1pbiI6ZmFsc2UsInVzZXJfbmFtZSI6ImdhdmluIiwic2NvcGUiOlsiYWxsIl0sImF0aSI6IjYyYWMyODM5LTc3YTEtNGIyYi05MjJmLTNiYjk2NTA1MTc5MiIsImlzcyI6IjVXQjFnRVhhNkgzNWxHc2toVnNjVDl1ckUzY3F4MXBTIiwiZXhwIjoxNTYwNTk4NTg5LCJhdXRob3JpdGllcyI6WyJVU0VSIl0sImp0aSI6IjExNmZjY2E1LTNhODMtNGE3NS1hOWI5LTVjMWVkYTkxYmE1MiIsImVudF9jb2RlIjoiMTAwMDIiLCJjbGllbnRfaWQiOiJjbGllbnRfMDEifQ.OXNUdTIuS4mXoyfRE2lGJu0lA78MeaoAFG1dk05Calk";

    public static void main(String[] args) {
        Jwt jwt = getJwt(token);

        MacSigner verifier = new MacSigner(signKey);
        jwt.verifySignature(verifier);
        System.out.println("done");
    }


    public static Jwt getJwt(String authentication) {
        return JwtHelper.decode(authentication);
    }
}
