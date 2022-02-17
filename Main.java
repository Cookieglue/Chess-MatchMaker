class Main {

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
    
    public static void main(String[] args) {
        
        Player[][] teams = {holliston, franklin, medway};
        matchPlayers(teams, 7, 2);
      
    }
    public static void matchPlayers(Player[][] teams, int playerNum, int matchNum){

      //for matches
      for (int m = 0 ; m < matchNum ; m++){
          //for teams
          for(int i = 0 ; i < teams.length ; i++){
              //for players
              for (int n = 0 ; n < playerNum ; n++){
                  
                Player self = teams[i][n];

                //for opponent teams
                for (int op = 0 ; op < playerNum ; op++){
                  Player opponent = teams[(op)%teams.length][n];
                  
                  if (self.matches[m] == null && opponent.matches[m] == null){
                      //Set "Home" match
                      self.setMatch(opponent, m);
                      //Set "Away" match
                      opponent.setMatch(self, m);
                      //for matches
                      System.out.println( self.name + " VS " + self.matches[0].name );
                  }
                }
  
              }
          }
        }
    }

  public Player getOpponent(int matchNum, int team){
    for (int op = 0 ; op < playerNum ; op++){
      
      Player opponent = teams[(op)%teams.length][n];
      //ensure that the opponent is free and is not on the same team
      if (opponent.matches[matchNum] == null, ){
        
      }
      
    }
  }
    
  }