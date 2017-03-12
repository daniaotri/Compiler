//package be.unamur.info.b314.compiler.main;
//
//import org.junit.Test;
//import org.junit.Rule;
//import org.junit.rules.TemporaryFolder;
//import org.junit.rules.TestRule;
//import org.junit.rules.TestWatcher;
//import org.junit.runner.Description;
//import org.slf4j.Logger;
//import org.slf4j.LoggerFactory;
//
//public class AffectationTest {
//
//    private static final Logger LOG = LoggerFactory.getLogger(AffectationTest.class);
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
//    public void testAffectationArraySquareExprD() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationArraySquareExprD.b314", testFolder.newFile(), true, "affect: AffectationArraySquareExprD");
//    }
//    @Test
//    public void testAffectationArrayIntegerConst() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationArrayIntegerConst.b314", testFolder.newFile(), true, "affect: AffectationArrayIntegerConst");
//    }
//    @Test
//    public void testAffectationBooleanExprD() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationBooleanExprD.b314", testFolder.newFile(), true, "affect: AffectationBooleanExprD");
//    }
//    @Test
//    public void testAffectationVariable() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationVariable.b314", testFolder.newFile(), true, "affect: AffectationVariable");
//    }
//
//    @Test
//    public void testAffectationArrayBooleanConst() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationArrayBooleanConst.b314", testFolder.newFile(), true, "affect: AffectationArrayBooleanConst");
//    }
//
//    @Test
//    public void testArrayManip() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/ArrayManip.b314", testFolder.newFile(), true, "affect: ArrayManip");
//    }
//    
//    @Test
//    public void testAffectationExprDInteger() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationExprDInteger.b314", testFolder.newFile(), true, "affect: AffectationExprDInteger");
//    }
//
//    @Test
//    public void testAffectationExprDSquare() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationExprDSquare.b314", testFolder.newFile(), true, "affect: AffectationExprDSquare");
//    }
//
//
//    @Test
//    public void testAffectationArrayBooleanExprD() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationArrayBooleanExprD.b314", testFolder.newFile(), true, "affect: AffectationArrayBooleanExprD");
//    }
//
//    @Test
//    public void testAffectationIntegerConst() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationIntegerConst.b314", testFolder.newFile(), true, "affect: AffectationIntegerConst");
//    }
//    @Test
//    public void testAffectationExprDArrayInteger() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationExprDArrayInteger.b314", testFolder.newFile(), true, "affect: AffectationExprDArrayInteger");
//    }
//
//
//    @Test
//    public void testAffectationArray() throws Exception{
//        CompilerTestHelper.launchCompilation("/syntax/comments/ok/AffectationArray.b314", testFolder.newFile(), true, "affect: AffectationArray");
//    }
//
//
//    @Test
//    public void testAffectationArrayFalse() throws Exception {
//        CompilerTestHelper.launchCompilation("/syntax/comments/ko/AffectationArrayFalse.b314", testFolder.newFile(), false, "affect: AffectationArrayFalse");
//    }
//
//    @Test
//    public void testAffectationArrayTrue() throws Exception {
//        CompilerTestHelper.launchCompilation("/syntax/comments/ko/AffectationArrayTrue.b314", testFolder.newFile(), false, "affect: AffectationArrayTrue");
//    }
//
//}