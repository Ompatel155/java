interface A {
    abstract void login();
}

class B implements A {
    public void login() {
        System.out.println("Hello");
    }
}

class hello {
    public static void main(String[] args) {
        B obj = new B();
        obj.login();

    }
}