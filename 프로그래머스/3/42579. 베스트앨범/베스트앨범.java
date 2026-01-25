import java.util.*;

class Solution {
    public int[] solution(String[] genres, int[] plays) {
        
        HashMap<String, Integer> play = new HashMap<>();
        HashMap<String, List<int[]>> musicList = new HashMap<>();
        
        for(int i=0; i<genres.length; i++) {
            play.put(genres[i], play.getOrDefault(genres[i], 0) + plays[i]);
            
            if (!musicList.containsKey(genres[i])) {
                musicList.put(genres[i], new ArrayList<>());
            }
            
            musicList.get(genres[i]).add(new int[]{i, plays[i]});
        }
        
        List<String> sortedGenres = new ArrayList<>(play.keySet());
        sortedGenres.sort((a, b) -> play.get(b) - play.get(a));
        
        List<Integer> result = new ArrayList<>();
        
        for (String genre: sortedGenres) {
            List<int[]> songs = musicList.get(genre);
            
            songs.sort((a, b) -> {
                if (a[1] == b[1]) {
                    return a[0] - b[0];
                }
                return b[1] - a[1];
            });
            
            for(int i=0; i<songs.size() && i < 2; i++) {
                result.add(songs.get(i)[0]);
            }
        }
        
        return result.stream().mapToInt(i -> i).toArray();
    }
}