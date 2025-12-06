import model.Apple;
import model.Meat;
import model.Food;
import service.ShoppingCart;
import model.constants.Colour;

public class Main {
    public static void main(String[] args) {

        Meat meat = new Meat(5, 100);
        Apple redApples = new Apple(10, 50, Colour.RED);
        Apple greenApples = new Apple(8, 60, Colour.GREEN);


        Food[] items = {meat, redApples, greenApples};


        ShoppingCart cart = new ShoppingCart(items);


        System.out.println("Общая сумма товаров без скидки: " + cart.getTotalPriceWithoutDiscount());
        System.out.println("Общая сумма товаров со скидкой: " + cart.getTotalPriceWithDiscount());
        System.out.println("Сумма всех вегетарианских продуктов без скидки: " + cart.getVegetarianTotalPrice());
    }
}
