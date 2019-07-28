package spring.bean;
/**
 * 步骤:加载时constructor(构造)-arg(有参)走有参,入参是ref里bean的id值,是创建对象了
 *创 建对象后成员变量初始化(赋值或者声明),容器得到另一类对象
 * 
 * 
 *
 */
public class ExampleBean {
   //构造注入  实际传进来的对象给成员变量   步骤
	private FirstBean firstBean;
	//构造注入  增加一个构造方法  入参是要注入的类对象的类型 类型名  给成员变量
	public ExampleBean(FirstBean firstBean){
		//值从这里来
		this.firstBean=firstBean;
	}
	
	
	public void test(){
		//调方法打印.再利用构造 注入的对象调用构造注入对象的方法
		System.out.println("ExampleBean test");
		//依赖,用别的类对象,方法
		//firstBean实例化好可以直接用
		firstBean.printInfo();
		
	
	}
}
