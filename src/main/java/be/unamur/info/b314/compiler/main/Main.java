package be.unamur.info.b314.compiler.main;

import be.unamur.info.b314.compiler.B314Lexer;
import be.unamur.info.b314.compiler.B314Parser;
import be.unamur.info.b314.compiler.exception.ParsingException;
import be.unamur.info.b314.compiler.scope.FillScope;
import be.unamur.info.b314.compiler.scope.Scope;
import be.unamur.info.b314.compiler.scope.SymboleTableFiller;
import be.unamur.info.b314.compiler.Visitor.PCodePrinter;
import be.unamur.info.b314.compiler.Visitor.PCodeVisitor;
import static com.google.common.base.Preconditions.checkArgument;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import org.antlr.v4.runtime.ANTLRInputStream;
import org.antlr.v4.runtime.CommonTokenStream;
import org.antlr.v4.runtime.RecognitionException;
import org.antlr.v4.runtime.misc.ParseCancellationException;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.apache.commons.cli.CommandLine;
import org.apache.commons.cli.CommandLineParser;
import org.apache.commons.cli.DefaultParser;
import org.apache.commons.cli.HelpFormatter;
import org.apache.commons.cli.Option;
import org.apache.commons.cli.Options;
import org.apache.commons.cli.ParseException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
        

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Map;


/**
 *
 * @author Xavier Devroey - xavier.devroey@unamur.be
 */
public class Main {
    
    

    private static final Logger LOG = LoggerFactory.getLogger(Main.class);

    private static final String NAME = "b314-compiler";
    private static final String HELP = "h";
    private static final String INPUT = "i";
    private static final String OUTPUT = "o";
    
    private B314Parser parser;

    /**
     * Main method launched when starting compiler jar file.
     *
     * @param args Command line arguments.
     */
    public static void main(String[] args) {
        Main main = new Main();
        CommandLineParser parser = new DefaultParser();
        CommandLine line = null;
        try {
            line = parser.parse(main.options, args);
        } catch (ParseException ex) {
            LOG.error("Error while parsing command line!", ex);
            main.printHelpMessage();
        }
        // If help is requested, print help message and exit.
        if (line != null) {
            if (line.hasOption(HELP)) {
                main.printHelpMessage();
            } else {
                // Else start compilation
                try {
                    System.out.println(line);
                    main.initialise(line);
                    System.out.println("jessica1");
                    main.compile(); // Call compile method (to be completed)
                    System.err.println("OK"); // Print OK on stderr
                } catch (Exception e) {
                    LOG.error("Exception occured during compilation!", e);
                    System.err.println("KO"); // Print KO on stderr if a problem occured
                }
            }
        }
    }

    /**
     * The command line options.
     */
    private final Options options;

    /**
     * The input B314 file.
     */
    private File inputFile;

    /**
     * The output PCode file.
     */
    private File outputFile;
    
    private Main() {
        // Create command line options
        options = new Options();
        options.addOption(Option.builder(HELP)
                .desc("Prints this help message.")
                .build());

        options.addOption(Option.builder(INPUT)
                .desc("The B314 input file.")
                .hasArg()
                .build());

        options.addOption(Option.builder(OUTPUT)
                .desc("The PCOde output file.")
                .hasArg()
                .build());
    }

    /**
     * Prints help message with this options.
     */
    private void printHelpMessage() {
        HelpFormatter formatter = new HelpFormatter();
        formatter.setWidth(128);
        formatter.printHelp(String.format("java -jar %s.jar -%s | %s %s",
                NAME, HELP, INPUT, OUTPUT), options);
    }

    /**
     * Initialise the input compiler using the given input line.
     *
     * @throws Exception If one of the three required arguments is not provided.
     */
    private void initialise(CommandLine line) throws Exception {
        LOG.debug("Initialisation");
        // Check that the arguments are there
        if (!line.hasOption(INPUT)) {
            throw new ParseException(String.format("Option %s is mandatory!", INPUT));
        } else if (!line.hasOption(OUTPUT)) {
            throw new ParseException(String.format("Option %s is mandatory!", OUTPUT));
        }
        // Get given files and check they exist
        inputFile = new File(line.getOptionValue(INPUT));
        checkArgument(inputFile.exists() && inputFile.isFile(), "File %s not found!", inputFile.getName());
        LOG.debug("Input file set to {}", inputFile.getPath());

        outputFile = new File(line.getOptionValue(OUTPUT));
        if(!outputFile.exists()){
            outputFile.createNewFile();
        }
        checkArgument(outputFile.exists() && outputFile.isFile(), "File %s not created!", outputFile.getName());
        LOG.debug("Output file set to {}", outputFile.getPath());

        LOG.debug("Initialisation: done");
    }

    
    /**
     * your Methods, this is where the MAGIC happens !!! \o/
     */
    
    private void compile() throws FileNotFoundException, IOException, ParseCancellationException, ParsingException {


        BufferedReader br= new BufferedReader(new FileReader(inputFile));
        String line= br.readLine();
        String printprog="";

        while(line !=null){
            printprog+=line +"\n";
            line= br.readLine();
        }
        //Fin de la discussion

        /*
        LOG.debug("Parsing input");
        B314Parser.ProgrammeContext tree =parse(new ANTLRInputStream(new FileInputStream(inputFile)));
        Scope x = fillSymTable(tree);  
        */
        /*
        BufferedReader br = new BufferedReader(new FileReader(inputFile));
        String line = br.readLine();
        String temp = "";
        String printprog = "";

        while(line!=null){
            temp += line + " ";
            printprog += line + "\n";
            line = br.readLine();}
        System.out.println(printprog);
        */
        LOG.debug("Parsing input");

        B314Parser.ProgrammeContext tree =parse(new ANTLRInputStream(new FileInputStream(inputFile)));
        Scope x = fillSymTable(tree); 
        //printPCode(tree, x);
        //System.out.println(x);
        //System.out.println(x.GetName());
        //System.out.println(x.getChildren().size());
    }
   
    private Scope fillSymTable(B314Parser.ProgrammeContext ctx){
        FillScope fill = new FillScope();
        ParseTreeWalker walk1 = new ParseTreeWalker(); 
        walk1.walk(fill, ctx);
        SymboleTableFiller filler = new SymboleTableFiller((Scope) fill.getScope());
        ParseTreeWalker walker = new ParseTreeWalker(); 
        walker.walk(filler, ctx);
        return filler.getScope();
        //return fill.getScope();
    }
    
    private B314Parser.ProgrammeContext parse(ANTLRInputStream input) throws ParseCancellationException, ParsingException{
        CommonTokenStream tokens = new CommonTokenStream(new B314Lexer(input));
        System.out.println(input);
        parser = new B314Parser(tokens);
        parser.removeErrorListeners();
        MyConsoleErrorListener errorListener = new MyConsoleErrorListener();
        parser.addErrorListener(errorListener);
        B314Parser.ProgrammeContext ctx;
        try{
            ctx = parser.programme();
        }catch(RecognitionException e) {throw new ParsingException("Error");}
        if(errorListener.errorHasBeenReported()) throw new ParsingException("Error while parsing input!");
        return ctx;
    }
    /**
     * Print PCode from AST and symtable.
     */
    private void printPCode(B314Parser.ProgrammeContext tree, Scope symTable) throws FileNotFoundException {
        PCodePrinter printer = new PCodePrinter(outputFile);
        PCodeVisitor visitor = new PCodeVisitor(symTable, printer);
        tree.accept(visitor);
        printer.flush();
        printer.close();
    }    

}
