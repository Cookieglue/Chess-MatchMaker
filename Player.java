public class Player{

    public String name;
    private int level;
    public Player[] matches = new Player[3];
    
    public Player(String name, int level) {
      
      this.name = name;
      this.level = level;
  
    }
    public void setMatch (Player opponent, int index){
      matches[index] = opponent;
    }
  }