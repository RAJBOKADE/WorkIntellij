package com.crossasyst.java;
interface phone{
    void call();
    default void message(){
        System.out.println("Call method");
    }
}
class AndroidPhone implements phone{
    @Override
    public void call() {
        System.out.println("Calling");
    }
}

public class DemoInterface {
    public static void main(String[] args) {
        phone p = new AndroidPhone();
        p.call();
        p.message();
    }

}
