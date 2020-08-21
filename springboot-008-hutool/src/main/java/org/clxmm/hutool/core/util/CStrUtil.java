package org.clxmm.hutool.core.util;

/**
 * 字符串工具类
 *
 * @author clx
 * @date 2020/8/18 10:18
 */
public class CStrUtil {


    public static final String NULL = "null";


    public static String format(CharSequence template, Object... params) {

        if (null == template) {
            return null;
        }

//        if (CArrayUtil.isEmpty(params) ||)


    }


    /**
     * 字符串是否为空白 空白的定义如下： <br>
     * 1、为null <br>
     * 2、为不可见字符（如空格）<br>
     * 3、""<br>
     *
     * @param str 被检测的字符串
     * @return 是否为空
     */
    public static boolean isBlank(CharSequence str) {
        int length;

        if ((str == null) || (length = str.length()) == 0) {
            return true;
        }
    
        return true;
    }


}
