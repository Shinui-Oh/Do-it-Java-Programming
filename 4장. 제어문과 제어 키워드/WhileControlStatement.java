/*while �ݺ������ �⺻��������, for�� ��ȯ, Ư���� ����, ���ѷ��� Ż��*/

public class WhileControlStatement {
    public static void main(String[] args) {
        //#1.while�� �⺻��������
        int a = 0;

        while(a < 10) {
            System.out.print(a +" ");
            a++;
        } // 0, 1, 2, ~ 9 : 10ȸ
        System.out.println();
        
        //@for������ ��ȯ
        for(int i = 0; i < 10; i++) {
            System.out.print(i + " ");
        } // 0, 1, 2, ~ 9 : 10ȸ
        System.out.println();
				
        int b = 10;

        while(b > 0) {
            System.out.print(b+" ");
            b--;
        } //10, 9, ~, 1 : 10ȸ
        System.out.println();
        
        //@for������ ��ȯ
        for(int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        } //10, 9, ~, 1 : 10ȸ
        		
        //#2.while�� Ư���� ����(���ѷ���)
        /*
        while(true) {
            System.out.println("���ѷ���");
        }
        */
        System.out.println();
        
        //#3.���ѷ��� Ż���ϱ� break
        int c = 0;

        while(true) {
            if(c>10) break;

            System.out.print(c+ " ");
            c++;
        } //0~ 10 : 11�� ����
    }
}