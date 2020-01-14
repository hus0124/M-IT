package basic;

public class Add1Program {

	public static void main(String[] args) {
		Add1 add1 = new Add1(7, 9);
		
		System.out.println(add1.sum()+"\n");
		
		Add1 object1 = new Add1();
		object1.num1=1;
		object1.num2=100;
		
		System.out.println(object1.sum()+"\n");
		
		Add1 object2 = new Add1();
		object2.num1 = 3;
		object2.num2 = 5;
		
		System.out.println(object2.sum());
		System.out.println(object1.sum()+"\n");
		
		System.out.println(add1.sub());
		System.out.println(object1.sub());
		System.out.println(object2.sub()+"\n");
		
		add1.print();
		object1.print();
		object2.print();
	}

}
