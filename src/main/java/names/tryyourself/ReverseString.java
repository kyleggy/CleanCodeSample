package names.tryyourself;

public class ReverseString {

    /*
    1. Please write a new function to rename these variables and add meaningful names.
    2. Write a unit test in ReverseStringTest to verify it works correctly.
     */
    public String get(String input)
    {
        char[] arr = new char[input.length()];
        int i = input.length() - 1;
        for (char e: input.toCharArray()) {
            arr[i] = e;
            i--;
        }
        return new String(arr);
    }
}
