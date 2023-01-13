package org.zero.create.singleton;

import org.junit.Test;

import java.lang.reflect.Constructor;

import static org.junit.Assert.*;

/**
 * @author yufa.wang (yufa.wang@ronganchina.com)
 * @since 2023/1/13
 */
public class DoubleCheckLockTest {

    @Test
    public void test() throws Exception {
        DoubleCheckLock instance1 = DoubleCheckLock.getInstance();
        System.out.println(System.identityHashCode(instance1));
        DoubleCheckLock instance2 = DoubleCheckLock.getInstance();
        System.out.println(System.identityHashCode(instance2));

        Constructor<DoubleCheckLock> constructor = DoubleCheckLock.class.getDeclaredConstructor();
        constructor.setAccessible(true);
        DoubleCheckLock instance3 = constructor.newInstance();
        System.out.println(System.identityHashCode(instance3));
    }
}