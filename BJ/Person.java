import java.util.ArrayList;

class Person{
    protected String name;
    protected Score score = new Score();
    protected ArrayList<Integer> myCards = new ArrayList<Integer>();

    public Person(String name,Card cards){
        this.name = name;
        firstCard(cards);
        score.scoreCal(myCards);
        //System.out.println("(Person)"+name+"の最初の合計:"+getScore());         
    }


    public void firstCard(Card cards){
        myCards.add(cards.giveOutCard());
        myCards.add(cards.giveOutCard());
        System.out.println("(Person)"+name+"の手札："+myCards);      
    }

    public void getCard(Card cards){
        int result =  cards.giveOutCard();
        System.out.println("(Person)"+name+"は"+result+"を引いた");
        myCards.add(result);
        System.out.println("(Person)"+name+"の手札："+ myCards);       
        System.out.println("(Person)"+name+"の合計:"+getScore()); 
    } 

    
    public int getScore(){
        score.scoreCal(myCards);
        return score.getScore();
    }

    public String getName(){
        return name;
    }

    public ArrayList<Integer> getMyCards(){
        return myCards;
    }

}