package be.unamur.info.b314.compiler.main;

import java.io.File;
import org.apache.commons.io.FileUtils;
import org.junit.Test;
import static org.junit.Assert.*;
import static org.hamcrest.Matchers.*;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314globalvariabledeclSemanticsTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314globalvariabledeclSemanticsTest.class);

    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests

    @Rule
    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
        @Override
        protected void starting(Description description) {
            LOG.info(String.format("Starting test: %s()...",
                    description.getMethodName()));
        }
    ;
    };

    @Test
    public void testglobalvariabledecl_mixing() throws Exception{
        File pcodeFile = testFolder.newFile();
        CompilerTestHelper.launchCompilation("/semantics/globalvariabledecl/mixing.b314", pcodeFile, true, "globalvariabledecl: mixing");
        LOG.debug("PCode is: {{}", FileUtils.readFileToString(pcodeFile));
        InterpreterResult result;
        // Turns: 1
        LOG.debug("Starting interpretation with 1 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 1);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(1));
        assertThat(result.getOutLines(), contains("0"));
        // Turns: 3
        LOG.debug("Starting interpretation with 3 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 3);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(3));
        assertThat(result.getOutLines(), contains("0", "0", "0"));
    }

    @Test
    public void testglobalvariabledecl_nul_size_array() throws Exception{
        File pcodeFile = testFolder.newFile();
        CompilerTestHelper.launchCompilation("/semantics/globalvariabledecl/nul_size_array.b314", pcodeFile, true, "globalvariabledecl: nul_size_array");
        LOG.debug("PCode is: {{}", FileUtils.readFileToString(pcodeFile));
        InterpreterResult result;
        // Turns: 1
        LOG.debug("Starting interpretation with 1 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 1);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(1));
        assertThat(result.getOutLines(), contains("0"));
        // Turns: 3
        LOG.debug("Starting interpretation with 3 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 3);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(3));
        assertThat(result.getOutLines(), contains("0", "0", "0"));
    }

    @Test
    public void testglobalvariabledecl_one_boolean_variable() throws Exception{
        File pcodeFile = testFolder.newFile();
        CompilerTestHelper.launchCompilation("/semantics/globalvariabledecl/one_boolean_variable.b314", pcodeFile, true, "globalvariabledecl: one_boolean_variable");
        LOG.debug("PCode is: {{}", FileUtils.readFileToString(pcodeFile));
        InterpreterResult result;
        // Turns: 1
        LOG.debug("Starting interpretation with 1 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 1);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(1));
        assertThat(result.getOutLines(), contains("0"));
        // Turns: 3
        LOG.debug("Starting interpretation with 3 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 3);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(3));
        assertThat(result.getOutLines(), contains("0", "0", "0"));
    }

    @Test
    public void testglobalvariabledecl_one_integer_variable() throws Exception{
        File pcodeFile = testFolder.newFile();
        CompilerTestHelper.launchCompilation("/semantics/globalvariabledecl/one_integer_variable.b314", pcodeFile, true, "globalvariabledecl: one_integer_variable");
        LOG.debug("PCode is: {{}", FileUtils.readFileToString(pcodeFile));
        InterpreterResult result;
        // Turns: 1
        LOG.debug("Starting interpretation with 1 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 1);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(1));
        assertThat(result.getOutLines(), contains("0"));
        // Turns: 3
        LOG.debug("Starting interpretation with 3 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 3);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(3));
        assertThat(result.getOutLines(), contains("0", "0", "0"));
    }

    @Test
    public void testglobalvariabledecl_one_square_variable() throws Exception{
        File pcodeFile = testFolder.newFile();
        CompilerTestHelper.launchCompilation("/semantics/globalvariabledecl/one_square_variable.b314", pcodeFile, true, "globalvariabledecl: one_square_variable");
        LOG.debug("PCode is: {{}", FileUtils.readFileToString(pcodeFile));
        InterpreterResult result;
        // Turns: 1
        LOG.debug("Starting interpretation with 1 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 1);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(1));
        assertThat(result.getOutLines(), contains("0"));
        // Turns: 3
        LOG.debug("Starting interpretation with 3 turn");
        result = PCodeInterpreter.getInterpreter().execute(pcodeFile, 3);
        assertThat("Interpreter exist status was not 0 \n" + (result.getErrLines().stream().reduce("", ((res, line) -> res + "\n" + line))), result.getExitStatus(), equalTo(0));
        assertThat("Wrong number of outputs, there was 1 turn", result.getOutLines(), hasSize(3));
        assertThat(result.getOutLines(), contains("0", "0", "0"));
    }

}