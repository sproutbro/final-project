package com.spring.baemin.controller;

import java.util.HashMap;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.spring.baemin.domain.User;
import com.spring.baemin.service.UserService;

@Controller
public class UserController {

	private static final Logger logger = LoggerFactory.getLogger(UserController.class);

	@Autowired
	private UserService userService;

	@RequestMapping("userJoinForm")
	public String userJoinForm() {
		logger.info("회원가입폼 입장.");

		return "user/userJoinForm";
	}

	@RequestMapping(value = "userJoinProcess", method = RequestMethod.POST)
	public String userJoinProcess(@RequestParam HashMap<String, String> param) {
		logger.info("회원가입시도 {}", param);

		User user = new User();
		user.setUser_id(param.get("user_id"));
		user.setUser_pass(param.get("user_pass"));
		user.setUser_name(param.get("user_name"));
		user.setUser_email(param.get("user_email"));
		user.setUser_nickname(param.get("user_nickname"));
		user.setUser_isadult(1);
		user.setUser_isclause(1);
		user.setUser_phone(param.get("user_phone"));

		userService.userJoinProcess(user);

		return "redirect:/";
	}

	@RequestMapping("userLoginForm")
	public String userLoginForm() {
		logger.info("로그인폼 들어옴.");

		return "user/userLoginForm";
	}

	@RequestMapping("userLoginProcess")
	public String userLoginProcess(@RequestParam HashMap<String, String> param, 
			HttpServletRequest request, String user_id) {
		logger.info("로그인시도.");

		String pass = userService.userLoginProcess(param);

		if (pass.equals(param.get("user_pass"))) {
			HttpSession session = request.getSession();
			session.setAttribute("isLogin", true);
			session.setAttribute("user_id", user_id);
			logger.info("{}로그인함.", param.get("user_id"));
		}

		return "redirect:/";
	}

	@RequestMapping("userLogoutProcess")
	public String userLogoutProcess(HttpServletRequest request) {
		logger.info("로그아웃");

		HttpSession session = request.getSession();
		session.invalidate();

		return "redirect:/";
	}

}
