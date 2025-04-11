package com.kscm.sorting;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MergeSortP1 {
    public List<Integer> sort(List<Integer> list) {
        if(list.size() == 1) {
            return list;
        }

        //sort(0, list.size()/2)
        List<Integer> leftList = sort(list.subList(0, list.size()/2));
        List<Integer> rightList = sort(list.subList(list.size()/2, list.size()));
        return merge(leftList, rightList);
    }

    public List<Integer> merge(List<Integer> leftList, List<Integer> rightList) {
        List<Integer> result = new ArrayList<>();
        int leftIdx = 0;
        int rightIdx = 0;

        while(leftIdx < leftList.size() && rightIdx < rightList.size()) {
            if(leftList.get(leftIdx) < rightList.get(rightIdx)) {
                result.add(leftList.get(leftIdx++));
            } else {
                result.add(rightList.get(rightIdx++));
            }
         }

        if(leftIdx < leftList.size()) {
            result.addAll(leftList.subList(leftIdx, leftList.size()));
        }

        if(rightIdx < rightList.size()) {
            result.addAll(rightList.subList(rightIdx, rightList.size()));
        }

        return result;
    }

    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(99, 44,6, 2, 1, 63, 87, 283, 4, 0));
        MergeSortP1 mergeSortP1 = new MergeSortP1();
        System.out.println(mergeSortP1.sort(list));
    }
}
