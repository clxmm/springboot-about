package org.clxmm.hutool.core.util;

/**
 * 数组工具类
 *
 * @author clx
 * @date 2020/8/18 10:22
 */
public class CArrayUtil {

    /**
     * 数组中的元素未找到的下标
     */
    public static final int INDEX_NOT_FOUND = -1;

    // ---------------------------------------------------------------------- isEmpty

    /**
     * 数组是否为空
     * @param <T> 数组元素类型
     * @param array 数组
     * @return 是否为空
     */
    public static <T> boolean isEmpty(T[] array) {
        return array == null || array.length == 0;
    }


}
