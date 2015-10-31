package in.championswimmer.libsocialbuttons.fabs;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;

import in.championswimmer.libsocialbuttons.R;
import in.championswimmer.libsocialbuttons.Utils;

import com.melnykov.fab.FloatingActionButton;

/**
 * Created by championswimmer on 1/11/15.
 */
public class FABFacebook extends FloatingActionButton {
    public FABFacebook(Context context, AttributeSet attrs) {
        super(context, attrs);

        int colorNormal = getResources().getColor(R.color.facebook);
        int colorRipple = getResources().getColor(R.color.ripple);
        int colorPressed = Utils.blendColors(colorNormal, colorRipple, 0.8f);

        setColorNormal(colorNormal);
        setColorRipple(colorRipple);
        setColorPressed(colorPressed);
        setImageResource(R.drawable.logo_facebook);
    }
}
