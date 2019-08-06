package com.example.materialdesignsample.animation

import android.animation.Animator
import android.animation.AnimatorListenerAdapter
import android.animation.ValueAnimator
import android.annotation.TargetApi
import android.content.Context
import android.graphics.drawable.Animatable
import android.graphics.drawable.Drawable
import android.os.Build
import android.util.AttributeSet
import android.view.View
import com.example.materialdesignsample.R
import com.google.android.material.floatingactionbutton.FloatingActionButton

@TargetApi(Build.VERSION_CODES.LOLLIPOP)
class FabAnimatableTransition(context: Context, attrs: AttributeSet) : BaseForcedTransition(context, attrs) {

    private val animatable: Animatable

    init {
        val a = context.obtainStyledAttributes(attrs, R.styleable.FabAnimatable)
        val drawable = a.getDrawable(R.styleable.FabAnimatable_android_src)
        a.recycle()
        if (drawable is Animatable) {
            animatable = drawable
        } else {
            throw IllegalArgumentException("Non-Animatable resource provided.")
        }
    }

    override fun getAnimator(view: View): Animator = createAnimation(view)


    // ---

    private fun createAnimation(view: View): ValueAnimator {
        val fab = view as FloatingActionButton
        fab.setImageDrawable(animatable as Drawable)

        val transition = ValueAnimator.ofInt(0, 1)
        transition.addListener(object : AnimatorListenerAdapter() {
            override fun onAnimationStart(animation: Animator) {
                animatable.start()
            }
        })
        return transition!!
    }
}