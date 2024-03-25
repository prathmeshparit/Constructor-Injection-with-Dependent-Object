package dev.prathmesh.demo;


import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test
{
    public static void main(String a[])
    {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("appC.xml");
        Employee ee = (Employee) context.getBean("forEmployee");
        ee.Print();
    }

}
