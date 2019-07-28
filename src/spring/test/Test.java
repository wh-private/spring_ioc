package spring.test;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import spring.bean.ExampleBean;
import spring.bean.FirstBean;
import spring.bean.NewExampleBean;

public class Test {
public static void main(String[] args) {
	

	//加载容器,即初始化spring 入参数核心配置文件相对src的路径   
	//Resource resource=new ClassPathResource("applicationContext.xml");
	//创工厂类   所有applicationContext.xml的bean都在这里
	//BeanFactory factory=new XmlBeanFactory(resource);

	//或者 用这个放所有bean
	ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");

	
	
	//获取想要的对象   工厂类.getBean方法   入参id拿值   向下转型
	FirstBean firstBean=(FirstBean) app.getBean("frist");
	firstBean.printInfo();
	//判断是否单例,比较两个对象  一样是单例
	/**
	 * ==和equals区别
	 * ==可以比基本数据类型,也可以比较引用数据类型,比较基本数据类型时比的是数值,比较引用数据类型比的是地址
	 * equals是object提供的方法,只能比较引用数据类型,比的地址,除非对equle进行了重写了,比如String,比较字符转的值
	 */
	FirstBean firstBean1=(FirstBean) app.getBean("frist");
	System.err.println(firstBean==firstBean1);
	
	
	//构造注入
	ExampleBean exam=(ExampleBean) app.getBean("example");
      // exam.test();

	NewExampleBean  newEx=(NewExampleBean)app.getBean("newExample");
	
	newEx.test();

}
}