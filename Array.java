import java.util.Scanner;
class Array{
public static void main(String[] qwe){
Scanner scan=new Scanner(System.in);
int N=scan.nextInt();
int K=scan.nextInt();
int[] arr=new int[N];
int sum=0;
for(int i=0;i<N;i++){
int temp=scan.nextInt();
arr[i]=temp;
}
System.out.println("output");
for(int k=0;k<N;k++)
System.out.println(arr[k]);
}
}
