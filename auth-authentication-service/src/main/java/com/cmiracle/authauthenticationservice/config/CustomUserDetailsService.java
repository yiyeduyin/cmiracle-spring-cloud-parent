package com.cmiracle.authauthenticationservice.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Component;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Component
public class CustomUserDetailsService implements UserDetailsService {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public UserDetails loadUserByUsername(String s) throws UsernameNotFoundException {
        CustomUserDetails user = this.findByUsername(s);
        if (Objects.isNull(user)) {
            throw new UsernameNotFoundException("");
        }
        return user;
    }


    private CustomUserDetails findByUsername(String username) {
        List<CustomUserDetails> userList = jdbcTemplate.query("select * from users where username=?", preparedStatement -> preparedStatement.setString(1, username), (resultSet, i) -> {
            CustomUserDetails user = null;
            String password = resultSet.getString("password");
            Integer enabled = resultSet.getInt("enabled");
            String entCode = resultSet.getString("ent_code");
            Boolean adminRole = false;
            if (enabled == 1) {
                SimpleGrantedAuthority simpleGrantedAuthority;
                if (entCode.equals("0")) {
                    adminRole = true;
                    simpleGrantedAuthority = new SimpleGrantedAuthority("SUPERADMIN");
                } else {
                    Integer isAdmin = resultSet.getInt("is_admin");
                    if (1 == isAdmin) {
                        adminRole = true;
                    }
                    simpleGrantedAuthority = new SimpleGrantedAuthority("USER");
                }
                user = new CustomUserDetails(username, password, true, true, true, true, Arrays.asList(simpleGrantedAuthority));
                user.setEntCode(entCode);
                user.setAdmin(adminRole);
            }
            return user;
        });
        if (userList != null && userList.size() > 0) {
            return userList.get(0);
        } else {
            return null;
        }
    }
}
