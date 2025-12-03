class Solution:
    def subsets(self, nums: List[int]) -> List[List[int]]:
        res=[[]]

        for num in nums:
 
             temp_res = []

             for subset in res:

                new_subset = subset + [num]

                temp_res.append(new_subset)

             res += temp_res

        return res     



