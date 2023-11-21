package Day1_1120;

public class Ex04 {
    public static void main(String[] args) {
        // 1은 가위, 2는 바위, 3은 보

        // Player는 이름이 있고 가위 바위 보 중 하나를 저장할 수 있다.
        // Player 클래스 생성 (이름, 무기)


        Player Player1;
        Player1=new Player();
        Player1.name="aaa";
        Player1.weapon=(int)(Math.random() * 3)+1;

        Player Player2;
        Player2= new Player();
        Player2.name="bbb";
        Player2.weapon=(int)(Math.random() * 3)+1;

        System.out.println(Player1);
        // 무승부면 반복
        while(Player1.weapon==Player2.weapon) {
            System.out.println(44);
            Player1.weapon = 1;
            //      player01이 가위, 바위, 보 중 랜덤하게 하나를 선택
            //      객체 생성, 이름을 player1로 저장, 랜덤으로 가위바위보 중 하나 저장

            //      player02가 가위, 바위, 보 중 랜덤하게 하나를 선택
            //      객체 생성, 이름을 player2로 저장, 랜덤으로 가위바위보 중 하나 저장

            //      둘 중에 이긴 사람 이름 출력
            Player1.weapon=(int)(Math.random() * 3)+1;
            Player2.weapon=(int)(Math.random() * 3)+1;
        }
        if(Player1.weapon==1 && Player2.weapon==2 || Player1.weapon==2 || Player2.weapon==1 ){}
    }
}
