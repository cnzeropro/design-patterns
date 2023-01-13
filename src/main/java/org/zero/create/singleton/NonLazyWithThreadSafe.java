package org.zero.create.singleton;

/**
 * 饿汉式-线程安全（不推荐：提前初始化，浪费资源）
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class NonLazyWithThreadSafe {
    private static final NonLazyWithThreadSafe uniqueInstance = new NonLazyWithThreadSafe();

    private NonLazyWithThreadSafe() {
    }

    public static NonLazyWithThreadSafe getInstance() {
        return uniqueInstance;
    }
}
