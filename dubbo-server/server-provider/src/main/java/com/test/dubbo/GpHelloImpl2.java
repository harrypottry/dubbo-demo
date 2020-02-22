package com.test.dubbo;

/**
 * @author harrypotter
 */
public class GpHelloImpl2 implements IGpHello{

    @Override
    public String sayHello(String msg) {
        return "Hello,i'm server 2:"+msg;
    }
}
