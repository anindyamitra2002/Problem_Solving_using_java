public class validParenthesis {
    public static void main(String[] args) {
        String par = "{({}([]";
        int a=0, b=0, c=0, i;
        for(i=0; i<par.length(); i++) {
            if (par.charAt(i) == '(') {
                a++;
            } else if (par.charAt(i) == ')') {
                a--;
            } else if (par.charAt(i) == '{') {
                b++;
            } else if (par.charAt(i) == '}') {
                b--;
            } else if (par.charAt(i) == '[') {
                c++;
            } else if (par.charAt(i) == ']') {
                c--;
            }
        }
        if(a == 0 && b ==0 && c ==0){
            System.out.print("This parenthesis are Valid.");
        }
        else{
            System.out.print("This parenthesis are Not Valid!");
        }
    }
}
