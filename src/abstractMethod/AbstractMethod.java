package abstractMethod;

public class AbstractMethod {

    static int test1;
    static int test2;

    public static void main(String[] args) {
    }
}


class PrivateExample {
    private String secret = "내 비밀이야!"; // private 필드

    private void tellSecret() { // private 메서드
        System.out.println(this.secret);
    }

    // 이 클래스 안에서는 private 멤버를 사용할 수 있어.
    public void accessPrivateMembers() {
        tellSecret(); // 내부에서 호출
        System.out.println(this.secret); // 내부에서 접근
    }
}

class AnotherClass {
    public void tryAccess() {
        PrivateExample example = new PrivateExample();
        // example.tellSecret(); // 에러! private 메서드는 외부에서 호출 불가.
        // String s = example.secret; // 에러! private 필드는 외부에서 접근 불가.
        example.accessPrivateMembers();
    }
}


