package Day1_1120;

import java.util.ArrayList;

public class Array{
    public static void main(String[] args) {

        ArrayList arrayList;
        arrayList = new ArrayList();

//        배열은 같은 타입의 값만 저장이 가능함, 크기가 처음에 정해진다
        Integer[] arr = new Integer[5];

//        배열에 저장된 변수 이름 뒤애 [순서번호]를 써주면 배열의 특정 순서에 있는 변수한테 접근
        arr[0]=10;
        arr[1]=20;
        arr[2]=30;
        arr[3]=40;
        arr[4]=50;

        String[] txt = new String[5];
        txt[1]="가";
    }
}