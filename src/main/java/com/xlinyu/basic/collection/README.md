# Collection

Collection是集合的父类接口，常见接口List、Set。

List和Set的重要区别，Set是基于HashMap实现的。

## List

ArrayList、LinkedList、Vector、Stack(extends Vector)

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

LinkedList 有序可重复, 底层采用双向链表，每个节点都包含了对前一个和后一个元素的引用，允许null元素，时候删除、添加操作。

### Vector

Vector非常类似ArrayList，但是Vector是同步的。同样适合查询

## Set

Set是一种不包含重复的元素的Collection，最多有一个null元素。set遍历使用Iterator迭代

### HashSet

无序 不重复 ， 允许一个null元素， 是基于HashMap实现的，线程非安全的，其底层 HashMap 实例的默认初始容量是 16，加载因子是 0.75

### LinkedHashSet

有序 ，不重复， 访问元素比HashSet要好，插入时性能稍微逊色。 默认大小为16，加载因子0.75

### TreeSet

TreeSet是SortedSet接口的实现类，内部是TreeMap. 有序 ，不重复。不允许null元素



