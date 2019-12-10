/*
 *   && => 직렬처리
 *   || => 병렬처리
 *   
 *   문법형식
 *     (조건) && (조건) : 범위안에 있는 경우
 *       => score>=90 && score<=100
 *     (조건) || (조건) : 범위 밖에 있는 경우 (오류처리)
 *       => score<= || score>100
 *       
 *       id와 password
 *       
 *       id=="" && pwd=1234
 *       !(id!="" || pwd!="")
 *     
 *    ===========================
 *                   &&    ||
 *    ===========================
 *    true true     true  true
 *    ===========================
 *    true false    false true
 *    ===========================
 *    false true    false true
 *    ===========================
 *    false false   false false
 *    ===========================
 *    
 *    *** 효율적 연산
 *    && => 왼쪽 => false => 오른쪽은 연산에서 제외
 *    || => 왼쪽 => true  => 오른쪽은 연산에서 제외
 */
public class 이항연산자_논리연산자 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        // 알파벳을 저장후에 소문자 , 대문자 구분
		char c='A'; // 'a'
		// 대문자면 소문자 ==> 소문자 ==>대문자 변경
		char result=(c>=65 && c<=86)?(char)(c+32):(char)(c-32);
		System.out.println(c+"는(은) "+result);
	}

}
