package in.ineuron.main;

public class IneuronPrint {

	public static void main(String[] args) {
		int n =10;
        for (int i=0; i<=n; i++)
        {
        	for (int j=0; j<=n; j++)
        	{
        		if(i==0 || i==n || j==n/2)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	for (int j=0; j<=n; j++)
        	{
        		if(j==0 || i==j || j==n)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	for (int j=0; j<=n; j++)
        	{
        		if(i==0 || i==n/2 && j<=(3*n)/4 || i==n || j==0)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	for (int j=0; j<=n; j++)
        	{
        		if((i==n && j>0 && j<n) || (j==0 && i!=n) || (j==n && i!=n))
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	for (int j=0; j<=n; j++)
        	{
        		if(j==0 || (i==0 && j<n) || (j==n && i>0 && i<n/2) || (i==n/2 && j<n) || (i==j && i>n/2 && j>n/2))
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	for (int j=0; j<=n; j++)
        	{
        		if((i==0 && j>0 && j<n) || (i==n && j>0 && j<n) || (j==0 && i>0 && i<n) || (j==n && i>0 && i<n))
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	for (int j=0; j<=n; j++)
        	{
        		if(j==0 || i==j || j==n)
        			System.out.print("*");
        		else
        			System.out.print(" ");
        	}
        	System.out.print("     ");
        	System.out.println();
        }

	}

}
