# 实例变量和类变量

static 修饰的成员变量是类变量, 非static修饰的成员变量是实例变量


## 实例变量的初始化时机

+ 构造器初始化
+ 初始化块
+ 定义变量时指定初始化值

javac java源文件 `javap -c java class文件`分析{初始化块} 指定初始化值

![javap分析](resources/01.png)

