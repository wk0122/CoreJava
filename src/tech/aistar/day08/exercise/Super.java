package tech.aistar.day08.exercise;

public class Super {
	int i = 10;

	public Super() {
		print();
		i = 20;
	}

	public void print() {
		System.out.println("打死运行不到..");
		System.out.println(i);
	}
}
