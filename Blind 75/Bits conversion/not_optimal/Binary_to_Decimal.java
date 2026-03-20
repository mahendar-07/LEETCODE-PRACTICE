/*
converting the binary number to decimal
it is also not optimal solution the input for int is upto 512 decimal digit only 
but if
enter the binary number:10000000000
error
Exception in thread "main" java.util.InputMismatchException: For input string: "10000000000"
        at java.base/java.util.Scanner.nextInt(Scanner.java:2303)
        at java.base/java.util.Scanner.nextInt(Scanner.java:2251)
        at Binary_to_Decimal.main(Binary_to_Decimal.java:27)
*/
import java.util.*;
class Binary_to_Decimal{
public static void bintodeci(int n){
int res=0;
int rem=0;
int count=0;
int temp=n;
int c2=0;
while(temp>0){
temp=temp/10;
c2++;
}
while(n>0){
rem=n%10;
res=res+rem*(int)Math.pow(2,count);
n=n/10;
count++;
}
System.out.println(res);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the binary number:");
int bin=sc.nextInt();
/*String bin;
String input;
do{
 input=sc.next();

}while(input==0 && input==1);
*/
bintodeci(bin);

}
}