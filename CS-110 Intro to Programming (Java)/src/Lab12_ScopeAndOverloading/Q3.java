package Lab12_ScopeAndOverloading;
public class Q3
{

	public static void main(String[] args ){ 
	    int x = 2, y = 3, z = 0;
	    display (x, z); // We pass the value x=2, z=0 to display( )
	    System.out.print("   INSIDE MAIN  ");
	    System.out.println( "x = " + x + " y = " + y + " z = " + z);
	}

	public static void display (int x, int y){ // this x and y are 										 // not related 
								// to the x and y in main-									// they are just 
								// values being passed
	    int z = x; // this z has nothing to do with the z in main -
	    			// This z gets the value 2
	    System.out.print("INSIDE DISPLAY   "); 
	    System.out.print( "x = " + x + " y = " + y + " z = " + z );
	}
}

