import java.util.Arrays;

class FizzBuzz
{
    public static void main(String[] args)
    {
        for(String str : fizzBuzz(5)) {
            System.out.println(str);
        }
        String[] answerFive = new String[] {"1","2","Fizz","4","Buzz"};
        if (!Arrays.equals(fizzBuzz(5), answerFive))
        {
            System.out.println("Failed! Try again.");
        } else {
            System.out.println("Correct!");
        }

        for(String str : fizzBuzz(15)) {
            System.out.println(str);
        }
        String[] answerFifteen = new String[] {"1","2","Fizz","4","Buzz","Fizz","7","8","Fizz","Buzz","11","Fizz","13","14","FizzBuzz"};
        if (!Arrays.equals(fizzBuzz(15), answerFifteen))
        {
            System.out.println("Failed! Try again.");
        } else {
            System.out.println("Correct!");
        }

    }

    /*
     * This function returns a String that obeys
     * the rules of the game "fizz buzz."
     * The rules: When counting up from 1 to n,
     * if the number is a multiple of 3, say "fizz."
     * If the number is a multiple of 5, say "buzz."
     * If it is a multiple of both, say "fizz buzz."
     */
    public static String[] fizzBuzz(int n)
    {
        String[] result = new String[n];

        for(int i=0; i < result.length; i++){
            String temp = "";


            if((i + 1) % 3 == 0){
                temp += "Fizz";
            }
            if((i + 1) % 5 == 0){
                temp += "Buzz";
            }
            if(temp.equals("")){
                result[i] = String.valueOf(i + 1);
            }
            else {
                result[i] = temp;
            }
        }
        return result;
    }
}