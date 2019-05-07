package tech.aistar.day08.exercise;

/**
 * 创建子类对象之前,需要先创建父类的对象[分配,初始化,构造]
 * 1. 分配空间
 * 2. 初始化[成员]
 * 3. 调用构造
 */
public class Sub extends Super {
	int j = 30;//应该是在super()全部走完之后才会进行

	public Sub() {
		super();
		print();//执行到此处的时候,第一步[分配空间],第二步已经完成[初始化成员]
		j = 40;
	}

	public void print() {
		System.out.println(j);
	}

	public static void main(String[] args) {
		System.out.println(new Sub().j);
	}
}
