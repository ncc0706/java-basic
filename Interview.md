# 面试题

Java 常见面试题

## Collection(集合)

1. Collection与Collections的区别?

	答：Collection是集合类的父接口，主要继承接口有List和Set，Collections是集合的类的一个工具类，提供了一系列的静态方法实现对集合的搜索、排序、线程安全的操作。

2. 什么情况下你会使用ArrayList？什么时候你会选择LinkedList？

	答：根据ArrayList、LinkedList各自的特点,ArrayList底层采用数组实现,当访问元素更频繁时选择ArrayList。LinkedList底层采用链表实现,当插入、修改、删除更频繁时选择LinkedList。

3. ArrayList的大小是如何自动增加的？扩容机制的1.5倍

	答：ArrayList试图增加一个元素时，Java会去检查ArrayList，已确保当前数组有足够的容量存储新对象。如果没有足够的容量，那么就新建一个更长的数组，旧的数组就会使用Arrays.copyOf方法被复制到新的数组中，现有数组引用指向了新的数组。

4. 



