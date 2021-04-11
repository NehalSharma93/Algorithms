/*Problem Description

Given an array of integers A of size N and an integer B.

College library has N books,the ith book has A[i] number of pages.

You have to allocate books to B number of students so that maximum number of pages alloted to a student is minimum.

A book will be allocated to exactly one student.
Each student has to be allocated at least one book.
Allotment should be in contiguous order, for example: A student cannot be allocated book 1 and book 3, skipping book 2.
Calculate and return that minimum possible number.

NOTE: Return -1 if a valid assignment is not possible.

Problem Constraints
1 <= N <= 105
1 <= A[i], B <= 105
*/


public class Solution {
    public int books(int[] a, int b) {
        int books = a.length;
        if(b>books)
            return -1;
        // int max = Collections.max(Arrays.asList(a);
        
        int sum = 0;
        int max = 1;
        for(int i=0; i<books; i++){
            sum = sum + a[i];
            if(a[i]>max)
                max = a[i];
        }
        
        int start = max;
        int end = sum;
        int mid;
        while(start<=end){
            mid = (start+end)/2;
            int totalPage = 0;
            int student = 1;
            for(int pages : a){
                totalPage += pages;
                if(totalPage > mid){
                    student++;
                    totalPage = pages;
                }
            }
            if(student > b)
                start = mid + 1;
            else
                end = mid - 1;
        }
        return start;
    }
}
