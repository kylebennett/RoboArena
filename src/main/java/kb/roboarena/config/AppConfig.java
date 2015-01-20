package kb.roboarena.config;

import kb.roboarena.battlerunner.BattleRunner;
import kb.roboarena.battlerunner.BattleRunnerImpl;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/**
 * @author Kyle
 *
 */
@Configuration
public class AppConfig {

    @Bean(name = "battlerunner")
    public BattleRunner battlerunner() {
        return new BattleRunnerImpl();
    }
}
