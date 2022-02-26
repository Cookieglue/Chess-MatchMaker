import java.util.Random;

class Main {
    static Random rand = new Random();
    static Player[] holliston = {
      new Player("Adam",1),
      new Player("Sai",2),
      new Player("Matt",3),
      new Player("Mari",4),
      new Player("Rupesh",5),
      new Player("Raj",6),
      new Player("Noah",7),
    };
    static Player[] franklin = {
        new Player("T",1),
        new Player("Te",2),
        new Player("Tem",3),
        new Player("Temm",4),
        new Player("Temmi",5),
        new Player("Temmie",6),
        new Player("bob",7),   
    };
    static Player[] medway = {
          new Player("Mark",1),
          new Player("Mario",2),
          new Player("Moo",3),
          new Player("Man",4),
          new Player("Mar dog",5),
          new Player("Marco",6),
          new Player("not mari",7),   
      };
    public static Player[][] teams;
    public static void main(String[] args) {

        teams = new Player[][]{holliston, franklin, medway};
        matchPlayers(7, 2);
      
    }
    public static void matchPlayers(int playerNum, int matchNum){

      //for matches
      for (int m = 0 ; m < matchNum ; m++){
        //for rank in team
        for (int n = 0 ; n < playerNum ; n++){
            //for teams
            for(int i = 0 ; i < teams.length ; i++){
                  
                Player self = teams[i][n];

                if (self.matches[m] == null){
                    Player opponent = getOpponent(m, i, self);
                    //Set "Home" match
                    self.setMatch(opponent, m);
                    System.out.println("MATCH " + m + " " + self.name + " VS " + opponent.name);
                }
  
              }
          }
        }
    }

  public static Player getOpponent(int matchNum, int playerTeam, Player self){
    
    Player opponent = new Player("No Match Found", 0);

    //cycle through players || strongest players are always prioritized
    for(int opponentRank = 0; opponentRank < holliston.length; opponentRank++){

        int arrayShift = rand.nextInt(teams.length);

        //cycle through teams
        for (int opponentTeamCount = 0 ; opponentTeamCount < teams.length ; opponentTeamCount++){

            //skip the players team to avoid self matching
            int opponentTeam = (opponentTeamCount+arrayShift)%teams.length; 
            if(opponentTeam == playerTeam) opponentTeamCount++;
            opponentTeam = (opponentTeamCount+arrayShift)%teams.length; 

            //ensure that the opponent is free during that match
            if (teams[opponentTeam][opponentRank].matches[matchNum] == null){
                opponent = teams[opponentTeam][opponentRank];
                //Set "Away" match
                opponent.setMatch(self, matchNum);
                return opponent;
            }

        }
      
      
    }
    return opponent;
  }
    
  }