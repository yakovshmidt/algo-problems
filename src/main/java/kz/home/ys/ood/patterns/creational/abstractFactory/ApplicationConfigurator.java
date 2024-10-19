package kz.home.ys.ood.patterns.creational.abstractFactory;

public class ApplicationConfigurator {

    public static void main(String[] args) {
        GuiFactory factory;
        if (System.getProperty("os").equals("Windows")) {
            factory = new WindowsFactory();
        } else {
            factory = new MacFactory();
        }

        Application application = new Application(factory);
    }
}
