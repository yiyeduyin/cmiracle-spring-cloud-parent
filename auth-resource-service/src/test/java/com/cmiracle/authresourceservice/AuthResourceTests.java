package com.cmiracle.authresourceservice;

import com.cmiracle.authresourceservice.model.SysMenu;
import com.cmiracle.authresourceservice.service.UserService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class AuthResourceTests {

	@Autowired
	private UserService userService;

	@Test
	public void getUserMenu() {
		long id = 1L;

		List<SysMenu> menus = userService.getUserMenus(id);

		System.out.println(menus);
	}

}
