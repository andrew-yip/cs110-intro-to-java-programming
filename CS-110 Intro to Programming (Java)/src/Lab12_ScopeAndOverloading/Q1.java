package Lab12_ScopeAndOverloading;
public class Q1
{
	public static void main(String[] args ){ 
	    int x = 2, y = 3, z = 0;
	    z = p(x,y); // All that gets passed here are the values of x 					and y
	    			// Their names are immaterial
	    System.out.print( "x = " + x + " y = " + y + " z = " + z);
	}
	
	public static int p (int x, int y ){ 
		/*It's a lot clearer if you give the parameters different 			names than the x and y used in main - x and y have no 				relation to x and y in main */
		
	    x = 21; // We pass x=2 and y=3 to the method p but
	    y = 31; // then change their values inside p
	    		// Notice tho- x and y are not changed in main
	    return y-x;
	}
}
