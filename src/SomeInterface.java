public interface SomeInterface {

    public static final String NAME_VAR = "asdasd";

    public void foo();
    public default void foo1() {
        System.out.println("asd");
    };

}
