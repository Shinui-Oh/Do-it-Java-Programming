/* �ʵ�� ���������� �ʱⰪ */

// #1 Ŭ���� ����(����)
class A {
	boolean m1;
	int m2;
	double m3;
	String m4;

	void printFieldValue () {
		System.out.println(m1); //false
		System.out.println(m2); //0
		System.out.println(m3); //0.0
		System.out.println(m4); //null: ��ü�� ����Ű�� �ʰ� �ִ�.
	}	

	void printLocalVariable() {
		int k;	
		//System.out.println(k); //���������� �ݵ�� �ʱ�ȭ�Ͽ��� ��
	}
}
public class InitialValueOfFieldAndLocalVariable {
	public static void main(String[] args) {
		// #2. Ŭ������ Ȱ���Ͽ� ��ü ����
		A a = new A();		
		// #3. ��üȰ��
		a.printFieldValue();
	}
}