public class Person {
    // Using an integer to represent the birthday simplifies random number generation
    // and direct comparisons (instead of dealing with date objects or strings).
    private int birthday;

    public Person(int birthday) {
        this.birthday = birthday;
    }

    public int getBirthday() {
        return birthday;
    }
}
