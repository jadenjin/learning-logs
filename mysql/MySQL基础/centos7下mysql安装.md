# centos7下mysql安装

## 安装前检查

卸载旧版mysql

```
rpm -qa | grep mysql  #查看已安装的MySQL
rpm -e PackageName		# 卸载查询到的所有安装包
rm -f /etc/my.cnf     #删除my.cnf
```



## 在线安装

1. 选择所需版本

https://dev.mysql.com/downloads/repo/yum/ 下载页面

![image-20240707105144000](/Users/chenjin/Library/Application Support/typora-user-images/image-20240707105144000.png)

```
cat /etc/centos-release   #查看操作系统发行信息
wget https://dev.mysql.com/get/[所需版本]
例如：wget https://dev.mysql.com/get/mysql84-community-release-el7-1.noarch.rpm
```

2. 安装RPM包

```
rpm -ivh [包名]
例如:rpm -ivh mysql84-community-release-el7-1.noarch.rpm
```

3. 安装mysql

```
yum install mysql-community-server -y
```

4. 启动mysql

```
systemctl enable --now mysqld.service	# 开机自启并立即启动mysql
systemctl status mysqld.service			# 查看mysql状态
```

5. 查看原始密码

```
grep "password" /var/log/mysqld.log
```

6. 登陆mysql

```
mysql -u root -p
输入原始密码（无回显）
```

7. 修改密码

```
# ↓MySQL8密码等级要求较高，首次修改密码时必须包含大小写字母、数字和特殊符号
alter user "root"@"localhost" identified by "Test!@12";		# 修改root密码
```

8. 配置远程登录

```
use mysql;			# 使用mysql库
update user set host="%" where user="root";		# 将host修改为所有ip均可以访问
flush privileges;	# 刷新权限
```

9. 配置密码策略

```
show variables like "validate_password%";		# 查看密码策略

set global validate_password.length=5;			# 密码长度设置为5位数
set global validate_password.policy=0;			# 密码策略改为低
alter user "root"@"%" identified by "12345";	# 修改密码为简单密码12345

```



## 离线安装

1. 选择版本

https://dev.mysql.com/downloads/mysql/ 下载页面

2. 解压

```
mkdir mysql-8.0.34		# 创建mysql-8.0.34目录
tar -xf mysql-8.0.34-1.el9.x86_64.rpm-bundle.tar -C mysql-8.0.34/	# 将tar包解压到新建的目录下
```

3. 安装

```
cd mysql-8.0.34/		# 进入mysql-8.0.34目录
rpm -ivh mysql-community-* --force --nodeps		# 不检查依赖并强制安装所有mysql-community-开头的rpm文件
```

4. 上述安装会自动添加用户和用户组`mysql`，所以只要修改MySQL数据所在目录的所有者为`mysql`用户和用户组即可

```
# ↓创建mysql数据存放目录，存放位置可自行选择
mkdir -p /var/lib/mysql/data
mkdir -p /var/lib/mysql/run
mkdir -p /var/lib/mysql/tmp

chown -R  mysql:mysql /var/lib/mysql	# 将mysql目录的所有者给mysql用户和用户组
chown mysql:mysql /var/log/mysqld.log	# 将mysqld.log文件的所有者给mysql用户和用户组
```

5. 配置MySQL

执行命令`vim /etc/my.cnf`，添加以下信息，请根据实际路径进行修改，*注意：请检查此文件内是否已存在相关信息，若已存在相关字段，请直接修改，否则配置路径冲突或错误均会造成MySQL服务启动失败*

```
[mysqld]
datadir=/var/lib/mysql/data
socket=/var/lib/mysql/run/mysqld.sock
pid-file=/var/lib/mysql/run/mysqld.pid
tmpdir=/var/lib/mysql/tmp
log-error=/var/log/mysqld.log

character-set-server=utf8mb4
collation-server=utf8mb4_unicode_ci
init_connect='SET NAMES utf8mb4'
skip-character-set-client-handshake=true
skip-name-resolve

user=mysql
port=3306

[mysql]
port=3306
default-character-set=utf8mb4

[client]
default-character-set=utf8mb4
socket=/var/lib/mysql/run/mysqld.sock

[mysqldump]
quick
max_allowed_packet=1024M
default-character-set=utf8mb4

```

6. 启动MySQL

```
systemctl start mysql.service
systemctl status mysql.service
```

7. 后续操作

后续同上方操作

## 忘记密码

1. 在`vim /etc/my.cnf`文件，在`[mysqld]`下添加以下内容，然后保存退出

```
skip-grant-tables
```

2. 重启MySQL服务

```
systemctl restart mysqld.service
```

3. 访问MySQL，执行命令：`mysql -u root -p`，不输入密码，直接回车键即可访问

```
use mysql;			# 使用mysql库
update user set authentication_string="" where user="root";	# 将密码置位空
flush privileges;	# 刷新权限
```

4. 修改

再次编辑`vim /etc/my.cnf`文件，删除刚才添加的`skip-grant-tables`，保存退出， 重启MySQL服务`systemctl restart mysqld.service`就可以无密码访问数据库啦，之后可通过`alter user "root"@"%" identified by "Test!@12";`命令设置新的访问密码

参考网页：[博客园](https://www.cnblogs.com/dyd168/p/17649983.html#:~:text=进入%20官网%20下载所需的MySQL版本，下载后上传至服务器任意目录下%20或者复制下载链接，使用%20wget%20命令在线下载%20wget%20https%3A%2F%2Fdev.mysql.com%2Fget%2Fmysql80-community-release-el9-3.noarch.rpm,安装后可以看到%20yum%20源配置目录下新增3个MySQL相关文件%20安装MySQL%20dnf%20install%20mysql-community-server%20-y)