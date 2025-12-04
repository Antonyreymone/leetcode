class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        p=0
        for i in range (0,len(nums)):
            if nums[i]==val:
                continue
            else:
                nums[p]=nums[i]
                p+=1
        return p            
        