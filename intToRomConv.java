public class intToRomConv {
    public static void conv(int num){
        int n, i;
        while(num > 0){
            if (num >= 1000) {
                n = num / 1000;
                for (i = 0; i < n; i++) {
                    System.out.print("M");
                }
                num = num % 1000;

            } else if (num >= 500) {

                if(num>=900){
                    System.out.print("CM");
                    num = num - 900;
                }
                else {
                    n = num / 500;
                    for (i = 0; i < n; i++) {
                        System.out.print("D");
                    }
                    num = num % 500;
                }
            } else if (num >= 100) {

                if(num>=400){
                    System.out.print("CD");
                    num = num - 400;
                }
                else {
                    n = num / 100;
                    for (i = 0; i < n; i++) {
                        System.out.print("C");
                    }
                    num = num % 100;
                }
            } else if (num >= 50) {

                if(num>=90){
                    System.out.print("XC");
                    num = num - 90;
                }
                else {
                    n = num / 50;
                    for (i = 0; i < n; i++) {
                        System.out.print("L");
                    }
                    num = num % 50;
                }
            } else if (num >= 10) {

                if(num>=40){
                    System.out.print("XL");
                    num = num - 40;
                }
                else {
                    n = num / 10;
                    for (i = 0; i < n; i++) {
                        System.out.print("X");
                    }
                    num = num % 10;
                }
            } else if (num >= 5) {

                if(num>=9){
                    System.out.print("IX");
                    num = num - 9;
                }
                else {
                    n = num / 5;
                    for (i = 0; i < n; i++) {
                        System.out.print("V");
                    }
                    num = num % 5;
                }
            } else if (num >= 1) {

                if(num>=4){
                    System.out.print("IV");
                }
                else {
                    n = num;
                    for (i = 0; i < n; i++) {
                        System.out.print("I");
                    }
                }
                break;
            }
        }
    }
    public static void main(String[] args) {
    int a = 94;
    conv(a);
    }
}
