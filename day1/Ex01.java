package Day1_1120;

public class Ex01 {
    public static void main(String[] args) {
        Integer num1;
        num1=10;

        Integer num2;
        num2=20;

        // 다음에 코드를 작성하여 num1과 num2에 저장된 숫자를 서로 바꾸시오
        // 단 num1 = 20;, num2=10; 사용금지

//        if(num1==10){
//            System.out.println(num2);
//        }
//
//        if(num2==20){
//            System.out.println(num1);
//        }

        Integer num3=num1;
        num1=num2;
        num2=num3;

        System.out.println(num1);
        System.out.println(num2);
    }
}
