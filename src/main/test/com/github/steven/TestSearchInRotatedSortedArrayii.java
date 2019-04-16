package com.github.steven;


import org.junit.Assert;
import org.junit.Test;

public class TestSearchInRotatedSortedArrayii {

    @Test
    public void testSearchIn(){
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 2;
        SearchInRotatedSortedArrayii searchInRotatedSortedArrayii = new SearchInRotatedSortedArrayii();
        boolean result = searchInRotatedSortedArrayii.search(nums, target);
        Assert.assertTrue(result);
    }

    @Test
    public void testSearchNotIn(){
        int[] nums = {2, 5, 6, 0, 0, 1, 2};
        int target = 3;
        SearchInRotatedSortedArrayii searchInRotatedSortedArrayii = new SearchInRotatedSortedArrayii();
        boolean result = searchInRotatedSortedArrayii.search(nums, target);
        Assert.assertFalse(result);
    }
}
