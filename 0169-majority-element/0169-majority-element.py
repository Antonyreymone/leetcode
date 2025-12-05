class Solution:
    def majorityElement(self, nums: List[int]) -> int:

        final_result=None

        count=0

        for num in nums:
            if count==0:
                final_result=num
            if num==final_result:
                count+=1
            else:
                count-=1
        return final_result          
        