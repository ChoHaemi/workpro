package ch06q;

public class Q14 {

	public static void main(String[] args) {
		Q13 q13=new Q13("홍길동","hong");//생성자 호출
		
		//외부 생성자 호출하기, 클래스명 아니고(그건 정적) q13 객체 생성 변수로 호출
		//앞에 다른 파일에 private 사용하면 여기에 게터세터 사용해야함
		System.out.println("이름: "+q13.name);
		System.out.println("아이디: "+q13.id);
		System.out.println("비밀번호: "+q13.password);
		System.out.println("나이: "+q13.age);
		

	}

}
