// public class practicestring {
    
//     public static void main(String[] args) {
//         String str="hello";
//         String str1="heiiiiii";
//         if(str.length()==str1.length()){
//         for(int i=0; i<str.length();i++){
//             if(str.charAt(i)==str1.charAt(i)){
//                 System.out.println("the character is matched");
//             }
//             else{
//                 System.out.println("the char is not matched");
//             }
        
       
//            }
   
//          }else{
//             System.out.println("the length is not matched");
//          }

//         }
//     }
// public class practicestring {
    
//         public static void main(String[] args){
//           String str="racecar";
//           char targate='r';
//           int total=0;
//           for(int i=0;i<str.length();i++){
//             if(str.charAt(i)==targate){
//                 total++;
//             }
//           }
//         System.out.println(total);
//     }
// }
 // question->2

 public class practicestring{
   public static void main(String[] args) {
      String str="helloo";
      char[] ch =str.toCharArray();
      for(int i=0;i<ch.length;i++){
         for(int j=i+1;j<ch.length;j++){
            if(ch[i]==ch[j]){
               System.out.println(ch[i]);//i ka place me j rakh do then it prints after the value of it
               return;
            }

         }
      }
   }
 }

 // Question->3

