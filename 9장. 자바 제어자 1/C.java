/* ��� �� �����ڿ� ����Ǵ� �� ���� ���� ������ */

import accessmodifier.AccessModifierOfMember.pack1.A;

public class C {
	public void print() { //a, b, c, d
		// #��ü���� 
		A a = new A(); //��ü���� ����
		
		// #��� Ȱ��
		System.out.print(a.a + " "); //����
		//System.out.print(a.b + " "); //�Ұ���
		//System.out.print(a.c + " "); //�Ұ���
		//System.out.print(a.d); //�Ұ���
		System.out.println();
	}
}