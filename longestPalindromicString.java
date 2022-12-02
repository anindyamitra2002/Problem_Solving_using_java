public class longestPalindromicString {
    static String reverseString(String str){

        char [] reverse = new char[str.length()];
        int i,k = str.length()-1;
        for(i=0;i<str.length(); i++){
            reverse[i] = str.charAt(k);
            k--;
        }
        return new String(reverse);
    }
    public static void main(String[] args) {
        String mystr = "ABCDCBAK";
        int i,j,k;
       for(i=0; i<mystr.length()/2; i++){

           if(mystr.charAt(i) == mystr.charAt(i+2)){
               j= i-1;
               k= i+3;
               while(mystr.substring(j,i+1).equals(reverseString(mystr.substring(i+2,k+1)))){
                   System.out.print(mystr.substring(j,k+1));
                   j--;
                   k++;
               }
               break;
           }
       }

    }
}
