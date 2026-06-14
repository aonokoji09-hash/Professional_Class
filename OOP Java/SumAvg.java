import java.util.Scanner;
class SumAvg{
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter any  Numbers:");
int a=sc.nextInt();
System.out.println("Enter any  Numbers:");
int b=sc.nextInt();
System.out.println("Enter any  Numbers:");
int c=sc.nextInt();
int Sum=a+b+c;
double Avg=Sum/3.0;
System.out.println("The Sum is: "+Sum+"The Avg is:"+Avg);
}
}