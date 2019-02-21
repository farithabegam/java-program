import java.util.Scanner;
class Palindrome{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int temp=N;
int rev=0;
while(temp!=0){
rev=rev*10+temp%10;
temp=temp/10;
}
System.out.println(N+" "+rev);

if(rev==N)
System.out.println("palindrome");
else
System.out.println("not palindrome");
}
}
