package sdk.security.service.impl;

import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import sdk.security.service.IAuthenticationProvider;
import sdk.security.util.HttpServletThreadLocal;

public class AuthenticationProviderImpl implements IAuthenticationProvider {

	public String getKrbPrincipalName() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getLoginUserId() {
		// TODO 从线程变量获取
		HttpServletRequest req = HttpServletThreadLocal.getRequest();
		HttpSession session = req.getSession();
		return (String) session.getAttribute("userId");
	}

	public Map<String, String> getLoginUserInfo() {
		// TODO Auto-generated method stub
		return null;
	}

	public String getToken() {
		// TODO Auto-generated method stub
		return null;
	}

}
