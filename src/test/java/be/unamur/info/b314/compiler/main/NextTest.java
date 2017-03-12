///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package be.unamur.info.b314.compiler.main;
//
//import org.junit.Rule;
//import org.junit.Test;
//import org.junit.rules.TemporaryFolder;
//import org.junit.rules.TestRule;
//import org.junit.rules.TestWatcher;
//import org.junit.runner.Description;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
///**
// *
// * @author jessi
// */
//public class NextTest {
//
//    private static final Logger LOG = LoggerFactory.getLogger(NextTest.class);
//
//    @Rule
//    public TemporaryFolder testFolder = new TemporaryFolder(); // Create a temporary folder for outputs deleted after tests
//
//    @Rule
//    public TestRule watcher = new TestWatcher() { // Prints message on logger before each test
//        @Override
//        protected void starting(Description description) {
//            LOG.info(String.format("Starting test: %s()...",
//                    description.getMethodName()));
//        }
//    ;
//    };
//
//
//    @Test
//    public void testnext_ok() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/next_ok.b314", testFolder.newFile(), true, "next: next_ok");
//    }
//
//    @Test
//    public void testnext_ko() throws Exception {
//        CompilerTestHelper.launchCompilation("/syntax/comments/ko/next_ko.b314", testFolder.newFile(), false, "next: next_ko");
//    }
//    
//}
