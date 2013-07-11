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
        for(int i=val;i<999;i++)
        {
            for(int j=i; j<999;j++)
            {
                int x;
                x=i*j;
                if(isPalindrome(x))
                {
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



}
