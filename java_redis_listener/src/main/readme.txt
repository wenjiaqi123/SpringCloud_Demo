1.  redis 通过2个命令来实现 pub/sub 的消息发布订阅
    publish 主题名称 消息内容   PS:这格式的意思是,向 【主题名称】 中发送 【消息内容】
    subscribe 主题名称          PS:这格式是订阅该主题
注意: 修改配置文件,以配置文件方式启动
2   配置订阅的主题名称
    __keyevent@dbindex__:expired    【注意:下划线是2个_】
    __keyevent@0__:expired          【存入到 redis 的0号数据库,监听过期key】