# 面试题

Java 常见面试题

## Collection(集合)

1. Collection与Collections的区别?

	答：Collection是集合类的父接口，主要继承接口有List和Set，Collections是集合的类的一个工具类，提供了一系列的静态方法实现对集合的搜索、排序、线程安全的操作。

2. 什么情况下你会使用ArrayList？什么时候你会选择LinkedList？

	答：根据ArrayList、LinkedList各自的特点,ArrayList底层采用数组实现,当访问元素更频繁时选择ArrayList。LinkedList底层采用链表实现,当插入、修改、删除更频繁时选择LinkedList。

3. ArrayList的大小是如何自动增加的？扩容机制的1.5倍

	答：ArrayList试图增加一个元素时，Java会去检查ArrayList，已确保当前数组有足够的容量存储新对象。如果没有足够的容量，那么就新建一个更长的数组，旧的数组就会使用Arrays.copyOf方法被复制到新的数组中，现有数组引用指向了新的数组。

4. 当传递ArrayList到某个方法中,或某个方法返回ArrayList，什么时候要考虑安全隐患？如何修复安全违规问题？

	答：当array被当做参数传递到某个方法中，如果array在没有被赋值的情况下直接被分配给了成员变量，那么就可能发生这种情况，即当原始的数组被调用的方法改变的时候，传递到这个方法中的数组也会改变。下面的这段代码展示的就是安全违规以及如何修复这个问题。

	ArrayList被直接赋给成员变量——安全隐患：

		public void setNames(String[] names) {
			this.names = names;
		}

	修复这个安全隐患：

		public void setNames(String[] names) {
			if(names == null){
				this.names = new String[0];
			}else{
				this.names = Arrays.copyOf(names, names.length);
			}
		}
5. 如何复制某个ArrayList到另一个ArrayList中去？

	1. 使用ArrayList的clone方法 
	2. 使用ArrayList构造方法
	3. 使用Collection的copy方法。


6. Thread的run()与start()的区别

	答：start()方法用来启动线程，真正实现了多线程运行，run()方法相当于普通的方法调用

7. 在Java中Executor和Executors的区别？

	1. Executors类，提供了一系列工厂方法用于创先线程池，返回的线程池都实现了ExecutorService接口。
	2. 接口Executor只有一个方法execute，接口ExecutorService扩展了Executor并添加了一些生命周期管理的方法，如shutdown、submit等。一个Executor的生命周期有三种状态，运行 ，关闭 ，终止
8. 