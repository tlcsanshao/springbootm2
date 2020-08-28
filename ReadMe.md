该程序主要展示了Mqtt与MongoDB的集成和使用。
* 使用Docker启动Mqtt和MongoDB的容器
* 使用配置参数去连接Mqtt服务器
* 程序既包含了publish，又包含了subscribe。可以拆成一个发送应用，一个接收应用。
* 在callback中定义了，消息发送结束后可以执行的操作，消息接收后可以执行的操作。
* 简单演示了如何操作MongoDB