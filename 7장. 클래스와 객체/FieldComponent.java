/* �ʵ�� ���������� ���� */

// #1. Ŭ������ ����
class A {
	int m = 3; //�ʵ�
	int n = 4; //�ʵ�	

	void work1() {
		int k = 5; //��������
		System.out.println(k); //5 �������� ���
		work2(3);
	}

	void work2(int i) { 
		// int i ���� ���� ���� //��������
		// i = �ܺο��� ���޵� ��
		int j = 4; //��������
		System.out.println(i+j); //7
	}
}

public class FieldComponent {
	public static void main(String[] args) {
		// #2. Ŭ������ Ȱ���Ͽ� ��ü ����
		A a = new A();		
		// #3-1. �ʵ尪 ���
		System.out.println(a.m); //3
		System.out.println(a.n); //4
		// #3-2. �޼��� ȣ��
		a.work1();
	}
}