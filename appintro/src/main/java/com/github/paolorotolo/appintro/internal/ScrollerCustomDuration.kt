package com.github.paolorotolo.appintro.internal

import android.content.Context
import android.view.animation.Interpolator
import android.widget.Scroller

/**
 * Set the factor by which the duration will change
 */
private const val SCROLL_DURATION_FACTOR = 6.0

/**
 * A [Scroller] that will allow to customize the duration of the scrolling.
 */
internal class ScrollerCustomDuration constructor(
    context: Context,
    interpolator: Interpolator
) : Scroller(context, interpolator) {

    override fun startScroll(startX: Int, startY: Int, dx: Int, dy: Int, duration: Int) {
        super.startScroll(startX, startY, dx, dy, (duration * SCROLL_DURATION_FACTOR).toInt())
    }
}
