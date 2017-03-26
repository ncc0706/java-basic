# Map 接口

将键映射到值的对象。一个映射不能包含重复的键；每个键最多只能映射到一个值

## HashMap类

初始化大小16，默认加载因子0.75，可以使用null作为key、value，非synchronized

``线程安全``的HashMap

	Map m = Collections.synchronizeMap(hashMap)


## Hashtable
用默认的初始容量 (11) 和加载因子 (0.75), 任何非 null 对象都可以用作键或值， 线程安全的,是基于陈旧的Dictionary类

