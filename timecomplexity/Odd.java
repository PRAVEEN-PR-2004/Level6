// import java.util.*;


// public class Odd{
//     public static void main(String[] args) {
//         Scanner sc = new Scanner(System.in);
//         String str1 = sc.nextLine();
//         String str2 = sc.nextLine();
//         String off = str1.substring(0,str1.length()/2);
//         System.out.println(off);
        
//         if (str2.isEmpty()) {
//             // Split str1 into two halves
//             String splits = str1.replace(" ...snip... ", "}-{");
//             String[] splitarr = splits.split("-");
//             // Remove brackets and spaces
//             String hstr1 = splitarr[0];
//             String hstr2 = splitarr[1];
//             String substr1 = hstr1.substring(1, hstr1.length() - 1);
//             String substr2 = hstr2.substring(1, hstr2.length() - 1);
//             // Split the substrings into arrays
//             String[] arr1 = substr1.split(", ");
//             String[] arr2 = substr2.split(", ");
//             // Convert to integer arrays
//             int[] array1 = new int[arr1.length];
//             int[] array2 = new int[arr2.length];
//             for (int i = 0; i < arr1.length; i++) {
//                 array1[i] = Integer.parseInt(arr1[i]);
//                 array2[i] = Integer.parseInt(arr2[i]);
//             }
            
//             // Count odd numbers in both arrays
//             int count1 = 0, count2 = 0;
//             for (int i = 0; i < array1.length; i++) {
//                 if (array1[i] % 2 != 0) {
//                     count1++;
//                 }
//                 if (array2[i] % 2 != 0) {
//                     count2++;
//                 }
//             }
//             System.out.print(count1 * count2);
//         } else 
//         {
//             // Remove brackets and spaces
//             String substr1 = str1.substring(1, str1.length() - 1);
//             String substr2 = str2.substring(1, str2.length() - 1);
//             // Split the substrings into arrays
//             String[] arr1 = substr1.split(", ");
//             String[] arr2 = substr2.split(", ");
//             // Convert to integer arrays
//             int[] array1 = new int[arr1.length];
//             int[] array2 = new int[arr2.length];
//             for (int i = 0; i < arr1.length; i++) {
//                 array1[i] = Integer.parseInt(arr1[i]);
//                 array2[i] = Integer.parseInt(arr2[i]);
//             }
            
//             // Count odd numbers in both arrays
//             int count1 = 0, count2 = 0;
//             for (int i = 0; i < array1.length; i++) {
//                 if (array1[i] % 2 != 0) {
//                     count1++;
//                 }
//                 if (array2[i] % 2 != 0) {
//                     count2++;
//                 }
//             }
//             // Ensure count2 is at least 1 to avoid multiplication by 0
//             if (count2 == 0) count2 = 1;
//             System.out.print(count1 * count2);
//         }
        
//         //sc.close();
//     }
// }
