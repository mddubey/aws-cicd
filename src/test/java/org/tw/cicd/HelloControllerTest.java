package org.tw.cicd;

import org.junit.Test;

import static org.junit.Assert.*;

public class HelloControllerTest {
    @Test
    public void helloWorldTest() throws Exception {
        HelloController helloController = new HelloController();
        assertEquals("Hell World", helloController.helloWorld());
    }
}
