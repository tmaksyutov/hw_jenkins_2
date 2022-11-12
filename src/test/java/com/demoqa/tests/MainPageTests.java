package com.demoqa.tests;

import com.demoqa.utils.DriverUtils;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Condition.visible;
import static com.codeborne.selenide.Selectors.byText;
import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Selenide.open;
import static io.qameta.allure.Allure.step;
import static org.assertj.core.api.Assertions.assertThat;

public class MainPageTests extends TestBase {

    @Test
    @DisplayName("Job search")
    void jobSearchTest() {
        step("Open url 'https://ufa.hh.ru/'", () ->
                open("https://ufa.hh.ru/"));

        step("Enter text in the search bar", () ->
                $("#a11y-search-input").setValue("QA").pressEnter());

        step("Checking for vacancies", () ->
                $("#a11y-main-content").shouldHave(text("QA")));
    }

    @Test
    @DisplayName("Available services")
    void servicesShouldBeVisibleTest() {
        step("Open url 'https://ufa.hh.ru/'", () ->
                open("https://ufa.hh.ru/"));

        step("Go to services section'", () ->
                $(".supernova-overlay").$(byText("Все сервисы")).click());

        step("Section visibility check'", () -> {
            $(".bloko-header-1").shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Available services")
    void dashboardShouldBeVisibleTest() {
        step("Open url 'https://ufa.hh.ru/'", () ->
                open("https://ufa.hh.ru/"));

        step("Dashboard visibility check'", () -> {
            $(".dashboard-tiles-wrapper").shouldBe(visible);
        });
    }

    @Test
    @DisplayName("Page title should have header text")
    void titleTest() {
        step("Open url 'https://ufa.hh.ru/'", () ->
                open("https://ufa.hh.ru/"));

        step("Page title should have text 'Работа в Уфе, поиск персонала и публикация вакансий - ufa.hh.ru'", () -> {
            String expectedTitle = "Работа в Уфе, поиск персонала и публикация вакансий - ufa.hh.ru";
            String actualTitle = title();

            assertThat(actualTitle).isEqualTo(expectedTitle);
        });
    }

}
