package org.clxmm.hutool.test;

import cn.hutool.system.*;

/**
 * 系统属性调用-SystemUtil
 *
 * @author clx
 * @date 2020/8/17 16:48
 */
public class SystemUtilAbout {


    public static void main(String[] args) {

        JvmSpecInfo jvmSpecInfo = SystemUtil.getJvmSpecInfo();
        System.out.println(jvmSpecInfo);

        JvmInfo jvmInfo = SystemUtil.getJvmInfo();
        System.out.println(jvmInfo);


        JavaSpecInfo javaSpecInfo = SystemUtil.getJavaSpecInfo();
        System.out.println(javaSpecInfo);


        JavaInfo javaInfo = SystemUtil.getJavaInfo();
        System.out.println(javaInfo);

        // Java运行时信息
        JavaRuntimeInfo javaRuntimeInfo = SystemUtil.getJavaRuntimeInfo();
        System.out.println(javaRuntimeInfo);

        // 系统信息
        OsInfo osInfo = SystemUtil.getOsInfo();
        System.out.println(osInfo);

        // 用户信息
        UserInfo userInfo = SystemUtil.getUserInfo();
        System.out.println(userInfo);


        // 当前主机网络地址信息
        HostInfo hostInfo = SystemUtil.getHostInfo();
        System.out.println(hostInfo);

//        运行时信息，包括内存总大小、已用大小、可用大小等
        RuntimeInfo runtimeInfo = SystemUtil.getRuntimeInfo();
        System.out.println(runtimeInfo);


    }



















}
