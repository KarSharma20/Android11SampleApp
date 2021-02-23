package com.example.color_diff_poc

import android.app.Application
import android.content.Context
import android.graphics.Canvas
import android.graphics.Paint
import android.util.AttributeSet
import android.util.Log
import android.view.View
import androidx.core.view.ViewCompat
import androidx.interpolator.view.animation.FastOutSlowInInterpolator
import androidx.interpolator.view.animation.LinearOutSlowInInterpolator
import com.google.android.material.internal.ViewUtils.dpToPx

class CircularView: View{

    private var mPaint = Paint()
    private val TAG = CircularView::class.java.simpleName

    fun seekBarAlphaChange(alpha: Int)
    {
        mPaint.alpha = alpha
        invalidate()
    }

    constructor(context: Context, attrs: AttributeSet): super(context, attrs) {
        mPaint.style = Paint.Style.STROKE
        mPaint.strokeCap = Paint.Cap.ROUND
        mPaint.color = resources.getColor(R.color.light_blue)
        mPaint.strokeWidth =  100f
        mPaint.isAntiAlias = true
    }

    override fun onDraw(canvas: Canvas) {
        super.onDraw(canvas)
        canvas.drawCircle(400f, 400f, 40f, mPaint)
        Log.d(TAG, "mPaint.Color: ${mPaint.color}")
    }

}