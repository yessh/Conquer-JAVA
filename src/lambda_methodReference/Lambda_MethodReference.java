package lambda_methodReference;

class A {

    int cal_plus(int a, int b) {
        return a + b;
    }
    int cal_minus(int a, int b) {
        return a - b;
    }
}


class B {

    A a = new A();

    MyFunction lambda_plus = (a,b) -> a + b;
    MyFunction lambda_minus = (a,b) -> a - b;

    MyFunction reference_plus = a::cal_plus;
    MyFunction reference_minus = a::cal_minus;


}


@FunctionalInterface
interface MyFunction {
    int calculate(int a, int b);
}