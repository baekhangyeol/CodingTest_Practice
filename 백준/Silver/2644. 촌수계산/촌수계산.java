import java.util.*;

public class Main {
    static ArrayList<Integer>[] relations;
    static boolean[] visited;
    static int[] distance;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int person1 = scanner.nextInt();
        int person2 = scanner.nextInt();
        int m = scanner.nextInt();
        
        relations = new ArrayList[n+1];
        
        for(int i=1; i<=n; i++) {
            relations[i] = new ArrayList<>();
        }
        visited = new boolean[n+1];
        distance = new int[n+1];
        
        for(int i=0; i<m; i++) {
            int parent = scanner.nextInt();
            int child = scanner.nextInt();
            
            relations[parent].add(child);
            relations[child].add(parent);
        }
        
        bfs(person1, n);
        System.out.println(distance[person2] == 0 ? -1 : distance[person2]);
    }
    
    static void bfs(int start, int n) {
        Queue<Integer> queue = new LinkedList<>();
        queue.offer(start);
        visited[start] = true;
        
        while(!queue.isEmpty()) {
            int current = queue.poll();
            
            for(int next : relations[current]) {
                if(!visited[next]) {
                    visited[next] = true;
                    distance[next] = distance[current] + 1;
                    queue.offer(next);
                }
            }
        }
    }
}