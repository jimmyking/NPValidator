package com.jimmy.test.npvalidator;

import com.jimmy.test.npvalidator.pojo.Car;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

import javax.validation.ConstraintViolation;
import javax.validation.Validation;
import javax.validation.Validator;
import javax.validation.ValidatorFactory;
import java.util.Set;

public class NpNotBlankTest {

    private static Validator validator;

    @BeforeClass
    public static void setUp() {
        ValidatorFactory factory = Validation.buildDefaultValidatorFactory();
        validator = factory.getValidator();
    }



    @Test
    public void test(){
        Car car = new Car();
        car.setBrand("");

        Set<ConstraintViolation<Car>> constraintViolations =
                validator.validate( car );

        assertEquals( 1, constraintViolations.size() );
        assertEquals(
                "brand is null",
                constraintViolations.iterator().next().getMessage()
        );
    }
}
