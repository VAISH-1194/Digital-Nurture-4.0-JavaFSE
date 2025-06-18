package Week1.Design_Patterns_and_Principles.FactoryMethodPattern;

public class PdfFactory extends DocumentFactory {
    public Document createDocument() {
        return new PdfDocument();
    }
}