package spring.bean;

public class NewExampleBean {
  //��Ա����   ��   �Ķ���
	private FirstBean firstBean;
	
	public void setFirstBean(FirstBean firstBean) {
		//��ֵ
		this.firstBean = firstBean;
	}

	public void test(){
	  
	  System.out.println("NewExampleBean ExampleBean");
	  firstBean.printInfo();
  }
}
