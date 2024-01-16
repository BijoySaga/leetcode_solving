class Solution {
public:
    int uniquePaths(int gridRowCount, int gridColumnCount) {
        vector<vector<int>> uniquePathCounts(gridRowCount, vector<int>(gridColumnCount));

        // Initialize top and left edges with 1 (single path to each cell)
        for (int rowIndex = 0; rowIndex < gridColumnCount; rowIndex++) {
            uniquePathCounts[0][rowIndex] = 1;
        }
        for (int columnIndex = 0; columnIndex < gridRowCount; columnIndex++) {
            uniquePathCounts[columnIndex][0] = 1;
        }

        // Calculate unique path counts for remaining cells
        for (int rowIndex = 1; rowIndex < gridRowCount; rowIndex++) {
            for (int columnIndex = 1; columnIndex < gridColumnCount; columnIndex++) {
                uniquePathCounts[rowIndex][columnIndex] = uniquePathCounts[rowIndex - 1][columnIndex] + uniquePathCounts[rowIndex][columnIndex - 1];
            }
        }

        return uniquePathCounts[gridRowCount - 1][gridColumnCount - 1];
    }
};
