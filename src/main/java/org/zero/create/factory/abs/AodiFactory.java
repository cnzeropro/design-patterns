package org.zero.create.factory.abs;

import org.zero.create.factory.BusinessCar;
import org.zero.create.factory.MiniCar;
import org.zero.create.factory.AodiBusiness;
import org.zero.create.factory.AodiMimi;

/**
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class AodiFactory implements Factory {
    @Override
    public MiniCar createMini() {
        return new AodiMimi();
    }

    @Override
    public BusinessCar createBusiness() {
        return new AodiBusiness();
    }
}
