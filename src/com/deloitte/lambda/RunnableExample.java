package com.deloitte.lambda;

public class RunnableExample {
    public static void main(String[] args) {
        Thread myThread = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("Runnable Example");
            }
        });
        myThread.run();
        Thread myLambdaThread = new Thread(() -> System.out.println("Runnable Lambda Example"));
        myLambdaThread.run();
    }
}