package kb.roboarena.core;

import kb.roboarena.battlerunner.BattleRunner;
import kb.roboarena.config.AppConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        BattleRunner runner = (BattleRunner) context.getBean("battlerunner");

        runner.runBattle();

    }
}
