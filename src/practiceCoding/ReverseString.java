package practiceCoding;

public class ReverseString {

    public static void main(String[] args) {
        String str = "Denisa";
      String output =  stringReverse(str);
      String output1 =  stringReverse1(str);
        System.out.println("output = " + output);
        System.out.println("output1 = " + output1);

    }

    private static String stringReverse1(String str) {
        StringBuilder stringBuilder = new StringBuilder(str);

        stringBuilder.reverse();
        return stringBuilder.toString();
    }

    private static String stringReverse(String str) {

        String result ="";
        for (int i = str.length()-1; i>=0 ; i--) {
            result += str.charAt(i);

        }
        return result;
    }
}
