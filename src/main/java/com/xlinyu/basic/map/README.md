# Map 接口

将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值

## HashMap类

初始化大小16，默认加载因子0.75，可以使用null作为key、value，非synchronized

``线程安全``的HashMap

	Map m = Collections.synchronizeMap(hashMap)

## LinkedHashMap

是HashMap的子类，保存了记录的插入顺序，在用Iterator遍历LinkedHashMap时，先得到的记录肯定是先插入的.也可以在构造时用带参数，按照应用次数排序。在遍历的时候会比HashMap慢，不过有种情况例外，当HashMap容量很大，实际数据较少时，遍历起来可能会比 LinkedHashMap慢

因为LinkedHashMap的遍历速度只和实际数据有关，和容量无关，而HashMap的遍历速度和他的容量有关

## Hashtable
用默认的初始容量 (11) 和加载因子 (0.75), 任何非 null 对象都可以用作键或值， 线程安全的,是基于陈旧的Dictionary类

## TreeMap

基于红黑树（Red-Black tree）的 NavigableMap 实现.TreeMap实现SortMap接口. 不允许null作为key， 无序的Map， 非线程安全。

