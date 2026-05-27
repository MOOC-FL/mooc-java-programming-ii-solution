public class books {
    private String name;
    private int age;

    public books(String name) {
        this.name = name;
        this.age = 0;
    }
    public books(int age) {
        this.name = "";
        this.age = age;
    }
    public books(String name, int age) {
        this.name = name;
        this.age = age;
    }
    @Override
    public String toString() {
        return this.name + " (recommended for " + this.age + " year-olds or older)";
    }
}
