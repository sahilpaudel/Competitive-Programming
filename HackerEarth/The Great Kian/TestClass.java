
import java.io.BufferedReader;
import java.io.InputStreamReader;


class TestClass {
	
	static void sum(int arr[],int N,int i) {
		int sum = 0;
		if((i+3)<=N){
			while(i < N) {
				sum += arr[i];
				i+=3;
			}
			System.out.println(sum);
		}
	}
	
    public static void main(String args[] ) throws Exception {
        
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String line = br.readLine();
        int N = Integer.parseInt(line);
        String line2 = br.readLine();
		String arr[] = line2.split(" ");
		int a[] = new int[N];
        for (int i = 1; i <= N; i++) {
             a[i] = Integer.parseInt(arr[i]);
        }
        
        for(int i=1; i<= N; i++)
			sum(a,N,i);
    }
}
