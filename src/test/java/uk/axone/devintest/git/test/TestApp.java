package uk.axone.devintest.git.test;


import org.junit.Test;

public class TestApp {
    @Test
    public void test1() {
        System.out.println("Running test1");
    }

    @Test
    public void test2() {
        System.out.println("Running test2");
    }

    @Test
    public void test3() {
        System.out.println("Running test3");
    }

    private void doSomething() {
        System.out.println("Do something");
    }

    public void test4() {
        System.out.println("Running test4");
    }
    public void test5() {
        System.out.println("Running test5");
    }
    public void test6() {
        int x=10/0;
        System.out.println("Running test6");
    }


}

