package day2;

import java.util.Scanner;

//정수로 된 돈의 액수를 입력받아
//오만원권, 만원권, 천원권, 500원짜리 동전, 100원짜리 동전, 50원짜리 동전, 10원짜리 동전, 1원짜리 동전이
//각각 몇갤로 변환되는지 출력
//unit배열을 활용
public class Ex07 {
    public static void main(String[] args) {
        //입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);

        //1원~5만원을 저장할 unit 배열 만들기
        //배열에 1원~5만원을 저장하기
        int[] money = {50000, 10000, 5000, 5000, 1000, 500, 100, 50, 10, 1};

        //숫자를 입력 받는 변수를 만들기
        Integer num;

        //숫자를 입력받아 변수에 저장하기
        System.out.print("숫자입력 : ");
        num = sc.nextInt();
        //입력받은 숫자가 다 나눠질때까지 반복한다
        //
        for(Integer i=0; i<9; i++){
            int num2=num/money[i];
            System.out.print(num2);

        }

//        System.out.print(money[num]);


//        335456->5만원 6장/만원 3장/천원 5장/100원 4개/50원 1개/1원 6개
//        나머지를 구하는 식을 쓰고 그 식을 다음 식ㅇ로 사용할 수 있게
    }
}
// System.out.print("잘못 입력하셨습니다");

