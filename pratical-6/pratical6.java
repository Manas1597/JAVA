class Practical6 {
    public static void displayPattern1(int num) {
        int row = 1;
        while (row <= num) {
            // Print spaces for the pyramid
            int space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }
            // Print '+' for the pyramid
            int col = 1;
            while (col <= 2 * row - 1) {
                System.out.print("+");
                col++;
            }
            System.out.println();
            row++;
        }

        row = num - 1;
        while (row > 0) {
            // Print spaces for the inverted pyramid
            int space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }
            // Print '+' for the inverted pyramid
            int col = 1;
            while (col <= 2 * row - 1) {
                System.out.print("+");
                col++;
            }
            System.out.println();
            row--;
        }
    }

    public static void displayPattern2(int num) {
        int row = 1;
        while (row <= num) {
            // Print spaces for the pyramid
            int space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }
            // Print '+' and '*' alternately for the pyramid
            int col = 1;
            while (col <= 2 * row - 1) {
                if (row % 2 == 0) {
                    System.out.print(col % 2 == 0 ? "*" : "+");
                } else {
                    System.out.print(col % 2 == 0 ? "+" : "*");
                }
                col++;
            }
            System.out.println();
            row++;
        }

        row = num;
        while (row > 0) {
            // Print spaces for the inverted pyramid
            int space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }
            // Print '+' and '*' alternately for the inverted pyramid
            int col = 1;
            while (col <= 2 * row - 1) {
                if (row % 2 == 0) {
                    System.out.print(col % 2 == 0 ? "+" : "*");
                } else {
                    System.out.print(col % 2 == 0 ? "*" : "+");
                }
                col++;
            }
            System.out.println();
            row--;
        }
    }

    public static void displayPattern3(int num) {
        int row = 1;
        while (row <= num) {
            // Print spaces for the pyramid
            int space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }
            // Print '+' with spaces for the pyramid
            int col = 1;
            while (col <= 2 * row - 1) {
                System.out.print(col % 2 == 0 ? " " : "+");
                col++;
            }
            System.out.println();
            row++;
        }

        row = num - 1;
        while (row > 0) {
            // Print spaces for the inverted pyramid
            int space = 1;
            while (space <= num - row) {
                System.out.print(" ");
                space++;
            }
            // Print '*' with spaces for the inverted pyramid
            int col = 1;
            while (col <= 2 * row - 1) {
                System.out.print(col % 2 == 0 ? " " : "*");
                col++;
            }
            System.out.println();
            row--;
        }
    }

    public static void main(String[] arg) {
        displayPattern1(3);
        System.out.println();
        displayPattern2(4);
        System.out.println();
        displayPattern3(3);
        System.out.println();
    }
}
