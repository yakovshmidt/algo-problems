package kz.home.ys.ood.patterns.creational.factoryMethod;

public class WindowsButton implements Button {

    @Override
    public void render() {
        System.out.println("<windows_button>Test Button</windows_button>");
        onClick();
    }

    @Override
    public void onClick() {
        System.out.println("Listener has just added!");
    }
}
