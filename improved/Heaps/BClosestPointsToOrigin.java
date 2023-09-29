import java.util.Arrays;
import java.util.Comparator;
import java.util.PriorityQueue;

/*
 * Problem Description
 * We have a list A of points (x, y) on the plane. Find the B closest points to
 * the origin (0, 0).
 *
 * Here, the distance between two points on a plane is the Euclidean distance.
 *
 * You may return the answer in any order. The answer is guaranteed to be unique
 * (except for the order that it is in.)
 *
 * NOTE: Euclidean distance between two points P1(x1, y1) and P2(x2, y2) is
 * sqrt( (x1-x2)2 + (y1-y2)2 ).
 *
 *
 *
 * Problem Constraints
 * 1 <= B <= length of the list A <= 105
 * -105 <= A[i][0] <= 105
 * -105 <= A[i][1] <= 105
 *
 *
 *
 * Input Format
 * The argument given is list A and an integer B.
 *
 *
 *
 * Output Format
 * Return the B closest points to the origin (0, 0) in any order.
 *
 *
 *
 * Example Input
 * Input 1:
 *
 * A = [
 * [1, 3],
 * [-2, 2]
 * ]
 * B = 1
 * Input 2:
 *
 * A = [
 * [1, -1],
 * [2, -1]
 * ]
 * B = 1
 *
 *
 * Example Output
 * Output 1:
 *
 * [ [-2, 2] ]
 * Output 2:
 *
 * [ [1, -1] ]
 *
 *
 * Example Explanation
 * Explanation 1:
 *
 * The Euclidean distance will be sqrt(10) for point [1,3] and sqrt(8) for point
 * [-2,2].
 * So one closest point will be [-2,2].
 * Explanation 2:
 *
 * The Euclidean distance will be sqrt(2) for point [1,-1] and sqrt(5) for point
 * [2,-1].
 * So one closest point will be [1,-1].
 */

public class BClosestPointsToOrigin {
  static class Pair {
    int x;
    int y;
    int d;

    Pair(int x, int y) {
      this.x = x;
      this.y = y;
      this.d = this.x * this.x + this.y * this.y;
    }
  }

  public static void main(String args[]) {
    int A[][] = {
        { 1, 3 },
        { -2, 2 }
    };
    int B = 1;
    solve(A, B);
  }

  private static void solve(int[][] a, int b) {
    PriorityQueue<Pair> pq = new PriorityQueue<>(new Comparator<Pair>() {
      @Override
      public int compare(Pair p1, Pair p2) {
        return p1.d - p2.d;
      }
    });
    for (int i = 0; i < a.length; i++) {
      pq.add(new Pair(a[i][0], a[i][1]));
    }
    int ans[][] = new int[b][2];
    for (int i = 0; i < b; i++) {
      Pair p = pq.remove();
      ans[i][0] = p.x;
      ans[i][1] = p.y;
    }

    for (int i = 0; i < ans.length; i++) {
      System.out.println(Arrays.toString(ans[i]));
    }
  }
}
