/*for �ݺ������ �⺻��������, Ư���� ����, ���ѷ������� Ż���ϱ�*/

public class ForControlStatement {
    public static void main(String[] args) {
        //#1. for �⺻��������
        int a;

        for(a = 0; a < 3; a++) {
            System.out.print(a + " ");
        } // 0, 1, 2
        System.out.println();
				
        for(int i = 0; i < 3; i++) {
            System.out.print(i + " ");
        } // 0, 1, 2
        System.out.println();
        
        for(int i = 0; i < 100; i++) {
            System.out.print(i + " ");
        } //0~99
        System.out.println();
        
        for(int i = 10; i > 0; i--) {
            System.out.print(i + " ");
        } //10, 9, ... , 1
        System.out.println();
        
        for(int i = 0; i < 10; i += 2) {
            System.out.print(i + " ");
        } //0, 2, 4, 6, 8
        System.out.println();
        
        for(int i = 0, j = 0; i < 10; i++, j++) {
            System.out.print(i + j + " ");
        } //0, 2, 4, 6, 8,.. , 18
        System.out.println();
				
        //#2. for���� Ư���� ���� (���ѷ���)
        /*
        for(int i = 0; ; i++) {
            System.out.print(i + " ");
        } //0 1 2 ...
        for(;;) {
            System.out.print("���ѷ���");
        } //���ѷ��� ...
        */
        System.out.println();
        
        //#3. ���ѷ��� Ż�� (break)
        for(int i = 0; ;i++) {
            if(i > 10) break;

            System.out.print(i+" ");
        } //0 ~ 10 : 11�� ���
        System.out.print("���ѷ��� Ż��");
    }
}