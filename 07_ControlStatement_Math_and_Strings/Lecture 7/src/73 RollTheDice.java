class RollTheDice {
    public static void main(String[] args) {
        RollTheDice myDice = new RollTheDice();
        System.out.println(myDice.rollDice());
    }

    int rollDice(){
        double random = Math.random() * 6;
        return (int) Math.floor(random) + 1;
    }
}
