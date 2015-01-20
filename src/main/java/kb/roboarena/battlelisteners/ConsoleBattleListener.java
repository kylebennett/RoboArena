package kb.roboarena.battlelisteners;

import robocode.BattleResults;
import robocode.control.events.BattleCompletedEvent;
import robocode.control.events.BattleErrorEvent;
import robocode.control.events.BattleFinishedEvent;
import robocode.control.events.BattleMessageEvent;
import robocode.control.events.BattlePausedEvent;
import robocode.control.events.BattleResumedEvent;
import robocode.control.events.BattleStartedEvent;
import robocode.control.events.IBattleListener;
import robocode.control.events.RoundEndedEvent;
import robocode.control.events.RoundStartedEvent;
import robocode.control.events.TurnEndedEvent;
import robocode.control.events.TurnStartedEvent;

/**
 * @author Kyle
 *
 */
public class ConsoleBattleListener implements IBattleListener {

    /*
     * (non-Javadoc)
     * 
     * @see robocode.control.events.IBattleListener#onBattleStarted(robocode.control.events.
     * BattleStartedEvent)
     */
    @Override
    public void onBattleStarted(BattleStartedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see robocode.control.events.IBattleListener#onBattleFinished(robocode.control.events.
     * BattleFinishedEvent)
     */
    @Override
    public void onBattleFinished(BattleFinishedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see robocode.control.events.IBattleListener#onBattleCompleted(robocode.control.events.
     * BattleCompletedEvent)
     */
    @Override
    public void onBattleCompleted(BattleCompletedEvent event) {

        BattleResults[] results = event.getSortedResults();

        StringBuilder builder = new StringBuilder();

        builder.append("\n");
        builder.append("----- Results -----");
        builder.append("\n");

        for (BattleResults r : results) {
            builder.append(r.getRank() + " - " + r.getTeamLeaderName() + " - " + r.getScore());
            builder.append("\n");
        }

        builder.append("-------------------");

        System.out.println(builder.toString());
    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * robocode.control.events.IBattleListener#onBattlePaused(robocode.control.events.BattlePausedEvent
     * )
     */
    @Override
    public void onBattlePaused(BattlePausedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see robocode.control.events.IBattleListener#onBattleResumed(robocode.control.events.
     * BattleResumedEvent)
     */
    @Override
    public void onBattleResumed(BattleResumedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * robocode.control.events.IBattleListener#onRoundStarted(robocode.control.events.RoundStartedEvent
     * )
     */
    @Override
    public void onRoundStarted(RoundStartedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * robocode.control.events.IBattleListener#onRoundEnded(robocode.control.events.RoundEndedEvent)
     */
    @Override
    public void onRoundEnded(RoundEndedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * robocode.control.events.IBattleListener#onTurnStarted(robocode.control.events.TurnStartedEvent
     * )
     */
    @Override
    public void onTurnStarted(TurnStartedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * robocode.control.events.IBattleListener#onTurnEnded(robocode.control.events.TurnEndedEvent)
     */
    @Override
    public void onTurnEnded(TurnEndedEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see robocode.control.events.IBattleListener#onBattleMessage(robocode.control.events.
     * BattleMessageEvent)
     */
    @Override
    public void onBattleMessage(BattleMessageEvent event) {

    }

    /*
     * (non-Javadoc)
     * 
     * @see
     * robocode.control.events.IBattleListener#onBattleError(robocode.control.events.BattleErrorEvent
     * )
     */
    @Override
    public void onBattleError(BattleErrorEvent event) {

    }

}
