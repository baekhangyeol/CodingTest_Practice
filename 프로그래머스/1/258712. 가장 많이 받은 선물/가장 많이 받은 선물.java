import java.util.*;

class Solution {
    public int solution(String[] friends, String[] gifts) {
        
        Map<String, Integer> friendsGifts = new HashMap<>();
        for (int i=0; i<friends.length; i++) {
            friendsGifts.put(friends[i], i);
        }
                
        int[][] giftGraph = new int[friends.length][friends.length];
        int[] giftScore = new int[friends.length];
        int[] nextMonthGifts = new int[friends.length];
        
        for (String gift: gifts) {
            String[] split = gift.split(" ");
            int giveFriend = friendsGifts.get(split[0]);
            int receiveFriend = friendsGifts.get(split[1]);
            
            giftGraph[giveFriend][receiveFriend]++;
            giftScore[giveFriend]++;
            giftScore[receiveFriend]--;
        }
        
        for (int i=0; i<friends.length; i++) {
            for (int j=i+1; j<friends.length; j++) {
                if (giftGraph[i][j] > giftGraph[j][i]) {
                    nextMonthGifts[i]++;
                }
                else if (giftGraph[i][j] < giftGraph[j][i]) {
                    nextMonthGifts[j]++;
                }
                else if ((giftGraph[i][j] == giftGraph[j][i])) {
                    if (giftScore[i] > giftScore[j]) {
                        nextMonthGifts[i]++;
                    }
                    else if (giftScore[i] < giftScore[j]) {
                        nextMonthGifts[j]++;
                    }
                }
            }
        }
        
        int answer = 0;
        for (int count: nextMonthGifts) {
            answer = Math.max(answer, count);
        }
        
        return answer;
    }
}