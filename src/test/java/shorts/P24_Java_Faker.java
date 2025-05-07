package shorts;

import com.github.javafaker.Faker;
import org.testng.annotations.Test;

public class P24_Java_Faker {
    @Test
    public void javafakerTest(){
        Faker faker = new Faker();
        System.out.println("faker.name().fullName() = " + faker.name().fullName());

        System.out.println("faker.address().fullAddress() = " + faker.address().fullAddress());
        System.out.println("faker.numerify(\"###-###-####\") = " + faker.numerify("###-###-####"));
        System.out.println("faker.letterify(\"??????\") = " + faker.letterify("??????"));


    }
}
