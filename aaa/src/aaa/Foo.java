package aaa;

import java.util.Random;

// TODO: Auto-generated Javadoc
/**
 * The Class Foo.
 */
public class Foo {
  
  /**
   * The main method.
   *
   * @param args the arguments
   */
  public static void main(String args[]) {

    Random oRandom = new Random();


    // 분포가 가운데에서 종 모양을 이루는 가우시안 랜덤 실수 1000개 출력
    // 평균 0.0 표준편차 1.0의 Gauss(가우스) 분포의 double형 난수 생성

		/*
		 * for (int i = 1; i <= 1000; i++) System.out.println(oRandom.nextGaussian());
		 */
    double aa = 0;
    	Random rd = new Random();
    	for (int i = 0; i < 10; i++) {
    		double temp = rd.nextGaussian();
			System.out.println(temp);
			aa+=temp;
		}
    	System.out.println("asd:"+aa);
    // 이것은 0.0 ~ 1.0 까지 균일한 분포로 랜덤한 실수 1000개 만들기 예제
    // for (int i = 1; i <= 1000; i++)
    //   System.out.println(oRandom.nextDouble());
    //

  }
}