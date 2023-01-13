package org.zero.behavior.responsibility;

/**
 * @author Zero (cnzeropro@qq.com)
 * @since 2023/1/12
 */
public abstract class BaseHandler {
    protected BaseHandler handler;

    protected BaseHandler(BaseHandler handler) {
        this.handler = handler;
    }

    protected abstract void handle(Request request);
}
