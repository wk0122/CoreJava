package tech.aistar.day08.exercise;

public class Animal {
	private String desc;

	public Animal() {
		System.out.println("==2==");
		this.desc = getDesc();
	}

	public String getDesc() {
		System.out.println("打死运行不到...");
		return "Animal";
	}

	public String toString() {
		return desc;
	}
}
