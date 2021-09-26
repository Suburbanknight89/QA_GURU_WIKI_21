package tests;

import io.appium.java_client.MobileBy;
import org.junit.jupiter.api.Test;

import static com.codeborne.selenide.Condition.text;
import static com.codeborne.selenide.Selenide.$;
import static io.qameta.allure.Allure.step;

public class Tests extends TestBase {
    @Test
    void checkContentTest() {

        step("First page test", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/view_onboarding_page_primary_text"))
                    .shouldHave(text("The Free Encyclopedia …in over 300 languages"));
        });

        step("Click continue", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Second page", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/view_onboarding_page_secondary_text"))
                    .shouldHave(text("\t\n" +
                            "Dive down the Wikipedia rabbit hole with a constantly updating Explore feed. Customize the" +
                            " feed to your interests – whether it’s learning about historical events On this day, or " +
                            "rolling the dice with Random."));
        });

        step("Click continue", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Third page", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/view_onboarding_page_secondary_text"))
                    .shouldHave(text("You can make reading lists from articles you want to read later, even when you’re" +
                            " offline. Login to your Wikipedia account to sync your reading lists. Join Wikipedia"));
        });

        step("Click continue", () ->
                $(MobileBy.id("org.wikipedia.alpha:id/fragment_onboarding_forward_button")).click());

        step("Send anonymous data", () -> {
            $(MobileBy.id("org.wikipedia.alpha:id/view_onboarding_page_secondary_text"))
                    .shouldHave(text("Help make the app better by letting us know how you use it. Data collected is anonymous. Learn more"));
        });
    }

}