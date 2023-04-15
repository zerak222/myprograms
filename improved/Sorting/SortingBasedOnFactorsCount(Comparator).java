public class Solution {
    public int[] solve(int[] A) {
        // create Integer array as int array is not supported in Comparator
        Integer arr[] = new Integer[A.length];
        for(int i=0;i<A.length;i++){
            arr[i]=A[i];
        }
        // comparator logic 
        Arrays.sort(arr,new Comparator<Integer>(){
            public int compare(Integer a,Integer b){
                int fa = countFactors(a);
                int fb = countFactors(b);
                if(fa==fb){
                    // a-b returns -ve if a<b , hence a comes before b
                    return (a-b);
                }else{
                    // fa-fb returns -ve if fa<fb, hence fa comes before fb i.e., a comes before b
                    return (fa-fb);
                }
            }
        });

        int ans[] = new int[A.length];
        for(int i=0;i<A.length;i++){
            ans[i]=arr[i];
        }
        return ans;

    }
    /*
        Program for counting factors of an element
        Start from 1 to sqrt(element),
        increase the count by 2 if element is divisible by i ( 1-> sqrt(element)), because for every i we can find element/i in the other half
        special case if i^2 = element only increase the count by 1
    */
    public int countFactors(int element){
        int count = 0;
        for(int i=1;i*i<=element;i++){
            if(element%i==0){
                if(i==(element/i)){
                    count++;
                }else{
                    count=count+2;
                }
            }
        }
        return count;
    }
}
