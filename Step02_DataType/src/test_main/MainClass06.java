package test_main;

public class MainClass06 {
	public static void main(String[] args) {
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
		//���� ������ type �� ������ �ִ� �� ���� �����
		
		String myName=null; // null �� �����ϸ� �ȴ�. (���������� Ÿ���� Ű���� ������ �ִ� ����)
		
		boolean isRun=false;
		
		if(isRun) {
			myName="�豸��";
		}
		// ������ ��� ���� null ���� �ƴ����� ���� �������� ������ �ؾ��ϴ� ��찡 �ִ�.
		if(myName==null) {
			System.out.println("null �̳�?");
		}
		
		System.out.println("���� �޼ҵ尡 ���� �Ǿ����ϴ�.");
	}
}
