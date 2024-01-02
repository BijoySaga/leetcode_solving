class Solution:
    def summaryRanges(self, nums: List[int]) -> List[str]:
        repo = []
        begining = 0
        for i in range(1, len(nums)+1):
            if i== len(nums) or nums[i] - nums[i-1] !=1:
                if begining == (i-1):
                    repo.append(str(nums[begining]))
                else:
                    repo.append(str(nums[begining])+"->"+str(nums[i-1]))
                begining = i
        return repo
        