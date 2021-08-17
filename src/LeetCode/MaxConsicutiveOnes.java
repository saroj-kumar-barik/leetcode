package LeetCode;

public class MaxConsicutiveOnes {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,1,1,1,0,1,1,1,1,1,1,1};
        int c= 0,ans = 0;

        for(int x : arr){
            if(x == 1) {
                c++;
                if(ans < c)
                    ans = c;
            }
            else
                c = 0;

        }
        System.out.println(ans);

    }
}
