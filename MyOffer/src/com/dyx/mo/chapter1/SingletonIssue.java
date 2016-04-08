package com.dyx.mo.chapter1;
/**
 * 
 * @author dayongxin
 *
 */
public class SingletonIssue {
	/**
	 * 1单例模式，懒汉式，线程安全
	 */
	public static class Singleton1{
		private final static Singleton1 instance1=new Singleton1();
		private Singleton1(){}
		public static Singleton1 getInstance(){
			return instance1;
		}
	}
	/**
	 * 2单例模式，饿汉式，线程不安全
	 */
	public static class Singleton2{
		private static Singleton2 instance2=null;
		private Singleton2(){}
		public static Singleton2 getInstance(){
			if(instance2==null){
				instance2=new Singleton2();
			}
			return instance2;
		}
	}
	/**
	 * 3单例模式，饿汉式，线程安全，多线程环境下效率不高
	 */
	public static class Singleton3{
		private static Singleton3 instance3=null;
		private Singleton3(){}
		public static synchronized Singleton3 getInstance(){
			if(instance3==null){
				instance3=new Singleton3();
			}
			return instance3;
		}
	}
	/**
	 * 4单例模式，懒汉式，线程安全，变种
	 */
	public static class Singleton4{
		private static Singleton4 singleton4=null;
		static{
			singleton4=new Singleton4();
		}
		private Singleton4(){}
		public static Singleton4 getInstance(){
			return singleton4;
		}
	}
	/**
	 * 5单例模式，使用静态内部类，线程安全
	 */
	public static class Singleton5{
		private final static class Singleton5Holder{
			private final static Singleton5 singleton5=new Singleton5();	
		}
		private Singleton5(){}
		public static Singleton5 getInstance(){
			return Singleton5Holder.singleton5;
		}
	}
	/**
	 * 6单例模式，静态内部类，你用枚举方式，线程安全
	 */
	public enum Singleton6{
		instance1;
		public void method(){
			
		}
	}
	/**
	 * 7单例模式，静态内部类，使用双重校验锁，线程安全
	 */
	public static class Singleton7{
		private volatile static Singleton7 instance7=null;
		private Singleton7(){}
		public static Singleton7 getInstance(){
			if(instance7==null){
				synchronized (Singleton7.class) {
					if(instance7==null){
						instance7=new Singleton7();
					}
				}
			}
			return instance7;
		}
	}
	/**
	 * 
	 * @param args
	 */
	
	public static void main(String[] args) {
		System.out.println(Singleton1.getInstance()==Singleton1.getInstance());
		System.out.println(Singleton2.getInstance()==Singleton2.getInstance());
		System.out.println(Singleton3.getInstance()==Singleton3.getInstance());
		System.out.println(Singleton4.getInstance()==Singleton4.getInstance());
		System.out.println(Singleton5.getInstance()==Singleton5.getInstance());
		System.out.println(Singleton6.instance1==Singleton6.instance1);
		System.out.println(Singleton7.getInstance()==Singleton7.getInstance());
	}
}
