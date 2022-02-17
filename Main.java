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
    
    public static void main(String[] args) {
        
        Player[][] teams = {holliston, franklin};
        matchPlayers(teams, 7, 1);
      
    }
    public static void matchPlayers(Player[][] teams, int playerNum, int matchNum){
      
        //for teams
        for(int i = 0 ; i < teams.length ; i++){
            //for players
            for (int n = 0 ; n < playerNum ; n++){
                
                Player opponent = teams[(i+1)%2][n];
                //Set "Home" match
                teams[i][n].setMatch(opponent, 0);
                //Set "Away" match
                opponent.setMatch(teams[i][n], 0);


                System.out.println( teams[i][n].name + " VS " + teams[i][n].matches[0].name );
                //for matches
                /** 
                while (teams[i].matches.length < matchNum){
                    teams[i].setMatch(opponent, index);
                }
                **/

            }
        }

    }
  }