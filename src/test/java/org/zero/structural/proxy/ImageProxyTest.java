package org.zero.structural.proxy;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class ImageProxyTest {

    @Test
    public void test() {
        HighResolutionImage highResolutionImage = new HighResolutionImage(1024, 2048);
        ImageProxy imageProxy = new ImageProxy(highResolutionImage);
        imageProxy.showImage();
    }
}