package Day1_1120;

public class IfPractice {
    public static void main(String[] args) {
//        if문
//        if(조건문){
//            조건이 참일 때 실행할 코드
//        }

        Integer num1;
        num1 = 10;
        Integer num2;
        num2 = 20;

//        만약에 num1이 num2보다 작으면 작다고 출력한다
//        조건이 1개
        if (num1 < num2) {
            System.out.println("크다");
        }

//        조건이 2개
//        만약에 num1이 num2보다 작으면 작다고 출력한다
//        그렇지 않으면 else
//        참일 때는 위에가 거짓일 때는 아래가 실행된다
        if (num1 < num2) {
            System.out.println("크다");
        } else {
            System.out.println("작거나 같다");
        }

//        조건이 3개
//        만약에 num1이 num2보다 작으면 작다고 출력한다
//        그렇지 않으면 else
//        참일 때는 위에가 거짓일 때는 아래가 실행된다
//        if(num1<num2){
//            System.out.println("작다");
//        }else{
//            System.out.println("같다");
//        }else if{
//            System.out.println("크다");
//        }
//
    }
}
