@echo off
chcp 65001 >nul


sc query mysql80 | find "STOPPED"
if %errorlevel% == 0 (
    echo MySQL 服务已经停止。
) else (
    echo 关闭 MySQL 服务...
    net stop mysql80
    if %errorlevel% == 0 (
        echo MySQL 服务已成功关闭。
    ) else (
        echo 无法关闭 MySQL 服务。请检查安装和配置。
    )
)

pause
