package kb.roboarena.battlerunner;

import java.io.File;

import kb.roboarena.battlelisteners.ConsoleBattleListener;
import robocode.control.BattleSpecification;
import robocode.control.BattlefieldSpecification;
import robocode.control.RobocodeEngine;
import robocode.control.RobotSpecification;

public class BattleRunnerImpl implements BattleRunner {

    private final RobocodeEngine engine;

    public BattleRunnerImpl() {

        engine = new RobocodeEngine(new File("C:/robocode"));
    }

    @Override
    public void runBattle() {

        engine.setVisible(true);
        engine.addBattleListener(new ConsoleBattleListener());

        int numRounds = 3;
        BattlefieldSpecification battlefield = new BattlefieldSpecification(800, 600);
        RobotSpecification[] robots = engine.getLocalRepository("sample.Crazy,sample.RamFire");

        BattleSpecification spec = new BattleSpecification(numRounds, battlefield, robots);

        engine.runBattle(spec);
    }

}
