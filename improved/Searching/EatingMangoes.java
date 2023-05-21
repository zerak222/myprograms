
public int solve(int A[],int B){
    int n = A.length;
	int low =1;
	int high = getMax(A);
	int ans=1;
	while(low<=high){
			int mid = (low+high)/2;
			if(isPossible(A,mid,B)){
				high = mid-1;
				ans=mid;
			}else{
				low = mid+1;
			}
	}
	return ans;
}

public int getMax(int A[]){
	int max = A[0];
	for(int i=1;i<A.length;i++){
		max = Math.max(A[i],max);
	}
    return max;
}

public boolean isPossible(int A[],int speed, int B){
		int totalTime = 0;
		for(int i=0;i<A.length;i++){
				int time = (int)Math.ceil(A[i]*1.0/speed);
				totalTime = totalTime+A[i];
				if(totalTime>B){
						return  false;
				}
		}
        return true;
}