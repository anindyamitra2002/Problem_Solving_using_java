import java.lang.Math;
public class threeSumClosest {
    public static void main(String[] args) {
        int [] a= {-1,2,1,-4};
        int [][]c = new int [5][5];
        int i, j, k, size, target, cls_ness, cls=999, min_sum = 0, sum;
        size = 4;
        target = 1;

        for(i=0; i<size-2; i++){
            for(j=i+1; j<size-1; j++){
                for(k=j+1; k<size; k++){
                    sum = a[i]+a[j]+a[k];
                    cls_ness = target - sum;

                    if(Math.abs(cls_ness) < cls){
                        cls = Math.abs(cls_ness);
                        min_sum = sum;
                    }
                }
            }
        }
        System.out.format("Closest sum = %d",min_sum);
    }
}
