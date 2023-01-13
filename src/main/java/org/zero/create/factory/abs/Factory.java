package org.zero.create.factory.abs;

import org.zero.create.factory.BusinessCar;
import org.zero.create.factory.MiniCar;

/**
 * 抽象工厂
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public interface Factory {
    MiniCar createMini();
    BusinessCar createBusiness();
}
