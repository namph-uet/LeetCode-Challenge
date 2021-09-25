class Solution {
    public int[] twoSum(int[] nums, int target) {
        List<Integer> inputList = Arrays.stream(nums).boxed().collect(Collectors.toList());
        int []output = new int[2];
        for(int i = 0; i < inputList.size(); i++) {
            int secondNum = inputList.get(i);
            if(inputList.contains(target - secondNum)) {
                int secondNumIndex = inputList.indexOf(target - secondNum);
                output[0] = i;
                if(i == secondNumIndex) {
                    inputList.set(secondNumIndex, secondNum - 1);
                    if(inputList.contains(target - secondNum)) {
                        output[1] = inputList.indexOf(target - secondNum);
                        break;
                    }
                    else {
                        inputList.set(secondNumIndex, secondNum);
                    }
                } else {
                    output[1] = secondNumIndex;
                    break;
                }
            }
        }

        return output;
    }
}