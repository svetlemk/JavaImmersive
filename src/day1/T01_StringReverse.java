package day1;
// using 2 method, inbuild from string builder and with loop
public class T01_StringReverse {
    public static void main(String[] args){

        String str= "word";
        str = new StringBuilder(str).reverse().toString();
        System.out.println("word1 reversed:  "+ str);

        String word = "apple";
        String reverseString = "";

        for (int i = word.length()-1; i >=0 ;i--){
            reverseString += word.charAt(i);


        }
        for(int i= str.length()-1;i>= 0; i--){

        }

System.out.println("word2 reversed: "+ reverseString);

        for(int i= str.length()-1;i>= 0; i--){

        }
    }
}
