package java_day14.school;

import java_day14_1.UtilClass;

/**
 * 학생 객체를 생성하기 위한 클래스
 */
public class Student implements Comparable {
	// 학생(Student) 클래스의 상태(State)를 필드 변수로 선언
	// 필드 변수의 값을 꼭 초기화(int a = 5;)하지 않아도 된다.
	String name;		// 학생의 이름
	int kor;			// 학생의 국어 점수
	int eng;			// 학생의 영어 점수
	int math;			// 학생의 수학 점수
	double avg;		// 학생의 평균 점수
	boolean isMan;
	
	// 기본 생성자
	// 따로 만들지 않아도 자동으로 존재한다.
	Student(){
		
	}
	
	// 단축키 [Alt + Shift + S] 혹은 [마우스 우클릭 - source]
	// Generate Constructor using Field 클릭 후 Generate 클릭
	public Student(String name, int kor, int eng, int math, double avg, boolean isMan) {
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		this.avg = avg;
		this.isMan = isMan;
	}
	
	// 메소드 오버로딩과 매우 흡사
	public Student(String name, int kor, int eng, int math,  boolean isMan) {	
		this.name = name;
		this.kor = kor;
		this.eng = eng;
		this.math = math;
		double average = (kor + eng + math) / 3.0;
		
		// 클래스 메소드 불러오기 (UtilClass)
		this.avg = UtilClass.round(average, 2);
		this.isMan = isMan;
	}
	
	// 성적표 출력
	public void state() {
		System.out.println("========================");
		System.out.println("이름: " + name);
		System.out.println("국어: " + kor);
		System.out.println("영어: " + eng);
		System.out.println("수학: " + math);
		avg = UtilClass.round((kor + eng + math) / 3.0, 2);		
		System.out.println("평균: " + avg);
		System.out.println("성별: " + isMan);
		System.out.println("========================");
	}

	// 단축키 [Alt + Shift + S] 혹은 [마우스 우클릭 - source]
	// Override는 기존의 메소드를 재정의 하는걸 말한다.
	@Override
	public String toString() {
		return "[이름=" + name + ", 국=" + kor + ", 영=" + eng + ", 수=" + math + ", 평균=" + avg
				+ ", 남성여부=" + isMan + "]";
	}
	
	@Override
	public int compareTo(Object stu) {
//		double compareAvg = ((Student) stu).avg;
		Student temp = ((Student)stu);
		int totalTemp = temp.kor + temp.eng + temp.math;
		int totalThis = this.kor + this.eng + this.math;
				
		
		// 오름차순
//		return (int) (this.avg - compareAvg);
		
		// 내림차순
//		return (int) (compareAvg -this.avg);
		return totalTemp - totalThis;
	}
}