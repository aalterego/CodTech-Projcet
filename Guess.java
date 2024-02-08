package codtech.guess;
import java.util.*;

public class Guess {
	public static void main(String[] args)
	{
		int ans=getRandom();
		System.out.println("YOU WILL GET 3 CHANCES TO GUESS THE CORRECT NUMBER BETWEEN 0N TO 100");
		Scanner sc=new Scanner(System.in);
		for(int i=0;i<3;i++)
		{
			int chance=2-i;
			int userNumber=sc.nextInt();
			if(userNumber<0 || userNumber>100)
			{
				System.out.println("The You Enter not in the range between 1 to 100");
			}
			if(userNumber==ans)
			{
				System.out.println("You Get The correct Number"+" "+ans);
				return;
			}
			else if(userNumber<ans)
			{
				System.out.println("To Low"+" "+chance+" Chance's left");
			}
			else
			{
				System.out.println("To high"+" "+chance+" Chance's left");
			}
			
		}
		System.out.println("The Answer Was "+ans+" Better Luck Next Time!!!");
	}
	static int getRandom(){
        Random r=new Random();
        int low=0;
        int high=100;
        return r.nextInt(high-low)+low;
    }

}
