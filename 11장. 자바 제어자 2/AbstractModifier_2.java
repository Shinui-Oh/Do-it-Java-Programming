/* �߻�Ŭ������ ����Ͽ� �������̵� ���� */

abstract class Animal {
	abstract void cry();
}

class Cat extends Animal {
	void cry() {
		System.out.println("�߿�");
	}
}

class Dog extends Animal {
	void cry() {
		System.out.println("�۸�");
	}
}

public class AbstractModifier_2 {
	public static void main(String[] args) {
		// #1. ��ü����
		Animal animal1 = new Cat();
		Animal animal2 = new Dog();
		
		// #2. �޼��� ȣ��
		animal1.cry(); //�߿�
		animal2.cry(); //�۸�
	}
}