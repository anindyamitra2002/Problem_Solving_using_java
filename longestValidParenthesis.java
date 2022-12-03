public class longestValidParenthesis {
    static int [] arr = new int [10];
    static int t=0;
    public static void push(int a){
    arr[t] = a;
    t++;
    }
    public static int pop(){
        if (t>0) {
            t--;
            return arr[t];
        }
        else{
            return -1;
        }
    }
    public static void main(String[] args) {
        String par = ")(())()";
        int i, point=0, v;
        for(i=0; i< par.length(); i++) {
            if (par.charAt(i) == '(') {
                push(1);
            } else if (par.charAt(i) == ')') {
                v = pop();
                v--;
                System.out.println(v);
                if (v == 0) {
                    point++;
                }
            }
        }
        System.out.println(point);
    }
}
