public class E128MixingStrings {
    public static String mixString(String s1, String s2){
        StringBuilder combine = new StringBuilder();
        for(int i=0; i<s1.length(); i++){
            if(i<s1.length()){
                combine.append(s1.charAt(i));
            }
            if(i<s2.length()){
                combine.append(s2.charAt(i));
            }
        }
        return combine.toString();
    }

    public static void main(String[] args) {
        System.out.println(mixString("sandwich","platypus"));
    }
}
