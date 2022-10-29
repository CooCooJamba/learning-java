public class ConcreteFactory<Complex> implements ComplexAbstractFactory<Complex> {
    @Override
    public Complex createComplex() {
        System.out.println("a + i * b");
        return null;
    }

    @Override
    public Complex CreateComplex(int real, int image) {
        Complex c = (Complex) (real + " + i * " + image);
        System.out.println(c);
        return c;
    }
}
