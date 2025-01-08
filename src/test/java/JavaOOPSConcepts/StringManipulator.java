package JavaOOPSConcepts;

public class StringManipulator {
    String str;
    StringManipulator(String str) {
        this.str = str;
    }
    final String ReverseString(){
      StringBuilder stringBuilder = new StringBuilder(str);
      stringBuilder.reverse().toString();
      return stringBuilder.toString();
    }
}
class ArrayManipulator{
    double sum = 0;
    final double avgElements(int[] numbers){
        for(int i=0; i<numbers.length; i++){
           sum+=numbers[i];
        }
        double avg = sum/numbers.length;
        return avg;
    }
}
