package com.deloitte.lambda;
interface Hello {
    void hello ();
}
public class Greeter {
    public static void main(String[] args) {
        Hello h = () -> System.out.println("Hello World");
        h.hello();
    }
}