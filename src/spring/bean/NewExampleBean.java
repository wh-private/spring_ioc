package spring.bean;

public class NewExampleBean {
  //成员变量   类   的对象
	private FirstBean firstBean;
	
	public void setFirstBean(FirstBean firstBean) {
		//赋值
		this.firstBean = firstBean;
	}

	public void test(){
	  
	  System.out.println("NewExampleBean ExampleBean");
	  firstBean.printInfo();
  }
}
