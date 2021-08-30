public class Practise6thAug {

    public static void main(String[] args) {
        threeLargestNumbers();
        String input = "";


        //calling a method
        String result = processing(input);

        patternProgram();

    }

    private static void patternProgram() {
        for(int i = 1; i < 6; i++) {
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }


    private static String processing(String input) {

        /*

        <returnType> <MethodName> (<input arguments>)
        Method Definition : Basically we are defining a method.
        processing - method name
        String input : input arguments. In english, there is function called
        "processing" which expects an input argument called input which will be
        of String data type
        String : This String value says that the processing function will return
        a value, and that value will be of String datatype
         */
        return "";
    }

    private static void threeLargestNumbers() {
        /*
        We are given an array, and we need to find the three largest numbers from that array
         */
        int[] input = { -1, -4, 4,5,6,7,8,6,45,34,3,45,6,67,7,78,8,8,7,65,5,4};

        int FirstLargest = Integer.MIN_VALUE; // Maximum element  45
        int SecondLargest = Integer.MIN_VALUE; // second maximum element    34
        int ThirdLargest = Integer.MIN_VALUE; //third ....   8

        //Sort the array and determine the last three elements.

        //but what if we do not want to sort the array ?

        for(int i = 0; i < input.length; i++) {
                int current = input[i];
                if(FirstLargest < current) {
                    ThirdLargest = SecondLargest;
                    SecondLargest = FirstLargest;
                    FirstLargest = current;
                } else if (SecondLargest < current) {
                    ThirdLargest = SecondLargest;
                    SecondLargest = current;
                } else if (ThirdLargest < current) {
                    ThirdLargest = current;
                }
        }

        System.out.println(FirstLargest + "   " + SecondLargest + "  " + ThirdLargest);


    }

}
