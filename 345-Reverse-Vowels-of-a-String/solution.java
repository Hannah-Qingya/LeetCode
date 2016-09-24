public class Solution {
    public String reverseVowels(String s) {
        int i = 0, j = s.length() - 1;
        Set<Character> set = new HashSet();
        set.add('a');
        set.add('e');
        set.add('i');
        set.add('o');
        set.add('u');
        set.add('A');
        set.add('E');
        set.add('I');
        set.add('O');
        set.add('U');
        char[] arr = s.toCharArray();
        
        while (i < j) {
            while(i < j && !set.contains(s.charAt(i))) {
                i++;
            }
            
            while(i < j && !set.contains(s.charAt(j))) {
                j--;
            }
            
            swap(arr, i, j);
            i++;
            j--;
        }
        
        return new String(arr);
        
    }
    
    public void swap(char[] arr, int i, int j) {
        char temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}