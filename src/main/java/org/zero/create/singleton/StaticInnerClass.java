package org.zero.create.singleton;

/**
 * 静态内部类实现（推荐：不仅具有延迟初始化的好处，而且由 JVM 提供了对线程安全的支持；但不完全推荐：同双重校验锁一样，反射可破解。但是可以在构造函数中添加防止多次实例化的代码以防止反射攻击）
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class StaticInnerClass {
    private StaticInnerClass() {
    }

    private static class SingletonHolder {
        private static final StaticInnerClass INSTANCE = new StaticInnerClass();
    }

    public static StaticInnerClass getInstance() {
        return SingletonHolder.INSTANCE;
    }
}
