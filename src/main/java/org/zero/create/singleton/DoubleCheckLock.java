package org.zero.create.singleton;

/**
 * 懒汉式-双重校验锁-线程安全（推荐但不完全推荐，因为反射可破解。但是可以在构造函数中添加防止多次实例化的代码以防止反射攻击）
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class DoubleCheckLock {
    private static volatile DoubleCheckLock uniqueInstance;

    private DoubleCheckLock() {
    }

    public static DoubleCheckLock getInstance() {
        if (uniqueInstance == null) {
            synchronized (DoubleCheckLock.class) {
                if (uniqueInstance == null) {
                    uniqueInstance = new DoubleCheckLock();
                }
            }
        }
        return uniqueInstance;
    }
}
