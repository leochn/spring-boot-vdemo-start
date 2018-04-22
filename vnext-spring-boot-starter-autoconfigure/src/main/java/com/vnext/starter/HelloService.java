package com.vnext.starter;

/**
 * @author leo
 * @version 2018/4/22 14:43
 * @since 1.0.0
 */
public class HelloService {

    HelloProperies helloProperies;

    public HelloProperies getHelloProperies() {
        return helloProperies;
    }

    public void setHelloProperies(HelloProperies helloProperies) {
        this.helloProperies = helloProperies;
    }

    public String sayHelloVnext(String name){
        return helloProperies.getPrefix()+ "-" + name + "-" + helloProperies.getSuffix();
    }
}
