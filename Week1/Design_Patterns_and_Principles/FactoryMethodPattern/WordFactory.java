package Week1.Design_Patterns_and_Principles.FactoryMethodPattern;

public class WordFactory extends DocumentFactory {
    public Document createDocument() {
        return new WordDocument();
    }
}