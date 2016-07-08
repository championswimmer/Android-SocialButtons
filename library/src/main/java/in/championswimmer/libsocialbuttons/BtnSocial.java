package in.championswimmer.libsocialbuttons;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Color;
import android.graphics.Typeface;
import android.graphics.drawable.Drawable;
import android.support.v7.widget.AppCompatButton;
import android.util.AttributeSet;
import android.util.TypedValue;

/**
 * Created by talat on 08-07-2016.
 */
public class BtnSocial extends AppCompatButton {

    public BtnSocial(Context context, AttributeSet attrs) {
        super(context, attrs);

        TypedArray a = context.getTheme().obtainStyledAttributes(
                attrs,
                R.styleable.Social,
                0, 0);

        try {
            int social = a.getInteger(R.styleable.Social_social, 0);
            String buttonClass = getResources().getStringArray(R.array.available_buttons)[social];
            TypedArray ar = context.getResources().obtainTypedArray(getResources().getIdentifier(buttonClass, "array", context.getPackageName()));
            int colorNormal = ar.getColor(0, 0);
            @SuppressWarnings("ResourceType")
            Drawable logo = ar.getDrawable(1);
            ar.recycle();

            setCompoundDrawablesWithIntrinsicBounds(logo, null, null, null);
            setSupportBackgroundTintList(ColorStateList.valueOf(colorNormal));
            setIncludeFontPadding(true);
            setTextColor(Color.WHITE);

            if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textAllCaps") == null) {
                setSupportAllCaps(false);
            }
            if ((attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "fontFamily") == null) &&
                    (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textStyle") == null)) {
                setTypeface(Typeface.create("sans-serif-light", Typeface.NORMAL));
            }

            if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "textSize") == null) {
                setTextSize(TypedValue.COMPLEX_UNIT_SP, 24);
            }

            if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "padding") == null) {
                int padding = getResources().getDimensionPixelSize(R.dimen.social_button_padding);
                setPadding(padding, padding, padding, padding);
            }

            if (attrs.getAttributeValue("http://schemas.android.com/apk/res/android", "drawablePadding") == null) {
                int padding = getResources().getDimensionPixelSize(R.dimen.social_button_padding);
                setCompoundDrawablePadding(padding);
            }


        } finally {
            a.recycle();
        }


    }
}
