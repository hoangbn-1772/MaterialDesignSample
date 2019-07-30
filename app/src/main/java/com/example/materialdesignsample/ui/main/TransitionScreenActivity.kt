package com.example.materialdesignsample.ui.main

import android.os.Bundle
import com.example.materialdesignsample.R
import com.example.materialdesignsample.ui.base.BaseActivity

class TransitionScreenActivity : BaseActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_transition_screen)
    }

    override fun getMenu(): Int = R.menu.bottom_menu_list

    override fun getFabIcon(): Int = R.drawable.ic_edit_black_24dp
}
