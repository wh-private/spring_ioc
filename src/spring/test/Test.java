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
	

	//��������,����ʼ��spring ��������������ļ����src��·��   
	//Resource resource=new ClassPathResource("applicationContext.xml");
	//��������   ����applicationContext.xml��bean��������
	//BeanFactory factory=new XmlBeanFactory(resource);

	//���� �����������bean
	ApplicationContext app=new ClassPathXmlApplicationContext("applicationContext.xml");

	
	
	//��ȡ��Ҫ�Ķ���   ������.getBean����   ���id��ֵ   ����ת��
	FirstBean firstBean=(FirstBean) app.getBean("frist");
	firstBean.printInfo();
	//�ж��Ƿ���,�Ƚ���������  һ���ǵ���
	/**
	 * ==��equals����
	 * ==���ԱȻ�����������,Ҳ���ԱȽ�������������,�Ƚϻ�����������ʱ�ȵ�����ֵ,�Ƚ������������ͱȵ��ǵ�ַ
	 * equals��object�ṩ�ķ���,ֻ�ܱȽ�������������,�ȵĵ�ַ,���Ƕ�equle��������д��,����String,�Ƚ��ַ�ת��ֵ
	 */
	FirstBean firstBean1=(FirstBean) app.getBean("frist");
	System.err.println(firstBean==firstBean1);
	
	
	//����ע��
	ExampleBean exam=(ExampleBean) app.getBean("example");
      // exam.test();

	NewExampleBean  newEx=(NewExampleBean)app.getBean("newExample");
	
	newEx.test();

}
}