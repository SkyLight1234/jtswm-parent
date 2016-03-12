package com.zdpzsp.frame.utils;

import java.io.*;
import java.net.URL;
import java.net.URLConnection;

/**
 * Created by wangziqing on 15/12/23.
 */
public class HttpBase {




    public static String baseHttp(String url,String param) {
        String result="";
        PrintWriter printWriter =null;
        BufferedReader bufferedReader=null;
        try
        {
            URL getUrl = new URL(url);
            URLConnection connection=  getUrl.openConnection();
            connection.setRequestProperty("accept", "*/*");
            connection.setRequestProperty("connection", "Keep-Alive");
            connection.setRequestProperty("user-agent",
                    "Mozilla/4.0 (compatible; MSIE 6.0; Windows NT 5.1;SV1)");
            // 发送POST请求必须设置如下两行
            connection.setDoOutput(true);
            connection.setDoInput(true);
            // 获取URLConnection对象对应的输出流
            printWriter = new PrintWriter(new OutputStreamWriter(connection.getOutputStream(),"UTF-8"));
            // start_time=2015-05-27 00:00:00"+"&end_time=2015-05-27 23:00:00"
            // 发送请求参数
            printWriter.print(param);
            // flush输出流的缓冲
            printWriter.flush();
            // 定义BufferedReader输入流来读取URL的响应
            bufferedReader= new BufferedReader(new InputStreamReader(connection.getInputStream(),"UTF-8"));
            String line;
            boolean f=false;
            while ((line = bufferedReader.readLine()) != null) {
                result +=(f?"\n":"")+ line;
                f=true;
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
        //使用finally块来关闭输出流、输入流
        finally{
            try{
                if(null!=printWriter){
                    printWriter.close();
                }
                if(null!=bufferedReader){
                    bufferedReader.close();
                }
            }
            catch(IOException ex){
                ex.printStackTrace();
            }
        }
        return  result;
    }
}
