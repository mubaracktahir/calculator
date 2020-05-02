package com.mubaracktahir.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.util.Log
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {
    private val TAG = "MAINACTIVITY"
    lateinit var calculator: Calculator;
    lateinit var opera: Calculator.Operation;

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        calculator = Calculator();
        opera = Calculator.Operation.SUB
        symbol.text = ""
    }

    /**
     * OnClick method which will be called when the subtraction Button is clicked.
     */

    fun onSub(view: View) {
        if (!isEmpty()) {
            moveFirstNumberUp()
        }
        setOperation(Calculator.Operation.SUB);
        symbol.text = "-"
        answer.text = ""

    }

    /**
     * OnClick method which will be called when the Addition Button is clicked.
     */

    fun onAdd(view: View) {
        if (!isEmpty()) {
            moveFirstNumberUp()
        }
        setOperation(Calculator.Operation.ADD)
        symbol.text = "+"
        answer.text = ""

    }

    /**
     * OnClick method which will be called when the Division Button is clicked.
     */

    fun onDiv(view: View) {
        if (!isEmpty()) {
            moveFirstNumberUp()
        }
        setOperation(Calculator.Operation.DIV)
        symbol.text = "/"
        answer.text = ""

    }

    /**
     * OnClick method which will be called when the multiplication Button is clicked.
     */

    fun onMul(view: View) {
        if (!isEmpty()) {
            moveFirstNumberUp()
        }
        setOperation(Calculator.Operation.MUL)
        symbol.text = "X"
        answer.text = ""

    }

    /**
     * OnClick method which will be called when the multiplication Button is clicked.
     */

    fun onEqu(view: View) {


        if (!isEmpty()) {
            var operation = getOperation()
            compute(operation)

        }


    }


    private fun compute(operator: Calculator.Operation) {
        val firstInput: Double
        val secondInput: Double
        try {
            firstInput = getInputs(editText2)
            secondInput = getInputs(editText1)
        } catch (nfe: java.lang.NumberFormatException) {
            Log.e(TAG, "NumberFormatException", nfe)
            Toast.makeText(this, "inpof", Toast.LENGTH_LONG).show()
            return
        }
        var result = ""
        when (operator) {
            Calculator.Operation.ADD -> result = java.lang.String.valueOf(
                calculator.add(firstInput, secondInput)
            )

            Calculator.Operation.SUB -> result = java.lang.String.valueOf(
                calculator.sub(firstInput, secondInput)
            )
            Calculator.Operation.DIV -> result = java.lang.String.valueOf(
                calculator.div(firstInput, secondInput)
            )
            Calculator.Operation.MUL -> result = java.lang.String.valueOf(
                calculator.mul(firstInput, secondInput)
            )
        }

        answer.text = result
    }


    /*
    *
    * @return check emptiness, check if a number have been inputted or not
    *
    * */
    fun isEmpty(): Boolean {
        val number = editText1.text.toString()
        if (number.equals(""))
            return true
        else
            return false
    }

    /*
    *
    *checks if the the two input field as a value
    *
    *  */
    fun isFilled(): Boolean {
        val number = editText1.text.toString()
        val numbr = editText2.text.toString()
        if (number.equals("")&&numbr.equals(""))
            return false
        else
            return true
    }


    /*
    *
    * moves the first number inputted to the up edith text and set the initials to empty
    *
    * */
    fun moveFirstNumberUp() {
        var input = java.lang.String.valueOf(getInputs(editText1))
        editText2.setText(input)
        editText1.setText("")
    }


    /*
    *
    *
    * */
    fun moveAnswerUp() {
        var input = answer.text
        editText2.setText(input)
        editText1.setText("")
    }

    /*
    *
    * @return Receives the inputs, and returns it Double equivalent.
    *
    * */

    fun getInputs(editText: EditText): Double {
        var value: String = editText.text.toString()
        return java.lang.Double.valueOf(value)
    }


    /*
    *
    * receives the the operator chosen by the user
    *
    * */

    private fun setOperation(operation: Calculator.Operation) {
        opera = operation
    }

    /**
    *
    * @return
    * returns the operator chosen by the user
    *
    * */
    fun getOperation() = opera
    fun deleteAll(view: View) {
        symbol.text= ""
        editText1.setText("")
        editText2.setText("")
        answer.text = ""

    }
}
