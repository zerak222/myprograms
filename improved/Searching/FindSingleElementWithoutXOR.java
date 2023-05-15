public class Solution {
   public int solve(int[] A) {
    int n = A.length;
    if (n == 1) {
        return A[0];
    }
    if (A[0] != A[1]) {
        return A[0];
    }
    if (A[n-1] != A[n-2]) {
        return A[n-1];
    }
    int low = 1;
    int high = n-1;
    while (low <=high) {
        int mid = (high+ low) / 2;
        int curr = A[mid];
        int prev = A[mid-1];
        int next = A[mid+1];
        int svi = mid;
        if (curr != prev && curr != next) {
            return curr;
        } else if (curr == prev) {
            svi = mid-1;
        } else if (curr == next) {
            svi = mid;
        }
        if (svi % 2 == 0) {
            low = mid+1; // single value element lies in right region of array
        } else {
            high = mid-1; // single value element lies in left region of array
        }
    }
    return -1;
}


}
