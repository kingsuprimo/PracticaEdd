package piedrapapeltijera;

class Player
{
    private int wins;      // # of wins
    /**
     * Randomly choose rock, paper, or scissors
     */
    public String playerChoice()
    {
        String choice = "";
        int c = (int)(Math.random()*3);
        
        switch(c) {
            case 0:
                choice = ("rock");
                break;
            case 1:
                choice = ("paper");
                break;
            case 2:
                choice = ("scissors");
                break;
            default: break;    
        }
        return choice;
    }
    public int setWins() 
    {
        wins = wins++;
        return wins;
    }
    public int getWins() 
    {
        return wins;
    }
}