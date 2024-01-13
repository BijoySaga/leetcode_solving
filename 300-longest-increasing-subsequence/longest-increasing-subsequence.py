class Solution:
    def lengthOfLIS(self, alot: List[int]) -> int:
        def ceil(alot,x):
            val=0
            step=len(alot)-1
            if x<alot[0]:
                return 0
            while(val<=step):
                ram=(val+step)>>1
                if alot[ram]==x:
                    return ram
                elif alot[ram]>x:
                    if alot[ram-1]<x:
                        return ram 
                    step=ram-1
                else:
                    if alot[ram+1]>x:
                        return ram+1
                    val=ram+1
        step=[alot[0]]
        for i in range(1,len(alot)):
            if alot[i]>step[-1]:
                step.append(alot[i])
            else:
                idx=ceil(step,alot[i])
                step[idx]=alot[i]
        return len(step)#bijoysaga
            