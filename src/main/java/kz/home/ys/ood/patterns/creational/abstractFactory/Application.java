package kz.home.ys.ood.patterns.creational.abstractFactory;

public class Application {

    private static GuiFactory factory = null;

    public Application(GuiFactory factory) {
        Application.factory = factory;
    }

    public static void main(String[] args) {
        Button button = factory.createButton();
        Checkbox checkbox = factory.createCheckbox();
    }
}
