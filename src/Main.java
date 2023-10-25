public class Main {
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student = new Student("lll");

        if (student instanceof Cloneable) {
            Object clone = student.clone();
            System.out.println("clone = " + clone);
        }
    }
}