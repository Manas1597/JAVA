class Practical5 {
    // Factorial using for loop
    public static int getFactorial1(int number) {
        int fact = 1;
        if (number >= 0) {
            for (int i = 1; i <= number; i++) {
                fact *= i; // Multiply directly
            }
        } else {
            return -1; // Return -1 for invalid input
        }
        return fact;
    }

    // Factorial using while loop
    public static int getFactorial2(int number) {
        int fact = 1, i = 1;
        if (number >= 0) {
            while (i <= number) {
                fact *= i;
                i++; // Increment counter
            }
        } else {
            return -1; // Return -1 for invalid input
        }
        return fact;
    }

    // Factorial without using any loop (recursion)
    public static int getFactorial3(int num) {
        if (num == 0 || num == 1) { // Handle base cases
            return 1;
        } else if (num > 0) {
            return num * getFactorial3(num - 1); // Recursive case
        } else {
            return -1; // Return -1 for invalid input
        }
    }

    // Sum of elements of an array using while loop
    public static int getSum1(int[] num) {
        int i = 0, sum = 0;
        while (i < num.length) {
            sum += num[i];
            i++; // Increment index
        }
        return sum;
    }

    // Sum of elements of an array using recursion
    public static int getSum2(int[] number, int index) {
        if (index < 0) { // Base case
            return 0;
        } else {
            return number[index] + getSum2(number, index - 1); // Recursive case
        }
    }

    public static void main(String[] args) {
        System.out.println("Factorial of 25 using for loop is: " + getFactorial1(25));
        System.out.println("Factorial of 7 using while loop is: " + getFactorial2(7));
        System.out.println("Factorial of 67 using recursion is: " + getFactorial3(67));

        int[] numbers = {1, 2, 3, 4, 5};
        System.out.println("Sum of array using while loop is: " + getSum1(numbers));
        System.out.println("Sum of array using recursion is: " + getSum2(numbers, numbers.length - 1));
    }
}
