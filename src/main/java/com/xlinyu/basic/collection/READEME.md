# Collection

Collection是集合的父类接口

## List

### ArrayList

特点: 有序 可重复, 底层是基于数组实现的, 默认初始化大小为10,增长机制：
	
	int newCapacity = oldCapacity + (oldCapacity >> 1);

线程不安全、效率高，查询快 修改、插入、删除慢

**ArrayList提供了三种方式的构造器**

1. 可以构造一个默认初始容量为10的空列表
2. 构造一个指定初始容量的空列表
3. 构造一个包含指定collection的元素的列表，这些元素按照该collection的迭代器返回它们的顺序排列的

`优化`如果数据量很大还是建议初始化的时候指定容量的大小，提高效率

### LinkedList

