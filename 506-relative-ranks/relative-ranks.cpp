class Solution {
public:
    vector<string> findRelativeRanks(vector<int>& scores) {
        int n = scores.size();
        int sortedScores[n];
        
        for(int i = 0; i < n; i++){
            sortedScores[i] = scores[i];
        }
        
        sort(sortedScores, sortedScores + n);
        vector<string> result;
        
        for(int i = 0; i < n; i++){
            for(int j = 0; j < n; j++){
                if(sortedScores[j] == scores[i]){
                    if(j + 1 == n){
                        result.push_back("Gold Medal");
                    }
                    else if(j + 1 == n - 1){
                        result.push_back("Silver Medal");
                    }
                    else if(j + 1 == n - 2){
                        result.push_back("Bronze Medal");
                    }
                    else{
                        result.push_back(to_string(n - j));
                    }
                }
            }
        }
        return result;
    }
};
