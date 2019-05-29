package com.cmiracle.authauthenticationservice.security;

import com.cmiracle.authauthenticationservice.mapper.SystemUserMapper;
import com.cmiracle.authauthenticationservice.model.SystemUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import tk.mybatis.mapper.entity.Example;

import java.util.ArrayList;
import java.util.List;

//@Service
public class AdminUserDetailsService implements UserDetailsService {

    @Autowired
    private SystemUserMapper systemUserMapper;

    @Override
    @Transactional(readOnly = true)
    public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {

        Example example = new Example(SystemUser.class);
        example.createCriteria()
                .andEqualTo("username", username)
                .andEqualTo("enabled", 1);
        SystemUser systemUser = systemUserMapper.selectOneByExample(example);
        if (systemUser == null) {
            throw new UsernameNotFoundException("用户不存在");
        }
        String password = systemUser.getPassword();
        List<SimpleGrantedAuthority> authorities = new ArrayList<SimpleGrantedAuthority>();
        authorities.add(new SimpleGrantedAuthority("ROLE_ADMIN"));
        User userDetails = new User(username, password, authorities);
        return userDetails;
    }
}
