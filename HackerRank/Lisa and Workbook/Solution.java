import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class Solution {

    public static void main(String[] args) {
        int p=0,ans=0;
        int page = 1;
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int k = in.nextInt();
        
        for(int i=1; i<=n; i++) {
            p = in.nextInt();
            for(int j=1; j<=p; j++) {
                if(page == j)
                    ans++;
                if(j % k == 0)
                    page++;
            }
            if(p % k != 0){
                page++;
            }
        }
        System.out.println(ans);
    }
}