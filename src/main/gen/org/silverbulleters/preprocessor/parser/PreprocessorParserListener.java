// Generated from PreprocessorParser.g4 by ANTLR 4.9.3
package org.silverbulleters.preprocessor.parser;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link PreprocessorParser}.
 */
public interface PreprocessorParserListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#module}.
	 * @param ctx the parse tree
	 */
	void enterModule(PreprocessorParser.ModuleContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#module}.
	 * @param ctx the parse tree
	 */
	void exitModule(PreprocessorParser.ModuleContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void enterDirective(PreprocessorParser.DirectiveContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#directive}.
	 * @param ctx the parse tree
	 */
	void exitDirective(PreprocessorParser.DirectiveContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#insertCommand}.
	 * @param ctx the parse tree
	 */
	void enterInsertCommand(PreprocessorParser.InsertCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#insertCommand}.
	 * @param ctx the parse tree
	 */
	void exitInsertCommand(PreprocessorParser.InsertCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#deleteCommand}.
	 * @param ctx the parse tree
	 */
	void enterDeleteCommand(PreprocessorParser.DeleteCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#deleteCommand}.
	 * @param ctx the parse tree
	 */
	void exitDeleteCommand(PreprocessorParser.DeleteCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#regionCommand}.
	 * @param ctx the parse tree
	 */
	void enterRegionCommand(PreprocessorParser.RegionCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#regionCommand}.
	 * @param ctx the parse tree
	 */
	void exitRegionCommand(PreprocessorParser.RegionCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void enterIfCommand(PreprocessorParser.IfCommandContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#ifCommand}.
	 * @param ctx the parse tree
	 */
	void exitIfCommand(PreprocessorParser.IfCommandContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void enterIfPart(PreprocessorParser.IfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#ifPart}.
	 * @param ctx the parse tree
	 */
	void exitIfPart(PreprocessorParser.IfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#elsIfPart}.
	 * @param ctx the parse tree
	 */
	void enterElsIfPart(PreprocessorParser.ElsIfPartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#elsIfPart}.
	 * @param ctx the parse tree
	 */
	void exitElsIfPart(PreprocessorParser.ElsIfPartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void enterElsePart(PreprocessorParser.ElsePartContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#elsePart}.
	 * @param ctx the parse tree
	 */
	void exitElsePart(PreprocessorParser.ElsePartContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#insert}.
	 * @param ctx the parse tree
	 */
	void enterInsert(PreprocessorParser.InsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#insert}.
	 * @param ctx the parse tree
	 */
	void exitInsert(PreprocessorParser.InsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#endInsert}.
	 * @param ctx the parse tree
	 */
	void enterEndInsert(PreprocessorParser.EndInsertContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#endInsert}.
	 * @param ctx the parse tree
	 */
	void exitEndInsert(PreprocessorParser.EndInsertContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#delete}.
	 * @param ctx the parse tree
	 */
	void enterDelete(PreprocessorParser.DeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#delete}.
	 * @param ctx the parse tree
	 */
	void exitDelete(PreprocessorParser.DeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#endDelete}.
	 * @param ctx the parse tree
	 */
	void enterEndDelete(PreprocessorParser.EndDeleteContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#endDelete}.
	 * @param ctx the parse tree
	 */
	void exitEndDelete(PreprocessorParser.EndDeleteContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#region}.
	 * @param ctx the parse tree
	 */
	void enterRegion(PreprocessorParser.RegionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#region}.
	 * @param ctx the parse tree
	 */
	void exitRegion(PreprocessorParser.RegionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#regionName}.
	 * @param ctx the parse tree
	 */
	void enterRegionName(PreprocessorParser.RegionNameContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#regionName}.
	 * @param ctx the parse tree
	 */
	void exitRegionName(PreprocessorParser.RegionNameContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#endRegion}.
	 * @param ctx the parse tree
	 */
	void enterEndRegion(PreprocessorParser.EndRegionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#endRegion}.
	 * @param ctx the parse tree
	 */
	void exitEndRegion(PreprocessorParser.EndRegionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#ifTerm}.
	 * @param ctx the parse tree
	 */
	void enterIfTerm(PreprocessorParser.IfTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#ifTerm}.
	 * @param ctx the parse tree
	 */
	void exitIfTerm(PreprocessorParser.IfTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#thenTerm}.
	 * @param ctx the parse tree
	 */
	void enterThenTerm(PreprocessorParser.ThenTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#thenTerm}.
	 * @param ctx the parse tree
	 */
	void exitThenTerm(PreprocessorParser.ThenTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#elsIfTerm}.
	 * @param ctx the parse tree
	 */
	void enterElsIfTerm(PreprocessorParser.ElsIfTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#elsIfTerm}.
	 * @param ctx the parse tree
	 */
	void exitElsIfTerm(PreprocessorParser.ElsIfTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#elseTerm}.
	 * @param ctx the parse tree
	 */
	void enterElseTerm(PreprocessorParser.ElseTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#elseTerm}.
	 * @param ctx the parse tree
	 */
	void exitElseTerm(PreprocessorParser.ElseTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#endIfTerm}.
	 * @param ctx the parse tree
	 */
	void enterEndIfTerm(PreprocessorParser.EndIfTermContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#endIfTerm}.
	 * @param ctx the parse tree
	 */
	void exitEndIfTerm(PreprocessorParser.EndIfTermContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#code}.
	 * @param ctx the parse tree
	 */
	void enterCode(PreprocessorParser.CodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#code}.
	 * @param ctx the parse tree
	 */
	void exitCode(PreprocessorParser.CodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void enterMethodSignature(PreprocessorParser.MethodSignatureContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#methodSignature}.
	 * @param ctx the parse tree
	 */
	void exitMethodSignature(PreprocessorParser.MethodSignatureContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void enterVarDefinition(PreprocessorParser.VarDefinitionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#varDefinition}.
	 * @param ctx the parse tree
	 */
	void exitVarDefinition(PreprocessorParser.VarDefinitionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#codeId}.
	 * @param ctx the parse tree
	 */
	void enterCodeId(PreprocessorParser.CodeIdContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#codeId}.
	 * @param ctx the parse tree
	 */
	void exitCodeId(PreprocessorParser.CodeIdContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#simpleCode}.
	 * @param ctx the parse tree
	 */
	void enterSimpleCode(PreprocessorParser.SimpleCodeContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#simpleCode}.
	 * @param ctx the parse tree
	 */
	void exitSimpleCode(PreprocessorParser.SimpleCodeContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterExpression(PreprocessorParser.ExpressionContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitExpression(PreprocessorParser.ExpressionContext ctx);
	/**
	 * Enter a parse tree produced by {@link PreprocessorParser#symbol}.
	 * @param ctx the parse tree
	 */
	void enterSymbol(PreprocessorParser.SymbolContext ctx);
	/**
	 * Exit a parse tree produced by {@link PreprocessorParser#symbol}.
	 * @param ctx the parse tree
	 */
	void exitSymbol(PreprocessorParser.SymbolContext ctx);
}