
public class ineuron {

    public static void main(String[] args) {
        int n = 100;

        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j > 0 && j < n - 1) ||
                        (i == n - 1 && j > 0 && j < n - 1) || j == (n - 1) / 2) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0 || j == n - 1 || i == j) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if ((i == 0 && j >= n / 4) ||
                        (i == n - 1 && j >= n / 4) ||
                        (i == (n - 1) / 2 && j >= n / 4) ||
                        j == (n / 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }

            for (int j = 0; j < n; j++) {
                if ((j == n / 4) || j == n - 1 ||
                        (i == n - 1 && j > n / 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if ((j == n / 4) ||
                        (i == 0 && j > n / 4) ||
                        (j == n - 1 && i < (n - 1) / 2) ||
                        (i == (n - 1) / 2 && j > n / 4) ||
                        (i == j && i > (n - 1) / 2))

                {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if ((j == n / 4) || j == n - 1 ||
                        (i == n - 1 && j > n / 4) || (i == 0 && j > n / 4)) {
                    System.out.print("*");
                } else {
                    System.out.print(" ");

                }

            }
            for (int j = 0; j < n; j++) {
                if (j == 0) {
                    System.out.print(" *");
                }

                else if (j == n - 1 || i == j) {
                    System.out.print("*");

                } else {
                    System.out.print(" ");

                }

            }
            System.out.println();

        }
    }

}