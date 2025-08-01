package com.newtaxiprime.user.appcommon.custompalette

/**
 * @package com.newtaxiprime.user
 * @subpackage custompalette
 * @category FontButton
 * @author Seen Technologies
 *
 */

import android.annotation.SuppressLint
import android.content.Context
import android.util.AttributeSet
import android.widget.Button

/* ************************************************************
                CustomFontUtils
Used for custom button when you want use custom fonts in button
*************************************************************** */
@SuppressLint("AppCompatCustomView")
class FontButton : Button {

    // Constructor
    constructor(context: Context) : super(context) {

        CustomFontUtils.applyCustomFont(this, context, null)
    }

    constructor(context: Context, attrs: AttributeSet) : super(context, attrs) {

        CustomFontUtils.applyCustomFont(this, context, attrs)
    }

    constructor(context: Context, attrs: AttributeSet, defStyle: Int) : super(context, attrs, defStyle) {

        CustomFontUtils.applyCustomFont(this, context, attrs)
    }
}