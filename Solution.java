class Solution {
    public List<String> fizzBuzz(int n) {
        ArrayList<String> arr = new ArrayList<>();
        for (int i = 1; i <= n; i++) {
            String str = "";
            boolean checker = false;
            if (i % 3 == 0) {
                checker = true;
                str = "Fizz";
            }
            if (i % 5 == 0) {
                checker = true;
                str += "Buzz";
            }
            if (!checker) {
                str = String.valueOf(i);
            }
            arr.add(str);
        }
        return arr;
    }
}
