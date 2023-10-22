import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();

        for (int i = 1; i <= t; i++) {
            System.out.print("Case #" + i + ": ");
            solve(sc);
            System.out.println();
        }
    }

    static void solve(Scanner sc) {
        long r, c, n, s, d, h, cnt = 0;
        r = sc.nextLong();
        c = sc.nextLong();
        n = sc.nextLong();
        s = sc.nextLong();
        d = sc.nextLong();
        h = sc.nextLong();

        long[] mx = new long[(int) r];
        for (int i = 0; i < n; i++) {
            long ind, hVal, x, y;
            ind = sc.nextLong();
            hVal = sc.nextLong();
            x = sc.nextLong();
            y = sc.nextLong();
            mx[(int) x] = Math.max(mx[(int) x], hVal);
        }

        for (long start = 0; ; start++) {
            boolean flag = false;

            for (long shot = 0; shot < s; shot++) {
                for (int i = 0; i < r; i++) {
                    if (mx[(int) ((start + i) % r)] != 0) {
                        mx[(int) ((start + i) % r)] = Math.max(mx[(int) ((start + i) % r)] - d + i * h, 0);
                        cnt++;
                        //System.out.println((start + i) % r + " " + shot + " " + start);
                        break;
                    }
                    if (i == r - 1) {
                        flag = true;
                        break;
                    }
                }
            }

            if (flag) {
                break;
            }
        }

        System.out.print(cnt + " ");
    }
}
