/* �������̽����� ����(staic) �޼��� */

interface A {
	static void abc() {
		System.out.println("A �������̽��� ���� �޼��� abc()");
	}
}

public class StaticMethod {
	public static void main(String[] args) {
		// #1.�����޼��� ȣ��
		A.abc();
	}
}