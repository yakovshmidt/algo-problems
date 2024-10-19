package kz.home.ys.ood.patterns.creational.factoryMethod;

public class HtmlDialog extends Dialog {

    public Button createButton() {
        return new HtmlButton();
    }
}
