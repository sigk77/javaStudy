package com.sist.temp;

import java.lang.reflect.Method;

class A
{
	public void disp1()
	{
		System.out.println("A:disp1 Call...");
	}
	public void disp2()
	{
		System.out.println("A:disp2 Call...");
	}
}
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		try
		{
//			A a=new A();     
//			a.disp1();
//			a.disp2();		new 가 있는 상태에서 메모리 할당
			A a=new A();
			System.out.println("a="+a);
			Class clsName=Class.forName("com.sist.temp.A");
			Object obj=clsName.newInstance();
			System.out.println("obj="+obj);    // new가 없는 상태에서 메모리 할당도 가능 
			
			Method[] methods=clsName.getDeclaredMethods();
			for(Method m:methods)
			{
				m.invoke(obj, null);
			}
		}catch(Exception ex) {}
	}

}
