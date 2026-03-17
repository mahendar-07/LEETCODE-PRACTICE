/*

Given an array of integers nums and an integer target, return indices of the two numbers such that they add up to target.

You may assume that each input would have exactly one solution, and you may not use the same element twice.

You can return the answer in any order.

 
Example 1:

Input: nums = [2,7,11,15], target = 9
Output: [0,1]
Explanation: Because nums[0] + nums[1] == 9, we return [0, 1].
Example 2:

Input: nums = [3,2,4], target = 6
Output: [1,2]
Example 3:

Input: nums = [3,3], target = 6
Output: [0,1]
 

Constraints:

2 <= nums.length <= 104
-109 <= nums[i] <= 109
-109 <= target <= 109
*/
import java.util.*;
public class using_hashMap{
public static void find_target(int[] ar,int n,int t){
int res[]=new int[2];
HashMap<Integer,Integer> map=new HashMap<>();
boolean isset=false;
for(int i=0;i<n;i++){
int tar=t-ar[i];
if(map.containsKey(tar)){
 res[0]=map.get(tar);
 res[1]=i;
 isset=true;
 break;
}
map.put(ar[i],i);

}
if(isset)?System.out.println("["+res[0]+","+res[1]+"]"); :System.out.println("no target");
}
public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.print("enter array size:");
int n=sc.nextInt();
int arr[]=new int[n];
System.out.println("enter array elements:");
for(int i=0;i<n;i++){
arr[i]=sc.nextInt();
}
System.out.print("enter the target: ");
int target=sc.nextInt();
find_target(arr,n,target);
}
}