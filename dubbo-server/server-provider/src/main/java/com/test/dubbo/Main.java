package com.test.dubbo;

import java.io.IOException;

/**
 * @author harrypotter
 */
public class Main {
    public static void main(String[] args) throws IOException {

        //默认情况下会使用spring容器来启动服务
        com.alibaba.dubbo.container.Main.main(
                new String[]{"spring","log4j"});



    }
}
