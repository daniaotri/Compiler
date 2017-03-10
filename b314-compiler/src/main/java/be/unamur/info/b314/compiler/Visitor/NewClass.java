///*
// * To change this license header, choose License Headers in Project Properties.
// * To change this template file, choose Tools | Templates
// * and open the template in the editor.
// */
//package be.unamur.info.b314.compiler.Visitor;
//
//import be.unamur.info.b314.compiler.B314BaseVisitor;
//import be.unamur.info.b314.compiler.B314Parser;
//import static com.google.common.base.Predicates.instanceOf;
//import java.util.HashMap;
//import java.util.Map;
//
///**
// *
// * @author jessi
// */
//public class NewClass extends B314BaseVisitor<Object>{
//    
//    enum TypeScalar{
//    INTEGER,
//    BOOLEAN,
//    SQUARE
//    }
//
//    Map<String, String> TableSymbole = new HashMap<>(); 
//    
//    
//    
//    public Map<String, String> parseTree(B314Parser.ProgrammeContext tree){
//       visitProgramme(tree);
//       return TableSymbole;
//    }
//    
//    @Override
//    public Object visitProgramme(B314Parser.ProgrammeContext prg){
//       return super.visitProgramme(prg);
//    }
//    
//
//    @Override 
//    public Object visitProgDecl(B314Parser.ProgDeclContext ctx) { 
//        for(int i = 0 ; i< ctx.varDecl().size();i++) visitVarDecl(ctx.varDecl(i));
//        for(int i = 0 ; i< ctx.fctDecl().size();i++) visitFctDecl(ctx.fctDecl(i));
//        return null;
//    }
//
//    @Override 
//    public Object visitFctDecl(B314Parser.FctDeclContext ctx) { 
//        return visitChildren(ctx);
//    }
//
//    @Override 
//    public Object visitFctType(B314Parser.FctTypeContext ctx) { return visitChildren(ctx); }
//
//    @Override 
//    public Object visitParamDecl(B314Parser.ParamDeclContext ctx) { 
//        for(int i = 0;i< ctx.varDecl().size();i++) visitVarDecl(ctx.varDecl(i));
//        return null; 
//    }
//
//    @Override 
//    public Object visitVarDecl(B314Parser.VarDeclContext ctx) { 
//        String nom = ctx.ID().getText();
//        String type = visitType(ctx.type()).toString();            
//        if(TableSymbole.containsKey(nom)) throw new RuntimeException("existe déjà dans la table");
//        else TableSymbole.put(nom, type);
//        return null; 
//    }
//
//    @Override 
//    public Object visitClauseWhen(B314Parser.ClauseWhenContext ctx) { return visitChildren(ctx); }
//
//    @Override 
//    public Object visitClauseDefault(B314Parser.ClauseDefaultContext ctx) { return visitChildren(ctx); }
//    
//    @Override 
//    public Object visitType(B314Parser.TypeContext ctx) { 
//        Object result = null;
//        for(int i = 0;i<ctx.getChildCount();i++){
//            if(ctx.getChild(i).equals(ctx.scalar())) result = visitScalar(ctx.scalar());
//            else if(ctx.getChild(i).equals(ctx.array())) result = visitArray(ctx.array());                
//            }   
//        return result; 
//    }
//
//    @Override 
//    public Object visitScalar(B314Parser.ScalarContext ctx) { 
//        Object result = null ;
//        for(int i =0; i< ctx.getChildCount();i++){
//            if(ctx.getChild(i).equals(ctx.BOOLEAN())) result = TypeScalar.BOOLEAN;
//            else if (ctx.getChild(i).equals(ctx.INTEGER())) result = TypeScalar.INTEGER;
//            else if(ctx.getChild(i).equals(ctx.SQUARE())) result = TypeScalar.SQUARE;
//            else throw new RuntimeException("type non connu");
//        }
//        return result;
//    }
//
//    @Override 
//    public Object visitArray(B314Parser.ArrayContext ctx) { return visitChildren(ctx); }
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
//    /*-------------------------------------------------------------------------
//    ------------------------------------------------------------------------
//    ***********************************************************************************/
// 