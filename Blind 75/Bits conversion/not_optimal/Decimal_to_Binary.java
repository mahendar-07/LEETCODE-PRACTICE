//this code only works for the small numbers for larger number it can't represent 
/*
if enter n=1024
the output is 2147483647 ,
the code fails...

*/
import java.util.*;
class Decimal_to_Binary{
public static void DecitoBin(int n){
int rem=1;
int res=0;
int count=0;
while(n>0){
rem=n%2;
res=res+rem*(int)Math.pow(10,count);
n=n/2;
count++;
}
System.out.println(res);
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("Enter number:");
int decimal=sc.nextInt();
DecitoBin(decimal);
}
}