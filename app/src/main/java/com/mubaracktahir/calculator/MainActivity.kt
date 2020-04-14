package com.mubaracktahir.calculator

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import android.view.View
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), View.OnClickListener  {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

    }

    override fun onClick(p0: View?) {
        when(p0?.id){
            R.id.equalto ->{

            }
            R.id.divide ->{

            }
            R.id.multiply ->{

            }
            R.id.add ->{

            }
            R.id.subtract ->{

            }
        }
    }


}
