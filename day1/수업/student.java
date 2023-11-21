package Day1_1120;
//클래스 이름 규칙 (안지키면 문법적으로 틀리는 약속)
//영어 대문자로 시작
//중간에 띄어쓰기 불가
//특수문자 사용ㄴㄴ
//_(언더바)만 사용가능

//아름다운 약속
//        클래스 이름은 무엇을 만들었는지 알 수 있는 단어로 만든다
//        여러 단어를 조합해야 할 때 아래 규칙을 따른다
//    camel case : 단어가 여러개일 때 전부 붙여서 쓰지만 영어 단어 맨 앞글자만 대문자
//        ex)MyNotebook
//    snake case : 영어 단어 사이사이를 언더바로 연결
//        ex) My_notebook
class Student {
//    클래스 안에는 속성과 기능으로 이뤄져 있다
//            속성 = 변수(뭔가를 저장해 둘 때 사용, 뭐를 저장했는지 잘 파악하고 있을 것)
//                  변수를 만드는 문법 : (클래스 이름) (저장할 값의 타입 변수 이름) ;
//    no useages : 내가 만든 변수를 아무 곳에서도 사용하지 읺았다
    String name;
    Integer age;

    Boolean major;
//    논리형 함수 -> true와 false 둘 중 하나만 저장할 수 있다

//            기능 = 메소드()

}

class Subject{
    String name;
    Integer time;
}