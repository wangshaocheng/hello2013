通过POJO的方式发布一个WebService到tomcat容器中。
这里需要注意的是：
Ant打成的Jar的格式，META-INF目录下必须包括services.xml，
以及services.xml的写法，可以认为每个方法就是一对operation标签。。
