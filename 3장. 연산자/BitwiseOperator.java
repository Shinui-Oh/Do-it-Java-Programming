/*�پ��� ������ ǥ���� ��Ʈ������*/

public class BitwiseOperator {
    public static void main(String[] args) {
        //#0. �ڹ��ڵ�� ���� ��ȯ
        int data =13;
        System.out.println(Integer.toBinaryString(data)); //1101
        System.out.println(Integer.toOctalString(data)); //15
        System.out.println(Integer.toHexString(data)); //d
        System.out.println();
        
        System.out.println(Integer.parseInt("1101", 2)); //13
        System.out.println(Integer.parseInt("15", 8)); //13
        System.out.println(Integer.parseInt("0D", 16)); //13
        System.out.println();
        
        //#1. �پ��� ���� ǥ��
        System.out.println(13); //13
        System.out.println(0b1101); //13
        System.out.println(015); //13
        System.out.println(0x0D); //13
        System.out.println();
        
        //#2. ��Ʈ������
        //@AND ��Ʈ������
        System.out.println(3 & 10); //2
        System.out.println(0b0011 & 0b1010); //0b0010 --> 2
        System.out.println(0x03 & 0x0A); //2
        System.out.println();
        
        //@OR ��Ʈ������
        System.out.println(3 | 10); //11
        System.out.println(0b0011 | 0b1010); //0b1011 --> 11
        System.out.println(0x03 | 0x0A); //11
        System.out.println();
        
        //@XOR ��Ʈ������
        System.out.println(3 ^ 10); //9
        System.out.println(0b0011 ^ 0b1010); //0b1001 --> 9
        System.out.println(0x03 ^ 0x0A); //9
        System.out.println();

        //@NOT ��Ʈ������
        System.out.println(~3); //-4
        System.out.println(~0b0011); //0b1111...1100 -> -4
        System.out.println(~0x03); //-4
    }
}