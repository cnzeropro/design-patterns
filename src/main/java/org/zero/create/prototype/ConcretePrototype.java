package org.zero.create.prototype;

import lombok.AllArgsConstructor;
import lombok.Data;

/**
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
@Data
@AllArgsConstructor
public class ConcretePrototype implements Prototype {
    private String name;

    @Override
    public Prototype customClone() {
        return new ConcretePrototype(name);
    }
}
