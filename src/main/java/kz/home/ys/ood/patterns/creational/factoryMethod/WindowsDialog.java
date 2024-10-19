package kz.home.ys.ood.patterns.creational.factoryMethod;

public class WindowsDialog extends Dialog {

    public Button createButton() {
        return new WindowsButton();
    }
}
