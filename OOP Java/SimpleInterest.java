import java.util.Scanner;
class SimpleInterest{ 
public static void main(String[]args){
Scanner sc=new Scanner(System.in);
System.out.println("Enter the Principal:");
int P=sc.nextInt();
System.out.println("Enter the Time:");
int T=sc.nextInt();
System.out.println("Enter the Rate:");
int R=sc.nextInt();
int SP=P*T*R/100;
System.out.println("The Simple Interest :"+SP);
}
}