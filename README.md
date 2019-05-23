# XMockApi

服务器数据接口

展示怎么通过gradle添加模拟服务器接口


# 怎么工作

该架构包括 UI层和数据层，两层通过DataApi接口传递数据

DataApiManager 通过 MockApiManager.getMockApi() 获取实例

Debug build 会提供Mock功能, Release build不会提供

IMockApiStrategy 定义如何模拟返回服务器数据

