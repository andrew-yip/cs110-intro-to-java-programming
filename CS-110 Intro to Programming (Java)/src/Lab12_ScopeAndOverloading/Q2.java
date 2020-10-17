package Lab12_ScopeAndOverloading;
public class Q2
{

	public static void main(String[] args ){ 
	    int x = 2, y = 3, z = 0; // This x is not related to the x in 						  // p( )
	    z = p(x,y);
	    System.out.print( "x = " + x + "  y = " + y + "  z = " + z );
	}

	public static int p (int a, int b ){
	    int x = 4; // This x has nothing to do with the x in main( )
	    a=7;
	    return a * x + b;
	}
}
