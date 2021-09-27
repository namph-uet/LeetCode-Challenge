class Solution {
    public boolean isPalindrome(int x) {
        String xs = String.valueOf(x);
        StringBuilder s = new StringBuilder();
        return (s.append(xs).reverse().toString().equals(xs));
    }
}