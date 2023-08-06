public class PerfectNumberChecker {
    public boolean isPerfectNumber(int number)
    {
        if(number<=0){
            return false;
        }
        int divisorsum=0;
        for(int i=1;i<number;i++)
        {
            if(number%i==0)
            divisorsum=divisorsum+i;
        }
        if(divisorsum==number){
            return true;
        }
         return false;
    }
}
