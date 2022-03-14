package java_day14_1;

public class UtilClass {
	
	public String owner = "만든이: 김지훈";
	
	/**
	 * 입력한 실수를 소수 n번째 자리로 리턴해주는 함수
	 * @param douNum = 반올림 하고 싶은 실수
	 * @param n = 반올림 하고싶은 자리
	 * @return = 반올림 된 실수
	 */
	public static double round(double douNum, int n) {
		// 소수 두번째 자리에서 반올림해서
		// 소수 첫번째 자리를 만들고 싶다. ( n = 1 )
		// 3.141592 에서 10을 곱한 뒤, Math.round를 적용하고
		// 다시 10으로 나누면 된다.
		
		// 소수 세번재 자리에서 반올림하여
		// 소수 두번째 자리를 만들고 싶다. ( n = 2 )
		// 3.141592 에서 100을 곺한 뒤, Math.round를 적용하고
		// 다시 100으로 나누면 된다.
		
		// douNum = 3.141592, n = 2 를 넣었다면
		int one = 1;
		for ( int i = 0; i < n; i++ ) {
			one *= 10;
		}
		
		// mul = 314.1592
		double mul = douNum * one;
		// longNum = 314
		long longNum = Math.round(mul);
		// douVal = 3.14
		double douVal = (double) longNum / one;
		
		return douVal;
	} 
	
	/**
	 * 연봉 액수(int, 단위: 만)가 들어오면
	 * 문자열(String)로 바꿔서 리턴해주는 함수
	 * @param salary
	 * @return
	 */
	public static String formatSalary(int salary) {
		if(salary < 10000) { // 연봉 1억 미만
			String str = salary + "";
			return str.substring(0,1) + "," + str.substring(1) + "만원";
		} else {
			int auk = salary / 10000;
			int remain = salary % 10000;
			
			if(remain < 1000) {
				return auk + "억 " + remain + "만원";
			}
			
			String temp = remain + "";
			
			return auk + "억 " + temp.substring(0,1) + "," + temp.substring(1) + "만원";
		}
	}
	
	/**
	 * 50% 확률로 true/false를 리턴해주는 함수
	 */
	public static boolean banban() {
		// randInt는 0또는 1을 가지는 변수
		int ranInt = (int) (Math.random() * 2);
		
		// if (ranInt == 1) {
		//  return true;
		// }
		
		return (ranInt == 1);
	}
	
}
