@echo off
chcp 65001 >nul
REM 启动 MySQL 数据库服务

REM 检查 MySQL 服务是否已经启动
sc query mysql80 | find "RUNNING"
if %errorlevel% == 0 (
    echo MySQL 服务已经在运行。
) else (
    echo 启动 MySQL 服务...
    net start mysql80
    if %errorlevel% == 0 (
        echo MySQL 服务启动成功。
    ) else (
        echo 无法启动 MySQL 服务。请检查安装和配置。
    )
)


pause
