package runner;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import cucumber.api.junit.Cucumber;
import org.junit.After;
import org.junit.runner.RunWith;

@RunWith(Cucumber.class)
@CucumberOptions(
        features = "src/test/resources/",	// Path: features = "classpath:features"
        glue = "steps_definition",					// Path: Steps
        tags = {"~@ignore"},
        monochrome = true,							// Cores no Terminal default: false
        snippets = SnippetType.UNDERSCORE,			// METHODOS do Steps em CAMELCASE
        strict = false,								// Considerar steps indefinidos erros ou nao, default: false
        dryRun = false,								// Validar Steps sem executar o teste
        plugin = {									// Plugins Cucumber para possivel integracao com Jenkins
                "pretty",
                "html:target/cucumber-reports",
                "json:target/report.json"
        }
        //,tags = { "@tagScenario" }

        /**
         * Executar testes no termial
         *
         *	$ mvn test
         *	$ mvn test -Dcucumber.options="--tags @tagScenario"
         *
         *	$ mvn clean
         *	$ mvn clean test
         *
         *
         * Gerar Relatorio Cucumber localmente
         *
         *	$ mvn verify -DskipTests
         *	$ mvn test verify
         *	$ mvn clean test verify
         *	$ mvn clean test -Dcucumber.options="--tags @tagScenario" verify
         * */
)

public class RunCucumberTest {

}