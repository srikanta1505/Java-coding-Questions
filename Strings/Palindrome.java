public class Palindrome {

    public static boolean isPalindrome(String str,int i){

         if(str.length()<=1)
         return true;
        if(i<str.length()/2)
        {
           if (str.charAt(i)!=str.charAt(str.length()-(i+1)))
            return false;
         return  isPalindrome(str, i+1);    
        }
        
    
       return true;
        
    }

   
    public static void main(String[] args) {
        String str= "cuttac";
        int i=0;
         boolean result =isPalindrome(str,i);
         if (result)
            System.out.println("it is palindrome");
        else 
            System.out.println("It is not palindrome");

    }
}
