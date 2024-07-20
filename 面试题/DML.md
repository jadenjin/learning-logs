# DML

1. 添加数据

```sql
1. 给指定字段添加数据
INSERT INTO 表名(字段名1，字段名2) VLAUSE(值1，值2);
2. 给全部字段添加数据
INSERT INTO 表名 VALUSE(值1，值2);
3. 批量添加
INSERT INTO 表名(字段名1，字段名2) VALUSE(值1，值2),(值1，值2),(值1，值2);
INSERT INTO 表名 VALUSE(值1，值2),(值1，值2),(值1，值2);
```

注意:字段顺序与值顺序一一对应，字符串以及日期类型数据包含在引号中。

2. 修改数据

```
UPDATE 表名 SET 字段名1=值1，字段名2=值2，...[WHERE 条件];
```

3. 删除语句

```
DELETE FROM 表名 [WHERE 条件];
```

# DQL

1. 查询

```
SELECT
		字段列表
FROM
		表名列表
WHERE
		条件列表
GROUP BY
		分组字段列表
HAVING
		分组后条件列表
ORDER BY
		排序字段列表
LIMIT
		分页参数
		
1. 查询多个字段
SELECT 字段1，字段2，字段3...FROM 表名;
SELECT * FROM 表名;
2. 设置别名
SELECT 字段1 [AS 别名1]，字段2[AS 别名2]...FROM 表名;
3. 去除重复记录
SELECT DISTINCT 字段列表 FROM 表名;
```

