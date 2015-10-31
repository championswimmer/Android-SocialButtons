package in.championswimmer.libsocialbuttons;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Color;

/**
 * Created by championswimmer on 1/11/15.
 */
public class Utils {

    public static int blendColors(int color1, int color2, float ratio) {
        final float inverseRation = 1f - ratio;
        float r = (Color.red(color1) * ratio) + (Color.red(color2) * inverseRation);
        float g = (Color.green(color1) * ratio) + (Color.green(color2) * inverseRation);
        float b = (Color.blue(color1) * ratio) + (Color.blue(color2) * inverseRation);
        return Color.rgb((int) r, (int) g, (int) b);
    }

    public static int dp2px (int dp, Resources res) {
        final float scale = res.getDisplayMetrics().density;
        return (int) (dp * scale + 0.5f);
    }
}
