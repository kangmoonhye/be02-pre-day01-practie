package day2;

import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        //입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        //숫자를 입력받을 크기가 10인 배열 만들기
        Integer[] arr = new Integer[10];
        //0부터 9까지 반복
        for(Integer i=0; i<10; i=i+1){
            //  배열의 반복횟수 번째에 숫자를 입력받아서 저장
            System.out.print("숫자 입력 : ");
            arr[i] = sc.nextInt();
        }

        //모든 수를 저장할 변수를 생성
        Integer num=0;
//        //0부터 9까지 반복
        for(Integer i=0; i<10; i=i+1){

            //  모든 수를 저장할 변수에 반복횟수에 해당하는 배열의 값을 더햇서 저장
            num=num+arr[i];
        }

        //모든 수를 저장한 변수에 배열의 크기만큼 나눠서 출력

        System.out.println(num/arr.length);

    }
}
