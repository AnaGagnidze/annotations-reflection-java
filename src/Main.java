import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Cat toby = new Cat("Brown", 2);

        Annotation catAnnotation = toby.getClass().getAnnotation(Pet.class);
        Pet pet = (Pet)catAnnotation;
        System.out.println(pet.petTheCat());

        Class catReflection = toby.getClass();
        for (Method i : catReflection.getDeclaredMethods()) {
            if (i.getName().equals("isCatCute")) {
                i.setAccessible(true);
                i.invoke(toby);
            }
        }
//        Method cuteCat = catReflection.getDeclaredMethod("isCatCute");
//        cuteCat.invoke(toby);

    }
}