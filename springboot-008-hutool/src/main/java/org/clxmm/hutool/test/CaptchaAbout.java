package org.clxmm.hutool.test;

import cn.hutool.captcha.CaptchaUtil;
import cn.hutool.captcha.CircleCaptcha;
import cn.hutool.captcha.LineCaptcha;
import cn.hutool.captcha.generator.RandomGenerator;
import cn.hutool.core.lang.Console;

/**
 * 验证码需求量巨大
 *
 * @author clx
 * @date 2020/8/17 17:22
 */
public class CaptchaAbout {


    private static String path = "C:/yyh/logs/";

    public static void main(String[] args) {
//        test1();
//        test2();
        test3();


    }


    // 自定义验证码
    private static void test2() {
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 20);
        RandomGenerator randomGenerator = new RandomGenerator("0123456789", 4);
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);
        captcha.setGenerator(randomGenerator);
    }






    // 圆圈干扰验证码
    private static void test3() {
        CircleCaptcha captcha = CaptchaUtil.createCircleCaptcha(200, 100, 4, 20);
        captcha.write(path + "1.png");
        // 验证码是否有效
        String code = captcha.getCode();
        System.out.println(code);
        boolean verify = captcha.verify("1234");
        System.out.println(verify);
    }






    // 线段干扰的验证码
    private static void test1() {
        //定义图形验证码的长和宽
        LineCaptcha lineCaptcha = CaptchaUtil.createLineCaptcha(200, 100);

        //图形验证码写出，可以写出到文件，也可以写出到流
        lineCaptcha.write("C:/yyh/logs/line.png");
        //输出code
        Console.log(lineCaptcha.getCode());
//        //验证图形验证码的有效性，返回boolean值
        boolean verify = lineCaptcha.verify("1234");
        System.out.println(verify);
//
        //重新生成验证码
        lineCaptcha.createCode();
//                lineCaptcha.write("C:/yyh/logs/line.png");
//        //新的验证码
//                Console.log(lineCaptcha.getCode());
//        //验证图形验证码的有效性，返回boolean值
//                lineCaptcha.verify("1234");


    }


}
