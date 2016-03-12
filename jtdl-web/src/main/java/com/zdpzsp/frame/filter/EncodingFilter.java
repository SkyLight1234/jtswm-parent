package com.zdpzsp.frame.filter;
import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import java.io.IOException;
import java.util.Map;
import java.util.Set;

public class EncodingFilter implements Filter {

    private String encoding = null;

    public String getEncoding() {
        return encoding;
    }

    public void setEncoding(String encoding) {
        this.encoding = encoding;
    }

    public void init(FilterConfig filterConfig) {
        this.encoding = filterConfig.getInitParameter("encoding");
    }

    public void doFilter(ServletRequest req, ServletResponse response,
                         FilterChain chain) throws IOException, ServletException {
        if (req.getCharacterEncoding() == null) {
            req.setCharacterEncoding(encoding);
        }
        response.setContentType("text/html;charset=" + encoding);
        // 处理GE T参数
        HttpServletRequest request = (HttpServletRequest) req;
        //response.addHeader("Access-Control-Allow-Origin", "*");
        if (request.getMethod().equalsIgnoreCase("get")) {
            Map paramMap = req.getParameterMap();
            String[] queryStringArray = null;
            if (request.getQueryString() != null) {
                queryStringArray = request.getQueryString().split("&");
            }
            if (queryStringArray != null) {
                for (int i = 0; i < queryStringArray.length; i++) {
                    queryStringArray[i] = queryStringArray[i].replaceAll(
                            "(.*)=(.*)", "$1");
                }
            }
            Set<String> keySet = paramMap.keySet();
            for (String key : keySet) {
                boolean isFromGet = false;
                for (String paramFromGet : queryStringArray) {
                    if (key.equals(paramFromGet)) {
                        isFromGet = true;
                    }
                }
                if (!isFromGet) {
                    continue;
                }
                String[] paramArray = (String[]) paramMap.get(key);
                for (int i = 0; i < paramArray.length; i++) {
                    paramArray[i] = new String(
                            paramArray[i].getBytes("iso-8859-1"), encoding);
                }
            }
        }
        chain.doFilter(request, response);
    }

    public void destroy() {
    }

}