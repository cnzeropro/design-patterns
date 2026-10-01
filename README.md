# design-patterns

设计模式的 Java 实现集合，按**创建型 / 结构型 / 行为型**三大类分目录，共 23 个模式目录，每个模式独立成包、可直接翻代码。

## 目录

```
src/main/java/org/zero/
├── create/                    # 创建型
│   ├── builder/               # 建造者
│   ├── factory/               # 工厂（simple 简单工厂 / abs 抽象工厂）
│   ├── prototype/             # 原型
│   └── singleton/             # 单例
├── structural/                # 结构型
│   ├── adapter/               # 适配器
│   ├── bridge/                # 桥接
│   ├── composite/             # 组合
│   ├── decorator/             # 装饰器
│   ├── facade/                # 外观
│   ├── flyweight/             # 享元
│   └── proxy/                 # 代理
└── behavior/                  # 行为型
    ├── command/               # 命令
    ├── interpreter/           # 解释器
    ├── iterator/              # 迭代器
    ├── mediator/              # 中介者
    ├── memento/               # 备忘录
    ├── nil/                   # 空对象（非 GoF 原书收录）
    ├── observer/              # 观察者
    ├── responsibility/        # 职责链
    ├── state/                 # 状态
    ├── strategy/              # 策略
    ├── template/              # 模板方法
    └── visitor/               # 访问者
```

## 运行

```bash
mvn test        # 各模式自带测试（如 DoubleCheckLockTest），测试即用法示例
```

## 说明

- 纯 Java 8 + Lombok + JUnit 4，不依赖任何框架，适合当参考手册翻
- 包内通常包含：接口 / 抽象类、具体实现，以及一个测试或 `main` 演示
