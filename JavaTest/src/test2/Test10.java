package test2;

/*
 * 날짜 : 2025/07/10
 * 이름 : 우지희
 * 내용 : 자바 피보나치 수열 재귀 메서드 연습문제            //
*/
public class Test10 {
	public static void main(String[] args) {
		
		for(int i=0 ; i<10 ; i++) {
			System.out.print(fibo(i)+ " ");
		}
	}
	public static int fibo(int n) {    
		
		if(n <= 1) {   //1 <= 1 이므로 true
			return n;  //n = 1 이므로 return 1
		}
		return fibo(n-1) + fibo(n-2);
	}

}

/*
 fibo(4)
├── fibo(3)
│   ├── fibo(2)
│   │   ├── fibo(1) → 1
│   │   └── fibo(0) → 0
│   │   결과: 1 + 0 = 1
│   └── fibo(1) → 1
│   결과: 1 + 1 = 2
└── fibo(2)
    ├── fibo(1) → 1
    └── fibo(0) → 0
    결과: 1 + 0 = 1
결과: 2 + 1 = 3
 */

