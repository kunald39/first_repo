import java.util.*;
public class Main 
{
    public static void main(String args[])
    {
        System.out.print("strong numbers till ");
        Scanner sc=new Scanner(System.in);
        long lim=sc.nextLong();
        System.out.print("are ");
        while(lim>=1){
        long num=lim,sum=0;
        while (num!=0)
        {
            long x=num%10, f=1L;
            while(x>0)
            {
                f=f*x;
                x--;
            }
            sum=sum+f;
            num=num/10;
        }
        if(sum==lim)
            System.out.print(lim+" ");
        lim--; 
        }
    }
}
