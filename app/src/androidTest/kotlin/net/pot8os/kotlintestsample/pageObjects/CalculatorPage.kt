package net.pot8os.kotlintestsample.pageObjects

import androidx.test.espresso.matcher.ViewMatchers.withId
import net.pot8os.kotlintestsample.R
import androidx.test.espresso.Espresso.onView
import androidx.test.espresso.action.ViewActions.click

class CalculatorPage {

    //region Locators for buttons for digits
    private val digit1btn = withId(R.id.button_1)
    private val digit2btn = withId(R.id.button_2)
    private val digit3btn = withId(R.id.button_3)
    private val digit4btn = withId(R.id.button_4)
    private val digit5btn = withId(R.id.button_5)
    private val digit6btn = withId(R.id.button_6)
    private val digit7btn = withId(R.id.button_7)
    private val digit8btn = withId(R.id.button_8)
    private val digit9btn = withId(R.id.button_9)
    private val digit0btn = withId(R.id.button_0)
    //endregion

    //region Locators for buttons for mathematical operations
    private val divisionOperationBtn = withId(R.id.button_div)
    private val multiplicationOperationBtn = withId(R.id.button_mul)
    private val subtractionOperationBtn = withId(R.id.button_sub)
    private val summationOperationBtn = withId(R.id.button_sum)
    //endregion
    
    //region Locators for other buttons
    private val calculateResultBtn = withId(R.id.button_calc)
    private val clearAllBtn = withId(R.id.button_all_clear)
    //endregion

    //region Fields
    private val calculationField = withId(R.id.field)
    //endregion

    //region Getters. Functions to get private variables.
    fun getDigit1btn() = digit1btn
    fun getDigit2btn() = digit2btn
    fun getDigit3btn() = digit3btn
    fun getDigit4btn() = digit4btn
    fun getDigit5btn() = digit5btn
    fun getDigit6btn() = digit6btn
    fun getDigit7btn() = digit7btn
    fun getDigit8btn() = digit8btn
    fun getDigit9btn() = digit9btn
    fun getDigit0btn() = digit0btn
    fun getDivisionOperationBtn() = divisionOperationBtn
    fun getMultiplicationOperationBtn() = multiplicationOperationBtn
    fun getSubtractionOperationBtn() = subtractionOperationBtn
    fun getSummationOperationBtn() = summationOperationBtn
    fun getCalculateResultBtn() = calculateResultBtn
    fun getClearAllBtn() = clearAllBtn
    fun getCalculationField() = calculationField
    //endregion

    //region Functions for interactions with digits buttons
    fun tapDigit1Btn(){
        onView(digit1btn).perform(click())
    }

    fun tapDigit2Btn(){
        onView(digit2btn).perform(click())
    }

    fun tapDigit3Btn(){
        onView(digit3btn).perform(click())
    }

    fun tapDigit4Btn(){
        onView(digit4btn).perform(click())
    }

    fun tapDigit5Btn(){
        onView(digit5btn).perform(click())
    }

    fun tapDigit6Btn(){
        onView(digit6btn).perform(click())
    }

    fun tapDigit7Btn(){
        onView(digit7btn).perform(click())
    }

    fun tapDigit8Btn(){
        onView(digit8btn).perform(click())
    }

    fun tapDigit9Btn(){
        onView(digit9btn).perform(click())
    }

    fun tapDigit0Btn(){
        onView(digit0btn).perform(click())
    }
    //endregion

    //region Functions for interactions with operations buttons
    fun tapDivisionOperationBtn(){
        onView(divisionOperationBtn).perform(click())
    }

    fun tapMultiplicationOperationBtn(){
        onView(multiplicationOperationBtn).perform(click())
    }

    fun tapSubtractionOperationButton(){
        onView(subtractionOperationBtn).perform(click())
    }

    fun tapSummationOperationButton(){
        onView(summationOperationBtn).perform(click())
    }
    //endregion

    //region Functions for interactions with other buttons
    fun tapCalculateResultBtn(){
        onView(calculateResultBtn).perform(click())
    }

    fun tapClearAllBtn(){
        onView(clearAllBtn).perform(click())
    }
    //endregion



}