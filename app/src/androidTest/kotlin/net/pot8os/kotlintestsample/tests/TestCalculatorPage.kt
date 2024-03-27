package net.pot8os.kotlintestsample.tests

import android.content.Intent
import androidx.test.core.app.ActivityScenario
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.assertion.ViewAssertions.matches
import androidx.test.espresso.intent.rule.IntentsRule
import androidx.test.espresso.matcher.ViewMatchers.withText
import androidx.test.ext.junit.runners.AndroidJUnit4
import androidx.test.platform.app.InstrumentationRegistry
import net.pot8os.kotlintestsample.MainActivity
import net.pot8os.kotlintestsample.pageObjects.CalculatorPage
import org.junit.After
import org.junit.Before
import org.junit.Test
import org.junit.runner.RunWith

@RunWith(AndroidJUnit4::class)
class TestCalculatorPage {

    //region Variable that are predefined and will be initialized later
    private lateinit var calculatorPage: CalculatorPage

    private lateinit var intentsRule: IntentsRule
    private lateinit var launchIntent: Intent
    private lateinit var scenario: ActivityScenario<MainActivity>
    //endregion


    @Before
    fun setup() {
        this.calculatorPage = CalculatorPage()
        this.intentsRule = IntentsRule()

        val applicationContext = InstrumentationRegistry.getInstrumentation().context
        this.launchIntent = Intent(applicationContext, MainActivity::class.java)
        this.scenario = ActivityScenario.launch(MainActivity::class.java)
    }

    @Test
    fun testInputProvisioningAndCleanup(){
        calculatorPage.tapDigit1Btn()
        calculatorPage.tapDigit2Btn()
        calculatorPage.tapDigit3Btn()
        onView(calculatorPage.getCalculationField()).
        check(matches
            (withText
            ("123")))
        calculatorPage.tapClearAllBtn()
        onView(calculatorPage.getCalculationField()).
        check(matches
            (withText
            ("0")))
    }

    @Test
    fun testSummation() {
        calculatorPage.tapDigit1Btn()
        calculatorPage.tapDigit2Btn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapSummationOperationButton()
        calculatorPage.tapDigit4Btn()
        calculatorPage.tapDigit5Btn()
        calculatorPage.tapDigit6Btn()
        calculatorPage.tapCalculateResultBtn()
        onView(calculatorPage.getCalculationField()).
        check(matches
            (withText
            ("579")))
    }

    @Test
    fun testSubtraction() {
        calculatorPage.tapDigit8Btn()
        calculatorPage.tapDigit5Btn()
        calculatorPage.tapDigit0Btn()
        calculatorPage.tapSubtractionOperationButton()
        calculatorPage.tapDigit2Btn()
        calculatorPage.tapDigit5Btn()
        calculatorPage.tapCalculateResultBtn()
        onView(calculatorPage.getCalculationField()).
        check(matches
            (withText
            ("825")))
    }

    @Test
    fun testDivision() {
        calculatorPage.tapDigit9Btn()
        calculatorPage.tapDigit9Btn()
        calculatorPage.tapDigit9Btn()
        calculatorPage.tapDivisionOperationBtn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapCalculateResultBtn()
        onView(calculatorPage.getCalculationField()).
        check(matches
            (withText
            ("3")))
    }

    @Test
    fun testMultiplication() {
        calculatorPage.tapDigit9Btn()
        calculatorPage.tapDigit9Btn()
        calculatorPage.tapDigit9Btn()
        calculatorPage.tapMultiplicationOperationBtn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapDigit3Btn()
        calculatorPage.tapCalculateResultBtn()
        onView(calculatorPage.getCalculationField()).
        check(matches
            (withText
            ("332,667")))
    }

    @After
    fun tearDown() {
        calculatorPage.tapClearAllBtn()
        this.scenario.close()
    }

}