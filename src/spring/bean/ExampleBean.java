package spring.bean;
/**
 * ����:����ʱconstructor(����)-arg(�в�)���в�,�����ref��bean��idֵ,�Ǵ���������
 *�� ��������Ա������ʼ��(��ֵ��������),�����õ���һ�����
 * 
 * 
 *
 */
public class ExampleBean {
   //����ע��  ʵ�ʴ������Ķ������Ա����   ����
	private FirstBean firstBean;
	//����ע��  ����һ�����췽��  �����Ҫע������������� ������  ����Ա����
	public ExampleBean(FirstBean firstBean){
		//ֵ��������
		this.firstBean=firstBean;
	}
	
	
	public void test(){
		//��������ӡ.�����ù��� ע��Ķ�����ù���ע�����ķ���
		System.out.println("ExampleBean test");
		//����,�ñ�������,����
		//firstBeanʵ�����ÿ���ֱ����
		firstBean.printInfo();
		
	
	}
}
