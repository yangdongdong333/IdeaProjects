ch04-return:接收请求的处理结果
接收请求参数，使用的是处理器方法的形参
1 ModelAndView：有数据和视图，对视图执行forward
2 String：表示视图，可以逻辑名称，也可以是完整视图路径
3 void 不能表示数据，也不能白哦是视图
在处理ajax的时候，可以使用void返回值。通过HttpServletResponse输出数据。响应ajax请求。
    ajax请求服务器端返回的就是数据，和视图无关

4 Object：例如String，Integer，Map，List等等对象。对象有属性，属性就是数据，所以返回对象表示数据，和试图无关。可以使用对象表示的数据，响应ajax的请求。
现在做ajax，主要使用json的格式。实现步骤：
1 加入处理json的工具库的依赖，springmvc默认使用jackson
2 把对象转换成json字符串，在springmvc中的配置文件中加入标签<mvc:annotation-driven>注解驱动：  json=om.writeValueAsString(student);
3 在处理器方法的上面加入@ResponseBody注解
springmvc处理器方法返回Object，可以转为json输出到浏览器，响应ajax的内容不原理
1.<mvc:annotation-driven> 注解驱动。
        注解驱动实现的功能是，完成java对象到json，xml，text，二进制等数据格式的转换。
        涉及到一个借口HttpMessageConveter接口：消息转换器。
        功能：定义了java对象转为json，xml等数据格式的方法。这个接口有很多的实现类，这些实现类完成了java到json、xml、二进制数据的转换。
    <mvc:annotation-driven>在加入到springmvc配置文件后，会自动创建HttpMessageConverter接口的7个实现类对象，包括MappingJackson2HttpMessageConverter（使用jackson工具库中的ObjectMapper实现java对象转为json字符串）




    注意：使用get请求没有中文乱码的问题
使用post请求方式提交请求，中文有乱码，需要使用过滤器处理乱码的问题

过滤器可以自定义，也可以使用框架中的过滤器CharacterEncodingFilter

第一个springMVC项目
需求：用户在页面发起一个请求，请求交给springMVC的控制器对象，并显示请求的结果（在结果页面显示一个欢迎语句）

实现步骤：
1、新建web maven工程
2、 加入依赖：spring-webMVC依赖，间接把spring的以来都加入到项目，jsp，servlet依赖
3、重点：在web.xml中注册springmvc框架的核心对象：DispactherServlet
1）DispactherServlet叫做中央调度器，是一个servlet，他的父类是继承HttpServlet
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
