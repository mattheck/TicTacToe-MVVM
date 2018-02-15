package com.sample.medullan.tictactoe;

import android.content.Context;
import android.content.Intent;
import android.support.test.InstrumentationRegistry;
import android.support.test.rule.ActivityTestRule;

import com.sample.medullan.tictactoe.view.GameActivity;

import org.junit.Rule;
import org.junit.Test;

import static com.schibsted.spain.barista.BaristaAssertions.assertDisplayed;
import static com.schibsted.spain.barista.BaristaAssertions.assertNotExist;
import static com.schibsted.spain.barista.BaristaDialogActions.clickDialogPositiveButton;

public class GameEndDialogShould {

    @Rule
    public ActivityTestRule<GameActivity> activityRule = new ActivityTestRule<>(
            GameActivity.class, true, false);

    Context context = InstrumentationRegistry.getTargetContext();


    @Test
    public void display_winner_when_game_ends() throws Exception {
        givenGameActivityLaunched();
        givenGameEnded();

        assertDisplayed(R.id.tv_winner);
    }

    @Test
    public void display_begin_dialog_when_done_clicked() throws Exception {
        givenGameActivityLaunched();
        givenGameEnded();

        clickDialogPositiveButton();
        assertNotExist(R.id.tv_winner);
        assertDisplayed(R.id.et_player1);
    }

    private void givenGameActivityLaunched() {
        Intent intent = new Intent(context, GameActivity.class);
        activityRule.launchActivity(intent);
    }

    private void givenGameEnded() {
        GameActivity activity = activityRule.getActivity();
        activity.update(null, "Matt");
    }
}