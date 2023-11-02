package practice;

public class exam {

	public static void main(String[] args) throws Exception {
		int keyCode;
		
		while(true) {
			keyCode = System.in.read();
			System.out.println("keyCode :"+ keyCode);
		}
	}
}
// p94, 입력된 키의 개수와 상관없이 키코드 읽기
