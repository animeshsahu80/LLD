package org.LLDCricBuzz.ScoreUpdater;


import org.LLDCricBuzz.Inning.BallDetails;

public interface ScoreUpdaterObserver {

    public void update(BallDetails ballDetails);
}

