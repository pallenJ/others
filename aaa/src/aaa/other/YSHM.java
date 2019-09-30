package aaa.other;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class YSHM {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		List<String> names = new ArrayList<>(Arrays.asList(new String[]{"가람", "겨레", "고운", "나나", "나래", "난새", "노아", "다슬"}));
		List<Integer> exams = new ArrayList<>(Arrays.asList(new Integer[]{46, 98, 96, 65, 69, 60, 61, 35}));
		
		while(true) {
			System.out.println("1. 학생 추가");
			System.out.println("2. 학생 삭제");
			System.out.println("3. 학생 출력");
			System.out.println("4. 최고점/최저점 학생 출력");
			System.out.println("5. 프로그램 종료");
			System.out.println();
			System.out.print("실행하려는 기능의 번호를 입력하세요: ");

			int user_input = sc.nextInt();
			
			if(user_input==1) {
				System.out.print("학생 이름:");
				String stdName = sc.next();
				System.out.print("점수:");
				int stdScore = -1;
				while(true) {
					stdScore = sc.nextInt();
					if(stdScore>=0 && stdScore<=100) break;
					System.out.println("유효한 점수가 아닙니다.\n");
				}
				names.add(stdName);
				exams.add(stdScore);
				
			}else if(user_input==2) {
				String stdName = sc.next();
				int idx;
				if((idx = names.indexOf(stdName))==-1) {
					System.out.println();
					System.out.println("존재하지 않는 학생입니다");
					continue;
				}
				names.remove(idx);
				exams.remove(idx);
			}else if(user_input==3) {
				
				int end = names.size();
				
				for (int i = 0; i < end; i++) {
					System.out.println("name:"+names.get(i)+"   score: "+exams.get(i));
				}
				
			}else if(user_input==4) {
			}else if(user_input==5) {
				System.out.println();
				System.out.println("프로그램을 종료합니다");
				break;
			}
			else {
				System.out.println();
				System.out.println("잘못된 입력입니다");
				System.out.println();
			}
			
			
			
		}
		
	}
	
}
