package org.clxmm.hutool.util.captcha.generator;

/**
 * @author clx
 * @date 2020/8/18 9:36
 */
public abstract class CAbstractGenerator implements CCodeGenerator {

    /**
     * 基础字符集合，用于随机获取字符串的字符集合
     */
    protected final String baseStr;


    /**
     * 验证码长度
     */
    protected final int length;


    /**
     * 构造
     *
     * @param baseStr 基础字符集合，用于随机获取字符串的字符集和
     * @param length  生产验证的长度
     */
    public CAbstractGenerator(String baseStr, int length) {
        this.baseStr = baseStr;
        this.length = length;
    }


    public CAbstractGenerator(int count) {
        this()
    }


    /**
     * 获取验证码的长度
     *
     * @return 验证码长度
     */
    public int getLength() {
        return length;
    }
}
