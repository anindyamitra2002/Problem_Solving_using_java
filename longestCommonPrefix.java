public class longestCommonPrefix {
    public static void main(String[] args) {
        StringBuilder prefix = new StringBuilder();
        int i;
        boolean run = true;
        String[] words = {"flower", "flew", "flight"};
        int size = words[0].length();
        for(i=0; i< words.length; i++){
            if(words[i].length() < size){
                size = words[i].length();
            }
        }
        System.out.println(size);
        i = 0;
        while(i < size) {
            char c1 = words[0].charAt(i);
            char c2 = words[1].charAt(i);
            char c3 = words[2].charAt(i);
            if (c1 == c2 && c2 == c3) {
                prefix.append(c1);
                i++;
            }
            else{
                break;
            }
        }
        System.out.print("Longest Prefix is: " + prefix);
    }
}
