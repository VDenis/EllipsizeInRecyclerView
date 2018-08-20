package com.denis.ellipsizeinrecyclerview

import android.content.Context
import android.graphics.Canvas
import android.util.AttributeSet
import android.widget.TextView

/**
 * Created by Denis Vlasov on 18/08/2018.
 */
class CustomEllipsizeTextView(context: Context, attr: AttributeSet) : TextView(context, attr) {

    private var shortText: String = if (isInEditMode) "short text" else ""

    // variables used in draw method
    private var textWidth: Float = 0f
    private var isFullVisible: Boolean = true
    private var visibleText: String = ""

    override fun draw(canvas: Canvas) {
        // calculate text width
        textWidth = paint.measureText(text.toString())
        isFullVisible = textWidth <= measuredWidth

        // select correct text
        visibleText = if (isFullVisible) text.toString() else shortText

        // set text
        text = visibleText

        super.draw(canvas)
    }

    fun setText(fullText: String, shortText: String) {
        text = fullText
        this.shortText = shortText
    }

}