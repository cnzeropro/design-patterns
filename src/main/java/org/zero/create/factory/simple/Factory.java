package org.zero.create.factory.simple;

import org.zero.create.factory.AodiBusiness;
import org.zero.create.factory.AodiMimi;
import org.zero.create.factory.Car;
import org.zero.create.factory.VolkswagenBusiness;
import org.zero.create.factory.VolkswagenMini;

/**
 * 简单工厂
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class Factory {
    public static Car createCar(int type) {
        Car car;
        if (type == 1) {
            car = new AodiMimi();
        } else if (type == 2) {
            car = new AodiBusiness();
        } else if (type == 3) {
            car = new VolkswagenMini();
        } else if (type == 4) {
            car = new VolkswagenBusiness();
        } else {
            throw new IllegalArgumentException("Invalid type: " + type);
        }
        return car;
    }
}
