package be.unamur.info.b314.compiler.main;

import org.junit.Test;
import org.junit.Rule;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class B314localvariabledeclSyntaxTest {

    private static final Logger LOG = LoggerFactory.getLogger(B314localvariabledeclSyntaxTest.class);

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
    // Serie localvariabledecl OK
    //
        /*
    @Test
    public void testlocalvariabledecl_when_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_when_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_when.b314", testFolder.newFile(), true, "localvariabledecl: when_local_var_same_names_and_different_types_than_global_vars_condition_on_global_vars_in_when");
    }

    @Test
    public void testlocalvariabledecl_mixing_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/mixing.b314", testFolder.newFile(), true, "localvariabledecl: mixing");
    }
  


    @Test
    public void testlocalvariabledecl_when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens.b314", testFolder.newFile(), true, "localvariabledecl: when_local_var_diff_names_than_global_vars_but_same_name_in_different_whens");
    }
    
    @Test
    public void testlocalvariabledecl_fct_local_var_diff_names_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_var_diff_names_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_var_diff_names_than_global_vars");
    }

    @Test
    public void testlocalvariabledecl_fct_local_var_diff_names_than_global_vars_but_same_name_in_different_functions_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_var_diff_names_than_global_vars_but_same_name_in_different_functions.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_var_diff_names_than_global_vars_but_same_name_in_different_functions");
    }

    @Test
    public void testlocalvariabledecl_fct_local_var_same_names_and_different_types_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_var_same_names_and_different_types_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_var_same_names_and_different_types_than_global_vars");
    }

    @Test
    public void testlocalvariabledecl_fct_local_variable_diff_names_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_variable_diff_names.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_variable_diff_names");
    }

    @Test
    public void testlocalvariabledecl_fct_local_variable_same_names_as_global_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/fct_local_variable_same_names_as_global.b314", testFolder.newFile(), true, "localvariabledecl: fct_local_variable_same_names_as_global");
    }



    @Test
    public void testlocalvariabledecl_when_local_var_diff_names_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_diff_names_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: when_local_var_diff_names_than_global_vars");
    }


    @Test
    public void testlocalvariabledecl_when_local_var_same_names_and_different_types_than_global_vars_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_var_same_names_and_different_types_than_global_vars.b314", testFolder.newFile(), true, "localvariabledecl: when_local_var_same_names_and_different_types_than_global_vars");
    }

    @Test
    public void testlocalvariabledecl_when_local_variable_diff_names_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_variable_diff_names.b314", testFolder.newFile(), true, "localvariabledecl: when_local_variable_diff_names");
    }

    @Test
    public void testlocalvariabledecl_when_local_variable_same_names_as_global_ok() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ok/when_local_variable_same_names_as_global.b314", testFolder.newFile(), true, "localvariabledecl: when_local_variable_same_names_as_global");
    }

    //
    // Serie localvariabledecl KO
    //
    @Test
    public void testlocalvariabledecl_fct_global_variables_are_indeed_hidden_by_local_variables_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ko/fct_global_variables_are_indeed_hidden_by_local_variables.b314", testFolder.newFile(), false, "localvariabledecl: fct_global_variables_are_indeed_hidden_by_local_variables");
    }

    @Test
    public void testlocalvariabledecl_fct_local_var_same_name_as_fucntion_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ko/fct_local_var_same_name_as_fucntion.b314", testFolder.newFile(), false, "localvariabledecl: fct_local_var_same_name_as_fucntion");
    }

    @Test
    public void testlocalvariabledecl_fct_local_var_same_name_as_parameter_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ko/fct_local_var_same_name_as_parameter.b314", testFolder.newFile(), false, "localvariabledecl: fct_local_var_same_name_as_parameter");
    }

    @Test
    public void testlocalvariabledecl_fct_local_var_same_names_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ko/fct_local_var_same_names.b314", testFolder.newFile(), false, "localvariabledecl: fct_local_var_same_names");
    }

    @Test
    public void testlocalvariabledecl_when_global_variables_are_indeed_hidden_by_local_variables_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ko/when_global_variables_are_indeed_hidden_by_local_variables.b314", testFolder.newFile(), false, "localvariabledecl: when_global_variables_are_indeed_hidden_by_local_variables");
    }

    @Test
    public void testlocalvariabledecl_when_local_var_same_names_ko() throws Exception {
        CompilerTestHelper.launchCompilation("/syntax/localvariabledecl/ko/when_local_var_same_names.b314", testFolder.newFile(), false, "localvariabledecl: when_local_var_same_names");
    }
*/
}