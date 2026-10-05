public class FindLargest {
    public static void main(String[] args) {
        int[] numbers = {-10, -5, -20, -3};
        int largest = numbers[0];
        int second_largest = 0;
        boolean foundSecond = false;

        for (int i = 1; i < numbers.length; i++) {

            if (numbers[i] > largest) {
                second_largest = largest;
                largest = numbers[i];
                foundSecond = true;
            }

            else if (numbers[i] < largest &&
             (!foundSecond || numbers[i] > second_largest)) {
                second_largest = numbers[i];
                foundSecond = true;
            }
        }
        System.out.println("Largest element: "+largest);
        if(!foundSecond){
            System.out.println("No second largest distinct element is found");
        }
        else{
            System.out.println("Second largest element: " + second_largest);
        }
    }
}
