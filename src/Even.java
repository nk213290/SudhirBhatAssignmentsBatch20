public class Even {
    public int sumEven(int x){
       int sum = 0;
       for(int i=2; i<=x; i++){
           if(i%2==0){
               sum+=i;
           }
       }
       return sum;
    }
}
