package org.clxmm.hutool.util.captcha.generator;

import java.io.Serializable;

/**
 * 验证码文字生成器
 *
 * @author clx
 * @date 2020/8/18 9:16
 */
public interface CCodeGenerator extends Serializable {

    /**
     * 生产验证码
     *
     * @return 验证码
     */
    String generate();


    /**
     * 验证用户输入的字符串是够与生产的验证码是否正确<br>
     * 用户通过实现此方法定义验证码的匹配方式
     *
     * @param code 随机生产的验证码
     * @param userInputCode 用户输入的验证码
     * @return 是否验证通过
     */
    boolean verify(String code, String userInputCode);

}
