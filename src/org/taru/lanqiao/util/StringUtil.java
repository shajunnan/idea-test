package org.taru.lanqiao.util;

public class StringUtil {
    /**
     * 转化为字符串
     * @param obj
     * @return
     */
    public static String valueOf(Object obj){
        if(obj == null){
            return null;
        }
        return obj.toString();
    }
}
