/* Ŭ���� ������ ��ü�� ���� �� Ȱ�� */

// #1. Ŭ������ ���� (����) : �ؾ ���
class A {
	int m = 3;
	void print() {
		System.out.println("��ü ���� �� Ȱ��");
	}
}

public class CreateObjectAndUsageOfMembers {
	public static void main(String[] args) {
		// #2. Ŭ������ ���� ��ü ���� : �ؾ
		A a = new A();
		
		// #3. Ŭ���� ��� Ȱ�� : �ؾ�� �Ա�
		// @ �ʵ�Ȱ��:�ʵ忡 ���� �б�/����
		a.m = 5;
		System.out.println(a.m); //5
		
		// @�޼��带 Ȱ��: �޼��带 ȣ��
		a.print(); //��ü ���� �� Ȱ��
	}
}