public class First {
	int c;
	protected int ab(int x)
	{
		c=x+6;
		return c;
	}
	protected static void m() {
		System.out.println("kjbkjbjhb");
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a$=5^4;
		System.out.println("guvv"+a$);
        int bitmask = 0x00F0;
        int val = 0x2222;
        // prints "2"
        System.out.println(val & bitmask);
        String searchMe = "peter piper picked a " + "peck of pickled peppers";
        int max = searchMe.length();
        int numPs = 0;

        for (int i = 0; i < max; i++) {
            // interested only in p's
            if (searchMe.charAt(i) != 'p')
                continue;

            // process p's
            numPs++;
        }
        System.out.println("Found " + numPs + " p's in the string.");
	}

}
