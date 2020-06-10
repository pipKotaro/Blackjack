class Dealer extends Person{

    public Dealer(Card cards){
        super("Dealer",cards);
        System.out.println("(Person)"+name+"の最初の合計:???");    
    }

    public void getCard(Card cards){
        while(getScore()<17){        
            int result =  cards.giveOutCard();
            System.out.println("(Dealer)"+name+"は"+result+"を引いた");
            myCards.add(result);
            System.out.println("(Dealer)"+name+"の手札："+ myCards);     
            System.out.println("(Dealer)"+name+"の合計:"+super.getScore()); 

        }

        if(super.getScore()>17){
            System.out.println("(Dealer)引きません");
        }
    }    

    public void firstCard(Card cards){
        myCards.add(cards.giveOutCard());
        myCards.add(cards.giveOutCard());
        System.out.println("(Dealer)Dealerの手札：[？, "+myCards.get(1)+"]");      
    }
    

}