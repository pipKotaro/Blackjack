import java.util.ArrayList;
import java.util.*;

class Card{
    private ArrayList<Integer> cards = new ArrayList<Integer>();

    //cards作成
    Card(){
        for(int i=1;i<14;i++){
            for (int k=0;k<4;k++){
                cards.add(i);
            }
        }
    }

    public int giveOutCard(){
        int ramdom = new Random().nextInt(cards.size()); // ランダムに選択された 0 以上 4 未満の整数
        int result = cards.get(ramdom); // ランダムに選択された要素
        //配布したカードの削除
        this.cards.remove(ramdom);

        return result;
    }

    //カードの中身を表示
    public void lookCrads(){
        System.out.println(cards);
    }

}