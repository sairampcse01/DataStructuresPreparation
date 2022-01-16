class Solution:
    def twoSum(self, nums: List[int], target: int) -> List[int]:
        x=[]
        for i in range(len(nums)):
            target=target-nums[i]
            if target in nums[i+1:len(nums)]:
                x.append(i)
                nums[i]=-2
                x.append(nums.index(target))
                break
            else:
                target=target+nums[i]
        return x
//https://leetcode.com/problems/two-sum/submissions/
//Runtime: 644 ms, faster than 57% of Python3 online submissions for Two Sum.
//Memory Usage: 14.9 MB, less than 87.2% of Python3 online submissions for Two Sum.
