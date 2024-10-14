package Modifiers;

public class E133Occurences {
    public static int countA(String s){
        s=s.toLowerCase();
        int count=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i)=='a'){
                count++;
            }
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countA("abrAcadAbra"));
        System.out.println(countA("Analytical"));
        System.out.println(countA("Paradoxical"));
    }
}
