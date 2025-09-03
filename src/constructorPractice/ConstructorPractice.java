package constructorPractice;

class A {

    Long id;
    String name;

    int A(Long id, String name) {
        this.id = id;
        this.name = name;
        return 0;
    }
    // 생성자에 반환값 적을시, 생성자가 아닌 메서드로 인식.
}


class B {

    A a = new A();

    // int constructorPractice.A(--){--} 가 메서드로 인식되었기에, 자동으로 기본 생성자 사용.
}