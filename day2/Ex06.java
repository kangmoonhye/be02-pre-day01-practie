package day2;

import java.util.Scanner;

//배열에 월~일까지 초기화 하고 0부터 6까지 숫자를 입력 받아 입력한 숫자와 같은 인덱스에 있는 요일을 ㅊㄹ력하고 범위에 없는
//숫자를 입력시 "잘못 입력하셔ㅅ습니다" 를 출력
public class Ex06 {
    public static void main(String[] args) {
        //입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        //월~일을 저장할 배열 만들기
        //배열에 월~일을 저장
        String[] day = {"월", "화", "수", "목", "금", "토", "일"};

        //숫자를 입력받을 변수 생성
        Integer num=0;
        //숫자를 입력받아 변수에 저장
        System.out.print("숫자 입력 : ");
        num = sc.nextInt();
        //만약에 입력받은 숫자가 0~6이라면
        if(0<=num && num<=6){
            //  배열에 입력받은 숫자번째 값을 출력
            System.out.print(day[num]);
            //그렇지 않으면
            //  잘못 입력 출력
        }else{
            System.out.print("잘못 입력하셨습니다");
        }



    }
}
