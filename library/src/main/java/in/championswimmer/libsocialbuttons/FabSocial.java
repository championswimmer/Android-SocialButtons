package in.championswimmer.libsocialbuttons;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.support.v4.content.ContextCompat;
import android.util.AttributeSet;

import com.melnykov.fab.FloatingActionButton;

/**
 * Created by talat on 08-07-2016.
 */
public class FabSocial extends FloatingActionButton {

    public FabSocial(Context context, AttributeSet attrs) {
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


            int colorRipple = ContextCompat.getColor(context, R.color.ripple);
            int colorPressed = Utils.blendColors(colorNormal, colorRipple, 0.8f);

            setColorNormal(colorNormal);
            setColorRipple(colorRipple);
            setColorPressed(colorPressed);
            setImageDrawable(logo);


        } finally {
            a.recycle();
        }


    }
}
