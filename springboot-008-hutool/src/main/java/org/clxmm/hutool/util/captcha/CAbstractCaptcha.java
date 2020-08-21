package org.clxmm.hutool.util.captcha;

import cn.hutool.captcha.ICaptcha;
import cn.hutool.captcha.generator.CodeGenerator;

import java.awt.*;
import java.io.OutputStream;

/**
 * 抽象验证码<br>
 * 抽象验证码实现了验证码字符串的生成、验证，验证码图片的写出<br>
 * 实现类通过实现{@link #createImage(String)} 方法生成图片对象
 *
 * @author clx
 * @date 2020/8/18 9:06
 */
public abstract class CAbstractCaptcha implements ICaptcha {


    /**
     * 图片的宽度
     */
    protected int width;


    /**
     * 图片的高度
     */
    protected int height;

    /**
     * 验证码干扰元素个数
     */
    protected int interfereCount;


    /**
     * 字体
     */
    protected Font font;


    /**
     * 验证码
     */
    protected String code;

    /**
     * 验证码图片
     */
    protected byte[] imageBytes;


    /**
     * 验证码生成器
     */
    protected CCodeGenerator codeGenerator;


    /**
     * 背景色
     */
    protected Color background;


    /**
     * 文字透明度
     */
    protected AlphaComposite textAlpha;


    /**
     *
     */
    public CAbstractCaptcha() {

    }

    public CAbstractCaptcha(int width, int height, int interfereCount) {
        this.width = width;
        this.height = height;
        this.interfereCount = interfereCount;
    }

    @Override
    public void createCode() {

    }

    @Override
    public String getCode() {
        return null;
    }

    @Override
    public boolean verify(String userInputCode) {
        return false;
    }

    @Override
    public void write(OutputStream out) {

    }
}
