class Judge{

    public void winloseJudge(Person person,Dealer dealer){
        if(person.getScore()>21 && dealer.getScore()>21){
            //どっちもバースト
            System.out.println(person.getName()+"の負けです。");
        }else if(person.getScore()>21 || dealer.getScore()>21){
            //片方がバースト
            if(person.getScore() > dealer.getScore()){
                System.out.println(person.getName()+"の負けです。");                
            }else{
                System.out.println(person.getName()+"の勝ちです。");          
            }
        }else{
            if(person.getScore()>dealer.getScore()){
                //プレイヤーの方が上
                System.out.println(person.getName()+"の勝ちです。"); 
            }else if(person.getScore()<dealer.getScore()){
                //ディーラーの方が上
                System.out.println(person.getName()+"の負けです。");
            }else{
                //引き分け
                System.out.println("引き分けです"); 
            }   
        }
    }

    






}