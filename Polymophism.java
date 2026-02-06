package Polymorphism;


    class Addition {
        int add(int a, int b) {
            return a + b;
        }

        int add(int a, int b, int c) {
            return a + b + c;
        }

        double add(double a, int b, int c, int d) {
            return a + b + c + d;
        }
    }

    public class Polymophism {
        public static void main(String[] args) {
            Addition sum = new Addition();
            System.out.println(sum.add(2, 3,3));            // 5
            System.out.println(sum.add(2, 4));         // 9
            System.out.println(sum.add(2, 3, 4, 5));      // 14
        }
    }



