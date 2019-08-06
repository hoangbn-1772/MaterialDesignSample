package com.example.materialdesignsample.ui.activity

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.materialdesignsample.R
import com.example.materialdesignsample.data.model.Mail
import com.example.materialdesignsample.ui.base.BaseActivity

class DetailActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail)
    }

    override fun getMenu(): Int = R.menu.menu_detail

    override fun getFabIcon(): Int = R.drawable.ic_reply_all_black_24dp

    companion object {

        fun getDetailIntent(context: Context, mail: Mail): Intent {
            val intent = Intent(context, DetailActivity::class.java)
            val bundle = Bundle().apply {
                putParcelable("EXTRA_MAIL", mail)
            }
            intent.putExtras(bundle)
            return intent
        }
    }
}
