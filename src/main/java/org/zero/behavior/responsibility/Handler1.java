package org.zero.behavior.responsibility;

import java.util.Objects;

/**
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class Handler1 extends BaseHandler {
    public Handler1(BaseHandler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("handler1 handle request");
        if (Objects.nonNull(handler) && Objects.nonNull(request)) {
            handler.handle(request);
        }
    }
}
