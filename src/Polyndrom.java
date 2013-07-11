/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 11.07.13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */

public class Polyndrom {

    private static void FindPal(Integer val,Object left,Object right)
    {
        for(int i=999;i>val;i--)
        {
            for(int j=i; j>val;j--)
            {
                int x = 0;
                x=i*j;
                if(isPalindrome(x))
                {
                    //System.out.println(x);
                    System.out.println("Left: " + i + " right " + j + " palindrome: " + x);
                    left=i;
                    right=j;
                }
            }
        }
    }

    public static boolean isPalindrome(int number) {
        char[] strNumber = Integer.toString(number).toCharArray();

        for (int i = 0, j = strNumber.length - 1; i < j; i++, j--)
            if (strNumber[i] != strNumber[j])
                return false;
        return true;
    }


    public static void main (String[] args) {
        int max = 999;
        while (!isPalindrome(max*max) && max >= 100) {
            max--;
        }
        System.out.println(max*max);
        int left = max;
        int right = max;
        FindPal(max, left, right);
        System.out.println("Left: " + left + " right " + right + " palindrome: " + left*right);
    }
}
