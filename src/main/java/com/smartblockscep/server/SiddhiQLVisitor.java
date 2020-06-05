// Generated from com\smartblockscep\server\SiddhiQL.g4 by ANTLR 4.7.1
package com.smartblockscep.server;

	//import io.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SiddhiQLParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SiddhiQLVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#parse}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitParse(SiddhiQLParser.ParseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#error}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitError(SiddhiQLParser.ErrorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#siddhi_app}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSiddhi_app(SiddhiQLParser.Siddhi_appContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#execution_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExecution_element(SiddhiQLParser.Execution_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_stream_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream_final(SiddhiQLParser.Definition_stream_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_stream(SiddhiQLParser.Definition_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_table_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table_final(SiddhiQLParser.Definition_table_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_table}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_table(SiddhiQLParser.Definition_tableContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_window_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window_final(SiddhiQLParser.Definition_window_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_window(SiddhiQLParser.Definition_windowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_query_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_query_final(SiddhiQLParser.Store_query_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_query(SiddhiQLParser.Store_queryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_input(SiddhiQLParser.Store_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_function_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function_final(SiddhiQLParser.Definition_function_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_function(SiddhiQLParser.Definition_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_name(SiddhiQLParser.Function_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#language_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLanguage_name(SiddhiQLParser.Language_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_body}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_body(SiddhiQLParser.Function_bodyContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_trigger_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger_final(SiddhiQLParser.Definition_trigger_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_trigger}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_trigger(SiddhiQLParser.Definition_triggerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#trigger_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTrigger_name(SiddhiQLParser.Trigger_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_aggregation_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_aggregation_final(SiddhiQLParser.Definition_aggregation_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#definition_aggregation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefinition_aggregation(SiddhiQLParser.Definition_aggregationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_name(SiddhiQLParser.Aggregation_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time(SiddhiQLParser.Aggregation_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time_duration}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time_duration(SiddhiQLParser.Aggregation_time_durationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time_range(SiddhiQLParser.Aggregation_time_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#aggregation_time_interval}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAggregation_time_interval(SiddhiQLParser.Aggregation_time_intervalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation(SiddhiQLParser.AnnotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#app_annotation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitApp_annotation(SiddhiQLParser.App_annotationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#annotation_element}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnnotation_element(SiddhiQLParser.Annotation_elementContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#partition}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition(SiddhiQLParser.PartitionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#partition_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_final(SiddhiQLParser.Partition_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#partition_with_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPartition_with_stream(SiddhiQLParser.Partition_with_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#condition_ranges}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_ranges(SiddhiQLParser.Condition_rangesContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#condition_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCondition_range(SiddhiQLParser.Condition_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_final}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_final(SiddhiQLParser.Query_finalContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery(SiddhiQLParser.QueryContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_input}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_input(SiddhiQLParser.Query_inputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#standard_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stream(SiddhiQLParser.Standard_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#join_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_stream(SiddhiQLParser.Join_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#join_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin_source(SiddhiQLParser.Join_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_stream(SiddhiQLParser.Pattern_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#every_pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_pattern_source_chain(SiddhiQLParser.Every_pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source_chain(SiddhiQLParser.Pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#absent_pattern_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsent_pattern_source_chain(SiddhiQLParser.Absent_pattern_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#left_absent_pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_absent_pattern_source(SiddhiQLParser.Left_absent_pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#right_absent_pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_absent_pattern_source(SiddhiQLParser.Right_absent_pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_source(SiddhiQLParser.Pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#logical_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_stateful_source(SiddhiQLParser.Logical_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#logical_absent_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLogical_absent_stateful_source(SiddhiQLParser.Logical_absent_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#every_absent_pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_absent_pattern_source(SiddhiQLParser.Every_absent_pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_absent_pattern_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_absent_pattern_source(SiddhiQLParser.Basic_absent_pattern_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#pattern_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPattern_collection_stateful_source(SiddhiQLParser.Pattern_collection_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#standard_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStandard_stateful_source(SiddhiQLParser.Standard_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source(SiddhiQLParser.Basic_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handlers}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handlers(SiddhiQLParser.Basic_source_stream_handlersContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#basic_source_stream_handler}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_source_stream_handler(SiddhiQLParser.Basic_source_stream_handlerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_stream(SiddhiQLParser.Sequence_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#every_sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_sequence_source_chain(SiddhiQLParser.Every_sequence_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#every_absent_sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvery_absent_sequence_source_chain(SiddhiQLParser.Every_absent_sequence_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#absent_sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAbsent_sequence_source_chain(SiddhiQLParser.Absent_sequence_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#left_absent_sequence_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLeft_absent_sequence_source(SiddhiQLParser.Left_absent_sequence_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#right_absent_sequence_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRight_absent_sequence_source(SiddhiQLParser.Right_absent_sequence_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_source_chain}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source_chain(SiddhiQLParser.Sequence_source_chainContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_source(SiddhiQLParser.Sequence_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#sequence_collection_stateful_source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSequence_collection_stateful_source(SiddhiQLParser.Sequence_collection_stateful_sourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#anonymous_stream}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnonymous_stream(SiddhiQLParser.Anonymous_streamContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#filter}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFilter(SiddhiQLParser.FilterContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#stream_function}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_function(SiddhiQLParser.Stream_functionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#window}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWindow(SiddhiQLParser.WindowContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#group_by_query_selection}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by_query_selection(SiddhiQLParser.Group_by_query_selectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_section}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_section(SiddhiQLParser.Query_sectionContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#group_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGroup_by(SiddhiQLParser.Group_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#having}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHaving(SiddhiQLParser.HavingContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#order_by}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by(SiddhiQLParser.Order_byContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#order_by_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder_by_reference(SiddhiQLParser.Order_by_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#order}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOrder(SiddhiQLParser.OrderContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#limit}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLimit(SiddhiQLParser.LimitContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#offset}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOffset(SiddhiQLParser.OffsetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#query_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuery_output(SiddhiQLParser.Query_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#store_query_output}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStore_query_output(SiddhiQLParser.Store_query_outputContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#set_clause}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_clause(SiddhiQLParser.Set_clauseContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#set_assignment}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSet_assignment(SiddhiQLParser.Set_assignmentContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_event_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_event_type(SiddhiQLParser.Output_event_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_rate}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate(SiddhiQLParser.Output_rateContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_rate_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_rate_type(SiddhiQLParser.Output_rate_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#for_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFor_time(SiddhiQLParser.For_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#within_time}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_time(SiddhiQLParser.Within_timeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#within_time_range}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWithin_time_range(SiddhiQLParser.Within_time_rangeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#per}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPer(SiddhiQLParser.PerContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#output_attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOutput_attribute(SiddhiQLParser.Output_attributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute(SiddhiQLParser.AttributeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#expression}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitExpression(SiddhiQLParser.ExpressionContext ctx);
	/**
	 * Visit a parse tree produced by the {@code multiplication_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMultiplication_math_operation(SiddhiQLParser.Multiplication_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code greaterthan_lessthan_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitGreaterthan_lessthan_math_operation(SiddhiQLParser.Greaterthan_lessthan_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code basic_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBasic_math_operation(SiddhiQLParser.Basic_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code in_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIn_math_operation(SiddhiQLParser.In_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code addition_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAddition_math_operation(SiddhiQLParser.Addition_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code and_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAnd_math_operation(SiddhiQLParser.And_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code or_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOr_math_operation(SiddhiQLParser.Or_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code equality_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEquality_math_operation(SiddhiQLParser.Equality_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by the {@code not_math_operation}
	 * labeled alternative in {@link SiddhiQLParser#math_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNot_math_operation(SiddhiQLParser.Not_math_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_operation}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_operation(SiddhiQLParser.Function_operationContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_list}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_list(SiddhiQLParser.Attribute_listContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#null_check}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitNull_check(SiddhiQLParser.Null_checkContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#stream_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_reference(SiddhiQLParser.Stream_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_reference}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_reference(SiddhiQLParser.Attribute_referenceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_index}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_index(SiddhiQLParser.Attribute_indexContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_id(SiddhiQLParser.Function_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#function_namespace}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFunction_namespace(SiddhiQLParser.Function_namespaceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#stream_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitStream_id(SiddhiQLParser.Stream_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#source_id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource_id(SiddhiQLParser.Source_idContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#alias}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAlias(SiddhiQLParser.AliasContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#property_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_name(SiddhiQLParser.Property_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_name(SiddhiQLParser.Attribute_nameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitType(SiddhiQLParser.TypeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#property_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_value(SiddhiQLParser.Property_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#property_separator}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProperty_separator(SiddhiQLParser.Property_separatorContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#source}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSource(SiddhiQLParser.SourceContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#target}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTarget(SiddhiQLParser.TargetContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#event}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitEvent(SiddhiQLParser.EventContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#name}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitName(SiddhiQLParser.NameContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#collect}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCollect(SiddhiQLParser.CollectContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#attribute_type}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitAttribute_type(SiddhiQLParser.Attribute_typeContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#join}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitJoin(SiddhiQLParser.JoinContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#constant_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitConstant_value(SiddhiQLParser.Constant_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#id}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitId(SiddhiQLParser.IdContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#keyword}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitKeyword(SiddhiQLParser.KeywordContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#time_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTime_value(SiddhiQLParser.Time_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#year_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitYear_value(SiddhiQLParser.Year_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#month_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMonth_value(SiddhiQLParser.Month_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#week_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWeek_value(SiddhiQLParser.Week_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#day_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDay_value(SiddhiQLParser.Day_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#hour_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitHour_value(SiddhiQLParser.Hour_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#minute_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMinute_value(SiddhiQLParser.Minute_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#second_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSecond_value(SiddhiQLParser.Second_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#millisecond_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitMillisecond_value(SiddhiQLParser.Millisecond_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_double_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_double_value(SiddhiQLParser.Signed_double_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_long_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_long_value(SiddhiQLParser.Signed_long_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_float_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_float_value(SiddhiQLParser.Signed_float_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#signed_int_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitSigned_int_value(SiddhiQLParser.Signed_int_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#bool_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBool_value(SiddhiQLParser.Bool_valueContext ctx);
	/**
	 * Visit a parse tree produced by {@link SiddhiQLParser#string_value}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitString_value(SiddhiQLParser.String_valueContext ctx);
}