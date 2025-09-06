package org.osd.omotproject.ui.splash;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import org.osd.omotproject.R;
import org.osd.omotproject.ui.auth.LoginActivity;

public class SplashActivity extends AppCompatActivity {
    private ImageView ivOmotLogo, ivOsdLogo;
    private TextView tvSubtitle;

    // Duration of the splash screen in milliseconds
    private static final long SPLASH_DURATION = 2500L;  // 2.5 seconds

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);
        setTheme(R.style.Theme_OMOT_Splash);

        initializedViews();
        startAnimations();
        navigateToNextScreen();
    }

    private void initializedViews() {
        ivOmotLogo = findViewById(R.id.iv_omot_logo);
        ivOsdLogo = findViewById(R.id.iv_osd_logo);
        tvSubtitle = findViewById(R.id.tv_subtitle);
    }

    private void startAnimations() {
        // Animate the main OMOT logo
        ivOmotLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in_scale_up));

        // Animate the "Mobile Ops Terminal" text with a delay
        tvSubtitle.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in_bottom_delay));

        // Animate the OSD parent logo at the bottom with a longer delay
        ivOsdLogo.startAnimation(AnimationUtils.loadAnimation(this, R.anim.fade_in_bottom_delay));
    }

    private void navigateToNextScreen() {
        new Handler(Looper.getMainLooper()).postDelayed(() -> {
            // TODO: Add logic here to check if user is already logged in
            // For now, always go to LoginActivity
            startActivity(new Intent(SplashActivity.this, LoginActivity.class));
            finish();   // Prevent going back to splash
        }, SPLASH_DURATION);
    }
}