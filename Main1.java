//This is The Coding Area
import java.util.*;
class Main
{
  public static void main(String[] args)
  {
    Scanner sc=new Scanner(System.in)
    int n=sc.nextInt();
    for(int i=0;i<n;i++)
    {
      int high=sc.nextInt();
      int sum=0;
      int count=0;
      for(int i=1;i<=high;i++)
      {
        sum=sum+i;
        if(sum<=high)
        {
          count++;
        }
        else
         	break;
      }
     	System.out.println(count);
    }
    
  }
}