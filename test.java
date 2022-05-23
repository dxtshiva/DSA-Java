

// import java.util.Scanner;

// public class test {
//     static int facts(int n){
//         int cnt = 0;
//         for(int i=1;i<=n;i++)
//             if(n%i==0)
//                 cnt++;

//         return cnt;
//     }
//     public static void main(String[] args) {
//      Scanner sc = new Scanner(System.in)   ;

//      int start = sc.nextInt();
//      int end = sc.nextInt();
//      int count = 0;
//      for(int i=start;i<=end;i++)
//         if(test.facts(i)==4)
//             count++;

//     System.out.println(count);
     
//     }
// }

// import java.util.*;
// class Main{
//     public static void main(String[] args) {
//         ArrayList arr = new ArrayList<Integer>();
//         Scanner sc= new Scanner(System.in);
//         int n;
//         while(true){
//             n = sc.nextInt();
//             if(n<0)
//                 break;
//             else
//                 arr.add(n);
//         }

//         for(int i = 0;i<arr.size();i++){
//             int sum = (int)arr.get(i);
//             for(int j=i;j<arr.size();j++){
//                 if(Integer.parseInt(arr.get(j).toString())>100)
//                     arr.remove(j);
//                 else 
//                     break;
//                 // }
//             }
//             arr.set(i, sum);
//         }
            
//         for(int i=0;i<arr.size();i++)
//              System.out.println(arr.get(i));

//     }
// }
//3 116 136 61 11 616 216 376 61 6 -1
//Initial Template for Java



// //Initial Template for Java



// import java.io.*;
// import java.util.*;


//  // } Driver Code Ends
// //User function Template for Java



// class Solution
// {
//     String findRollOut(String s,long roll[], int N)
//     {  
//         int shifts[] = new int[N];
        
//         for(int i=0; i<N;i++)
//           shifts[(int)roll[i]-1]++;
          
//         for(int i= N-2 ; i>=0; i--)
//           shifts[i] += shifts[i + 1];
          
//         char ch[] = s.toCharArray();
//         for(int i=0; i<N; i++)
//          {
//              int moves = ch[i] - 'a';
//              moves += shifts[i];
//              ch[i] = (char)((moves%26) + 'a');
//          }
         
//          return new String(ch);
//     }
// }


// // { Driver Code Starts.

// // Driver class
// class Array {

//     // Driver code
//     public static void main(String[] args) throws IOException {
//         // Taking input using buffered reader
//         BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

//         int testcases = Integer.parseInt(br.readLine());
//         // looping through all testcases
//         while (testcases-- > 0) {
//             int n = Integer.parseInt(br.readLine());
//             String s=br.readLine();
//             String line1 = br.readLine();
//             String[] a1 = line1.trim().split("\\s+");
//             long a[] = new long[n];
//             for (int i = 0; i < n; i++) {
//                 a[i] = Long.parseLong(a1[i]);
//             }
//             Solution ob = new Solution();
//             String ans=ob.findRollOut(s,a,n);
//             System.out.println(ans);
//         }
//     }
// }



  // } Driver Code Ends

// import java.util.*;
// class HelloWorld {
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String s  = sc.next();
//         String p = "";
//         for(int i = 0;i<s.length();i++){
//             int x = s.charAt(i);
//             if(x>=65 && x<=90){
//                 int t = x+2;
//                 if(t>90)
//                     p+= (char)(64+(t-90));
//                 else
//                     p+= (char)(t);
              
//             }
//         }
//         System.out.print(p);
//     }
// }

// class Cl{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         long n = sc.nextLong();
//         String s = ""+ Long.toBinaryString(n);
//         String s2 ="";
//         for(int i = 32-s.length()-1;i>=0;i--)
//         s2+=0;
//         s2+=s;
//         String rev = "";
//         for(int i = 31;i>=0;i--)
//          rev+=s2.charAt(i);
//         long fin = 0;
//         for(int i =31,j=0;i>=0;i--,j++)  
//         {
//             long num = Long.parseLong(""+rev.charAt(j));
            
//             long num1 = (long)Math.pow(2, i)*num;
            
//             fin = fin + num1;
//         }
//         System.out.println(fin);
//     }
// }
// import java.util.Scanner;
// class Main{
//     void isValid(int a[],int b[],int c[],int n){
//         for(int i=0;i<n;i++)
//             if((a[i]+b[i])>c[i] && ((b[i]+c[i])>a[i]) && ((c[i]+a[i])>b[i]))
//                 System.out.println("Yes");
//             else 
//                 System.out.println("No");
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int a[] = new int[n],b[] = new int[n],c[]=new int[n];
//         for(int i=0;i<n;i++)
//             a[i]= sc.nextInt();
//         for(int i=0;i<n;i++)
//             b[i]= sc.nextInt();
//         for(int i=0;i<n;i++)
//             c[i]= sc.nextInt();

//         new Main().isValid(a, b, c, n);
//     }
// }

// import java.util.Scanner;
// class Main{
//     int magicstick(int input1,int input2[],int input3[]){
//         int arr[] = new int[input1];
//         for(int i = 0;i<input1;i++){
//             int ans = 0;
//             for(int j = 0;j<input1;j++){
//                 if(input2[j]>=input2[i])
//                 ans+=(input2[j]-input2[i])*input3[j];
//                 else
//                 ans+=(input2[i]-input2[j])*input3[j];
//                 // System.out.println(ans);
//             }
//             arr[i] = ans;
            
//         }

//         Arrays.sort(arr);
//         return arr[0];
//     }

