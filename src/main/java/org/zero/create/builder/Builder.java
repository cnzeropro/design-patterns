package org.zero.create.builder;

/**
 * 参考lombok @Builder注解生成的代码
 *
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class Builder {
    private Integer id;
    private String name;

    public Builder id(final Integer id) {
        this.id = id;
        return this;
    }

    public Builder name(final String name) {
        this.name = name;
        return this;
    }

    public Product build() {
        return new Product(id, name);
    }
}
