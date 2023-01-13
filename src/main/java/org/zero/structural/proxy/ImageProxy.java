package org.zero.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.SneakyThrows;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@AllArgsConstructor
public class ImageProxy implements Image {
    private HighResolutionImage image;

    @Override
    @SneakyThrows
    public void showImage() {
        while (!image.isLoad()) {
            System.out.println("Temp Image: " + image.getWidth() + " " + image.getHeight());
            Thread.sleep(300);
        }

        image.showImage();
    }
}
