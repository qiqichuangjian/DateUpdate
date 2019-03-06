package demo03;

import springioc.ClassPathXmlApplicationContext;



/**
 * @Acthor:孙琪;
 * date:2019/3/6;
 */
//SpringIOC，就是把每一个bean(实体类)与bean(实体了)之间的关系交给第三方容器进行管理。
public class Springioc {
    public static void main(String[] args) throws Exception{
        //1.读取springxml配置   反转控制
        ClassPathXmlApplicationContext classPathXmlApplicationContext = new ClassPathXmlApplicationContext(
                "applicationContext.xml");
        //2.获取bean对象   示例
        /*TestService testService = (TestService) classPathXmlApplicationContext.getBean("testService");
        System.out.println(testService.test());*/
        User user = (User) classPathXmlApplicationContext.getBean("user2");
        System.out.println(user.getUserId()+"----"+user.getUserName());

    }
}
