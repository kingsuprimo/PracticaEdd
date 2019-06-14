package piedrapapeltijera;

public class Game {
    
        private boolean gameWon = false;  
        private String p1Choice;
        String p2Choice;
        private  int roundsPlayed = 0;    // Number of rounds played
        private  Player p1;
        private  Player p2;
        int p1Wins = p1.getWins();
        int p2Wins = p2.getWins();
        private int draw = 0;

        
 
        
    public void Jugar(){
        
        Player p1 = new Player();
        Player p2 = new Player();
        
         // MainJuego Loop // 

        {
            System.out.println("***** Round: " +
                roundsPlayed + " *********************\n");
            System.out.println("Number of Draws: "+ 
                draw + "\n");
            p1Choice = p1.playerChoice();
            System.out.println("Player 1: " + p1Choice + 
                "\t Player 1 Total Wins: " + p1Wins);
            p2Choice = p2.playerChoice();
            System.out.println("Player 2: " + p2Choice+ 
                "\t Player 2 Total Wins: " + p2Wins);
            
            
            
            if (p1Choice.equals("rock")&&p2Choice.equals("paper"))
            {
                System.out.println("Player 2 Wins");
                p2Wins++;  // trying a couple different ways to get count to work
            }
            else if (p1Choice.equals("paper") && p2Choice.equals("rock"))
            {
                p1Wins++;
                System.out.println("Player 1 Wins");
            }
            else if(p1Choice.equals("rock")&&p2Choice.equals("scissors"))
            {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            }
            else if((p1Choice.equals("scissors"))&&(p2Choice.equals("rock")))
            {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            }
            else if((p1Choice.equals("scissors"))&&(p2Choice.equals("paper")))
            {
                p1Wins = p1.setWins();
                System.out.println("Player 1 Wins");
            }
            else if((p1Choice.equals("paper"))&&(p2Choice.equals("scissors")))
            {
                p2Wins = p2.setWins();
                System.out.println("Player 2 Wins");
            }
            if(p1Choice.equals(p2Choice))
            {
                draw++;
                System.out.println("\n\t\t\t Draw \n");
            }
      
            roundsPlayed++;
            
        }
 
    }
            public int getRoundPlayeds(){
            return roundsPlayed;
        }
    }
    

