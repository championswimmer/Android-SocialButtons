package in.championswimmer.libsocialbuttons.fabs;

import android.content.Context;
import android.util.AttributeSet;

import com.melnykov.fab.FloatingActionButton;

import in.championswimmer.libsocialbuttons.R;
import in.championswimmer.libsocialbuttons.Utils;

/**
 * Created by championswimmer on 1/11/15.
 */
public class FABTumblr extends FloatingActionButton {
    public FABTumblr(Context context, AttributeSet attrs) {
        super(context, attrs);


        int colorNormal = getResources().getColor(R.color.tumblr);
        int colorRipple = getResources().getColor(R.color.ripple);
        int colorPressed = Utils.blendColors(colorNormal, colorRipple, 0.8f);

        setColorNormal(colorNormal);
        setColorRipple(colorRipple);
        setColorPressed(colorPressed);
        setImageResource(R.drawable.logo_tumblr);
    }
}
