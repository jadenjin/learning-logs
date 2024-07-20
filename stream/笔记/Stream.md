## Stream流

1. 先得到一个Stream流，并把数据放上去。
2. 使用中间方法对流水线上的数据进行操作。
3. 使用终结方法对流水线上的数据进行操作。

作用：结合Lambda表达式，简化集合、数组的操作。

获取Stream流对象

单列集合：Collection中的默认方法stream

双列集合：不能直接获取

数组：Arrays工具类型中的静态方法stream

常见方法
filter、limit、skip、distinct、concat、map

foreach、count、collect

