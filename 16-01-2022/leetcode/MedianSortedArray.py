class Solution:
    def findMedianSortedArrays(self, nums1: List[int], nums2: List[int]) -> float:
        nums1=nums1+nums2
        nums1.sort()
        n=len(nums1)
        if n%2==0:
            return (nums1[int(n/2)-1]+nums1[int(n/2)])/2
        else:
            return nums1[int((n+1)/2)-1]
//https://leetcode.com/problems/median-of-two-sorted-arrays/
//Runtime: 132 ms-40%
//Memory Usage: 14.5 MB-81%
