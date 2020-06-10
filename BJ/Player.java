class Player extends Person{

    public Player(String name,Card cards){
        super(name,cards);
        System.out.println("(Player)"+name+"の最初の合計:"+getScore());
    }

    
}