///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package be.unamur.info.b314.compiler.Visitor;
//
//import TableSimplifiee.AlreadyExistsException;
//import TableSimplifiee.TableSimplifiee;
//import be.unamur.info.b314.compiler.B314BaseVisitor;
//import be.unamur.info.b314.compiler.B314Parser;
//
//import java.util.Map;
//import java.util.HashMap;
//import java.util.Iterator;
//import java.util.Set;
//import java.util.logging.Level;
//import java.util.logging.Logger;
///**
// * ce visitor permet de créer la table de symbole
// * @author jessi
// */
//
//
//
//
//public class MyVisitor extends B314BaseVisitor {
//    //Charles
//    
//    	/**
//	 * {@inheritDoc}
//	 *
//	 * <p>The default implementation returns the result of calling
//	 * {@link #visitChildren} on {@code ctx}.</p>
//	 */
//    
//    enum FunctionType{
//        INTEGER,
//        BOOLEAN,
//        SQUARE,
//        VOID
//    }
//    
//    enum Scalar{
//        INTEGER,
//        BOOLEAN,
//        SQUARE
//        
//    }
//    enum TypeExpression{
//    INTEGER,
//    BOOLEAN,
//    CASE
//    }
//    String[] Stack = new String[2];
//    int stackPointer = 0;
//    
//      Map<String, Scalar> TypeVariablesGlobales = new HashMap<>(); 
//      Map<String, Scalar> TypeTableauxGlobaux = new HashMap<>();
//      Map<String, Integer> NombreParametresTableauxGlobaux = new HashMap<>();
//      
//      Map<String, FunctionType> TypeFonctions = new HashMap<>();
//      Map<String, Integer> NombreParametresFonctions = new HashMap<>();
//      TableSimplifiee<Integer, Scalar> TypeParametresFunctions = new TableSimplifiee();
//      
//      //Les variables locales contiennent les valeurs des variables et tableaux de manière locale. (fonction, when, default)
//      Map<String, Scalar> TypeParametresLocaux = new HashMap<>();
//      Map<String, Scalar> TypeVariablesLocales = new HashMap<>();
//      Map<String, Scalar> TypeTableauxLocaux = new HashMap<>();
//      Map<String, Integer> NombreParametresTableauxLocaux = new HashMap<>();
//      
//      //Les variables suivantes permettent de remplir typeVariablesGlobales, TypeTableauxGlobaux
//      //et NombreParametresTableauxGlobaux.
//      
//      String idUtilise = new String(); // Permet de voir avec quelle variable on travaille lors
//      //de la vérification de la définition des variables
//      String typeUtilise = new String(); // Permet de voir le type de la variable qu'on utilise
//      // à l'instant dans le visiteur.
//      int nombreParametresUtilises=0;
//      boolean currentIsArray=false;
//      
//      //Variables utilisées pour la définition des données relatives aux fonctions.
//      
//      String typeFonctionCourante = new String();
//      int nombreParametresFonctionCourante = 0;
//      boolean currentIsLocal=false;
//      boolean currentIsParameter=false;
//      
//      String idFonctionUtilise = new String();
//      
//      int etapeDeDeclaration=1; // 1= on tient en compte les valeurs globales (struct de données et fonctions)
//                                // 2= on tient en compte les valeurs locales
//
//    @Override
//    public Object visitProgramme(B314Parser.ProgrammeContext ctx) {
//        
//        visitProgDecl(ctx.progDecl());
//        etapeDeDeclaration++;
//        visitProgDecl(ctx.progDecl());
//        
//        return super.visitProgramme(ctx); //To change body of generated methods, choose Tools | Templates.
//    }
//      
//      
//
//    @Override
//    public Object visitVarDecl(B314Parser.VarDeclContext ctx) {
//        
//        idUtilise = ctx.getChild(0).getText();
//        visitType(ctx.typeOfVar);
//        if(currentIsLocal==false && etapeDeDeclaration==1){
//            if(currentIsArray==true){
//
//                switch (typeUtilise) {
//                case "BOOLEAN":
//                    TypeTableauxGlobaux.put(idUtilise, Scalar.BOOLEAN);
//                    break;
//                case "INTEGER":
//                    TypeTableauxGlobaux.put(idUtilise, Scalar.INTEGER);
//                    break;
//                case "SQUARE":
//                    TypeTableauxGlobaux.put(idUtilise, Scalar.SQUARE);
//                    break;
//                }
//
//                NombreParametresTableauxGlobaux.put(idUtilise, nombreParametresUtilises);
//                nombreParametresUtilises=0;
//
//                currentIsArray=false;
//            }else{
//                switch (typeUtilise) {
//                case "BOOLEAN":
//                    TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
//                    break;
//                case "INTEGER":
//                    TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
//                    break;
//                case "SQUARE":
//                    TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
//                    break;
//                }
//            }
//        }else if (etapeDeDeclaration==2){ //Cas local
//            if(currentIsParameter){ //cas des paramètres
//                if (currentIsArray){
//                    // KO
//                }else{
//                    nombreParametresFonctionCourante++;
//
//                    //typeUtilise idUtilise
//
//                    switch (typeUtilise) {
//                    case "BOOLEAN":
//                        TypeParametresLocaux.put(idUtilise, Scalar.BOOLEAN);
//                        break;
//                    case "INTEGER":
//                        TypeParametresLocaux.put(idUtilise, Scalar.INTEGER);
//                        break;
//                    case "SQUARE":
//                        TypeParametresLocaux.put(idUtilise, Scalar.SQUARE);
//                        break;
//                    }
//                }
//                
//
//            }else{
//                if(currentIsArray==true){
//
//                    switch (typeUtilise) {
//                    case "BOOLEAN":
//                        TypeTableauxLocaux.put(idUtilise, Scalar.BOOLEAN);
//
//                        break;
//                    case "INTEGER":
//                        TypeTableauxLocaux.put(idUtilise, Scalar.INTEGER);
//                        break;
//                    case "SQUARE":
//                        TypeTableauxLocaux.put(idUtilise, Scalar.SQUARE);
//                        break;
//                    }
//
//                    NombreParametresTableauxLocaux.put(idUtilise, nombreParametresUtilises);
//                    nombreParametresUtilises=0;
//
//                    currentIsArray=false;
//                }else{
//                    switch (typeUtilise) {
//                    case "BOOLEAN":
//                        TypeVariablesLocales.put(idUtilise, Scalar.BOOLEAN);
//                        break;
//                    case "INTEGER":
//                        TypeVariablesLocales.put(idUtilise, Scalar.INTEGER);
//                        break;
//                    case "SQUARE":
//                        TypeVariablesLocales.put(idUtilise, Scalar.SQUARE);
//                        break;
//                    }
//                }  
//            }
//        }
//        return null;
//    }
//
//    @Override
//    public Object visitType(B314Parser.TypeContext ctx) {
//        
//        visitChildren(ctx);
//        
//        if(currentIsLocal){
//            if(currentIsArray){
//                //Renvoyer une erreur
//                currentIsArray=false;
//            }
//        }
//        
//        return null;
//    }
//
//    @Override
//    public Object visitScalar(B314Parser.ScalarContext ctx) {
//        
//        
//        switch (ctx.getChild(0).getText()) {
//            case "boolean":
//                //TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
//                typeUtilise = "BOOLEAN";
//                break;
//            case "integer":
//                //TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
//                typeUtilise = "INTEGER";
//                break;
//            case "square":
//                //TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
//                typeUtilise = "SQUARE";
//                break;
//        }
//        
//        
//        
//        return null;
//    }
//
//    @Override
//    public Object visitArray(B314Parser.ArrayContext ctx) {
//        
//        switch (ctx.getChild(0).getText()) {
//            case "boolean":
//                //TypeVariablesGlobales.put(idUtilise, Scalar.BOOLEAN);
//                typeUtilise = "BOOLEAN";
//                break;
//            case "integer":
//                //TypeVariablesGlobales.put(idUtilise, Scalar.INTEGER);
//                typeUtilise = "INTEGER";
//                break;
//            case "square":
//                //TypeVariablesGlobales.put(idUtilise, Scalar.SQUARE);
//                typeUtilise = "SQUARE";
//                break;
//        }
//        
//        if(ctx.getChildCount()==4){
//            //NombreParametresTableauxGlobaux.put(idUtilise, 1);
//            nombreParametresUtilises = 1;
//        }else if(ctx.getChildCount()==5){
//            //NombreParametresTableauxGlobaux.put(idUtilise, 2);
//            nombreParametresUtilises = 2;
//        }
//        
//        currentIsArray=true;
//           
//        
//        return null;
//    }
//
//    @Override
//    public Object visitFctDecl(B314Parser.FctDeclContext ctx) {
//        
//        currentIsLocal=true;
//        visitChildren(ctx);
//        if(etapeDeDeclaration==1){
//            NombreParametresFonctions.put(ctx.ID().getText(), nombreParametresUtilises);
//            
//            switch (typeFonctionCourante) {
//            case "boolean":
//                TypeFonctions.put(ctx.ID().getText(), FunctionType.BOOLEAN);
//                break;
//            case "integer":
//                TypeFonctions.put(ctx.ID().getText(), FunctionType.INTEGER);
//                break;
//            case "square":
//                TypeFonctions.put(ctx.ID().getText(), FunctionType.SQUARE);
//                break;
//            case "void":
//                TypeFonctions.put(ctx.ID().getText(), FunctionType.VOID);
//                break;
//            }
//        
//            TypeParametresFunctions.ajoutLigne(ctx.ID().getText());
//            
//            
//            Set<String> parametersSets = TypeParametresLocaux.keySet();
//            Iterator it= parametersSets.iterator();
//
//            int i=0;
//            while(it.hasNext()){
//
//                String str = (String)it.next();
//                Scalar scal = TypeParametresLocaux.get(str);
//
//                try {
//                    TypeParametresFunctions.ajoutValeur(ctx.ID().getText(),new Integer(i), scal);
//                } catch (AlreadyExistsException ex) {
//                    Logger.getLogger(MyVisitor.class.getName()).log(Level.SEVERE, null, ex);
//                }
//
//                i++;
//            }
//        }
//        
//        
//        
//        
//        nombreParametresUtilises=0;
//        currentIsLocal= false;
//
//        return null;
//    }
//
//    @Override
//    public Object visitFctType(B314Parser.FctTypeContext ctx) {
//        
//        typeFonctionCourante=ctx.getText();
//        
//        return null; 
//    }
//
//    @Override
//    public Object visitParamDecl(B314Parser.ParamDeclContext ctx) {
//        
//        currentIsParameter=true;
//        visitChildren(ctx);
//        
//        
//        
//        currentIsParameter=false;
//        
//        return null; //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Object visitClauseWhen(B314Parser.ClauseWhenContext ctx) {
//        
//        
//        return super.visitClauseWhen(ctx); //To change body of generated methods, choose Tools | Templates.
//    }
//
//    @Override
//    public Object visitClauseDefault(B314Parser.ClauseDefaultContext ctx) {
//        
//        currentIsLocal=true;
//        visitChildren(ctx);
//        currentIsLocal=false;
//        
//        return super.visitClauseDefault(ctx); //To change body of generated methods, choose Tools | Templates.
//    }
//    
//    	@Override public Object visitExprDexprG(B314Parser.ExprDexprGContext ctx) { return visitChildren(ctx); }
//        @Override public Object visitFunctionCall(B314Parser.FunctionCallContext ctx) { return visitChildren(ctx); }
//        
//
//	@Override 
//        public Object visitExprEnvInt(B314Parser.ExprEnvIntContext ctx) { 
//            Stack[stackPointer]= MyVisitorExpression.TypeExpression.INTEGER.name();
//            stackPointer++;            
//            return null;
//        }
//        // le type de ExprD depend du type de l'expression entre ()
//	@Override 
//        public Object visitExprPar(B314Parser.ExprParContext ctx) {             
//            return visitChildren(ctx); }
//
//	@Override 
//        public Object visitExprEnvCase(B314Parser.ExprEnvCaseContext ctx) { 
//            Stack[stackPointer]= MyVisitorExpression.TypeExpression.CASE.name();
//            stackPointer++;            
//            return null; 
//        }
//
//	@Override 
//        public Object visitExprEntier(B314Parser.ExprEntierContext ctx) { 
//            Stack[stackPointer]= MyVisitorExpression.TypeExpression.INTEGER.name();
//            stackPointer++;      
//            return null; 
//        }
//	
//
//	@Override 
//        public Object visitExprEnvBool(B314Parser.ExprEnvBoolContext ctx) { 
//            Stack[stackPointer]= MyVisitorExpression.TypeExpression.BOOLEAN.name();
//            stackPointer++;            
//            return null; 
//        }
//        @Override 
//        public Object visitExprOp(B314Parser.ExprOpContext ctx) {
//            int localStackPointer=stackPointer;
//            String[] LocalStack = new String[2];
//            
//            for(int i=0;i==stackPointer;i++){
//                LocalStack[i]= new String(Stack[i]);
//            }            
//            stackPointer=0;
//            visitChildren(ctx);
//            String nomOperation = ctx.op.toString();
//            if(visitType(Stack,nomOperation)){
//                //OK, CONTINUER                
//                stackPointer= localStackPointer;
//                for(int i=0;i==stackPointer;i++){
//                    Stack[i]= new String(LocalStack[i]);
//                }                
//                //Ajout du résultat dans la pile                
//                Stack[stackPointer]= new String(MyVisitorExpression.TypeExpression.INTEGER.name());
//                stackPointer++;
//            }
//            return null; 
//        }
//
//        private Boolean visitType (String[] pile, String operation){            
//            Boolean result = false;
//            if(operation.equals("not")) result = pile[0].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name());
//            if(operation.equals("plus")) result = pile[0].equals(MyVisitorExpression.TypeExpression.INTEGER.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.INTEGER.name());
//            if(operation.equals("moins")) result = pile[0].equals(MyVisitorExpression.TypeExpression.INTEGER.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.INTEGER.name());
//            if(operation.equals("mul")) result = pile[0].equals(MyVisitorExpression.TypeExpression.INTEGER.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.INTEGER.name());
//            if(operation.equals("div")) result = pile[0].equals(MyVisitorExpression.TypeExpression.INTEGER.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.INTEGER.name());
//            if(operation.equals("divEnt")) result = pile[0].equals(MyVisitorExpression.TypeExpression.INTEGER.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.INTEGER.name());
//            if(operation.equals("sup")) result = pile[0].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name());
//            if(operation.equals("inf")) result = pile[0].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name());
//            if(operation.equals("egale")) result = pile[0].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name()) && pile[1].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name());
//            return result;
//        }
//        private Object visitExprD(B314Parser.ExprDContext ctx){
//                        int localStackPointer=stackPointer;
//            String[] LocalStack = new String[2];
//            
//            for(int i=0;i==stackPointer;i++){
//                LocalStack[i]= new String(Stack[i]);
//            }            
//            stackPointer=0;
//            visitChildren(ctx);
//            if(Stack[0].equals(MyVisitorExpression.TypeExpression.BOOLEAN.name())){
//                //OK, CONTINUER                
//                stackPointer= localStackPointer;
//                for(int i=0;i==stackPointer;i++){
//                    Stack[i]= new String(LocalStack[i]);
//                }                
//                //Ajout du résultat dans la pile                
//                Stack[stackPointer]= new String(MyVisitorExpression.TypeExpression.INTEGER.name());
//                stackPointer++;
//            }
//            return null; 
//        }
//        
//        @Override 
//        public Object visitSkipppp(B314Parser.SkippppContext ctx) {    
//            return null; 
//        }
//        @Override 
//        public Object visitIf(B314Parser.IfContext ctx) {    
//            return visitExprD(ctx.exprD()); 
//        }
//
//	@Override 
//        public Object visitIfthenelse(B314Parser.IfthenelseContext ctx) { 
//            return visitExprD(ctx.exprD()); 
//        }
//
//	@Override 
//        public Object visitWhile(B314Parser.WhileContext ctx) { 
//            return visitExprD(ctx.exprD()); 
//        }
//
//	@Override 
//        public Object visitAffectation(B314Parser.AffectationContext ctx) { 
//            return visitExprD(ctx.exprD()); 
//        }
//
//        
//	@Override 
//        public Object visitCompute(B314Parser.ComputeContext ctx) { 
//            return visitExprD(ctx.exprD());  
//        }
//
//	@Override 
//        public Object visitNextAction(B314Parser.NextActionContext ctx) { 
//            return visitAction(ctx.action());
//        }
//    
//    
//    
//    
//    
//    
//    
//    
//    
//}
//    
//    
//    
//    
//    
//
//    
//      
//      
//      
//      
//      
//    
//      
//      
//    
//    
//    
