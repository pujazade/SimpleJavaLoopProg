package examples;
public class forLoop {

public static void main (String[] args){
	for ( int i=1; i<=10;i=i+2)   //L1
	{
		System.out.println("odd number is = "+i);//odd number 1,3,5,7,9
	}	
	 for (int k=1;k<=10;k++)      //L2
    {
 		 System.out.println("K = "+(k=k+2));//odd number 3,6,9,12
    }
	
     for (int a=1;a<=10;a++)      //L3
    {
	 System.out.println("a="+(a=a+1));//Even number
    }
     
     for (int b=1;b<=10;b++)      //L4
    {
	 System.out.println("b="+b);
//	 System.out.println(b);//same
    }
}
}

