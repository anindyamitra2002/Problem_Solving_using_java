public class threeSumTriplets {
    public static void main(String[] args) {
        int []a = {3,-1,2,1,0,-1,-3,4};
        int [][] c = new int[10][10];
        int i, j, k, size, t=0;
        size = a.length;

        for(i=0; i<size-2; i++){
            for(j=i+1; j<size-1; j++){
                for(k=j+1; k<size; k++){
                    if(a[i]+a[j]+a[k] == 0){
                        c[t][0]= a[i];
                        c[t][1]= a[j];
                        c[t][2]= a[k];
                        t++;
                    }
                }
            }
        }

        for(i=0;i<t; i++){
            for(j=0;j<3;j++){
                System.out.format("%d, ",c[i][j]);
            }
            System.out.format("\n");
        }
    }
}
