package Modifiers;

public class AnotherClass {
    private String M1(){
String word = "Private";
return word;
    }
    String M2(){
        String word = "Default";
        return word;
    }
    protected String M3(){
        String word = "Protected";
        return word;
    }
    public String M4(){
        String word = "Public";
        return word;
    }
     protected String replaceSpaces(String str){
        String newstr = str.replace(" ", "_");
        return newstr;
    }
   static String maxSpace(String[] word){
        String result = word[0];
        for(int i = 1; i< word.length; i++){
            if(word[i].length()>result.length()){
                result = word[i];
            }
        }
        return result;
    }
    public int maxNum(int[] nums){
        int result = nums[0];
        for(int i=1; i<nums.length; i++){
            if(nums[i]>result){
                result = nums[i];
            }
        }
       return result;
    }
}
