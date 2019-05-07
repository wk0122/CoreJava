package tech.aistar.day08.exercise;

public class Worf extends Animal {
	private String name;
	private double weight;

	public Worf(String name, double weight) {
		//System.out.println("==1==");
		super();
		System.out.println("==4==");
		this.name = name;
		this.weight = weight;
	}

	public String getDesc() {
		System.out.println("==3==");
		return "Worf:" + name + ",Weight:" + weight;
	}

	public static void main(String[] args) {
		System.out.println(new Worf("狼", 10).toString());
	}
}
