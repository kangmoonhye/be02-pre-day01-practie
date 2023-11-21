package Day1_1120;

class School{
//    맨 처음 실행할 기준점이 필요함 - main
//    하나의 틀이라고 생각하면 됨
    public static void main(String[] args) {
    //    클래스로 객체 생성
    //    객체를 저장할 수 있는 변수 생성
                Student AAA;

    //      앞에서 만든 변수에 new로 객체를 생성해서 저장할 때는 =(등호)으로 저장
                AAA = new Student();
                AAA.age=26;
                AAA.name="AAA";
                AAA.major=true;

                Student BBB;
                BBB = new Student();

//                객체 안에 있는 변수, 메소드를 사용할 때는 변수이름 뒤에 .(점)을 사용한다
//                변수에게 문자 데이터를 지정할 때는 "큰따옴표"를 사용한다
                BBB.age=31;
                BBB.name="BBB";

//            자바는 위에서부터 아래로 읽기 때문에 모든 변수가 선언이 된 이후에 실행된다.

                Student CCC;
                CCC = new Student();
                CCC.age=27;
                CCC.name="CCC";
                CCC.major=false;

        //        연산자 사이에는 우선순위가 있다
        //        제일 높은 연산자 - 괄호>산술(덧뺄곱나)>비교>논리>대입

                Integer totalAge;
                totalAge=AAA.age + BBB.age * CCC.age;
//산술연산자
                Integer result;
                result=AAA.age + BBB.age; //57
                System.out.println(result);
                result=AAA.age - BBB.age; //-4
                System.out.println(result);
                result=AAA.age * BBB.age; //806
                System.out.println(result);
                result=AAA.age / BBB.age; //0, 나머지를 제외한 몫만 저장이 된다
                 System.out.println(result);
                result=AAA.age % BBB.age; //26,몫을 제외한 나머지만 저장이 된다
                System.out.println(result);

                //비교연산자
        Boolean result2;
        result2 = AAA.age > BBB.age; //false
        System.out.println(result2);
        result2 = AAA.age < BBB.age; //true
        System.out.println(result2);
        result2 = AAA.age >= BBB.age; //false
        System.out.println(result2);
        result2 = AAA.age <= BBB.age; //true
        System.out.println(result2);
        result2 = AAA.age == BBB.age; //false
        System.out.println(result2);
        result2 = AAA.age != BBB.age; //true
        System.out.println(result2);

//        논리연산자 and/or
//        연산          결과
//        f && f        f
//        f && t        f
//        t && f        f
//        t && t        t

//        f || f        f
//        f || f        f
//        f || f        f
//        t || t        t





        Subject linux;
                Subject DB;
                Subject sw;

                linux=new Subject();
                linux.name="리눅스";
                linux.time=2;

                DB=new Subject();
                DB.name="데이터베이스";
                DB.time=8;

                sw=new Subject();
                sw.name="소프트웨어공학";
                sw.time=3;

    }

}