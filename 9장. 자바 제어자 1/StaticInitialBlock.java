/* ���� �ʱ�ȭ ��� */

class A {
	int a;
	static int b;

	static {
		b = 5; // static �ʵ��� �ʱ�ȭ�� static {} ������ ����
		System.out.println("Ŭ���� A�� �ε��Ǿ����ϴ�!!");
	}	

	A() {
		a = 3; // �ν��Ͻ� �ʵ� �ʱ�ȭ�� �����ڿ��� �Ϲ������� ����
		//b = 5;
	}
}

public class StaticInitialBlock {
	public static void main(String[] args) {
		System.out.println(A.b); //5
	}
}