import java.util.Scanner;
class Player
{
  String name;
  int matches;
  int runs;
  int wickets;

  Player()
  {
    this.name="unkonw";
    this.matches=100;
    this.runs=10000;
    this.wickets=9;
    System.out.println("Default constructor");
  }
  Player(String n,int m,int r,int w)
  {
    this.name=n;
    this.matches=m;
    this.runs=r;
    this.wickets=w;
    System.out.println("parameterized constructor");
  }
  

  void setName(String name)
  {
     this.name=name;
  }
  void setMatches(int matches)
 {
    this.matches=matches;
  }
  void setRuns(int runs)
 {
    this.runs=runs;
 }
 void setWickets(int wickets)
 {
    this.wickets=wickets;
 }
 
//getter
 String getName()
  {
    return this.name;
  }
  int getMatches()
 {
   return this.matches;
  }
  int getRuns()
 {
   return this.runs;
 }
 int getWickets()
 {
    return this.wickets;
 }
//display
  void displayInfo()
  {
     System.out.println("Name is "+name);
     System.out.println("Matches is "+matches);
     System.out.println("Runs "+runs);
    System.out.println("Wickets is "+wickets);
    System.out.println("-----------------------");
}
}// class Player end here
class TestPlayer
{
   public static void main(String args[])
   {
     Scanner sc =new Scanner (System.in);
     Player[] prr=new Player[10];
     

     System.out.println("Enter details 10 players:");
        for (int i = 0; i < prr.length; i++) {
            System.out.println("Enter details of Player " + (i + 1));
            System.out.print("Name: ");
            String name = sc.nextLine();
            System.out.print("Matches: ");
            int matches = sc.nextInt();
            System.out.print("Runs: ");
            int runs = sc.nextInt();
            System.out.print("Wickets: ");
            int wickets = sc.nextInt();
            sc.nextLine(); 

            prr[i] = new Player(name, matches, runs, wickets); // parameterized constructor
        }
        System.out.println("\nAll Player Information:");
        for (int i = 0; i < prr.length; i++) {
            System.out.println("Player " + (i + 1) + ":");
            prr[i].displayInfo();
        }
       
       //max runs and wickets
        int maxRuns = prr[0].getRuns();
        int maxWickets = prr[0].getWickets();
       for(int i=0;i<prr.length;i++)
      {
        	if(prr[i].getRuns()>maxRuns)
	     maxRuns=prr[i].getRuns();
            
           if(prr[i].getWickets()>maxWickets)
	      maxWickets=prr[i].getWickets();
    }
     System.out.println("\n Player with Maximum Runs:"+maxRuns);
    
      
        System.out.println("\nPlayer with Maximum Wickets:"+ maxWickets);
       
}
}
    