package com.test.circleci;


import org.junit.Assert;
import org.junit.Test;

public class AppTest {


    @Test
    public void shouldBeEqual() {
        Assert.assertEquals(App.sum(10, 10), 20);
    }
}