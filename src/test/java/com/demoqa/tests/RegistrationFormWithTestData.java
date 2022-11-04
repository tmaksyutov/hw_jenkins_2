package com.demoqa.tests;

import com.demoqa.pages.RegistrationFormPage;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;
import static com.demoqa.testData.UserData.*;
import static io.qameta.allure.Allure.step;

public class RegistrationFormWithTestData extends TestBase {
    RegistrationFormPage registrationFormPage = new RegistrationFormPage();

    @Test
    @Tag("test_form")
    void fillFormTest () {

        step("Open page",() -> {
            registrationFormPage.openPage();
        });

        step("Set data", () -> {
            registrationFormPage.setFirstName(firstName)
                    .setLastName(lastName)
                    .setEmail(email)
                    .setGender(gender)
                    .setNumber(number)
                    .setDate(day, month, year)
                    .setHobbies(hobby)
                    .setSubjects(subject)
                    .setUploadPicture(path)
                    .setAddress(address)
                    .setState(state)
                    .setCity(city);
        } );

        step("Click button Submit", () -> {
            registrationFormPage.setSubmit();
        });

        step("Check result", () ->{
            registrationFormPage.checkResultsTableVisible()
                    .checkResultTableData(firstName, lastName, email, gender,
                            number, date, hobby, subject, picture, address, state, city);
        });
    }

}
