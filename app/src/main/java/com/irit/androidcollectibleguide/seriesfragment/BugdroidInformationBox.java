package com.irit.androidcollectibleguide.seriesfragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.app.DialogFragment;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.irit.androidcollectibleguide.R;
import com.irit.androidcollectibleguide.bugdroids.AbstractBugdroid;

import java.util.Calendar;

/**
 * Created by Nicolas on 06/07/2014.
 */
public class BugdroidInformationBox  extends DialogFragment{

    private AbstractBugdroid mBugdroid;

    public static BugdroidInformationBox newInstance(AbstractBugdroid bugdoid) {
        BugdroidInformationBox infoBox = new BugdroidInformationBox();
        infoBox.mBugdroid = bugdoid;
        return infoBox;
    }

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity(),AlertDialog.THEME_HOLO_LIGHT);
        View view = getActivity().getLayoutInflater().inflate(R.layout.budroid_info_box_layout,null);

        ImageView bugdroidLargePicture = (ImageView) view.findViewById(R.id.infoBoxImage);
        TextView bugdroidArtist = (TextView) view.findViewById(R.id.infoBoxArtist);
        TextView bugdroidDate = (TextView) view.findViewById(R.id.infoBoxDate);

        bugdroidLargePicture.setImageResource(mBugdroid.getLargePicture());
        bugdroidArtist.setText(mBugdroid.getArtist());
        bugdroidDate.setText(mBugdroid.getReleaseDate().get(Calendar.MONTH)+"/"+mBugdroid.getReleaseDate().get(Calendar.YEAR));

        //TODO Ajout des informations supplémentaites
        return builder.create();
    }
}
