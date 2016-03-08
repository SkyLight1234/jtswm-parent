package com.zdpzsp.frame.utils;


import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.*;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * XML 数据接收对象转换工具类
 * @author LiYi
 *
 */
public class XMLConverUtil {

	private static Map<Class<?>,Unmarshaller> uMap = new HashMap<Class<?>,Unmarshaller>();
	private static Map<Class<?>,Marshaller> mMap = new HashMap<Class<?>,Marshaller>();

	/**
	 * XML to Object
	 * @param <T>
	 * @param clazz
	 * @param xml
	 * @return
	 */
	public static <T> T convertToObject(Class<T> clazz, String xml){
		return convertToObject(clazz,new StringReader(xml));
	}

	/**
	 * XML to Object
	 * @param <T>
	 * @param clazz
	 * @param inputStream
	 * @return
	 * @throws UnsupportedEncodingException
	 */
	public static <T> T convertToObject(Class<T> clazz, InputStream inputStream)  {
		//设置UTF-8防止中文乱码
		T t=null;
		try {
			 t=convertToObject(clazz,new InputStreamReader(inputStream,"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
			t=convertToObject(clazz,new InputStreamReader(inputStream));
		}
		return t;
	}

	/**
	 * XML to Object
	 * @param <T>
	 * @param clazz
	 * @param reader
	 * @return
	 */
	@SuppressWarnings("unchecked")
	public static <T> T convertToObject(Class<T> clazz, Reader reader){
		try {
			if(!uMap.containsKey(clazz)){
				JAXBContext jaxbContext = JAXBContext.newInstance(clazz);
				Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();
				uMap.put(clazz,unmarshaller);
			}
			return (T)uMap.get(clazz).unmarshal(reader);
		} catch (JAXBException e) {
			e.printStackTrace();
		}
		return null;
	}

	/**
	 * Object to XML
	 * @param object
	 * @return
	 */
	public static <T> String convertToXML(T object)
	{
		ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
		try
		{
			JAXBContext context = JAXBContext.newInstance(object.getClass());
			// 将对象转变为xml Object------XML
			// 指定对应的xml文件
			Marshaller marshaller = context.createMarshaller();
			marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);//是否格式化生成的xml串
			marshaller.setProperty(Marshaller.JAXB_FRAGMENT, false);//是否省略xml头信息

			// 将对象转换为对应的XML文件
			marshaller.marshal(object, byteArrayOutputStream);
		}
		catch (JAXBException e)
		{

			e.printStackTrace();
		}
		//转化为字符串返回
		String xmlContent = null;
		try {
			xmlContent = new String(byteArrayOutputStream.toByteArray(), "UTF-8");
		} catch (UnsupportedEncodingException e) {
			e.printStackTrace();
		}
		return xmlContent;
	}


	/**
	 * 简单Map to XML
	 * @return
	 */
	public static String convertToXML(Map map){
		
		StringBuffer sb = new StringBuffer();
		sb.append("<xml>");
		Iterator it = map.keySet().iterator();
		while(it.hasNext())
		{
			String k = (String)it.next();
			String v = (String)map.get(k);
			
			sb.append(v==null?"":("<"+k+">"+v+"</"+k+">"));	
							
		}
		sb.append("</xml>");
		return sb.toString();
	}
}
