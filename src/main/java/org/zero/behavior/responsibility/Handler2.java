package org.zero.behavior.responsibility;

import java.util.Objects;

/**
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public class Handler2 extends BaseHandler {
    public Handler2(BaseHandler handler) {
        super(handler);
    }

    @Override
    public void handle(Request request) {
        System.out.println("handler2 handle request");
        if (Objects.nonNull(handler) && Objects.nonNull(request)) {
            handler.handle(request);
        }
    }
}
