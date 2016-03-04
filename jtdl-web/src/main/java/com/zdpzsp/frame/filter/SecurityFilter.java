package com.zdpzsp.frame.filter;

import com.alibaba.fastjson.JSON;
import com.zdpzsp.frame.FrameConst;
import com.zdpzsp.frame.ResultCode;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class SecurityFilter implements Filter {
	public void init(FilterConfig filterConfig)
	{

	}

	public void doFilter(ServletRequest req, ServletResponse resp, FilterChain chain) throws IOException, ServletException
	{
		HttpServletRequest request = (HttpServletRequest) req;
		HttpServletResponse response = (HttpServletResponse) resp;

		Object userInofObj=request.getSession().getAttribute(FrameConst.SessionNames.userInfo);
		if(userInofObj==null)
		{
			//未登录
			Map<String,Object> map=new HashMap<String, Object>();

			map.put("code",ResultCode.user_no_login.getCode());
			map.put("message",ResultCode.user_no_login.getMessage());
			response.getWriter().println(JSON.toJSONString(map));
		}else
		{
			chain.doFilter(request,response);
		}

	}

	public void destroy() {
	}

}