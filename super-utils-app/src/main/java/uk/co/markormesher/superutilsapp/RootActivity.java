package uk.co.markormesher.superutilsapp;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import uk.co.markormesher.superutils.SuperUtils;

public class RootActivity extends AppCompatActivity {

	@Override
	protected void onCreate(@Nullable Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		SuperUtils.checkLibraryWorking();
	}
}
