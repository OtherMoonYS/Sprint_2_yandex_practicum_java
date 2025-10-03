package org.example;


import model.Apple;
import model.Food;
import model.Meat;
import model.constants.Colour;
import model.constants.Discount;
import model.service.ShoppingCard;


public class Main {
    public static void main(String[] args) {
        var meat = new Meat(100, 5);
        var red = new Apple(10, 50, Colour.RED);
        var green = new Apple(8, 60, Colour.GREEN);

        Food[] items = {meat, red, green};
        var cart = new ShoppingCard(items);

        System.out.println(String.format("Общая сумма товаров без скидки: ", cart.totalPrice()));
        System.out.println(String.format("Общая сумма всех товаров со скидкой: ", cart.discountPrice()));
        System.out.println(String.format("Общая сумма всех вегатерианских продуктов без скидки: ", cart.vegetarianPrice()));
    }
}