import java.util.PriorityQueue;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        long sum = 0;

        // 12개의 우선순위 큐 배열과 존재 여부 배열 초기화
        PriorityQueue<Integer>[] v = new PriorityQueue[12];
        boolean[] isExist = new boolean[12];
        
        for (int i = 0; i < 12; i++) {
            v[i] = new PriorityQueue<>((a, b) -> b - a); // 큰 값이 우선인 우선순위 큐
        }

        // 입력 처리
        for (int i = 0; i < n; i++) {
            int p = sc.nextInt();
            int w = sc.nextInt();
            v[p].offer(w);
            isExist[p] = true;
        }

        // k번 반복
        for (int i = 0; i < k; i++) {
            for (int j = 1; j <= 11; j++) {
                if (isExist[j] && !v[j].isEmpty()) {
                    int tmp = v[j].poll();
                    if (tmp == 1) break;
                    tmp--;
                    v[j].offer(tmp);
                }
            }
        }

        // 결과 합산
        for (int i = 1; i <= 11; i++) {
            if (isExist[i] && !v[i].isEmpty()) {
                sum += v[i].peek();
            }
        }

        System.out.println(sum);
        sc.close();
    }
}
