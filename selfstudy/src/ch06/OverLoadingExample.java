package ch06;

public class OverLoadingExample {

	public static void main(String[] args) {
		//객체 생성(=생성자 호출)
		OverLoading person1=new OverLoading("조해미");
		OverLoading person2=new OverLoading("조비빔",45);
		OverLoading person3=new OverLoading("조사라",12,"여");
		//필드사용(읽기랑 바꾸기 중 읽기)
		System.out.println("회원1 국적: "+person1.nation);
		System.out.println("회원1 이름: "+person1.name);
		System.out.println("회원1 나이: "+person1.age);
		System.out.println("회원1 성별: "+person1.gender);
		System.out.println();
		
		System.out.println("회원2 국적: "+person2.nation);
		System.out.println("회원2 이름: "+person2.name);
		System.out.println("회원2 나이: "+person2.age);
		System.out.println("회원2 성별: "+person2.gender);
		System.out.println();
		
		System.out.println("회원3 국적: "+person3.nation);
		System.out.println("회원3 이름: "+person3.name);
		System.out.println("회원3 나이: "+person3.age);
		System.out.println("회원3 성별: "+person3.gender);
		

	}

}
