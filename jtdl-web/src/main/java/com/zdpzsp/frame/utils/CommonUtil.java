package com.zdpzsp.frame.utils;

import java.text.DecimalFormat;

/**
 * Created by apple on 15/12/18.
 */
public class CommonUtil {

    public static String fenChangeY(Integer fen){
        float r = fen==null?0.00f:fen/100.00f;
        double y = Math.round(r * 100) / 100.00;
        DecimalFormat df = new DecimalFormat("0.00");
        return df.format(y);
    }

    public static long yChangeFen(double y){
        return (long)(y*100);
    }

    /**
     * @description 射线法判断点是否在多边形内部
     * @param {Object} p 待判断的点，格式：{ x: X坐标, y: Y坐标 }
     * @param {Array} poly 多边形顶点，数组成员的格式同 p
     * @return {Boolean} 点 p 和多边形 poly 的几何关系
     */
    public static boolean rayCasting(String lng,String lat,String polys){
        String[] poly = polys.split(";");
        double px = Double.parseDouble(lng);
        double py = Double.parseDouble(lat);
        boolean flag = false;
        for(int i=0,l=poly.length,j=l-1;i<l;j=i,i++){
            double sx = Double.parseDouble(poly[i].split(",")[0]);
            double sy = Double.parseDouble(poly[i].split(",")[1]);
            double tx = Double.parseDouble(poly[j].split(",")[0]);
            double ty = Double.parseDouble(poly[j].split(",")[1]);
            // 点与多边形顶点重合
            if((sx == px && sy == py) || (tx == px && ty == py)) {
                return true;
            }
            // 判断线段两端点是否在射线两侧
            if((sy < py && ty >= py) || (sy >= py && ty < py)) {
                // 线段上与射线 Y 坐标相同的点的 X 坐标
                double x = sx + (py - sy) * (tx - sx) / (ty - sy);

                // 点在多边形的边上
                if(x == px) {
                    return true;
                }

                // 射线穿过多边形的边界
                if(x > px) {
                    flag = !flag;
                }
            }
        }
        // 射线穿过多边形边界的次数为奇数时点在多边形内
        return flag ? true : false;
    }


    /**
     * @description 射线法判断点是否在多边形内部
     * @param {Object} p 待判断的点，格式：{ x: X坐标, y: Y坐标 }
     * @param {Array} poly 多边形顶点，数组成员的格式同 p
     * @return {Boolean} 点 p 和多边形 poly 的几何关系

    function rayCasting(p, poly) {
    var px = p.x,
    py = p.y,
    flag = false;

    for(var i = 0, l = poly.length, j = l - 1; i < l; j = i, i++) {
    var sx = poly[i].x,
    sy = poly[i].y,
    tx = poly[j].x,
    ty = poly[j].y;

    // 点与多边形顶点重合
    if((sx === px && sy === py) || (tx === px && ty === py)) {
    return true;
    }

    // 判断线段两端点是否在射线两侧
    if((sy < py && ty >= py) || (sy >= py && ty < py)) {
    // 线段上与射线 Y 坐标相同的点的 X 坐标
    var x = sx + (py - sy) * (tx - sx) / (ty - sy)

    // 点在多边形的边上
    if(x === px) {
    return true;
    }

    // 射线穿过多边形的边界
    if(x > px) {
    flag = !flag;
    }
    }
    }

    // 射线穿过多边形边界的次数为奇数时点在多边形内
    return flag ? true : false;
    }
     */

    public static String captureName(String name){
        char[] cs=name.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }

    public static String lowerName(String name){
        char[] cs=name.toCharArray();
        cs[0]-=32;
        return String.valueOf(cs);
    }

    public static String getColumn(String s){
        char[] chars = s.toCharArray();
        StringBuffer sb = new StringBuffer();
        for(int i=0;i<chars.length;i++){
            if(Character.isUpperCase(chars[i])){
                sb.append("_");
                chars[i]+=32;
            }
            sb.append(chars[i]);
        }
        return sb.toString();
    }

}
