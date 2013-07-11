/**
 * Created with IntelliJ IDEA.
 * User: art
 * Date: 11.07.13
 * Time: 21:18
 * To change this template use File | Settings | File Templates.
 */
public class Polyndrom {
    public static boolean isPalindrome(int number) {
        return true;
    }

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

    public static void main (String[] args) {
        int max = 999;
        while (!isPalindrome(max)) {
            max--;
        }
    }
}
