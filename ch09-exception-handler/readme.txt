ch09项目：异常处理
异常处理的步骤：
1、新建maven web项目
2、加入依赖
3、新建一个自定义异常类，MyUserException，在定义它的子类NameExcetion，AgeException
4、在controller中抛出NameException,AgeException
5、创建一个普通类，作为全局异常处理类
    1）在类的上面加入注解@ControllerAdvice
    2）在类中定义方法，方法的上面加入@ExceptionHandler
6、创建异常的视图页面：让用户知道发生了甚么异常
7、创建springmvc的配置文件
    1）组件扫描器，扫描@Controller注解
    2）扫描@ControlelrAdvice所在的包名
    3）声明注解驱动
