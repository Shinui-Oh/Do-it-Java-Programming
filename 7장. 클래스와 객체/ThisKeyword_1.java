/* ������ this Ű���� �ڵ� �߰� */

// #1. Ŭ�������ο��� �ʵ�, �޼��忡 �տ� �ٴ� �ڵ����� �ٴ� this Ű����
class A {
	int m;
	int n;

	void init(int a, int b) {
		int c;
		c = 3;
		this.m = a; //this. ������ �ڵ� �߰�
		this.n = b; //this. ������ �ڵ� �߰�
	}

 	void work() {
		this.init(2, 3); //this. ������ �ڵ� �߰�
	}
}

public class ThisKeyword_1 {
	public static void main(String[] args) {
		// #2. Ŭ���� ��ü ����
		A a = new A();
		// #3. �޼��� ȣ�� / �ʵ尪 Ȱ��
		a.work();
		System.out.println(a.m); //2
		System.out.println(a.n); //3
	}
}