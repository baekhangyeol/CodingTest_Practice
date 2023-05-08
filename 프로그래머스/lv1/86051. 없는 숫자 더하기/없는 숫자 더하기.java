class Solution {
    public int solution(int[] numbers) {
        int answer = -1;
        int sum = 0;
        int count = 0;
        int a = 0;
        
        // for(int i=0; i<numbers.length; i++) {
        //     for(int j=0; j<10; j++) {
        //         if(j == numbers[i])
        //             count = 1;
        //         if(count == 0)
        //             sum += j;
        //     }
        //     count = 0;
        // }
        for(int i=0; i<10; i++) {
            for(int j=0; j<numbers.length; j++)
                if(i == numbers[j])
                    count = 1;
            if(count == 0)
                sum += i;
            count = 0;
        }
        return sum;
    }
}