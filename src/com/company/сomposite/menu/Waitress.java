package com.company.сomposite.menu;

public class Waitress {
    MenuComponent allMenus;

    public Waitress() {
        //Init constructor
        MenuComponent puncakeMenu = new Menu("PANCAKE MENU", "Breakfast");
        MenuComponent dinerMenu = new Menu("DINER MENU", "Lunch");
        MenuComponent cafeMenu = new Menu("CAFE MENU", "Dinner");
        MenuComponent desertMenu = new Menu("DESERT MENU", "Dessert of course");

        allMenus = new Menu("ALL MENU", "All menus combined");

        allMenus.add(puncakeMenu);
        allMenus.add(dinerMenu);
        allMenus.add(cafeMenu);

        puncakeMenu.add(new MenuItem("Small Pancakes", "Small Pancakes with sauce", true, 0.99d));
        puncakeMenu.add(new MenuItem("Pancakes", "Pancakes with chocolate", true, 1.49d));
        puncakeMenu.add(new MenuItem("Great Pancakes", "Great Pancakes with two sauce", true, 1.79d));

        dinerMenu.add(new MenuItem("Pasta #1", "Spaghetti", true, 2.17d));
        dinerMenu.add(new MenuItem("Pasta #2", "Bolognese", true, 3.17d));
        dinerMenu.add(new MenuItem("Pasta #3", "King Spaghetti with beef slice", false, 5.17d));

        dinerMenu.add(desertMenu);

        desertMenu.add(new MenuItem("CheeseCake", "NY", false, 0.99d));
        desertMenu.add(new MenuItem("Brownie", "Chocolate", false, 0.99d));
        desertMenu.add(new MenuItem("Cooke", "Chocolate", false, 0.49d));

        cafeMenu.add(new MenuItem("Soup", "chicken", false, 0.55d));
        cafeMenu.add(new MenuItem("Soup", "Path tay", false, 0.85d));
        cafeMenu.add(new MenuItem("Soup", "borsch", false, 0.75d));
    }

    public Waitress(MenuComponent allMenus) {
        this.allMenus = allMenus;
    }

    public void printMenu() {
        allMenus.print();
    }
}
