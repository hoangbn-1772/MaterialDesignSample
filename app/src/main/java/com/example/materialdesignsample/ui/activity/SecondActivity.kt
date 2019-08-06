package com.example.materialdesignsample.ui.activity

import android.os.Bundle
import com.example.materialdesignsample.R
import com.example.materialdesignsample.ui.base.BaseActivity

class SecondActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_second)
    }

    override fun getMenu(): Int = R.menu.bottom_menu_list

    override fun getFabIcon(): Int = R.drawable.ic_edit_black_24dp
}
