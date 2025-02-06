class Practical7 {
    public static void main(String[] args) {
        Practical7 obj = new Practical7();
        int n = 5;
        n += 3;

        for (int row = 1; row <= n; row++) {
            System.out.println(obj.getM(row, n) + " " + obj.getA(row, n) + " " + obj.getN(row, n) + " " + obj.getA(row, n) + " " + obj.getS(row, n));
        }
    }

    String getM(int row, int n) {
        String M = "";

        for (int column = 1; column <= n; column++) {
            if (column == 1 || column == n || row == column && column > 0 && column <= (n / 2) || (row + column == n + 1 && row <= (n / 2))) {
                M += "*";
            } else {
                M += " ";
            }
            M += " ";
        }
        return M;
    }

    public static String getA(int row, int n) {
        String A = "";

        for (int column = 1; column <= n; column++) {
            if (row == 1 || row == (n / 2) || column == 1 || column == n) {
                A += "*";
            } else {
                A += " ";
            }
            A += " ";
        }
        return A;
    }

    String getN(int row, int n) {
        String N = "";

        for (int column = 1; column <= n; column++) {
            if (column == 1 || column == n || column == row) {
                N += "*";
            } else {
                N += " ";
            }
            N += " ";
        }
        return N;
    }

    String getS(int row, int n) {
        String S = "";

        for (int column = 1; column <= n; column++) {
            if (row == 1 || (column == 1 && row <= (n / 2)) || (column == n && row >= (n / 2) + 1) || row == n || row == (n / 2)) {
                S += "*";
            } else {
                S += " ";
            }
            S += " ";
        }
        return S;
    }
}

