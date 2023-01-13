package org.zero.create.singleton;

/**
 * 懒汉式-线程安全（不推荐：性能问题）
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class LazyWithThreadSafe {
    private static LazyWithThreadSafe uniqueInstance;

    private LazyWithThreadSafe() {
    }

    public static synchronized LazyWithThreadSafe getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new LazyWithThreadSafe();
        }
        return uniqueInstance;
    }
}
