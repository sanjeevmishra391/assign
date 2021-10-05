public class windowsliding {
    public static void main(String[] args) {
        int a[]={1,4,2,10,23,3,1,0,20};
        int k=4,sum1=0;
        for(int i=0;i<k;i++){
            sum1=sum1+a[i];
        }
        System.out.println(sum1);
        
        int window_sum;
        window_sum=sum1;
        int max=window_sum;
        for(int j=1;j<=a.length-k;j++){
            window_sum =window_sum+a[j+k-1]-a[j-1];
                if(window_sum>max){
                    max=window_sum;
                }
        }
        System.out.println("Maximum is "+max);
    }
}
