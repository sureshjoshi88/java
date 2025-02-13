
//         System.out.print("jai shree ram");
//     }
// }

// public class index {
//     public static void main(String args[]){
//         // System.out.println("jai bajrang bali");


//         // int a = 20;
//         // double b = a;
//         // System.out.println(b);

//         char myname = "A";
//         // int chanegname = myname;
//         System.out.println(myname);
//     }

    
// }
//         // Scanner sc = new Scanner(System.in);
//         // System.out.println("enter a name");
//         // String name = sc.next();
//         // System.out.println("name = " + name);

//         // int a = 10;
//         // int b = ++a;
//         // System.out.println(a);
//         // System.out.println(b);

//         int a = 10; 
//         int b = a++;
//         System.out.println(a);
//         System.out.println(b);
//     }
// }



// public class start {
//     public static void main(String[] args) {
//         System.err.print("jai shree ram");

//         int  a = 10;
//         int b = 20;
//         int sum = a+b;
//         System.err.println(sum);

//         String name = "suresh";
//         System.out.println(name);

//         Scanner sc = new Scanner(System.in);
//         int a = sc.nextInt();
//         System.out.print(a);
//     }
    
// }



// import java.util.*;

// public class intro{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age>=18){
//             System.out.println("eleigble");
//         }else{
//             System.out.println("not eleigible");
//         }
//     }
// }


// import java.util.*;

// public class intro{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         int age = sc.nextInt();
//         if(age%4==0 && age%100!=0 || age%400==0){
//             System.out.println("leep year");
//         }else{
//             System.out.println("no leep year");
//         }
//     }
// }

// public class intro {
//     public static void main(String[] args) {
//     Scanner sc  = new Scanner(System.in);
//     int number = sc.nextInt();
//     for(int a = 2;a<=number;a++){
//         if(number%a==0){
//             String value = "prime";
//             System.out.println(value);
//         }else{
//             String valus = "not prime number";
//             System.out.println(valus);
//         }
//     }
// }
// }




// public class intro {
//     public static void main(String[] args) {
//         for (int i = 0; i < 5; i++) {
//             System.out.println("Hello");
//             i += 2;
//         }
//     }
// }

// public class intro {

//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         if(number>=0){
//             System.out.println("the number is postive");
//         }
//         else{
//             System.out.println("the number is negative");
//         }
//     }
// }



// public class intro {

//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         for(int i = 1;i<=10;i++){
//             System.out.println(number*i);
//         }
//     }
// }

// import java.util.Scanner;
// public class intro {

//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         int factroil = 1;
//         for(int i  = 1;i<=number;i++){
//             factroil = factroil*i;
//         }
//         System.out.println(factroil);
//     }
// }


// public class intro {

//     public static void main(String[] args) {
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();
//         switch (number) {
//             case 1:
//                 System.out.println("Monday"); 
//                 break;
//             case 2:
//                 System.out.println("tuesday"); 
//                 break;
//             case 3:
//                 System.out.println("wednesday"); 
//                 break;
//             case 4:
//                 System.out.println("thursday"); 
//                 break;
//             case 5:
//                 System.out.println("Friday"); 
//                 break;
//             case 6:
//                 System.out.println("Saturday"); 
//                 break;
//             case 7:
//                 System.out.println("Sunday"); 
//                 break;
//             default:
//                 throw new AssertionError();
//         }
//     }
// }

// import java.util.*;
// public class intro {
//     public static void main(String[] args) {
//         int evenSum = 0;
//         int oddSum =0;
//         System.out.println("enter a number");
//         Scanner sc = new Scanner(System.in);
//         int number = sc.nextInt();

//         for(int i =0; i <=number; i++){
//         if(i%2==0){
//             evenSum += i;
//         }else if(i%2!=0){
//             oddSum +=i;
//         }
//     }
//     System.out.println(evenSum+" the even sum");
//     System.out.println(oddSum+" the odd sum");
//     }
// }



// public class intro {

//     public static void main(String[] args) {
//       int number = 10996;
//       int reversed = 0;
//       while (number != 0) {
//           int num  = number%10;
//         reversed = reversed*10+num;
//         number/=10;

//       }
//       System.out.println("reverseed number "+reversed);
//     }
// }

// public class intro {

//     public static void main(String[] args) {
//        int n =4;
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//     }   
// }



// public class intro {

//     public static void main(String[] args) {
//        int n =4;
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=n;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//     }   
// }



// public class intro {

//     public static void main(String[] args) {
//        int n =4;
//        for(int i = n;i>=1;i--){
//         for(int j = 1;j<=i;j++){
//             System.out.print("*");
//         }
//         System.out.println();
//        }
//     }   
// }




// public class intro {

//     public static void main(String[] args) {
//        int n =4;
//        for(int i = 1;i<=n;i++){
//             for(int j = 1;j<=n-i;j++){
//                 System.out.print(" ");
//             }
//             for(int j = 1;j<=i;j++){
//                 System.out.print("*");
//             }
//         System.out.println();
//        }
//     }   
// }


// public class intro {

//     public static void main(String[] args) {
//        int n =5;
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=i;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//        }
//     }   
// }






// public class intro {
//     public static void main(String[] args) {
//        int n =5;
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=n-i+1;j++){
//             System.out.print(j+" ");
//         }
//         System.out.println();
//        }
//     }   
// }



// public class intro {

//     public static void main(String[] args) {
//        int n =5;
//        int number = 1;
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=i;j++){
//             System.out.print(number+" ");
//             number++;
//         }
//         System.out.println();
//        }
//     }   
// }



// public class intro {

//     public static void main(String[] args) {
//        int n =5;
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=i;j++){
//             int sum = i+j;
//           if(sum%2==0){
//             System.out.print("1");
//           }else{
//             System.out.print("0");
//           }
//         }
//         System.out.println();
//        }
//     }   
// }


// public class intro {

//     public static void main(String[] args) {
//        int n = 4;
//       char str = 'A';
//        for(int i = 1;i<=n;i++){
//         for(int j = 1;j<=i;j++){
//             System.out.print(str+" ");
//             str++;
//         }
//         System.out.println();
//        }
//     }   
// }



