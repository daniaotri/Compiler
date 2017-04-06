package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314affectSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314affectSyntaxTest.class);

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

    //
    // Serie affect OK
    //
  
    @Test
    public void testaffect_affect_int_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_int_right_expressions.b314", testFolder.newFile(), true, "affect: affect_int_right_expressions");
    }

    @Test
    public void testaffect_affect_square_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_square_right_expressions.b314", testFolder.newFile(), true, "affect: affect_square_right_expressions");
    }

    @Test
    public void testaffect_affect_int_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_int_array_right_expressions.b314", testFolder.newFile(), true, "affect: affect_int_array_right_expressions");
    }

    @Test
    public void testaffect_affect_var_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_var.b314", testFolder.newFile(), true, "affect: affect_var");
    }

    @Test
    public void testaffect_affect_array_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_array.b314", testFolder.newFile(), true, "affect: affect_array");
    }

    @Test
    public void testaffect_affect_int_array_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_int_array_constant_values.b314", testFolder.newFile(), true, "affect: affect_int_array_constant_values");
    }

    @Test
    public void testaffect_affect_square_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_square_array_right_expressions.b314", testFolder.newFile(), true, "affect: affect_square_array_right_expressions");
    }

    @Test
    public void testaffect_affect_bool_array_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_bool_array_right_expressions.b314", testFolder.newFile(), true, "affect: affect_bool_array_right_expressions");
    }

    @Test
    public void testaffect_affect_bool_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_bool_constant_values.b314", testFolder.newFile(), true, "affect: affect_bool_constant_values");
    }

    @Test
    public void testaffect_operations_with_arrays_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/operations_with_arrays.b314", testFolder.newFile(), true, "affect: operations_with_arrays");
    }

    @Test
    public void testaffect_affect_bool_array_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_bool_array_constant_values.b314", testFolder.newFile(), true, "affect: affect_bool_array_constant_values");
    }

    @Test
    public void testaffect_affect_bool_right_expressions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_bool_right_expressions.b314", testFolder.newFile(), true, "affect: affect_bool_right_expressions");
    }

    @Test
    public void testaffect_affect_int_constant_values_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/affect/ok/affect_int_constant_values.b314", testFolder.newFile(), true, "affect: affect_int_constant_values");
    }

    //
    // Serie affect KO
    //
    @Test
    public void testaffect_affect_wrong_place_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affect/ko/affect_wrong_place.b314", testFolder.newFile(), false, "affect: affect_wrong_place");
    }

    @Test
    public void testaffect_affect_reserved_word_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/affect/ko/affect_reserved_word.b314", testFolder.newFile(), false, "affect: affect_reserved_word");
    }

}