package com.sun.zq.design.decorate;

public class ConsoleUpCaseLogger extends Decorator {

    public ConsoleUpCaseLogger(ILogger logger) {
        super(logger);
    }

    @Override
    public void show(String message) {
        StringBuilder sb = new StringBuilder();
        sb.append("经过装饰后的日志内容是").append(message).append(",装饰结束了");
        logger.show(sb.toString());

    }
}
