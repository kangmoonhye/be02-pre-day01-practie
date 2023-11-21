package Day1_1120;

public class Practice{
    public static void main(String[] args) {
        // 강지흔 학생의 객체를 생성해서 저장한다.
        Student kjh;
        kjh= new Student();
        // 강지흔 학생의 객체의 나이에 26을 저장한다.
        kjh.age=26;
        // 강지흔 학생의 객체의 이름에 "강지흔"을 저장한다.
        kjh.name="강지흔";

        // 한경훈 학생의 객체를 생성해서 저장한다.
        Student hgh;
        hgh = new Student();
        // 한경훈 학생의 객체의 나이에 25을 저장한다.
        hgh.age=25;
        // 한경훈 학생의 객체의 이름에 "한경훈"을 저장한다.
        hgh.name="한경훈";

        // 임태우 학생의 객체를 생성해서 저장한다.
        Student itw;
        itw = new Student();
        // 임태우 학생의 객체의 나이에 27을 저장한다.
        itw.age=27;
        // 임태우 학생의 객체의 이름에 "임태우"을 저장한다.
        itw.name="임태우";

        // 이주현 학생의 객체를 생성해서 저장한다.
        Student ljh;
        ljh = new Student();
        // 이주현 학생의 객체의 나이에 23을 저장한다.
        ljh.age=23;
        // 이주현 학생의 객체의 이름에 "이주현"을 저장한다.
        ljh.name="이주현";

        // 강지흔 학생의 나이와 한경훈 학생의 나이를 곱해서 저장한다.
        Integer age1;
        age1=kjh.age * hgh.age;
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한다.
        Integer age2;
        age2=itw.age + ljh.age;
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한다.
        Integer age3;
        age3= age2 * kjh.age;
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한 값에 한경훈 학생의 나이를 나눈다.
        Integer age4;
        age4=age3/hgh.age;
        // 강지흔 학생의 나이와 한경훈 학생의 나이를 곱해서 저장한 값이
        // 임태우 학생의 나이와 이주현 학생의 나이를 더해서 저장한 값에 강지흔 학생의 나이를 곱해서 저장한 값에 한경훈 학생의 나이를 나눈 값보다
        // 큰지 비교한다.
        Boolean finalAge;
        Integer age5;
        finalAge=age1 > age4;
        System.out.println(finalAge);

        // 결과를 화면에 출력한다.



    }

}