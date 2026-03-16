//product of array except self
/*
Given an integer array nums, return an array answer such that answer[i] is equal to the product of all the elements of nums except nums[i].

The product of any prefix or suffix of nums is guaranteed to fit in a 32-bit integer.

You must write an algorithm that runs in O(n) time and without using the division operation.

 

Example 1:

Input: nums = [1,2,3,4]
Output: [24,12,8,6]
Example 2:

Input: nums = [-1,1,0,-3,3]
Output: [0,0,9,0,0]
 

Constraints:

2 <= nums.length <= 105
-30 <= nums[i] <= 30
The input is generated such that answer[i] is guaranteed to fit in a 32-bit integer.

*/

import java.util.*;
public class Prdofarrayexcetself{
public static void prdofarr(int nums[]){
int m=nums.length;
int res[]=new int[m];
/*
using bruteforce method
it it takes more time and exceeds the time so we need the o(n) not O(n^2)
for(int i=0;i<m;i++){
int var=1;
for(int j=0;j<m;j++){
if(i!=j){
var*=nums[j];
}
}
res[i]=var;
}
for(int i=0;i<m;i++){
System.out.print(res[i]+ " ");
}
*/
//trying with the O(n)
//c alculating the leftproducts
int left[]=new int[m];
left[0]=1;
for(int i=1;i<m;i++){
//using the leftproduct using prefix
left[i]=left[i-1]*nums[i-1]; 
}
int rightprd=1;
for(int i=m-1;i>=0;i--){
res[i]=left[i]*rightprd;
rightprd*=nums[i];
}
System.out.println("the resultant prdoucts except itself is :");
for(int i=0;i<m;i++){
System.out.print(res[i]+" ");
} 
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter the array size:");
int n=sc.nextInt();
int nums[]=new int[n];
System.out.print("enter array elements:");
for(int i=0;i<n;i++){
nums[i]=sc.nextInt();
}
//
for(int i=0;i<n;i++){
System.out.print(nums[i]+" ");
}
prdofarr(nums);
sc.close();
}

}