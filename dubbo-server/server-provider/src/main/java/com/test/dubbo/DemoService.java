package com.test.dubbo;

/**
 * @author harrypotter
 */
public class DemoService implements IDemoService{


    @Override
    public String protocolDemo(String msg) {
        return "I'm Protocol Demo:"+msg;
    }
}
