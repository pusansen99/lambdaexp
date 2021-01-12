package com.deloitte.lambda;
@FunctionalInterface
interface Length {
    int getLength(String s);
}

public class StrLen {
    public static void main(String[] args) {
        printLength((s) -> s.length());
    }
    public static void printLength(Length l) {
        System.out.print(l.getLength("HelloWorld"));
    }
}
