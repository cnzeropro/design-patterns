package org.zero.create.factory.abs;

import org.zero.create.factory.BusinessCar;
import org.zero.create.factory.MiniCar;
import org.zero.create.factory.VolkswagenBusiness;
import org.zero.create.factory.VolkswagenMini;

/**
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class VolkswagenFactory implements Factory {
    @Override
    public MiniCar createMini() {
        return new VolkswagenMini();
    }

    @Override
    public BusinessCar createBusiness() {
        return new VolkswagenBusiness();
    }
}
