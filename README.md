jdbc的问题分析

1.数据库连接创建，释放频繁造成系统资源浪费从而影响性能，使用数据库连接池可以解决此问题。

2.sql语句中存在硬编码，sql变动的时候，需要修改代码。

3.在preparedStatement向占有符号传参数存在硬编码，因为sql条件where条件不一定，可能多也可能少。

4.对结果集解析存在硬编码（查询列名）,如果能将结果映射成pojo代码比较方便。

——————————————————————————————————————————————————

mysql的在maven中的依赖

<dependency>
            <groupId>mysql</groupId>
            <artifactId>mysql-connector-java</artifactId>
            <version>8.0.11</version>
</dependency>