第一个springMVC项目
需求：用户在页面发起一个请求，请求交给springMVC的控制器对象，并显示请求的结果（在结果页面显示一个欢迎语句）

实现步骤：
1、新建web maven工程
2、 加入依赖：spring-webMVC依赖，间接把spring的以来都加入到项目，jsp，servlet依赖
3、重点：在web.xml中注册springmvc框架的核心对象：DispactherServlet
1）DispactherServlet叫做中央调度器，是一个servlet，他的父类世纪城HttpServlet
2）DispactherServlet也叫做前端控制器（front controller）
3）DispactherServlet负责接收用户提交的请求，调用其他的控制器对象，并把请求的处理结果显示给用户
4、创建一个发起请求的页面 index.jsp
5、创建一个控制器(处理器）类
1）在类的上面加上@Controller注解，会创建对象，并放入到springmvc容器中
2）在类中的方法上面加入@RequestMapping注解
6、创建一个作为结果的jsp，显示请求的处理结果
7、创建一个springmvc的配置文件（和spring的一样）
1）生命组件扫描器，指定controller注解所在的包名
2）生命视图解析器：帮助处理视图的
