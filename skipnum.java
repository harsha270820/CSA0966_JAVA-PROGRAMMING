import java.util.*;
class skipnum
{
public static void main(String[] args)
{
Scanner sc=new Scanner(System.in);
System.out.println("enter the number from where we need start M=");
int M=sc.nextInt();
System.out.print("enter the number where to end N=");
int N=sc.nextInt();
System.out.print("enter the number where to skip k=");
int K=sc.nextInt();
for(int i=M;i<N;i++){
i=i+K;
System.out.println("my result is :"+i);
}
}
}


