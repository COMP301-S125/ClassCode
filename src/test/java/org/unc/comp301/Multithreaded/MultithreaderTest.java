package org.unc.comp301.Multithreaded;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;
public class MultithreaderTest {

    @Before
    public void setup(){
        System.out.println("starting the test...");
    }

    @After
    public void teardown(){
        System.out.println("...Test is finished");
    }
    @Test
    public void example1() {
        Multithreader.example1();
      }

    @Test
    public void example2() {
        Multithreader.example2();
      }

    @Test
    public void example3() {
        Multithreader.example3();
    }

    @Test
    public void example4() {
        Multithreader.example4();
    }

    @Test
    public void example5() throws InterruptedException {
        Multithreader.example5();
      }
}