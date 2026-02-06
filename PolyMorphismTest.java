package Polymorphism;



    class Shape {
        public void Draw() {
            System.out.println(" drawing a shape ");
        }

    }
 class Rectanglle extends Shape {
    @Override
    public void Draw() {
        System.out.println(" Rectangle  has 4 angles");
    }
}


class Square extends Shape{
        @Override
        public void Draw(){
            System.out.println("  square  is a shape");
        }
    }



    public class PolyMorphismTest {
        public static void main(String[] args) {
            Shape shape=new Rectanglle();
            shape.Draw();// Here Draw override with UPCASTING
            // print rectangle method
            shape=new Square();// override parent with child UPCASTING
            shape.Draw();// print sqaure method
           shape=new Shape();// orignoal
            shape.Draw();// print originaol
        }
    }

