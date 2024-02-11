import java.util.*;

public class Main {
    static ArrayList<Integer>[] adjList;
    static boolean[] visited;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int N = scanner.nextInt(); // 정점의 개수
        int M = scanner.nextInt(); // 간선의 개수
        
        adjList = new ArrayList[N+1];
        
        for(int i=1; i<=N; i++) {
            adjList[i] = new ArrayList<>();
        }
        
        for(int i=0; i<M; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            adjList[u].add(v);
            adjList[v].add(u);
        }
        
        visited = new boolean[N+1];
        int componentCount = 0;
        
        for(int i=1; i<=N; i++) {
            if(!visited[i]) {
                dfs(i);
                componentCount++; // 연결 요소의 개수 증가
            }
        }
        
        System.out.println(componentCount);
    }
    
    static void dfs(int v) {
        if(visited[v])
            return;
        visited[v] = true;
        for(int next: adjList[v]) {
            if(!visited[next]) {
                dfs(next);
            }
        }
    }
}