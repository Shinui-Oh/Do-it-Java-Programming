/* this(�������� �Ű�����) �޼����� ������ Ư¡�� �ǹ� */

// #1. Ŭ������ ����
class A {
	A() {
		System.out.println("ù��° ������");
	}

	A(int a) {
		this(); //�������� ù�ٿ��� �� �� �ִ�.
		System.out.println("�ι�° ������");
	}

	/* �޼��忡���� this() �޼��� ��� �Ұ� 
	void abc() {
		this(); //�Ұ���
	}
    */
}

public class ThisMethod_1 {
	public static void main(String[] args) {
		// #2. ��ü ����
		A a1 = new A(); //ù��° ������
		System.out.println();
		A a2 = new A(3);// ù��° ������ -> �ι�° ������
	}
}