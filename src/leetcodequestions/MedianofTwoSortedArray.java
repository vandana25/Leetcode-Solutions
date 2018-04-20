package leetcodequestions;

public class MedianofTwoSortedArray {
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) { int length = nums1.length+nums2.length;
    int[] newArray =new int[length];
    int i=0;
    int j=0;
    int count=-1;
    
    while(j<nums2.length && i<nums1.length){
        if(nums1[i]<nums2[j]){
            newArray[++count]=nums1[i];
            i++;
        }
        else if(nums1[i]>nums2[j]){
            newArray[++count]=nums2[j];
            j++;
        }
        else{
            newArray[++count]=nums1[i];
            i++;
            j++;
        }
    }
    if(nums1.length>nums2.length){
    	for(int k=i;k<nums1.length;k++){
    		newArray[++count]=nums1[k];
    	}
    	
    }
    else{
    	for(int k=j;k<nums2.length;k++){
    		newArray[++count]=nums2[k];
    	}
    }
    if(newArray.length%2==0){
    	int index = newArray.length;
    	double sum = newArray[index/2]+newArray[index/2-1];
    	System.out.println(sum/2);
    	return sum/2;
    }
    else{
    	System.out.println(newArray[(length/2)]);
    	return newArray[(length/2)];
    }
    
}

	public static void main(String[] args) {
		int[] nums1={1,2,6,10,63};
		int[] nums2 = {3,4};
		findMedianSortedArrays(nums1, nums2);
	}

}
