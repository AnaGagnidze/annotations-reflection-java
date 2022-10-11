@Pet(PettingTypes.SOFT)
public class Cat {
    private final String color;
    private final Integer age;

    public Cat(String color, Integer age) {
        this.color = color;
        this.age = age;
    }


    public String getColor() {
        return color;
    }

    public Integer getAge() {
        return age;
    }

    private Boolean isCatCute() {
        return true;
    }
}