//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int input1 = sc.nextInt();
//         int input2[] = new int[input1];
//         for(int i=0;i<input1;i++)
//         input2[i] = sc.nextInt();
//         int input3[] = new int[input1];
//         for(int i=0;i<input1;i++)
//         input3[i] = sc.nextInt();
//         System.out.print(new Main().magicstick(input1, input2, input3));

//     }
// }

// import java.util.*;
 
// class RomanToNumber {
//     // This function returns
//     // value of a Roman symbol
//     int value(char r)
//     {
//         if (r == 'I')
//             return 1;
//         if (r == 'V')
//             return 5;
//         if (r == 'X')
//             return 10;
//         if (r == 'L')
//             return 50;
//         if (r == 'C')
//             return 100;
//         if (r == 'D')
//             return 500;
//         if (r == 'M')
//             return 1000;
//         return -1;
//     }
 
//     // Finds decimal value of a
//     // given roman numeral
//     int romanToDecimal(String str)
//     {
//         // Initialize result
//         int res = 0;
 
//         for (int i = 0; i < str.length(); i++) {
//             // Getting value of symbol s[i]
//             int s1 = value(str.charAt(i));
 
//             // Getting value of symbol s[i+1]
//             if (i + 1 < str.length()) {
//                 int s2 = value(str.charAt(i + 1));
 
//                 // Comparing both values
//                 if (s1 >= s2) {
//                     // Value of current symbol
//                     // is greater or equalto
//                     // the next symbol
//                     res = res + s1;
//                 }
//                 else {
//                     // Value of current symbol is
//                     // less than the next symbol
//                     res = res + s2 - s1;
//                     i++;
//                 }
//             }
//             else {
//                 res = res + s1;
//             }
//         }
 
//         return res;
//     }
 
//     // Driver Code
//     public static void main(String args[])
//     {
//         RomanToNumber ob = new RomanToNumber();
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         // Considering inputs given are valid
//         String names[] = new String[n];
//         String numerals[] = new String[n];
//           for(int i=0;i<n;i++){
//             names[i] = sc.next();
//             numerals[i] = sc.next()
//         }
      
//     }
// }

// import java.util.*;
// class Main{
//     static int maxSum(int input1,int input2[]){
//         int sum =0;
//         sum+=input2[0];
//         for(int i=1;i<input1;i++)
//         {
//             if(input2[i]<input2[i-1]){
//                 input2[i]=input2[i-1]+1;
                
//             }
//             sum+=input2[i];
//         }
//         return sum;
//     }
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for(int i=0;i<n;i++)
//             arr[i]=sc.nextInt();
//         System.out.println(maxSum(n, arr));
//         sc.close();
//     }
// }



// import java.util.*;
// class Main1256{
// public static void main(String arg[])
// {
//     int n=6;
//     int r=1;
// for(int i=1;i<=n;i++)
// {
//  r=r*i;
// }
// System.out.print(r);
// }
// }
// import java.util.*;
// class test{
//     public static void main(String ar[])
//     {
//     int n=12;
//     int s=0,r=0;
//     for(int i=0; i<=n; i++)
// {
//     if(i%2==0)
//     {
//         r=r+i;
//     }
//     else{
//         s=s+i;
//     }
// }
// System.out.println(r + " " + s);
//     }
// }

// class test{
//     public static void main(String ar[])
//     {
//         int n=20, a=0, b=0;
//         for( ;n>0; n--)
//         {
//             if(n%2==0)
//             {
//                 a+=n;
//             }
//             else
//                 b+=n;
//         }
//         System.out.print(a+ " "+b);

//     }
// }

// class test
// {
//     public static void main(String ar[])
//     {
//         int n=20, a=0, b=0;
//         System.out.print("Sum of all even numbers from 0 to "+n+" is ");
//         while(n>0)
//         {
//             if(n%2==0)
//               a+=n;
//             else
//               b+=n;
//             n--;
//         }
//         System.out.print(a+ " and odd is "+b+".");
//     }
// }
// import java.util.*;
// class Main33445{
//   static ArrayList<Integer> factorize(long number){
   
//     ArrayList<Integer> li = new ArrayList<>();
//     for(int i = (int)number-1; i>1; i--) {
//       while(number%i == 0) {
//          li.add(i);
//          number = number/i;
//       }
      
//    }
//    System.out.println(li);
//     return li;
//   }
//   static int fun(int N, List<Integer> arr){
//     long num = 1;
//     for(int x:arr)
//     num*= x;
 
//     ArrayList<Integer> li = factorize(num);
//     System.out.println(li);
//     HashMap<Integer,Integer> map = new HashMap<>();
//     for(int x:li)
//     if(map.containsKey(x))
//     map.replace(x,map.get(x)+1);
//     int ans =1;
//     for(Map.Entry maps : map.entrySet()){
//       int key = (int)maps.getKey();
//       int val = (int)maps.getValue();
//       ans = ans*(int)(Math.pow(key, val+1)/key-1);
//     }
  
//   return ans;
// }
// public static void main(String[] args) {
//   List<Integer> li = new ArrayList<>();
//   li.add(5);
//   li.add(7);
//   li.add(3);
//   li.add(8);

//   System.out.println(fun(4, li));
// }
// }

// class main123
// {
//   //void display(){System.out.println("Class method");}
// }
// interface inter{
//    static void display(){System.out.println("Interface method");}
// }
// class trial extends main123 implements inter {
//   public static void main(String[] args) {
//     trial.display();
//     //new trial().display();
//   }
// }