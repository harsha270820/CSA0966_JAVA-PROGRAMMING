import java.util.*;
class armstrong{
public static void main(String[] args){
Scanner sc=new Scanner(System.in);
System.out.println("enter the 3 digit number");
int num=sc.nextInt();
System.out.println("the obtianed n,k,m are sorted digits of given numbers");
int n=num%10;
int sum=num/10;
System.out.println("the value of sum :"+n);
int k=sum%10;
System.out.println("the value of k: "+k);
int m=sum/10;
System.out.println("the value of k: "+m);
double t=Math. pow(m, 3);
double s=Math. pow(k,3);
double f=Math. pow(n,3);
double total=f+s+t;
if(total==num){
System.out.println("yes entered number is armstrong number"+num);
}
else{
System.out.println("yes entered number is not an armstrong number"+num);
}
}
}







  