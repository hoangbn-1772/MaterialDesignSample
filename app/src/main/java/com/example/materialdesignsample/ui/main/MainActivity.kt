package com.example.materialdesignsample.ui.main

import android.os.Bundle
import android.view.MenuItem
import androidx.appcompat.app.AppCompatActivity
import com.arlib.floatingsearchview.FloatingSearchView
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion
import com.example.materialdesignsample.R
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener,
        FloatingSearchView.OnQueryChangeListener, FloatingSearchView.OnSearchListener,
        FloatingSearchView.OnFocusChangeListener, FloatingSearchView.OnMenuItemClickListener,
        FloatingSearchView.OnHomeActionClickListener {

    private var mLastQuery = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
    }

    override fun onOffsetChanged(appBarLayout: AppBarLayout?, verticalOffset: Int) {
        floating_search_view?.translationY = verticalOffset.toFloat()
    }

    override fun onSearchTextChanged(oldQuery: String?, newQuery: String?) {
        if (!oldQuery.equals("") && newQuery.equals("")) {
            floating_search_view?.clearSuggestions()
        } else {
            floating_search_view?.showProgress()

        }
    }

    override fun onSearchAction(currentQuery: String?) {

    }

    override fun onSuggestionClicked(searchSuggestion: SearchSuggestion?) {

    }

    override fun onHomeClicked() {

    }

    override fun onActionMenuItemSelected(item: MenuItem?) {
    }

    override fun onFocusCleared() {
    }

    override fun onFocus() {
    }


    private fun initComponents() {
        app_bar?.addOnOffsetChangedListener(this)
    }

    private fun setupSearchBar() {

    }

    companion object {
        private const val FIND_SUGGESTION_SIMULATED_DELAY = 250
    }
}
