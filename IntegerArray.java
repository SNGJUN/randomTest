import java.util.*;

public class IntegerArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		/*
		try {
			Scanner sc = new Scanner(System.in);
			System.out.print("총합 자연수 T (3 <= T <= 300) : ");
			int n = sc.nextInt();
			System.out.println("********************************");	
		}catch(InputMismatchException e) {
			System.out.println("정수를 입력하세요.");
			
		}
		*/
		
		Scanner scan = new Scanner(System.in);
		System.out.print("총합 자연수 T (3 <= T <= 300) : ");
		int n = scan.nextInt();
		System.out.println("********************************");
		// 입력된 값이 조건에 맞지 않을 때
		if(n < 3 || n > 300) {
			System.out.println("조건에 맞는 자연수를 입력하세요!");
		}
		// 100개의 값을 저장할 수 있는 배열(triple) 생성
		int[] triple = new int[100];
		// Random 메소드 사용하기 위해 생성자 rand이용
		Random rand = new Random();	
		// 100이하의 랜덤 자연수 3가지 생성 후 sum == n 일 때, 자연수 3가지의 index & 값 출력 
		while(true) {
		
			// 100 이하의 랜덤 자연수
			// int x = rand.nextInt(value) -> (0 <= x <= 1) * value
			int randInt_1 = (rand.nextInt(100)) + 1; 
			int randInt_2 = (rand.nextInt(100)) + 1;
			int randInt_3 = (rand.nextInt(100)) + 1;
			
			// (정수) n 의 값을 비교하기 위한 (정수) sum 생성
			int sum = randInt_1 + randInt_2 + randInt_3;
			
			if(sum == n) {
			// 조건에 맞는 랜덤 자연수 정해짐
				// 1 ~ 100까지의 순차적으로 저장된 배열(triple) 생성
				for(int i = 0 ; i < triple.length ; i++) {
					triple[i] = i+1;
					// *중요* else if 사용시, 중복된 randInt 값을 출력해주지 않음. 따라서 if문 3번 사용.			
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
			
			
		
		
			
			
