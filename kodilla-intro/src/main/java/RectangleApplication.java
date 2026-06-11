public class RectangleApplication {
    public static void main(String[] args) {

        Rectangle rectangle = new Rectangle(12, 36);
        rectangle.calculateArea();  //Czy skoro niżej utworzona jest zmienna która wywoływa metodę, to czy da linijka jest w ogóle potrzebna?
        int area = rectangle.calculateArea();
        System.out.println("Pole wynosi: " + area);
    }
}