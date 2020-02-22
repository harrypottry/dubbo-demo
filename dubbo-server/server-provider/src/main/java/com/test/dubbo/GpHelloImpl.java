package com.test.dubbo;

/**
 * @author harrypotter
 */
public class GpHelloImpl implements IGpHello{

    @Override
    public String sayHello(String msg) {
        return "Hello:"+msg;
    }
}
