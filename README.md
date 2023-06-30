# 程序运行方法

## 1. 启动redis

```
redis-server
```



## 2. 启动RocketMQ

```
启动mqnamesrv（name server名称服务器）启动命令：sh mqnamesrv
启动mqbroker（代理服务器）启动命令：sh mqbroker -n localhost:9876 autoCreateTopicEnable=true
```

## 3. 启动FastDFS

```
启动tracker和storage，命令如下：
启动tracker：fdfs_trackerd /etc/fdfs/tracker.conf
启动storage：fdfs_storaged /etc/fdfs/storage.conf
```

启动Nignx代理

```
sudo systemctl start nginx
```

## 4. 启动docker中的elasticsearch和kibana
