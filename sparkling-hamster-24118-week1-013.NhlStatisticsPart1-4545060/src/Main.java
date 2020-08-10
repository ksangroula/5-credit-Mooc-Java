
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
    System.out.println("Top ten players based on goals");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        
    System.out.println("Top 25 players based on penalty amounts");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
    
    System.out.println("statistics for Sidney Crosby");
        NHLStatistics.searchByPlayer("Sidney Crosby");
    
    System.out.println("statistics for Philadelphia Flyers");
        NHLStatistics.teamStatistics("PHI");
        NHLStatistics.sortByPoints();
        
     System.out.println("players in Anaheim Ducks ");
        NHLStatistics.teamStatistics("ANA");
        NHLStatistics.sortByPoints();
     
    }
}
