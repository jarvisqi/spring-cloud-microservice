# Spring-Cloud-Microservice
Java : 1.8+   
Spring Boot : 2.0.3.RELEASE   
Spring Cloud : Finchley.Finchley.RELEASE     


# Using Components

服务注册发现：Eureka Server,Eureka Client    
服务消费负载均衡：Ribbon、Feign   
服务容错保护（降级、隔离、熔断）：Hystrix、Hystrix-Dashboard      
服务容网关：Zuul    

# Use       
1，启动eureka-server 服务注册中心，http://localhost:9100      
2，启动user-service 服务，http://localhost:9200,http://localhost:9201     
&emsp; 启动两个服务，用于测试负载均衡功能，启动命令：  
```jshelllanguage
java -jar user-service-0.0.1-SNAPSHOT.jar --server.port=9200     
java -jar user-service-0.0.1-SNAPSHOT.jar --server.port=9201  
```
3，启动eureka-ribbon 服务负载均衡，http://localhost:9300        
4，启动eureka-feign 服务负载均衡，http://localhost:9400       
5，启动eureka-feign-hystrix 服务容错降级，http://localhost:9500   
6，启动hystrix-dashboard 服务容错仪表盘监控，http://localhost:9600      
          


