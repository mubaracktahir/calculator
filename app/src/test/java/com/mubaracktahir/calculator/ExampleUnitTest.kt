package com.mubaracktahir.calculator

import org.hamcrest.CoreMatchers.equalTo
import org.junit.Assert.assertEquals
import org.junit.Assert.assertThat
import org.junit.Before
import org.junit.Test

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class ExampleUnitTest {

    lateinit var calculator: Calculator;

    @Before
    fun setUp(){
        calculator = Calculator()
    }
    @Test
    fun addition_isCorrect() {

        var answer = calculator.sub(222.0,30.0)
        assertThat(answer, equalTo(192.0))
    }
}
