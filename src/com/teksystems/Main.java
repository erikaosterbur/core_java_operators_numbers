package com.teksystems;

public class Main {

    public static void main(String[] args) {
//        problemOne();
//        problemTwo();
//        problemThree();
//        problemFour();
        problemFive();
        problemSix();
        problemSeven();
        problemEight();
    }

    public static void problemOne () {
        // Write the following integers in binary notation:
        // 1 -> 1
        // 8 -> 1000
        // 33 -> 1000 01
        // 78 -> 1001 110
        // 787 -> 1100 0100 11
        // 33,987 -> 1000 0100 1100 0011

    }

    public static void problemTwo () {
        // Convert the following binary numbers to decimal notation:
        // 0010 -> 2
        // 1001 -> 9
        // 0011 0100 -> 52
        // 0111 0010 -> 114
        // 0010 0001 1111 -> 543
        // 0010 1100 0110 0111 -> 11,367
    }

    public static void problemThree () {
        // Write a program that declares an integer a variable x and assigns the value 2 to it
        // and prints out the binary string version of the number ( Integer.toBinaryString(x) ).
        int x = 2;
        System.out.println(Integer.toBinaryString(x));

        // Now, use the left shift operator (<<) to shift by 1 and assign the result to x.
        x = x << 1;
        // Before printing the results, write a comment with the predicted decimal value and binary string.
        // Now, print out x in decimal form and in binary notation.
        System.out.println(x); //4
        System.out.println(Integer.toBinaryString(x)); //100

        // Do the preceding exercise with the following values: 9, 17, 88
        int y = 9;
        System.out.println(Integer.toBinaryString(y));

        y = y << 1;
        System.out.println(y); //18
        System.out.println(Integer.toBinaryString(y)); //10010

        int z = 17;
        System.out.println(Integer.toBinaryString(z));

        z = z << 1;
        System.out.println(z); //34
        System.out.println(Integer.toBinaryString(z)); //100010

        int a = 88;
        System.out.println(Integer.toBinaryString(a));

        a = a << 1;
        System.out.println(a); //176
        System.out.println(Integer.toBinaryString(a)); //10110000

    }

    public static void problemFour () {
        // Write a program that declares a variable x and assigns 150 to it and prints out the binary string version of the number.
        int x = 150;
        System.out.println(Integer.toBinaryString(x));

        // Now use the right shift operator (>>) to shift by 2 and assign the result to x.
        x = x >> 2;

        // Write a comment indicating what you anticipate the decimal and binary values to be.
        // Now print the value of x and the binary string.
        System.out.println(x);//37
        System.out.println(Integer.toBinaryString(x));//10010110

       // Do the preceding exercise with the following values: 225, 1555, 32456
        int y = 225;
        System.out.println(Integer.toBinaryString(y));

        y = y >> 2;
        System.out.println(y);//56
        System.out.println(Integer.toBinaryString(y));//111000

        int z = 1555;
        System.out.println(Integer.toBinaryString(z));

        z = z >> 2;
        System.out.println(z);//388
        System.out.println(Integer.toBinaryString(z));//110000100

        int a = 32456;
        System.out.println(Integer.toBinaryString(a));

        a = a >> 2;
        System.out.println(a);//8114
        System.out.println(Integer.toBinaryString(a));//1111110110010

    }

    public static void problemFive () {
        // Write a program that declares 3 int variables x, y, and z.
        // Assign 7 to x and 17 to y.
        // Write a comment that indicates what you predict will be the result of the bitwise & operation on x and y.
        int x = 7;
        int y = 17;
        int z;
        //Bitwise & operation prediction: decimal: 1 binary: 1

        // Now use the bitwise & operator to derive the decimal and binary values and assign the result to z.
        z = (x & y);
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));

        // Now, with the preceding values, use the bitwise | operator to calculate the “or” value between x and y.
        // As before, write a comment that indicates what you predict the values to be before printing them out.
        //Bitwise | operation prediction: decimal: 23 binary: 10111
        z = (x | y);
        System.out.println(z);
        System.out.println(Integer.toBinaryString(z));
    }

    public static void problemSix () {
        // Write a program that declares an integer variable, assigns a number, and uses a postfix increment operator to increase the value.
        // Print the value before and after the increment operator.
    }

    public static void problemSeven () {
        // Write a program that demonstrates at least 3 ways to increment a variable by 1 and does this multiple times.
        // Assign a value to an integer variable, print it, increment by 1, print it again, increment by 1, and then print again.
    }

    public static void problemEight () {
        // Write a program that declares 2 integer variables, x, and y, and then assigns 5 to x and 8 to y.
        // Create another variable sum and assign the value of ++x added to y and print the result.
        // Notice the value of the sum (should be 14).
        // Now change the increment operator to postfix (x++) and re-run the program.
        // Notice what the value of sum is.
        // The first configuration incremented x and then calculated the sum
        // while the second configuration calculated the sum and then incremented x.

    }
}
