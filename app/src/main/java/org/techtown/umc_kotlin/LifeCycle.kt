package org.techtown.umc_kotlin

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import org.techtown.umc_kotlin.databinding.ActivityLifecycleBinding
import org.techtown.umc_kotlin.databinding.ActivityMainBinding

class LifeCycle : AppCompatActivity() {

    private lateinit var viewBinding: ActivityLifecycleBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        viewBinding = ActivityLifecycleBinding.inflate(layoutInflater)
        val view = viewBinding.root
        setContentView(view)

        viewBinding.btnMain.setOnClickListener{
            val intent = Intent(this, LifeCycleTwo::class.java)

                intent.putExtra("data", viewBinding.edtMain.text.toString())
                startActivity(intent)
        }
    }

    override fun onStop() {
        super.onStop()
        var text1 = viewBinding.edtMain.text.toString()

        Toast.makeText(this, text1, Toast.LENGTH_SHORT).show()
    }

    override fun onRestart() {
        super.onRestart()
            val mAlertDialog = AlertDialog.Builder(this@LifeCycle)
            mAlertDialog.setTitle("이어서 작성하겠습니까?") //set alertdialog title
            mAlertDialog.setPositiveButton("예") { dialog, id ->
                //perform some tasks here
            }
            mAlertDialog.setNegativeButton("아니요") { dialog, id ->
                //perform som tasks here
                viewBinding.edtMain.setText(null)
            }
            mAlertDialog.show()

    }
}