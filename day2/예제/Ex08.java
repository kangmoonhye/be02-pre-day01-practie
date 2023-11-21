package day2;

import java.util.Scanner;

//로또번호 생성기
//로또 번호는 1~45 중애 중복 없이 6개를 고르는 것
//변수, 조건문, 반복문, 배열만 사용할 것, 랜덤숫자 생성
public class Ex08 {
    public static void main(String[] args) {

        //1~45를 저장할 배열을 만든다
        //배열에 1~45를 저장한다
        Integer[] number = new Integer[45];

        //정수 45까지의 숫자를 생성한다
        for(Integer i=0;i<6;i++){

            number[i] =(int) (Math.random() * 45)+1;

            for(int j=0; j<i; j++){
                if(number[i]==number[j]){
                    number[i] =(int) (Math.random() * 45)+1;
                    j=0;

                }
            }
            System.out.println(number[i]);

        }
        // 랜덤한 숫자 1개를 고른다
//        number[i] =(int) (Math.random() * 45)+1;
//        //숫자 1개를 고른다
//        number[i] =(int) (Math.random() * 45)+1;
//        //1번째와 2번째를 비교한다
//        if(){
//
//        }
        //뽑은게 같다면 버리고 다시 뽑는다
        //숫자 1개를 고른다
        //2번째와 3번째를 비교한다
        //뽑은게 같다면 버리고 다시 뽑는다
        //숫자 1개를 고른다
        //3번째와 4번째를 비교한다
        //뽑은게 같다면 버리고 다시 뽑는다
        //숫자 1개를 고른다
        //4번째와 5번째를 비교한다
        //뽑은게 같다면 버리고 다시 뽑는다
        //숫자 1개를 고른다
        //5번째와 6번째를 비교한다
        //뽑은게 같다면 버리고 다시 뽑는다











        //숫자를 입력받을 변수를 만든다


        //숫자를 입력 받아 변수에 저장한다
//        System.out.print("숫자입력 : ");
//        num = sc.nextInt();

        //1~45에서 랜덤한 숫자 6개를 출력할 때까지 반복한다
//        for(int i=0; i<=6; i++){
//            number[i] = (int) (Math.random() * 10);
//        }
//        System.out.println(num);


    }
}
