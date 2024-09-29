import java.util.*;

class Solution {
    List<String> route = new ArrayList<>();
    Map<String, PriorityQueue<String>> flights = new HashMap<>();
    
    public String[] solution(String[][] tickets) {
        for(String[] ticket: tickets) {
            flights.putIfAbsent(ticket[0], new PriorityQueue<>());
            flights.get(ticket[0]).offer(ticket[1]);
        }
        
        dfs("ICN");
        
        Collections.reverse(route);
        return route.toArray(new String[0]);
    }
    
    private void dfs(String airport) {
        PriorityQueue<String> dests = flights.get(airport);
        while (dests != null && !dests.isEmpty()) {
            dfs(dests.poll());
        }
        route.add(airport);
    }
}