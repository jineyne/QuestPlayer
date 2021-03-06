package com.qsp.player.game;

import android.net.Uri;

import androidx.documentfile.provider.DocumentFile;

public interface LibQspProxy {
    PlayerViewState getViewState();
    void setPlayerView(PlayerView view);
    void execute(String code);
    void onActionSelected(int index);
    void onActionClicked(int index);
    void onObjectSelected(int index);
    void onInputAreaClicked();
    void runGame(String title, DocumentFile dir, DocumentFile file);
    void restartGame();
    void resumeGame();
    void pauseGame();
    void loadGameState(Uri uri);
    void saveGameState(Uri uri);
}
