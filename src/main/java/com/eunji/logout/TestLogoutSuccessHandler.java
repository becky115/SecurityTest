package com.eunji.logout;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutHandler;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.security.web.authentication.logout.SimpleUrlLogoutSuccessHandler;

/*implements LogoutSuccessHandler*/
public class TestLogoutSuccessHandler extends SimpleUrlLogoutSuccessHandler {



	@Override
	public void onLogoutSuccess(HttpServletRequest request, HttpServletResponse response, Authentication authentication)
			throws IOException, ServletException {
		System.out.println("onLogoutSuccess");
		System.out.println(getDefaultTargetUrl());
		setDefaultTargetUrl("/");
		super.onLogoutSuccess(request, response, authentication);
	}

}

/**
 * 		if (authentication != null) {
			// do something
			HttpSession session = request.getSession(false);
			if(session != null) session.invalidate();
		}
		response.sendRedirect("/");
 */
