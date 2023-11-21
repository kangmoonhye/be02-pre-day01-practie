package Day1_1120;

public class ForWhilePractice {
    public static void main(String[] args) {
        Integer num1=1;
        num1=1;

//        만약에 num1이 5보다 크면 "크다"를 출력하는 걸 반복한다
        while(num1>5){
            System.out.println(" 크다");
            //조건을 변경 시키는 코드
            num1=num1-1;
        }


//        i가 0부터 i를 1씩 증가시키면서 10보다 같거나 커질 때 까지
//        "반복할 코드"를 반복한다
        for(Integer i=0; i<10; i=i+1){
            System.out.println("반복할 코드");
        }

    }

}