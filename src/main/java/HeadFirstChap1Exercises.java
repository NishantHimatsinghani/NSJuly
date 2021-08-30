public class HeadFirstChap1Exercises {

    //function has a set of instructions that some ones asks it to execute.
    //How does someone ask ? : via the Class. Every function exists inside of a class.
    //the main methods signature is significant and unique.."  public static void main(String[] args)" is recognized by the JVM.
    //Internally, a THREAD will be assigned a function to be executed : " public static void main(String[] args)" using the Class scope

    public static void main(String[] args) { // card 1
        //example1();
        //example2();
        example3();
    }

    private static void example3() {
        int x = 0;
        while(x<4) {
            if(x<1) {
                System.out.print("a ");
                System.out.print("noise");
            }
            ////
            if(x>1) {
                ////
                System.out.print("an");
                System.out.print(" oyster");//x=2
                x=x+2;//4
            }
            if(x==1) {
                System.out.print("annoys");
            }
            if(x>3){
                //
            }
            System.out.println("");
            x=x+1;//x=4
        }
    }

    private static void example2() {
        int x = 0; int y = 0;
        while(x < 5) {

            y=x-y;

            System.out.print(x + "" + y + " ");
            x=x+1;

        }
        System.out.println("dfa");
    }

    private static void example1() {
        int x = 3;// card 2
        if(x > 2) {
            System.out.print("a");
        }//card 3

        while (x>0) {

            x = x - 1;
            System.out.print("-");//x=1

            if(x == 2) {
                System.out.print("b c");
            }

            if(x == 1) {
                System.out.print("d");
                x = x - 1;

            }
        }
    }


}
