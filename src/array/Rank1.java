package array;

public class Rank1 {
    public static void main(String[] args) {
        int a [] = new int[]{18,62,68,82,65,9};
        //����ǰ���Ȱ����ݴ�ӡ����
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
        //ð�ݷ�����
      
        //��һ�����ӵ�һλ��ʼ����������λ���бȽ�
        //�������ǰ��ıȺ���Ĵ󣬾ͰѴ�����ݽ����ں���
          
        for (int i = 0; i < a.length-1; i++) {
            if(a[i]>a[i+1]){  
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        //�����ݴ�ӡ����
        //���Է��֣����ĵ��������
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");
          
        //�ڶ����� ����һ�Σ�ֻ�������ñȽ����һλ
        for (int i = 0; i < a.length-2; i++) {
            if(a[i]>a[i+1]){  
                int temp = a[i];
                a[i] = a[i+1];
                a[i+1] = temp;
            }
        }
        //�����ݴ�ӡ����
        //���Է��֣������ڶ���ĵ��˵����ڶ���λ��
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");       
          
        //���Է���һ������
        //��߽�������
        //���Կ�����������һ��ѭ��
          
        for (int j = 0; j < a.length; j++) {
            for (int i = 0; i < a.length-j-1; i++) {
                if(a[i]>a[i+1]){  
                    int temp = a[i];
                    a[i] = a[i+1];
                    a[i+1] = temp;
                }
            }
        }
          
        //�����ݴ�ӡ����
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println(" ");       
    }
}
