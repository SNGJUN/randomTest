import java.util.*;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("���� �ڿ��� T (3 <= T <= 300) : ");
			int n = sc.nextInt();
			System.out.println("********************************");	
		}catch(InputMismatchException e) {
			System.out.println("������ �Է��ϼ���.");
			
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("���� �ڿ��� T (3 <= T <= 300) : ");
		int n = scan.nextInt();
		System.out.println("********************************");
		// �Էµ� ���� ���ǿ� ���� ���� ��
		if(n < 3 || n > 300) {
			System.out.println("���ǿ� �´� �ڿ����� �Է��ϼ���!");
		}
		// 100���� ���� ������ �� �ִ� �迭(triple) ����
		int[] triple = new int[100];
		// Random �޼ҵ� ����ϱ� ���� ������ rand�̿�
		Random rand = new Random();	
		// 100������ ���� �ڿ��� 3���� ���� �� sum == n �� ��, �ڿ��� 3������ index & �� ��� 
		while(true) {
		
			// 100 ������ ���� �ڿ���
			// int x = rand.nextInt(value) -> (0 <= x <= 1) * value
			int randInt_1 = (rand.nextInt(100)) + 1; 
			int randInt_2 = (rand.nextInt(100)) + 1;
			int randInt_3 = (rand.nextInt(100)) + 1;
			
			// (����) n �� ���� ���ϱ� ���� (����) sum ����
			int sum = randInt_1 + randInt_2 + randInt_3;
			
			if(sum == n) {
			// ���ǿ� �´� ���� �ڿ��� ������
				// 1 ~ 100������ ���������� ����� �迭(triple) ����
				for(int i = 0 ; i < triple.length ; i++) {
					triple[i] = i+1;
					// *�߿�* else if ����, �ߺ��� randInt ���� ��������� ����. ���� if�� 3�� ���.			
					if(triple[i] == randInt_1) {
						System.out.println("triple["+ i +"] -> " + "index : " + i + ", number : " + randInt_1);
					}
					if(triple[i] == randInt_2) {
						System.out.println("triple["+ i +"] -> " + "index : " + i + ", number : " + randInt_2);
					}
					if(triple[i] == randInt_3) {
						System.out.println("triple["+ i +"] -> " + "index : " + i + ", number : " + randInt_3);	
					}
				}
				
				break;
			}
		
		}
		
		
		
	}
}
			
			
		
		
			
			
