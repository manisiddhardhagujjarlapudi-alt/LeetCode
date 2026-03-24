class Solution(object):
    def search(self, nums, target):
        i,j = 0,len(nums)-1
        while i <= j:
            mid = (i+j)/2
            if nums[mid] > target:
                j = mid - 1
            elif nums[mid] < target:
                i = mid + 1
            else:
                return mid
        return -1               

        