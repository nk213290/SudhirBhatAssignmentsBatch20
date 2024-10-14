package Modifiers;

public class E130StatMethVarrays {
public static int [] mystery(int [] numbers){
    for(int i=0; i< numbers.length; i++){
        if(numbers[i]%2==0){
            numbers[i]=numbers[i]/2;
        }else
            numbers[i]=numbers[i]*10;
    }
    return numbers;
}
public static void display(int[] numbers){
    for(int i=0; i< numbers.length; i++) {
        System.out.print(numbers[i] + " ");
    }
}

    public static void main(String[] args) {
       int [] numbers = {8, 16, 5, 12, 3};
       mystery(numbers);
       display(numbers);
    }
}
