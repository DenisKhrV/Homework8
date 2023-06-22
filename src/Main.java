import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();

    }

    public static void task1(){
        int numbers[] = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        double doubleNumbers[]= {1.57, 7.654, 9.986};
        int random[] = {1,2,3,4,5,6,7,8,9,10};
    }

    public static void task2() {
        System.out.println("Задача 2");

        int numbers[] = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
           if(i!=2) {
               System.out.print(numbers[i] + ", ");
           }else{
               System.out.println(numbers[2]);
           }
        }

        double doubleNumbers[] = {1.57, 7.654, 9.986};
        for (int i = 0; i < doubleNumbers.length; i++) {
            if (i != 2) {
                System.out.print(doubleNumbers[i] + ", ");
            } else {
                System.out.println(doubleNumbers[2]);
            }
        }

        int random[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        for (int i = 0; i < random.length; i++) {
            if(i< random.length-1) {
                System.out.print(random[i] + ", ");
            }else{
                System.out.println(random[random.length-1]);
            }
        }

        }
        public static void task3(){
        System.out.println("\nЗадача 3");
            int numbers[] = new int[3];
            numbers[0] = 1;
            numbers[1] = 2;
            numbers[2] = 3;
            for (int i = 2; i >= 0; i--) {
                if(i == 0) {
                    System.out.println(numbers[i]);
                    break;
                }
                System.out.print(numbers[i] + ", ");
            }

            double doubleNumbers[] = {1.57, 7.654, 9.986};
            for (int i = 2; i >= 0; i--) {
                if (i == 0) {
                    System.out.println(doubleNumbers[i]);
                    break;
                }
                System.out.print(doubleNumbers[i] + ", ");

            }

            int random[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
            for (int i = random.length-1; i >= 0; i--) {
                if(i==0) {
                    System.out.println(random[i]);
                    break;
                }
                System.out.print(random[i] + ", ");
            }
    }
    public static void task4(){
        System.out.println("\nЗадача 4");
        int numbers[] = new int[3];
        numbers[0] = 1;
        numbers[1] = 2;
        numbers[2] = 3;
        for (int i = 0; i < 3; i++) {
            if(numbers[i] % 2 != 0){
                numbers[i] += 1;
            }
        }
        System.out.println(Arrays.toString(numbers));
    }

}
