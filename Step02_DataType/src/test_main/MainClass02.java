package test_main;

public class MainClass02 {
	public static void main(String[] args) {
		//국어점수
		int kor=99;
		//영어점수
		int eng=100;

		//국어 영어 점수의 평균을 구해서 출력하고 싶다면
		
		//두점수의 합
		int sum=kor+eng;
		/*
		 * 정수 끼리 연산하면 결과는 정수
		 * 정수와 실수를 연산하면 결과는 실수 
		 */
		
		//평균
		double ave=sum/2d;
		
		float num1=10.1f;
		double num2=10.1d;
		
		double num3=num1+num2;
		System.out.println(num3);
		System.out.println(eng+num1);
		
		System.out.println("평균:"+ave);
	}
}
