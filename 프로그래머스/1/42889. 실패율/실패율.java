import java.util.*;

class Solution {
    public int[] solution(int N, int[] stages) {
        Map<Integer, Stage> stageMap = new HashMap<>();
        for(int i = 1 ; i < N + 1 ; i++) {
            stageMap.put(i, new Stage(i, 0, 0));
        }
        
        for(int stage : stages) {
            for(int i = 1 ; i < stage ; i++) {
                Stage visitStage = stageMap.get(i);
                visitStage.visitCount += 1;
            }
            if(stage > N) {
                continue;
            }
            Stage curStage = stageMap.get(stage);
            curStage.visitCount += 1;
            curStage.curExistCount += 1;
        }
        
        return stageMap.values()
            .stream()
            .sorted(new Comparator<Stage>() {
                @Override
                public int compare(Stage stg1, Stage stg2) {
                    double stg2FailPer = stg2.getFailPercentage();
                    double stg1FailPer = stg1.getFailPercentage();
                    if (stg2FailPer > stg1FailPer) {
                        return 1;
                    } else if(stg2FailPer == stg1FailPer && stg2.stageNum < stg1.stageNum) {
                        return 1;
                    }
                    return -1;
                }
            })
            .mapToInt(stg -> stg.stageNum)
            .toArray();
    }
    
    public static class Stage {
        
        int stageNum;
        int visitCount;
        int curExistCount;
        
        public double getFailPercentage() {
            if(visitCount == 0) {
                return 0;
            }
            return (double)curExistCount / (double)visitCount;
        }
        
        public Stage(int stageNum, int visitCount, int curExistCount) {
            this.stageNum = stageNum;
            this.visitCount = visitCount;
            this.curExistCount = curExistCount;
        }
        
    }
    
}