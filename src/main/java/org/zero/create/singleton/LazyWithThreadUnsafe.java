package org.zero.create.singleton;

/**
 * 懒汉式-线程不安全（不推荐：线程不安全）
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class LazyWithThreadUnsafe {
    private static LazyWithThreadUnsafe uniqueInstance;

    private LazyWithThreadUnsafe() {
    }

    public static LazyWithThreadUnsafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazyWithThreadUnsafe();
        }
        return uniqueInstance;
    }
}
