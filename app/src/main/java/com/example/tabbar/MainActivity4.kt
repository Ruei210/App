package com.example.tabbar

import android.os.AsyncTask
import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import kotlinx.android.synthetic.main.fragment_option.*

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.fragment_option)
        btn_calculate.setOnClickListener {
            when {
                ed_height.length() < 1 -> Toast.makeText(this, "請輸入身高", Toast.LENGTH_SHORT).show()
                ed_weight.length() < 1 -> Toast.makeText(this, "請輸入體重", Toast.LENGTH_SHORT).show()
                else -> runAsyncTask()
            }
        }

    }

    private fun runAsyncTask() {
        object : AsyncTask<Void, Int, Boolean>() {
            override fun onPreExecute() {
                super.onPreExecute()
                tv_bmi.text = "BMI值\n無"
                progressBar2.progress = 0
                tv_progress.text = "0%"
                proGress.visibility = View.VISIBLE
            }

            override fun doInBackground(vararg voids: Void): Boolean? {
                var progress = 0
                while (progress <= 100) {
                    try {
                        Thread.sleep(50)
                        publishProgress(progress)
                        progress++
                    } catch (e: InterruptedException) {
                        e.printStackTrace()
                    }
                }
                return true
            }

            override fun onProgressUpdate(vararg values: Int?) {
                super.onProgressUpdate(*values)
                values[0]?.let {
                    progressBar2.progress = it
                    tv_progress.text = "$it%"
                }
            }

            override fun onPostExecute(status: Boolean?) {
                proGress.visibility = View.GONE
                val cal_height = ed_height.text.toString().toDouble()
                val cal_weight = ed_weight.text.toString().toDouble()
                val cal_standweight: Double
                val cal_bodyfat: Double
                if (btn_boy.isChecked) {
                    cal_standweight = (cal_height - 80) * 0.7
                    cal_bodyfat = (cal_weight - 0.88 * cal_standweight) / cal_weight * 100
                } else {
                    cal_standweight = (cal_height - 70) * 0.6
                    cal_bodyfat = (cal_weight - 0.82 * cal_standweight) / cal_weight * 100
                }
                tv_bmi.text = "BMI值\n${String.format("%.2f", cal_bodyfat)}"
            }

        }.execute()
    }
}