package com.example.dynamic_feature1;


import org.junit.Before;
import org.junit.Test;

import java.net.URL;
import java.net.URLClassLoader;

public class DynamicPresenterTest {
    @Before
    public void setUp() throws Exception {
        DynamicPresenter dynamicPresenter = new DynamicPresenter();
    }

    @Test
    public void testXyz() {

    }

    @Test
    public void printOutClasspathTest() {
        System.out.println("=== test's classpath ===");
        ClassLoader systemClassLoader = ClassLoader.getSystemClassLoader();
        URL[] systemUrls = ((URLClassLoader) systemClassLoader).getURLs();
        for (URL url : systemUrls) {
            System.out.println(url.getFile());
        }
    }
}