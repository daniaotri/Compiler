/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package be.unamur.info.b314.compiler.main;

import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.TemporaryFolder;
import org.junit.rules.TestRule;
import org.junit.rules.TestWatcher;
import org.junit.runner.Description;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 *
 * @author jessi
 */
public class TypeTest {
    
 private static final Logger LOG = LoggerFactory.getLogger(TypeTest.class);
    
    @Rule
    public TemporaryFolder testFolder = new TemporaryFolder();
    
    @Rule
    public TestRule watcher = new TestWatcher(){
        @Override
        protected void starting(Description description){
            LOG.info(String.format("starting test: %s()",
                        description.getMethodName()));
        }
        ;
    };
    
    @Test
    public void testAssgnBoolean() throws Exception{       
        CompilerTestHelper.launchCompilation("/syntax/type/ok/AssignBoolean.b314", testFolder.newFile(), true, "type: AssignBoolean");
    }

    @Test
    public void testAssignInteger() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/type/ok/AssignInteger.b314", testFolder.newFile(), true, "type: AssignInteger");
    }

    @Test
    public void testVariableType() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/type/ok/VariableType.b314", testFolder.newFile(), true, "type: VariableType");
    }

    @Test
    public void testArrayType() throws Exception{
        CompilerTestHelper.launchCompilation("/syntax/type/ok/ArrayType.b314", testFolder.newFile(), true, "type: ArrayType");
    }

         
            
            
                    
    
    
    
    

    
}
