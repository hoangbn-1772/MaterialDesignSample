package com.example.materialdesignsample.ui.main

import android.os.Build
import android.os.Bundle
import android.transition.ChangeBounds
import android.transition.Transition
import android.transition.TransitionManager
import android.view.Gravity
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.view.animation.*
import android.widget.LinearLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.appcompat.widget.AppCompatButton
import androidx.interpolator.view.animation.FastOutLinearInInterpolator
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import com.arlib.floatingsearchview.FloatingSearchView
import com.arlib.floatingsearchview.suggestions.model.SearchSuggestion
import com.example.materialdesignsample.R
import com.google.android.material.appbar.AppBarLayout
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), AppBarLayout.OnOffsetChangedListener,
    FloatingSearchView.OnQueryChangeListener, FloatingSearchView.OnSearchListener,
    FloatingSearchView.OnFocusChangeListener, FloatingSearchView.OnMenuItemClickListener,
    FloatingSearchView.OnHomeActionClickListener, View.OnClickListener {

    private lateinit var transition: Transition

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        initComponents()
    }

    override fun onClick(v: View?) {
        when (v?.id) {
            R.id.btn_accelerate_decelerate -> if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                btn_accelerate_decelerate?.let {
                    moveButtonWithTransitionEffect(it, AccelerateDecelerateInterpolator())
                }
            }

            R.id.btn_accelerate -> btn_accelerate?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, AccelerateInterpolator())
                }
            }

            R.id.btn_decelerate -> btn_decelerate?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, DecelerateInterpolator())
                }
            }

            R.id.btn_anticipate -> btn_anticipate?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, AnticipateInterpolator())
                }
            }

            R.id.btn_anticipate_overshoot -> btn_anticipate_overshoot?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, AnticipateOvershootInterpolator())
                }
            }

            R.id.btn_bounce -> btn_bounce?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, BounceInterpolator())
                }
            }

            R.id.btn_cycle -> btn_cycle?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, CycleInterpolator(1F))
                }
            }

            R.id.btn_linear -> btn_linear?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, LinearInterpolator())
                }
            }

            R.id.btn_over_shoot -> btn_over_shoot?.let {
                if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
                    moveButtonWithTransitionEffect(it, OvershootInterpolator())
                }
            }

            R.id.btn_fast_out_linear_in -> btn_fast_out_linear_in?.let { button ->
                root_container?.let {
                    transition.interpolator = FastOutLinearInInterpolator()
                    TransitionManager.beginDelayedTransition(it, transition)
                    moveButtonPosition(button)
                }
            }

            R.id.btn_fast_out_slow_in -> btn_fast_out_slow_in?.let { button ->
                root_container?.let {
                    transition.interpolator = FastOutSlowInInterpolator()
                    TransitionManager.beginDelayedTransition(it, transition)
                    moveButtonPosition(button)
                }
            }
        }
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
        transition = ChangeBounds()
        transition.duration = 1500
        app_bar?.addOnOffsetChangedListener(this)
        btn_accelerate_decelerate?.setOnClickListener(this)
        btn_accelerate?.setOnClickListener(this)
        btn_decelerate?.setOnClickListener(this)
        btn_anticipate?.setOnClickListener(this)
        btn_anticipate_overshoot?.setOnClickListener(this)
        btn_bounce?.setOnClickListener(this)
        btn_cycle?.setOnClickListener(this)
        btn_linear?.setOnClickListener(this)
        btn_over_shoot?.setOnClickListener(this)
        btn_fast_out_linear_in?.setOnClickListener(this)
        btn_fast_out_slow_in?.setOnClickListener(this)
    }

    private fun moveButtonWithTransitionEffect(button: AppCompatButton, interpolator: BaseInterpolator) {
        //Set transition interpolator
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP_MR1) {
            if (::transition.isInitialized) {
                transition.interpolator = interpolator
            }
        }

        // Begin transition
        root_container?.let {
            TransitionManager.beginDelayedTransition(it, transition)
        }

        // Move the button from left to right
        moveButtonPosition(button)
    }

    private fun moveButtonPosition(button: AppCompatButton) {
        val newLinearLayoutParams = LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT)

        val layoutParams = button.layoutParams

        val linearLayoutParams: LinearLayout.LayoutParams = layoutParams as LinearLayout.LayoutParams

        val gravity = linearLayoutParams.gravity

        if (gravity == Gravity.START || gravity == -1) {
            newLinearLayoutParams.gravity = Gravity.END
        } else {
            newLinearLayoutParams.gravity = Gravity.START
        }

        button.layoutParams = newLinearLayoutParams
    }

    companion object {
        private const val FIND_SUGGESTION_SIMULATED_DELAY = 250
    }
}
