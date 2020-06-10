import java.util.Scanner;

class Main{
    public static void main(String[] args){
        Card cards = new Card();
        Player taiki = new Player("taiki",cards);
        Dealer dealer = new Dealer(cards);
        Judge judge = new Judge();
        
        turn(taiki,cards);

        System.out.println("ディーラーの手札："+ dealer.getMyCards());
        System.out.println("ディーラーのスコア："+ dealer.getScore());
        dealer.getCard(cards);
        
        judge.winloseJudge(taiki,dealer); 

    }

    static void turn(Person person,Card cards){
        boolean draw = true;
        Scanner scanner = new Scanner(System.in); 

        while(draw){
            if(person.getScore() >21){
                System.out.println("バーストしました");
                draw = false;
            }else if(person.getScore() == 21){
                 System.out.println("ブラックジャック！！");
                draw = false;               
            }else{
                System.out.print("スタンド or ヒット　> ");
                String input_text = scanner.nextLine();
                if(input_text.equals("スタンド")){
                    draw = false;
                }else if(input_text.equals("ヒット")){
                    person.getCard(cards);
                }else{
                    System.out.println("ヒットかスタンドを入力してください");
                }
            }
        }
    }


}