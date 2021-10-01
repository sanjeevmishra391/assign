import java.util.*;
class code{
    void countingsort(int[] array){
        int n= array.length;
        int[] count= new int[10];
        Arrays.fill(count,0);
        int[] sorted=new int[n];
        for(int i=0;i<n;i++)
        {
            ++count[array[i]];
        }
        for(int i=1;i<n;i++)
        {
            count[i]=count[i]+count[i-1];
        }
        for(int i=n-1;i>=0;i--)
        {   --count[array[i]];
            sorted[count[array[i]]]=array[i];
            
        }
        for(int i=0;i<n;i++)
        {
            array[i]=sorted[i];
        }
        for(int i=0;i<n;i++)
        {
            System.out.print(sorted[i]+"\t");
        
        }
        System.out.println("\n");
    }
    
}
public class counting_sort{
    public static void main(String[] args) {
       try {code ob=new code();
        Scanner sc =new Scanner(System.in);
        System.out.println("define size");
        int n=sc.nextInt();
        int[] array =new int[n];
        System.out.println("enter elements");
        for(int i=0;i<n;i++){
            array[i]=sc.nextInt();
        }
        ob.countingsort(array);
        for(int i=0;i<n;i++)
        {
            System.out.print(array[i]+"\t");
        }
        sc.close();
    }catch(Exception e){};
}
}
