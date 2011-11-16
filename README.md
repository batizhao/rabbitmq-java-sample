说明
============================================================

rabbitmq-java-sample 是一个使用 [RabbitMQ](http://www.rabbitmq.com) 的 Java 客户端示例。
主要是在官方的 [Sample](http://www.rabbitmq.com/tutorials/tutorial-one-java.html) 之上做了一些重构。
在使用之前，需要参照 [RabbitMQ Server Installation](http://www.rabbitmq.com/install.html) 运行 RabbitMQ Server 。

可能用到的几个常用命令
-------------------------------------------------------

查看 queues, vhosts, permissions

    $ rabbitmqctl list_queues
    $ rabbitmqctl list_vhosts
    $ rabbitmqctl list_permissions

强制重置 rabbit server

    $ rabbitmqctl stop_app
    $ rabbitmqctl force_reset
    $ rabbitmqctl start_app

重置rabbitmq，会有以下影响：

* 从集群节点中删除。
* 删除 db 数据，如 user，vhost 信息，持久化消息。

