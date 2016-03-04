package com.zdpzsp.system.utils;

import org.springframework.beans.BeanUtils;

import java.util.*;

/**
 * Created by xiong on 2015/11/24.
 */
public class CommonUtil {
    public static <E>E copyObj(E o)
    {
        if(o==null)
        {
            return null;
        }
        E o2=null;
        try {
            if(o.getClass().isPrimitive())
            {
                o2=o;
            }else if(o instanceof Integer)
            {
                Integer a= Integer.parseInt(o.toString());
                o2=(E)new Integer(a);
            }else if(o instanceof Long){
                Long a= Long.parseLong(o.toString());
                o2=(E)new Long(a);
            }else if(o instanceof Float){
                Float a= Float.parseFloat(o.toString());
                o2=(E)new Float(a);
            }else if(o instanceof Double){
                Double a=Double.parseDouble(o.toString());
                o2=(E)new Double(a);
            }else if(o instanceof Byte){
                Byte a=Byte.parseByte(o.toString());
                o2=(E)new Byte(a);
            }else if(o instanceof Short){
                Short a=Short.parseShort(o.toString());
                o2=(E)new Short(a);
            }else if(o instanceof Boolean){
                Boolean a=Boolean.parseBoolean(o.toString());
                o2=(E)new Boolean(a);
            }else {
                o2 = (E) o.getClass().newInstance();
            }
           // switch ()
            BeanUtils.copyProperties(o,o2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return o2;
    }
    public static <E>List<E> copyObj(List<E> o)  {
        if(o==null)
        {
            return null;
        }
        List<E> o2=new ArrayList<E>();
        for (E oo:o)
        {
            o2.add(CommonUtil.copyObj(oo));
        }
        return o2;
    }
    public static <E>Set<E> copyObj(Set<E> o)
    {
        if(o==null)
        {
            return null;
        }
        Set<E> o2=new HashSet<E>();
        for (E oo:o)
        {
            o2.add(CommonUtil.copyObj(oo));
        }
        return o2;
    }
    public static <K,E>Map<K,E> copyObj(Map<K,E> o)
    {
        if(o==null)
        {
            return null;
        }
        Map<K,E>  o2=new HashMap<K,E>();
        for (K k:o.keySet())
        {
            K k1=CommonUtil.copyObj(k);
            o2.put(k1,CommonUtil.copyObj(o.get(k)));
        }
        return o2;
    }
}

