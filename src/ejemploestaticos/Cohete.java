package ejemploestaticos;

public class Cohete {
		
private static int numCohetes;
	public Cohete (){
		numCohetes++;
	}
public static int getCohetes (){
	return numCohetes;
	}
}
	 