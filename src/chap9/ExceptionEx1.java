package chap9;
/*
 * 예외 처리 : 발생된 예외를 정상적으로 처리하는 방법
 * 
 * try catch 구문
 * 	try 블럭 : 예외 발생 가능성이 있는 문장을 가진 블럭
 * 	catch 블럭 : catch 블럭이 속한 try 블럭에서 예외 발생 시 실행되는 블럭 
 * [결과]
 * 145
 * 1235
 */
public class ExceptionEx1 {
	public static void main(String[] args) {
		try {
			System.out.print(1);
//			System.out.print(2/0);	//ArithmeticException 발생
			System.out.print(2);
			System.out.print(3);
		} catch(Exception e) {		//예외가 발생한 경우만 출력
			System.out.print(4);
		}
		
		System.out.println(5);
		
	}

}
