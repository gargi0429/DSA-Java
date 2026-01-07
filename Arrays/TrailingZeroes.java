public class TrailingZeroes {
    static int trailingZeroes(int n)
    {
        int count = 0;
        while( n > 0)
        {
            n = n / 5;
            count += n;
        }
        return count;
    }
    public static void main(String[] args)
    {
        int n = 25;
        int result = trailingZeroes(n);
        System.out.println("Trailing zeroes in " + n + "! = " + result);
    }
}
