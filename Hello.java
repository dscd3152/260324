package kr.com.beak;


/*
 * 
 */

//클래스 선언
public class Hello {

	//print() 메서드
	public void print(String name) {
		System.out.println("Hello, " + name); 
	}
	 //
	
	public static void main(String[] args) {
			Hello hello = new Hello();
			hello.print("Java");// new 키위드르르 사용해 객체 생성
			
		
	}

}
