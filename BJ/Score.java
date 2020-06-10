import java.util.ArrayList;

class Score{
    private int score;
    //手札に１があったときのサブスコア用（低い数をsubScoreに入れる）
    private int subScore=0;
    private boolean one =false;

    public Score(){
    }

    public void scoreCal(ArrayList<Integer> myCards){
        score = 0;
        for(int num:myCards){
            if(num > 9){
                num = 10;
            }
            if(num==1){
                num =11;
            }
            score += num;
        }

        if(score>21 && myCards.indexOf(1) != -1){
            //手札に１がある時の処理
            this.score -= 10;
        }
    }


    public int getScore(){
        return this.score;
    }

}