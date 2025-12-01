class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        d={}
        for i in range(0,len(nums)):
            value=nums[i]
            diff=target-value
            if value not in d:
               d[diff]=i
            else:
               current_index=i
               previous_index=d[value]
               return  [ current_index,previous_index ]

            
        