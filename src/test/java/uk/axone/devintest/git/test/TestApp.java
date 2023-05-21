package uk.axone.devintest.git.test;

import org.testng.annotations.Test;

public class TestApp {
    @Test
    public void test1(){
        System.out.println("Running test1");
    }

    private void doSomething(){
        System.out.println("Do something");
    }
}
