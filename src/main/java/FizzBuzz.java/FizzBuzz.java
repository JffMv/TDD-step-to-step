public class FizzBuzz {
    public static String fizzbuzz(int n) {
        String value = isMultiply3(n)+isMultiply5(n);
        return value.equals("")? String.valueOf(n):value;
    }
    
    private static String isMultiply5(int n){
        return n%5==0 ? "Buzz": "";
    }
    private static String isMultiply3(int n){
        return n%3==0 ? "Fizz": "";
    }
}