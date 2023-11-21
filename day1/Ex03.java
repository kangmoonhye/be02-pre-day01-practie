package Day1_1120;

public class Ex03 {
    public static void main(String[] args) {
        // 1. 다음과 같이 정사각형을 출력하는 코드 작성
        /*
        ----------
         *****
         *****
         *****
         *****
         *****
        ----------
         */

//        Integer num1=5;
//        while(num1==5){
//            System.out.println("*****");
//        }

//        println=개행하는 코드
//        printf=힌줄에 이어서
        for(Integer i=0; i<5; i=i+1){
            System.out.println("*****");
        }




        // 2. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
         *
         **
         ***
         ****
         *****
        ----------
         */
        for(Integer i=1; i<5; i=i+1){
            System.out.println("*");
            for(Integer k=0; k<i+1; k=k+1){
                System.out.print("*");
            }
        }


        // 3. 다음과 같이 삼각형을 출력하는 코드 작성
        /*
        ----------
             *
            ***
           *****
          ********
         **********
         ----------
         */


    }
}
