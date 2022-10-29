public class main {
    public static void main(String[] args) {
        ComplexAbstractFactory<String> cf = new ConcreteFactory<>();
        cf.CreateComplex(10, 22);
        cf.createComplex();
    }
}
