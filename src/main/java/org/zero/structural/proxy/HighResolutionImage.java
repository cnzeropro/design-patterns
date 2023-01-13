package org.zero.structural.proxy;

import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
@Getter
@AllArgsConstructor
public class HighResolutionImage implements Image {
    private final long startTime = System.currentTimeMillis();

    private int height;
    private int width;

    public boolean isLoad() {
        // 模拟图片加载，延迟 3s 加载完成
        long endTime = System.currentTimeMillis();
        return endTime - startTime > 3000;
    }


    @Override
    public void showImage() {
        System.out.printf("Real Image, width: %s, height: %s", width, height);
    }
}
