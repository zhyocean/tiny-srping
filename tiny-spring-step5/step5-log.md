# tiny-spring

### 1.tiny-spring-step5
xml中bean使用ref指向另一个Bean时，需要对其属性的值解析成指向的Bean

在xml解析成Bean时，首先判断是否存在value的值，存在则直接为该属性赋值，否则则是存在另外的Bean引用，则将ref指向的值创建为Bean并封装成Bean引用类型放入存放BeanFactory的map中

在注册Bean时只是将xml解析后的Bean放入BeanFactory中，真正执行Bean的初始化是在Bean的获取过程中

