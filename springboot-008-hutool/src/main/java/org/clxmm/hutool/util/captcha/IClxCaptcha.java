package org.clxmm.hutool.util.captcha;

import java.io.OutputStream;
import java.io.Serializable;

/**
 * 验证码接口，提供验证码对象接口定义
 *
 * @author clx
 * @date 2020/8/18 8:36
 */
public interface IClxCaptcha extends Serializable {


    /**
     * 创建验证码，实现类需要同时生成随机验证码字符串和验证码图片
     */
    void createCode();

    /**
     * 获取验证码的字符串
     *
     * @return 验证码字符内容
     */
    String getCode();


    /**
     * 验证码验证是否正确，建议忽略大小写
     *
     * @param userInputCode 用户输入的验证码
     * @return是否与生成的一致
     */
    boolean verify(String userInputCode);


    /**
     * 将验证码写出到目标流中
     */
    void write(OutputStream out);


}
