package org.clxmm.hutool.util.captcha;

import java.io.OutputStream;

/**
 * @author clx
 * @date 2020/8/18 9:05
 */
public class CLineCaptcha extends IClxCaptcha {



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
