package dev.tornaco.torscreenrec.ui.tiles;

import android.content.Context;
import android.view.View;

import dev.nick.tiles.tile.QuickTile;
import dev.nick.tiles.tile.QuickTileView;
import dev.tornaco.torscreenrec.R;

/**
 * Created by Tornaco on 2017/7/28.
 * Licensed with Apache.
 */

public class MagiskInstallTile extends QuickTile {

    public MagiskInstallTile(Context context) {
        super(context);

        this.titleRes = R.string.title_magisk_install;
        this.summaryRes = R.string.summary_magisk_install;
        this.iconRes = R.mipmap.avatar_magisk;

        this.tileView = new QuickTileView(context, this) {
            @Override
            public void onClick(View v) {
                super.onClick(v);
            }

            @Override
            protected boolean useStaticTintColor() {
                return false;
            }
        };
    }
}
