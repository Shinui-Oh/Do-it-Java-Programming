/* �ν��Ͻ� �ʵ�� �����ʵ��� Ȱ�� ��� */

class A {
	int m = 3; //�ν��Ͻ� �ʵ�
	static int n = 5; //����(static) �ʵ�
}

public class StaticField_1 {
	public static void main(String[] args) {
		// #1. �ν��Ͻ� �ʵ� Ȱ���� (�׻� ��ü������ �� �� ��밡��)
		A a1 = new A();
		System.out.println(a1.m); //3
		
		// #2. ����(static) �ʵ� Ȱ�� ���
		// @���#1 (��ü�������� Ŭ���� �̸����� �ٷ� Ȱ��)
		System.out.println(A.n); //5
		// @���#2 (��ü���� �� Ȱ�� : �ν��Ͻ��� ����) : ������ ����
		A a2 = new A();
		System.out.println(a2.n); //5
	}
}