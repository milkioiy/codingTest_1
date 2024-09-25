import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;

public class Main {

	static int n, m;
	static char[][] campus;

	public static void main(String[] args) throws IOException {

		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

		StringTokenizer st = new StringTokenizer(br.readLine());
		n = Integer.parseInt(st.nextToken());
		m = Integer.parseInt(st.nextToken());

		campus = new char[n][m];

		for(int i = 0; i < n; i++){
			campus[i] = br.readLine().toCharArray();
		}

		int count = bfs();

		System.out.println(count == 0? "TT" : count);

	}

	public static int bfs(){

		int[] dx = {0, 0, -1, 1};
		int[] dy = {-1, 1, 0, 0};


		int x = 0;
		int y = 0;

		// 시작 위치 찾기
		for(int i = 0; i < n; i++){
			for(int j = 0; j < m; j++){
				if (campus[i][j] == 'I'){
					x = i;
					y = j;
					campus[i][j] = 'X';
					break;
				}
			}
		}

		Queue<int []> queue = new LinkedList<>();
		queue.add(new int[] {x, y});
		int[] location;
		int fx, fy;
		int count = 0;

		//bfs 탐색 시작
		while (queue.size() > 0){
			location = queue.poll();
			x = location[0];
			y = location[1];

			for(int k = 0; k < 4; k++){
				fx = x + dx[k];
				fy = y + dy[k];
				if((fx >= 0 && fx < n && fy >= 0 && fy < m) && campus[fx][fy] != 'X'){
					// 사람일 경우
					if (campus[fx][fy] == 'P'){
						count++;
					}
					campus[fx][fy] = 'X';
					queue.add(new int[] {fx, fy});
				}
			}

		}

		return count;
	}

}