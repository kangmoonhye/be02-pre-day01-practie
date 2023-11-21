package day2;

//배열을 사용하여 6개의 숫자를 입력받고 6개의 숫자를 거꾸로 출력하시오
import java.util.Scanner;
public class Ex03 {
    public static void main(String[] args) {
        //입력받기 위한 스캐너 만들기
        Scanner sc = new Scanner(System.in);
        //숫잘를 입력받을 크기가 6인 배열 만들기
        Integer[] arr = new Integer[6];

        //0부터 5까지 반복
        for (Integer i=0; i<6; i++){
            System.out.print("숫자 입력해라 : ");
            arr[i] = sc.nextInt();
        }
        //  배열의 반복횟수 번째에 숫자를 입력받아서 저장


//        5부터 0까지 반복
//             배열의 반복횟수 번쨰에 숫자를 출력
        for (Integer i=5; i>=0; i=i-1){
            System.out.println(arr[i]);
        }

    }
}
