package model.service;

import model.Food;

public class ShoppingCard {

    public ShoppingCard(Food[] items) {
        this.items = items;
    }
    private final Food[] items;

    public double totalPrice() {
        double price = 0;


        for (Food item : items) {
            price += item.totalPrice();
        }


        return price;
    }

    public double discountPrice() {
        double price = 0;

        for (Food item : items) {
            price += item.discountPrice();
        }

        return price;
    }

    public double vegetarianPrice () {
        double price = 0;


        for (Food item : items) {
            if (item.isVegetarian()) {
                price += item.totalPrice();
            }
        }


        return price;
    }
}
