package ch06;

public class OverLoading {
	//필드 선언(첫글자 소문자)
	String nation="대한민국";
	String name;
	int age;
	String gender;
	
	//생성자 선언(생성자 오버로딩=이름같은 생성자가 여러개)
	public OverLoading(String name){
		this.name=name;
		this.age=26;
		this.gender="여";
	}
	public OverLoading(String name,int age) {
		this.name=name;
		this.age=age;
		this.gender="남";
		
	}
	public OverLoading(String name,int age,String gender){
		this.name=name;
		this.age=age;
		this.gender=gender;
	}
	
	


}
