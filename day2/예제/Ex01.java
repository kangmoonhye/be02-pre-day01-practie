package day2;

public class Ex01 {
    public static void main(String[] args) {
        //총합을 저장하기 위한 변수 만들기
        // i가 1부터 100까지 1씩 증가하면서 반복
        // 총합에 i를 더해서 저장
        Integer num= 0;

        for (Integer i=1; i<=100; i++){

            num=num+i;

        }

        System.out.println("총합은"+num+"임");

    }
}
