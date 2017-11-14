package test_main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("메인 메소드가 시작 되었습니다.");
		//참조 데이터 type 을 담을수 있는 빈 변수 만들기
		
		String myName=null; // null 을 대입하면 된다. (참조데이터 타입이 키값을 담을수 있는 상태)
		
		boolean isRun=false;
		
		if(isRun) {
			myName="김구라";
		}
		// 변수에 담긴 값이 null 인지 아닌지에 따라 선택적인 동작을 해야하는 경우가 있다.
		if(myName==null) {
			System.out.println("null 이네?");
		}
		
		System.out.println("메인 메소드가 종료 되었습니다.");
	}
}
