public class ProgramFor2 {
    public static void main(String[] args) {

        for (int x = 0; x < 10; x++) {

            System.out.println("x: " + x);
        }

        System.out.println("*************");
        int nums[] = {10,2,30,4,50,6,70,8,90};

        for (int x : nums){
            System.out.println("value is: " + x);
        }


    }
}