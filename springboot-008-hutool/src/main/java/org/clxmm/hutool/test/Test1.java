package org.clxmm.hutool.test;

import cn.hutool.core.convert.Convert;

/**
 * @author clx
 * @date 2020/8/17 16:27
 */
public class Test1 {


    public static void main(String[] args) {


        test1();
    }

    private static void test1() {
        int a = 1;
        // aStr为"1"
        String s = Convert.toStr(1);
        System.out.println(s);
        long[] b = {1,2,3,4,5};
        // b str 为：
        String bStr = Convert.toStr(b);
        System.out.println(bStr);
    }


}
