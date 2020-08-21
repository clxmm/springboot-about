package org.clxmm.hutool.core.util;

import java.security.NoSuchAlgorithmException;
import java.security.SecureRandom;
import java.util.concurrent.ThreadLocalRandom;

/**
 * 随机工具类
 *
 * @author clx
 * @date 2020/8/18 9:53
 */
public class CRandomUtil {


    /**
     * 用于随机选的数字
     */
    public static final String BASE_NUMBER = "1234567890";


    /**
     * 用于随机选的字符串
     */
    public static final String BASE_CHAR = "abcdefghijklmnopqrstuvwxyz";


    /**
     * 用于随机选的字符和数字
     */
    public static final String BASE_CHAR_NUMBER = BASE_NUMBER + BASE_CHAR;


    /**
     * 获取随机数 <br>
     * ThreadLocalRandom是JDK 7之后提供并发产生随机数，能够解决多个线程发生的竞争争夺。
     *
     * <p>
     * 注意：此方法返回的{@link ThreadLocalRandom}不可以在多线程环境下共享对象，否则有重复随机数问题。
     * 见：https://www.jianshu.com/p/89dfe990295c
     * </p>
     *
     * @return ThreadLocalRandom
     */
    public static ThreadLocalRandom getRandom() {
        return ThreadLocalRandom.current();
    }

    /**
     * 创建{@link SecureRandom}，类提供加密的强随机数生成器 (RNG)<br>
     *
     * @param seed 自定义随机种子
     * @return SecureRandom
     */
    public static SecureRandom createSecureRandom(byte[] seed) {
        return (null == seed) ? new SecureRandom() : new SecureRandom(seed);
    }


    public static SecureRandom getSecureRandom () {
        try {
                SecureRandom.getInstance("SHA1PRNG");
        } catch (NoSuchAlgorithmException e) {
throw new
        }

    }





}
