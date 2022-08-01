/*
 * To declare a variable with a value that cannot be manipulated,
 * we need to use the final keyword. To use the final keyword,
 * prepend final to a variable declaration like so:
 * final int yearBorn = 1968;
 */

public class Final {
    public static void main(String[] args) {
        final double pi = 3.14;

        System.out.println(pi);

        // this will fail because pi is final and thus immutable!
        // double kaas = pi += 2;

        System.out.println(pi + 2);
		
	}
}