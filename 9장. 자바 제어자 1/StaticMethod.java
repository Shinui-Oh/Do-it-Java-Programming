/* �ν��Ͻ� �޼���� ���� �޼��� */

class A {
	void abc() { //�ν��Ͻ� �޼���
		System.out.println("instance �޼���");
	}

	static void bcd() { //�����޼���
		System.out.println("static �޼���");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		// #1. �ν��Ͻ� �޼��� Ȱ���� (��ü���� �Ŀ��� ��밡��)
		A a1 = new A();
		a1.abc(); //instance �޼���
		
		// #2. ���� �޼��� Ȱ���� 
		// @���1. Ŭ���� �̸����� �ٷ� �����Ͽ� ���
		A.bcd(); //static �޼���
		// @���2. ��ü�����Ŀ��� ��밡�� : ������ ����
		A a2 = new A();
		a2.bcd(); //static �޼���
	}
}