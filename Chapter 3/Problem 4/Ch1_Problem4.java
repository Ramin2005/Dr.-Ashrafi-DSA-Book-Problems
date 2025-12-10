

public class Ch1_Problem4 {
    
    public BigNumber fac(int n){
        BigNumber result = new BigNumber("1");
        for(int i = 2; i <= n; i++){
            result = BigNumber.multiply(result, new BigNumber(Integer.toString(i)));
        }
        return result;
    }
    
}
