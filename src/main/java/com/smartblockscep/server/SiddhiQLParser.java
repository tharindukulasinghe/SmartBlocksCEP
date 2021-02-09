// Generated from com\smartblockscep\server\SiddhiQL.g4 by ANTLR 4.7.1
package com.smartblockscep.server;

	//import io.siddhi.query.compiler.exception.SiddhiParserException;

import org.antlr.v4.runtime.atn.*;
import org.antlr.v4.runtime.dfa.DFA;
import org.antlr.v4.runtime.*;
import org.antlr.v4.runtime.misc.*;
import org.antlr.v4.runtime.tree.*;
import java.util.List;
import java.util.Iterator;
import java.util.ArrayList;

@SuppressWarnings({"all", "warnings", "unchecked", "unused", "cast"})
public class SiddhiQLParser extends Parser {
	static { RuntimeMetaData.checkVersion("4.7.1", RuntimeMetaData.VERSION); }

	protected static final DFA[] _decisionToDFA;
	protected static final PredictionContextCache _sharedContextCache =
		new PredictionContextCache();
	public static final int
		T__0=1, INT_LITERAL=2, LONG_LITERAL=3, FLOAT_LITERAL=4, DOUBLE_LITERAL=5, 
		COL=6, SCOL=7, DOT=8, TRIPLE_DOT=9, OPEN_PAR=10, CLOSE_PAR=11, OPEN_SQUARE_BRACKETS=12, 
		CLOSE_SQUARE_BRACKETS=13, COMMA=14, ASSIGN=15, STAR=16, PLUS=17, QUESTION=18, 
		MINUS=19, DIV=20, MOD=21, LT=22, LT_EQ=23, GT=24, GT_EQ=25, EQ=26, NOT_EQ=27, 
		AT_SYMBOL=28, FOLLOWED_BY=29, HASH=30, STREAM=31, DEFINE=32, FUNCTION=33, 
		TRIGGER=34, TABLE=35, APP=36, FROM=37, PARTITION=38, WINDOW=39, SELECT=40, 
		GROUP=41, BY=42, ORDER=43, LIMIT=44, OFFSET=45, ASC=46, DESC=47, HAVING=48, 
		INSERT=49, DELETE=50, UPDATE=51, SET=52, RETURN=53, EVENTS=54, INTO=55, 
		OUTPUT=56, EXPIRED=57, CURRENT=58, SNAPSHOT=59, FOR=60, RAW=61, OF=62, 
		AS=63, AT=64, OR=65, AND=66, IN=67, ON=68, IS=69, NOT=70, WITHIN=71, WITH=72, 
		BEGIN=73, END=74, NULL=75, EVERY=76, LAST=77, ALL=78, FIRST=79, JOIN=80, 
		INNER=81, OUTER=82, RIGHT=83, LEFT=84, FULL=85, UNIDIRECTIONAL=86, YEARS=87, 
		MONTHS=88, WEEKS=89, DAYS=90, HOURS=91, MINUTES=92, SECONDS=93, MILLISECONDS=94, 
		FALSE=95, TRUE=96, STRING=97, INT=98, LONG=99, FLOAT=100, DOUBLE=101, 
		BOOL=102, OBJECT=103, AGGREGATION=104, AGGREGATE=105, PER=106, ID_QUOTES=107, 
		ID=108, STRING_LITERAL=109, SINGLE_LINE_COMMENT=110, MULTILINE_COMMENT=111, 
		SPACES=112, UNEXPECTED_CHAR=113, SCRIPT=114, INT8=115, INT16=116, INT32=117, 
		INT64=118, INT128=119, INT256=120;
	public static final int
		RULE_parse = 0, RULE_error = 1, RULE_siddhi_app = 2, RULE_execution_element = 3, 
		RULE_definition_stream_final = 4, RULE_definition_stream = 5, RULE_definition_table_final = 6, 
		RULE_definition_table = 7, RULE_definition_window_final = 8, RULE_definition_window = 9, 
		RULE_store_query_final = 10, RULE_store_query = 11, RULE_store_input = 12, 
		RULE_definition_function_final = 13, RULE_definition_function = 14, RULE_function_name = 15, 
		RULE_language_name = 16, RULE_function_body = 17, RULE_definition_trigger_final = 18, 
		RULE_definition_trigger = 19, RULE_trigger_name = 20, RULE_definition_aggregation_final = 21, 
		RULE_definition_aggregation = 22, RULE_aggregation_name = 23, RULE_aggregation_time = 24, 
		RULE_aggregation_time_duration = 25, RULE_aggregation_time_range = 26, 
		RULE_aggregation_time_interval = 27, RULE_annotation = 28, RULE_app_annotation = 29, 
		RULE_annotation_element = 30, RULE_partition = 31, RULE_partition_final = 32, 
		RULE_partition_with_stream = 33, RULE_condition_ranges = 34, RULE_condition_range = 35, 
		RULE_query_final = 36, RULE_query = 37, RULE_query_input = 38, RULE_standard_stream = 39, 
		RULE_join_stream = 40, RULE_join_source = 41, RULE_pattern_stream = 42, 
		RULE_every_pattern_source_chain = 43, RULE_pattern_source_chain = 44, 
		RULE_absent_pattern_source_chain = 45, RULE_left_absent_pattern_source = 46, 
		RULE_right_absent_pattern_source = 47, RULE_pattern_source = 48, RULE_logical_stateful_source = 49, 
		RULE_logical_absent_stateful_source = 50, RULE_every_absent_pattern_source = 51, 
		RULE_basic_absent_pattern_source = 52, RULE_pattern_collection_stateful_source = 53, 
		RULE_standard_stateful_source = 54, RULE_basic_source = 55, RULE_basic_source_stream_handlers = 56, 
		RULE_basic_source_stream_handler = 57, RULE_sequence_stream = 58, RULE_every_sequence_source_chain = 59, 
		RULE_every_absent_sequence_source_chain = 60, RULE_absent_sequence_source_chain = 61, 
		RULE_left_absent_sequence_source = 62, RULE_right_absent_sequence_source = 63, 
		RULE_sequence_source_chain = 64, RULE_sequence_source = 65, RULE_sequence_collection_stateful_source = 66, 
		RULE_anonymous_stream = 67, RULE_filter = 68, RULE_stream_function = 69, 
		RULE_window = 70, RULE_group_by_query_selection = 71, RULE_query_section = 72, 
		RULE_group_by = 73, RULE_having = 74, RULE_order_by = 75, RULE_order_by_reference = 76, 
		RULE_order = 77, RULE_limit = 78, RULE_offset = 79, RULE_query_output = 80, 
		RULE_store_query_output = 81, RULE_set_clause = 82, RULE_set_assignment = 83, 
		RULE_output_event_type = 84, RULE_output_rate = 85, RULE_output_rate_type = 86, 
		RULE_for_time = 87, RULE_within_time = 88, RULE_within_time_range = 89, 
		RULE_per = 90, RULE_output_attribute = 91, RULE_attribute = 92, RULE_expression = 93, 
		RULE_math_operation = 94, RULE_function_operation = 95, RULE_attribute_list = 96, 
		RULE_null_check = 97, RULE_stream_reference = 98, RULE_attribute_reference = 99, 
		RULE_attribute_index = 100, RULE_function_id = 101, RULE_function_namespace = 102, 
		RULE_stream_id = 103, RULE_source_id = 104, RULE_alias = 105, RULE_property_name = 106, 
		RULE_attribute_name = 107, RULE_type = 108, RULE_property_value = 109, 
		RULE_property_separator = 110, RULE_source = 111, RULE_target = 112, RULE_event = 113, 
		RULE_name = 114, RULE_collect = 115, RULE_attribute_type = 116, RULE_join = 117, 
		RULE_constant_value = 118, RULE_id = 119, RULE_keyword = 120, RULE_time_value = 121, 
		RULE_year_value = 122, RULE_month_value = 123, RULE_week_value = 124, 
		RULE_day_value = 125, RULE_hour_value = 126, RULE_minute_value = 127, 
		RULE_second_value = 128, RULE_millisecond_value = 129, RULE_signed_double_value = 130, 
		RULE_signed_long_value = 131, RULE_signed_float_value = 132, RULE_signed_int_value = 133, 
		RULE_bool_value = 134, RULE_string_value = 135;
	public static final String[] ruleNames = {
		"parse", "error", "siddhi_app", "execution_element", "definition_stream_final", 
		"definition_stream", "definition_table_final", "definition_table", "definition_window_final", 
		"definition_window", "store_query_final", "store_query", "store_input", 
		"definition_function_final", "definition_function", "function_name", "language_name", 
		"function_body", "definition_trigger_final", "definition_trigger", "trigger_name", 
		"definition_aggregation_final", "definition_aggregation", "aggregation_name", 
		"aggregation_time", "aggregation_time_duration", "aggregation_time_range", 
		"aggregation_time_interval", "annotation", "app_annotation", "annotation_element", 
		"partition", "partition_final", "partition_with_stream", "condition_ranges", 
		"condition_range", "query_final", "query", "query_input", "standard_stream", 
		"join_stream", "join_source", "pattern_stream", "every_pattern_source_chain", 
		"pattern_source_chain", "absent_pattern_source_chain", "left_absent_pattern_source", 
		"right_absent_pattern_source", "pattern_source", "logical_stateful_source", 
		"logical_absent_stateful_source", "every_absent_pattern_source", "basic_absent_pattern_source", 
		"pattern_collection_stateful_source", "standard_stateful_source", "basic_source", 
		"basic_source_stream_handlers", "basic_source_stream_handler", "sequence_stream", 
		"every_sequence_source_chain", "every_absent_sequence_source_chain", "absent_sequence_source_chain", 
		"left_absent_sequence_source", "right_absent_sequence_source", "sequence_source_chain", 
		"sequence_source", "sequence_collection_stateful_source", "anonymous_stream", 
		"filter", "stream_function", "window", "group_by_query_selection", "query_section", 
		"group_by", "having", "order_by", "order_by_reference", "order", "limit", 
		"offset", "query_output", "store_query_output", "set_clause", "set_assignment", 
		"output_event_type", "output_rate", "output_rate_type", "for_time", "within_time", 
		"within_time_range", "per", "output_attribute", "attribute", "expression", 
		"math_operation", "function_operation", "attribute_list", "null_check", 
		"stream_reference", "attribute_reference", "attribute_index", "function_id", 
		"function_namespace", "stream_id", "source_id", "alias", "property_name", 
		"attribute_name", "type", "property_value", "property_separator", "source", 
		"target", "event", "name", "collect", "attribute_type", "join", "constant_value", 
		"id", "keyword", "time_value", "year_value", "month_value", "week_value", 
		"day_value", "hour_value", "minute_value", "second_value", "millisecond_value", 
		"signed_double_value", "signed_long_value", "signed_float_value", "signed_int_value", 
		"bool_value", "string_value"
	};

	private static final String[] _LITERAL_NAMES = {
		null, "'!'", null, null, null, null, "':'", "';'", "'.'", "'...'", "'('", 
		"')'", "'['", "']'", "','", "'='", "'*'", "'+'", "'?'", "'-'", "'/'", 
		"'%'", "'<'", "'<='", "'>'", "'>='", "'=='", "'!='", "'@'", "'->'", "'#'"
	};
	private static final String[] _SYMBOLIC_NAMES = {
		null, null, "INT_LITERAL", "LONG_LITERAL", "FLOAT_LITERAL", "DOUBLE_LITERAL", 
		"COL", "SCOL", "DOT", "TRIPLE_DOT", "OPEN_PAR", "CLOSE_PAR", "OPEN_SQUARE_BRACKETS", 
		"CLOSE_SQUARE_BRACKETS", "COMMA", "ASSIGN", "STAR", "PLUS", "QUESTION", 
		"MINUS", "DIV", "MOD", "LT", "LT_EQ", "GT", "GT_EQ", "EQ", "NOT_EQ", "AT_SYMBOL", 
		"FOLLOWED_BY", "HASH", "STREAM", "DEFINE", "FUNCTION", "TRIGGER", "TABLE", 
		"APP", "FROM", "PARTITION", "WINDOW", "SELECT", "GROUP", "BY", "ORDER", 
		"LIMIT", "OFFSET", "ASC", "DESC", "HAVING", "INSERT", "DELETE", "UPDATE", 
		"SET", "RETURN", "EVENTS", "INTO", "OUTPUT", "EXPIRED", "CURRENT", "SNAPSHOT", 
		"FOR", "RAW", "OF", "AS", "AT", "OR", "AND", "IN", "ON", "IS", "NOT", 
		"WITHIN", "WITH", "BEGIN", "END", "NULL", "EVERY", "LAST", "ALL", "FIRST", 
		"JOIN", "INNER", "OUTER", "RIGHT", "LEFT", "FULL", "UNIDIRECTIONAL", "YEARS", 
		"MONTHS", "WEEKS", "DAYS", "HOURS", "MINUTES", "SECONDS", "MILLISECONDS", 
		"FALSE", "TRUE", "STRING", "INT", "LONG", "FLOAT", "DOUBLE", "BOOL", "OBJECT", 
		"AGGREGATION", "AGGREGATE", "PER", "ID_QUOTES", "ID", "STRING_LITERAL", 
		"SINGLE_LINE_COMMENT", "MULTILINE_COMMENT", "SPACES", "UNEXPECTED_CHAR", 
		"SCRIPT", "INT8", "INT16", "INT32", "INT64", "INT128", "INT256"
	};
	public static final Vocabulary VOCABULARY = new VocabularyImpl(_LITERAL_NAMES, _SYMBOLIC_NAMES);

	/**
	 * @deprecated Use {@link #VOCABULARY} instead.
	 */
	@Deprecated
	public static final String[] tokenNames;
	static {
		tokenNames = new String[_SYMBOLIC_NAMES.length];
		for (int i = 0; i < tokenNames.length; i++) {
			tokenNames[i] = VOCABULARY.getLiteralName(i);
			if (tokenNames[i] == null) {
				tokenNames[i] = VOCABULARY.getSymbolicName(i);
			}

			if (tokenNames[i] == null) {
				tokenNames[i] = "<INVALID>";
			}
		}
	}

	@Override
	@Deprecated
	public String[] getTokenNames() {
		return tokenNames;
	}

	@Override

	public Vocabulary getVocabulary() {
		return VOCABULARY;
	}

	@Override
	public String getGrammarFileName() { return "SiddhiQL.g4"; }

	@Override
	public String[] getRuleNames() { return ruleNames; }

	@Override
	public String getSerializedATN() { return _serializedATN; }

	@Override
	public ATN getATN() { return _ATN; }

	public SiddhiQLParser(TokenStream input) {
		super(input);
		_interp = new ParserATNSimulator(this,_ATN,_decisionToDFA,_sharedContextCache);
	}
	public static class ParseContext extends ParserRuleContext {
		public Siddhi_appContext siddhi_app() {
			return getRuleContext(Siddhi_appContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public ParseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_parse; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitParse(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ParseContext parse() throws RecognitionException {
		ParseContext _localctx = new ParseContext(_ctx, getState());
		enterRule(_localctx, 0, RULE_parse);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(272);
			siddhi_app();
			setState(273);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ErrorContext extends ParserRuleContext {
		public TerminalNode UNEXPECTED_CHAR() { return getToken(SiddhiQLParser.UNEXPECTED_CHAR, 0); }
		public ErrorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_error; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitError(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ErrorContext error() throws RecognitionException {
		ErrorContext _localctx = new ErrorContext(_ctx, getState());
		enterRule(_localctx, 2, RULE_error);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(275);
			match(UNEXPECTED_CHAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Siddhi_appContext extends ParserRuleContext {
		public List<Definition_streamContext> definition_stream() {
			return getRuleContexts(Definition_streamContext.class);
		}
		public Definition_streamContext definition_stream(int i) {
			return getRuleContext(Definition_streamContext.class,i);
		}
		public List<Definition_tableContext> definition_table() {
			return getRuleContexts(Definition_tableContext.class);
		}
		public Definition_tableContext definition_table(int i) {
			return getRuleContext(Definition_tableContext.class,i);
		}
		public List<Definition_triggerContext> definition_trigger() {
			return getRuleContexts(Definition_triggerContext.class);
		}
		public Definition_triggerContext definition_trigger(int i) {
			return getRuleContext(Definition_triggerContext.class,i);
		}
		public List<Definition_functionContext> definition_function() {
			return getRuleContexts(Definition_functionContext.class);
		}
		public Definition_functionContext definition_function(int i) {
			return getRuleContext(Definition_functionContext.class,i);
		}
		public List<Definition_windowContext> definition_window() {
			return getRuleContexts(Definition_windowContext.class);
		}
		public Definition_windowContext definition_window(int i) {
			return getRuleContext(Definition_windowContext.class,i);
		}
		public List<Definition_aggregationContext> definition_aggregation() {
			return getRuleContexts(Definition_aggregationContext.class);
		}
		public Definition_aggregationContext definition_aggregation(int i) {
			return getRuleContext(Definition_aggregationContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<App_annotationContext> app_annotation() {
			return getRuleContexts(App_annotationContext.class);
		}
		public App_annotationContext app_annotation(int i) {
			return getRuleContext(App_annotationContext.class,i);
		}
		public List<Execution_elementContext> execution_element() {
			return getRuleContexts(Execution_elementContext.class);
		}
		public Execution_elementContext execution_element(int i) {
			return getRuleContext(Execution_elementContext.class,i);
		}
		public Siddhi_appContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_siddhi_app; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSiddhi_app(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Siddhi_appContext siddhi_app() throws RecognitionException {
		Siddhi_appContext _localctx = new Siddhi_appContext(_ctx, getState());
		enterRule(_localctx, 4, RULE_siddhi_app);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(281);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					setState(279);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
						{
						setState(277);
						app_annotation();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(278);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					} 
				}
				setState(283);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,1,_ctx);
			}
			setState(291);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,2,_ctx) ) {
			case 1:
				{
				setState(284);
				definition_stream();
				}
				break;
			case 2:
				{
				setState(285);
				definition_table();
				}
				break;
			case 3:
				{
				setState(286);
				definition_trigger();
				}
				break;
			case 4:
				{
				setState(287);
				definition_function();
				}
				break;
			case 5:
				{
				setState(288);
				definition_window();
				}
				break;
			case 6:
				{
				setState(289);
				definition_aggregation();
				}
				break;
			case 7:
				{
				setState(290);
				error();
				}
				break;
			}
			setState(305);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(293);
					match(SCOL);
					setState(301);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,3,_ctx) ) {
					case 1:
						{
						setState(294);
						definition_stream();
						}
						break;
					case 2:
						{
						setState(295);
						definition_table();
						}
						break;
					case 3:
						{
						setState(296);
						definition_trigger();
						}
						break;
					case 4:
						{
						setState(297);
						definition_function();
						}
						break;
					case 5:
						{
						setState(298);
						definition_window();
						}
						break;
					case 6:
						{
						setState(299);
						definition_aggregation();
						}
						break;
					case 7:
						{
						setState(300);
						error();
						}
						break;
					}
					}
					} 
				}
				setState(307);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,4,_ctx);
			}
			setState(315);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(308);
					match(SCOL);
					setState(311);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
					case FROM:
					case PARTITION:
						{
						setState(309);
						execution_element();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(310);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(317);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,6,_ctx);
			}
			setState(319);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(318);
				match(SCOL);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Execution_elementContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public Execution_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_execution_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitExecution_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Execution_elementContext execution_element() throws RecognitionException {
		Execution_elementContext _localctx = new Execution_elementContext(_ctx, getState());
		enterRule(_localctx, 6, RULE_execution_element);
		try {
			setState(323);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,8,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(321);
				query();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(322);
				partition();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_stream_finalContext extends ParserRuleContext {
		public Definition_streamContext definition_stream() {
			return getRuleContext(Definition_streamContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_stream_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_stream_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_stream_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_stream_finalContext definition_stream_final() throws RecognitionException {
		Definition_stream_finalContext _localctx = new Definition_stream_finalContext(_ctx, getState());
		enterRule(_localctx, 8, RULE_definition_stream_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(325);
			definition_stream();
			setState(327);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(326);
				match(SCOL);
				}
			}

			setState(329);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_streamContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode STREAM() { return getToken(SiddhiQLParser.STREAM, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Definition_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_streamContext definition_stream() throws RecognitionException {
		Definition_streamContext _localctx = new Definition_streamContext(_ctx, getState());
		enterRule(_localctx, 10, RULE_definition_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(334);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(331);
				annotation();
				}
				}
				setState(336);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(337);
			match(DEFINE);
			setState(338);
			match(STREAM);
			setState(339);
			source();
			setState(340);
			match(OPEN_PAR);
			setState(341);
			attribute_name();
			setState(342);
			attribute_type();
			setState(349);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(343);
				match(COMMA);
				setState(344);
				attribute_name();
				setState(345);
				attribute_type();
				}
				}
				setState(351);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(352);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_table_finalContext extends ParserRuleContext {
		public Definition_tableContext definition_table() {
			return getRuleContext(Definition_tableContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_table_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_table_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_table_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_table_finalContext definition_table_final() throws RecognitionException {
		Definition_table_finalContext _localctx = new Definition_table_finalContext(_ctx, getState());
		enterRule(_localctx, 12, RULE_definition_table_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(354);
			definition_table();
			setState(356);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(355);
				match(SCOL);
				}
			}

			setState(358);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_tableContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode TABLE() { return getToken(SiddhiQLParser.TABLE, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Definition_tableContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_table; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_table(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_tableContext definition_table() throws RecognitionException {
		Definition_tableContext _localctx = new Definition_tableContext(_ctx, getState());
		enterRule(_localctx, 14, RULE_definition_table);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(363);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(360);
				annotation();
				}
				}
				setState(365);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(366);
			match(DEFINE);
			setState(367);
			match(TABLE);
			setState(368);
			source();
			setState(369);
			match(OPEN_PAR);
			setState(370);
			attribute_name();
			setState(371);
			attribute_type();
			setState(378);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(372);
				match(COMMA);
				setState(373);
				attribute_name();
				setState(374);
				attribute_type();
				}
				}
				setState(380);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(381);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_window_finalContext extends ParserRuleContext {
		public Definition_windowContext definition_window() {
			return getRuleContext(Definition_windowContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_window_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_window_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_window_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_window_finalContext definition_window_final() throws RecognitionException {
		Definition_window_finalContext _localctx = new Definition_window_finalContext(_ctx, getState());
		enterRule(_localctx, 16, RULE_definition_window_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(383);
			definition_window();
			setState(385);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(384);
				match(SCOL);
				}
			}

			setState(387);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_windowContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode WINDOW() { return getToken(SiddhiQLParser.WINDOW, 0); }
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public List<Attribute_nameContext> attribute_name() {
			return getRuleContexts(Attribute_nameContext.class);
		}
		public Attribute_nameContext attribute_name(int i) {
			return getRuleContext(Attribute_nameContext.class,i);
		}
		public List<Attribute_typeContext> attribute_type() {
			return getRuleContexts(Attribute_typeContext.class);
		}
		public Attribute_typeContext attribute_type(int i) {
			return getRuleContext(Attribute_typeContext.class,i);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode OUTPUT() { return getToken(SiddhiQLParser.OUTPUT, 0); }
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public Definition_windowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_window; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_window(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_windowContext definition_window() throws RecognitionException {
		Definition_windowContext _localctx = new Definition_windowContext(_ctx, getState());
		enterRule(_localctx, 18, RULE_definition_window);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(392);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(389);
				annotation();
				}
				}
				setState(394);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(395);
			match(DEFINE);
			setState(396);
			match(WINDOW);
			setState(397);
			source();
			setState(398);
			match(OPEN_PAR);
			setState(399);
			attribute_name();
			setState(400);
			attribute_type();
			setState(407);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(401);
				match(COMMA);
				setState(402);
				attribute_name();
				setState(403);
				attribute_type();
				}
				}
				setState(409);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(410);
			match(CLOSE_PAR);
			setState(411);
			function_operation();
			setState(414);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(412);
				match(OUTPUT);
				setState(413);
				output_event_type();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_query_finalContext extends ParserRuleContext {
		public Store_queryContext store_query() {
			return getRuleContext(Store_queryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Store_query_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_query_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_query_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_query_finalContext store_query_final() throws RecognitionException {
		Store_query_finalContext _localctx = new Store_query_finalContext(_ctx, getState());
		enterRule(_localctx, 20, RULE_store_query_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(416);
			store_query();
			setState(418);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(417);
				match(SCOL);
				}
			}

			setState(420);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_queryContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Store_inputContext store_input() {
			return getRuleContext(Store_inputContext.class,0);
		}
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public TerminalNode INSERT() { return getToken(SiddhiQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SiddhiQLParser.INTO, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(SiddhiQLParser.UPDATE, 0); }
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public Store_query_outputContext store_query_output() {
			return getRuleContext(Store_query_outputContext.class,0);
		}
		public Store_queryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_query(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_queryContext store_query() throws RecognitionException {
		Store_queryContext _localctx = new Store_queryContext(_ctx, getState());
		enterRule(_localctx, 22, RULE_store_query);
		int _la;
		try {
			setState(448);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,23,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(422);
				match(FROM);
				setState(423);
				store_input();
				setState(425);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECT) {
					{
					setState(424);
					query_section();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(427);
				query_section();
				setState(428);
				match(INSERT);
				setState(429);
				match(INTO);
				setState(430);
				target();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(432);
				query_section();
				setState(433);
				match(UPDATE);
				setState(434);
				match(OR);
				setState(435);
				match(INSERT);
				setState(436);
				match(INTO);
				setState(437);
				target();
				setState(439);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(438);
					set_clause();
					}
				}

				setState(441);
				match(ON);
				setState(442);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(445);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECT) {
					{
					setState(444);
					query_section();
					}
				}

				setState(447);
				store_query_output();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_inputContext extends ParserRuleContext {
		public Source_idContext source_id() {
			return getRuleContext(Source_idContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Within_time_rangeContext within_time_range() {
			return getRuleContext(Within_time_rangeContext.class,0);
		}
		public PerContext per() {
			return getRuleContext(PerContext.class,0);
		}
		public Store_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_inputContext store_input() throws RecognitionException {
		Store_inputContext _localctx = new Store_inputContext(_ctx, getState());
		enterRule(_localctx, 24, RULE_store_input);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(450);
			source_id();
			setState(453);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(451);
				match(AS);
				setState(452);
				alias();
				}
			}

			setState(457);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(455);
				match(ON);
				setState(456);
				expression();
				}
			}

			setState(462);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(459);
				within_time_range();
				setState(460);
				per();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_function_finalContext extends ParserRuleContext {
		public Definition_functionContext definition_function() {
			return getRuleContext(Definition_functionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_function_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_function_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_function_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_function_finalContext definition_function_final() throws RecognitionException {
		Definition_function_finalContext _localctx = new Definition_function_finalContext(_ctx, getState());
		enterRule(_localctx, 26, RULE_definition_function_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(464);
			definition_function();
			setState(466);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(465);
				match(SCOL);
				}
			}

			setState(468);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_functionContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode FUNCTION() { return getToken(SiddhiQLParser.FUNCTION, 0); }
		public Function_nameContext function_name() {
			return getRuleContext(Function_nameContext.class,0);
		}
		public Language_nameContext language_name() {
			return getRuleContext(Language_nameContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public Attribute_typeContext attribute_type() {
			return getRuleContext(Attribute_typeContext.class,0);
		}
		public Function_bodyContext function_body() {
			return getRuleContext(Function_bodyContext.class,0);
		}
		public Definition_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_functionContext definition_function() throws RecognitionException {
		Definition_functionContext _localctx = new Definition_functionContext(_ctx, getState());
		enterRule(_localctx, 28, RULE_definition_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(470);
			match(DEFINE);
			setState(471);
			match(FUNCTION);
			setState(472);
			function_name();
			setState(473);
			match(OPEN_SQUARE_BRACKETS);
			setState(474);
			language_name();
			setState(475);
			match(CLOSE_SQUARE_BRACKETS);
			setState(476);
			match(RETURN);
			setState(477);
			attribute_type();
			setState(478);
			function_body();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Function_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_nameContext function_name() throws RecognitionException {
		Function_nameContext _localctx = new Function_nameContext(_ctx, getState());
		enterRule(_localctx, 30, RULE_function_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(480);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Language_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Language_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_language_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLanguage_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Language_nameContext language_name() throws RecognitionException {
		Language_nameContext _localctx = new Language_nameContext(_ctx, getState());
		enterRule(_localctx, 32, RULE_language_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(482);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_bodyContext extends ParserRuleContext {
		public TerminalNode SCRIPT() { return getToken(SiddhiQLParser.SCRIPT, 0); }
		public Function_bodyContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_body; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_body(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_bodyContext function_body() throws RecognitionException {
		Function_bodyContext _localctx = new Function_bodyContext(_ctx, getState());
		enterRule(_localctx, 34, RULE_function_body);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(484);
			match(SCRIPT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_trigger_finalContext extends ParserRuleContext {
		public Definition_triggerContext definition_trigger() {
			return getRuleContext(Definition_triggerContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_trigger_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_trigger_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_trigger_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_trigger_finalContext definition_trigger_final() throws RecognitionException {
		Definition_trigger_finalContext _localctx = new Definition_trigger_finalContext(_ctx, getState());
		enterRule(_localctx, 36, RULE_definition_trigger_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(486);
			definition_trigger();
			setState(488);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(487);
				match(SCOL);
				}
			}

			setState(490);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_triggerContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode TRIGGER() { return getToken(SiddhiQLParser.TRIGGER, 0); }
		public Trigger_nameContext trigger_name() {
			return getRuleContext(Trigger_nameContext.class,0);
		}
		public TerminalNode AT() { return getToken(SiddhiQLParser.AT, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Definition_triggerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_trigger; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_trigger(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_triggerContext definition_trigger() throws RecognitionException {
		Definition_triggerContext _localctx = new Definition_triggerContext(_ctx, getState());
		enterRule(_localctx, 38, RULE_definition_trigger);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(492);
			match(DEFINE);
			setState(493);
			match(TRIGGER);
			setState(494);
			trigger_name();
			setState(495);
			match(AT);
			setState(499);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case EVERY:
				{
				setState(496);
				match(EVERY);
				setState(497);
				time_value();
				}
				break;
			case STRING_LITERAL:
				{
				setState(498);
				string_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Trigger_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Trigger_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_trigger_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitTrigger_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Trigger_nameContext trigger_name() throws RecognitionException {
		Trigger_nameContext _localctx = new Trigger_nameContext(_ctx, getState());
		enterRule(_localctx, 40, RULE_trigger_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(501);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_aggregation_finalContext extends ParserRuleContext {
		public Definition_aggregationContext definition_aggregation() {
			return getRuleContext(Definition_aggregationContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Definition_aggregation_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_aggregation_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_aggregation_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_aggregation_finalContext definition_aggregation_final() throws RecognitionException {
		Definition_aggregation_finalContext _localctx = new Definition_aggregation_finalContext(_ctx, getState());
		enterRule(_localctx, 42, RULE_definition_aggregation_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(503);
			definition_aggregation();
			setState(505);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(504);
				match(SCOL);
				}
			}

			setState(507);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Definition_aggregationContext extends ParserRuleContext {
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode AGGREGATION() { return getToken(SiddhiQLParser.AGGREGATION, 0); }
		public Aggregation_nameContext aggregation_name() {
			return getRuleContext(Aggregation_nameContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Standard_streamContext standard_stream() {
			return getRuleContext(Standard_streamContext.class,0);
		}
		public Group_by_query_selectionContext group_by_query_selection() {
			return getRuleContext(Group_by_query_selectionContext.class,0);
		}
		public TerminalNode AGGREGATE() { return getToken(SiddhiQLParser.AGGREGATE, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Aggregation_timeContext aggregation_time() {
			return getRuleContext(Aggregation_timeContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Definition_aggregationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_definition_aggregation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDefinition_aggregation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Definition_aggregationContext definition_aggregation() throws RecognitionException {
		Definition_aggregationContext _localctx = new Definition_aggregationContext(_ctx, getState());
		enterRule(_localctx, 44, RULE_definition_aggregation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(512);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(509);
				annotation();
				}
				}
				setState(514);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(515);
			match(DEFINE);
			setState(516);
			match(AGGREGATION);
			setState(517);
			aggregation_name();
			setState(518);
			match(FROM);
			setState(519);
			standard_stream();
			setState(520);
			group_by_query_selection();
			setState(521);
			match(AGGREGATE);
			setState(524);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==BY) {
				{
				setState(522);
				match(BY);
				setState(523);
				attribute_reference();
				}
			}

			setState(526);
			match(EVERY);
			setState(527);
			aggregation_time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregation_nameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public Aggregation_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_nameContext aggregation_name() throws RecognitionException {
		Aggregation_nameContext _localctx = new Aggregation_nameContext(_ctx, getState());
		enterRule(_localctx, 46, RULE_aggregation_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(529);
			id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregation_timeContext extends ParserRuleContext {
		public Aggregation_time_rangeContext aggregation_time_range() {
			return getRuleContext(Aggregation_time_rangeContext.class,0);
		}
		public Aggregation_time_intervalContext aggregation_time_interval() {
			return getRuleContext(Aggregation_time_intervalContext.class,0);
		}
		public Aggregation_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_timeContext aggregation_time() throws RecognitionException {
		Aggregation_timeContext _localctx = new Aggregation_timeContext(_ctx, getState());
		enterRule(_localctx, 48, RULE_aggregation_time);
		try {
			setState(533);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,33,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(531);
				aggregation_time_range();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(532);
				aggregation_time_interval();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregation_time_durationContext extends ParserRuleContext {
		public TerminalNode SECONDS() { return getToken(SiddhiQLParser.SECONDS, 0); }
		public TerminalNode MINUTES() { return getToken(SiddhiQLParser.MINUTES, 0); }
		public TerminalNode HOURS() { return getToken(SiddhiQLParser.HOURS, 0); }
		public TerminalNode DAYS() { return getToken(SiddhiQLParser.DAYS, 0); }
		public TerminalNode WEEKS() { return getToken(SiddhiQLParser.WEEKS, 0); }
		public TerminalNode MONTHS() { return getToken(SiddhiQLParser.MONTHS, 0); }
		public TerminalNode YEARS() { return getToken(SiddhiQLParser.YEARS, 0); }
		public Aggregation_time_durationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time_duration; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time_duration(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_time_durationContext aggregation_time_duration() throws RecognitionException {
		Aggregation_time_durationContext _localctx = new Aggregation_time_durationContext(_ctx, getState());
		enterRule(_localctx, 50, RULE_aggregation_time_duration);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(535);
			_la = _input.LA(1);
			if ( !(((((_la - 87)) & ~0x3f) == 0 && ((1L << (_la - 87)) & ((1L << (YEARS - 87)) | (1L << (MONTHS - 87)) | (1L << (WEEKS - 87)) | (1L << (DAYS - 87)) | (1L << (HOURS - 87)) | (1L << (MINUTES - 87)) | (1L << (SECONDS - 87)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregation_time_rangeContext extends ParserRuleContext {
		public List<Aggregation_time_durationContext> aggregation_time_duration() {
			return getRuleContexts(Aggregation_time_durationContext.class);
		}
		public Aggregation_time_durationContext aggregation_time_duration(int i) {
			return getRuleContext(Aggregation_time_durationContext.class,i);
		}
		public TerminalNode TRIPLE_DOT() { return getToken(SiddhiQLParser.TRIPLE_DOT, 0); }
		public Aggregation_time_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_time_rangeContext aggregation_time_range() throws RecognitionException {
		Aggregation_time_rangeContext _localctx = new Aggregation_time_rangeContext(_ctx, getState());
		enterRule(_localctx, 52, RULE_aggregation_time_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(537);
			aggregation_time_duration();
			setState(538);
			match(TRIPLE_DOT);
			setState(539);
			aggregation_time_duration();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Aggregation_time_intervalContext extends ParserRuleContext {
		public List<Aggregation_time_durationContext> aggregation_time_duration() {
			return getRuleContexts(Aggregation_time_durationContext.class);
		}
		public Aggregation_time_durationContext aggregation_time_duration(int i) {
			return getRuleContext(Aggregation_time_durationContext.class,i);
		}
		public List<TerminalNode> COMMA() { return getTokens(SiddhiQLParser.COMMA); }
		public TerminalNode COMMA(int i) {
			return getToken(SiddhiQLParser.COMMA, i);
		}
		public Aggregation_time_intervalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_aggregation_time_interval; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAggregation_time_interval(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Aggregation_time_intervalContext aggregation_time_interval() throws RecognitionException {
		Aggregation_time_intervalContext _localctx = new Aggregation_time_intervalContext(_ctx, getState());
		enterRule(_localctx, 54, RULE_aggregation_time_interval);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(541);
			aggregation_time_duration();
			setState(546);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(542);
				match(COMMA);
				setState(543);
				aggregation_time_duration();
				}
				}
				setState(548);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AnnotationContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public AnnotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnnotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AnnotationContext annotation() throws RecognitionException {
		AnnotationContext _localctx = new AnnotationContext(_ctx, getState());
		enterRule(_localctx, 56, RULE_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(549);
			match(AT_SYMBOL);
			setState(550);
			name();
			setState(568);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(551);
				match(OPEN_PAR);
				setState(554);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case STREAM:
				case DEFINE:
				case TABLE:
				case APP:
				case FROM:
				case PARTITION:
				case WINDOW:
				case SELECT:
				case GROUP:
				case BY:
				case ORDER:
				case LIMIT:
				case ASC:
				case DESC:
				case HAVING:
				case INSERT:
				case DELETE:
				case UPDATE:
				case RETURN:
				case EVENTS:
				case INTO:
				case OUTPUT:
				case EXPIRED:
				case CURRENT:
				case SNAPSHOT:
				case FOR:
				case RAW:
				case OF:
				case AS:
				case OR:
				case AND:
				case ON:
				case IS:
				case NOT:
				case WITHIN:
				case WITH:
				case BEGIN:
				case END:
				case NULL:
				case EVERY:
				case LAST:
				case ALL:
				case FIRST:
				case JOIN:
				case INNER:
				case OUTER:
				case RIGHT:
				case LEFT:
				case FULL:
				case UNIDIRECTIONAL:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case HOURS:
				case MINUTES:
				case SECONDS:
				case MILLISECONDS:
				case FALSE:
				case TRUE:
				case STRING:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case BOOL:
				case OBJECT:
				case ID_QUOTES:
				case ID:
				case STRING_LITERAL:
					{
					setState(552);
					annotation_element();
					}
					break;
				case AT_SYMBOL:
					{
					setState(553);
					annotation();
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(563);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(556);
					match(COMMA);
					setState(559);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case STREAM:
					case DEFINE:
					case TABLE:
					case APP:
					case FROM:
					case PARTITION:
					case WINDOW:
					case SELECT:
					case GROUP:
					case BY:
					case ORDER:
					case LIMIT:
					case ASC:
					case DESC:
					case HAVING:
					case INSERT:
					case DELETE:
					case UPDATE:
					case RETURN:
					case EVENTS:
					case INTO:
					case OUTPUT:
					case EXPIRED:
					case CURRENT:
					case SNAPSHOT:
					case FOR:
					case RAW:
					case OF:
					case AS:
					case OR:
					case AND:
					case ON:
					case IS:
					case NOT:
					case WITHIN:
					case WITH:
					case BEGIN:
					case END:
					case NULL:
					case EVERY:
					case LAST:
					case ALL:
					case FIRST:
					case JOIN:
					case INNER:
					case OUTER:
					case RIGHT:
					case LEFT:
					case FULL:
					case UNIDIRECTIONAL:
					case YEARS:
					case MONTHS:
					case WEEKS:
					case DAYS:
					case HOURS:
					case MINUTES:
					case SECONDS:
					case MILLISECONDS:
					case FALSE:
					case TRUE:
					case STRING:
					case INT:
					case LONG:
					case FLOAT:
					case DOUBLE:
					case BOOL:
					case OBJECT:
					case ID_QUOTES:
					case ID:
					case STRING_LITERAL:
						{
						setState(557);
						annotation_element();
						}
						break;
					case AT_SYMBOL:
						{
						setState(558);
						annotation();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					}
					setState(565);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(566);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class App_annotationContext extends ParserRuleContext {
		public TerminalNode APP() { return getToken(SiddhiQLParser.APP, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public List<Annotation_elementContext> annotation_element() {
			return getRuleContexts(Annotation_elementContext.class);
		}
		public Annotation_elementContext annotation_element(int i) {
			return getRuleContext(Annotation_elementContext.class,i);
		}
		public App_annotationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_app_annotation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitApp_annotation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final App_annotationContext app_annotation() throws RecognitionException {
		App_annotationContext _localctx = new App_annotationContext(_ctx, getState());
		enterRule(_localctx, 58, RULE_app_annotation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(570);
			match(AT_SYMBOL);
			setState(571);
			match(APP);
			setState(572);
			match(COL);
			setState(573);
			name();
			setState(585);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_PAR) {
				{
				setState(574);
				match(OPEN_PAR);
				setState(575);
				annotation_element();
				setState(580);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(576);
					match(COMMA);
					setState(577);
					annotation_element();
					}
					}
					setState(582);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				setState(583);
				match(CLOSE_PAR);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Annotation_elementContext extends ParserRuleContext {
		public Property_valueContext property_value() {
			return getRuleContext(Property_valueContext.class,0);
		}
		public Property_nameContext property_name() {
			return getRuleContext(Property_nameContext.class,0);
		}
		public Annotation_elementContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_annotation_element; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnnotation_element(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Annotation_elementContext annotation_element() throws RecognitionException {
		Annotation_elementContext _localctx = new Annotation_elementContext(_ctx, getState());
		enterRule(_localctx, 60, RULE_annotation_element);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(590);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,41,_ctx) ) {
			case 1:
				{
				setState(587);
				property_name();
				setState(588);
				match(ASSIGN);
				}
				break;
			}
			setState(592);
			property_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PartitionContext extends ParserRuleContext {
		public TerminalNode PARTITION() { return getToken(SiddhiQLParser.PARTITION, 0); }
		public TerminalNode WITH() { return getToken(SiddhiQLParser.WITH, 0); }
		public List<Partition_with_streamContext> partition_with_stream() {
			return getRuleContexts(Partition_with_streamContext.class);
		}
		public Partition_with_streamContext partition_with_stream(int i) {
			return getRuleContext(Partition_with_streamContext.class,i);
		}
		public TerminalNode BEGIN() { return getToken(SiddhiQLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SiddhiQLParser.END, 0); }
		public List<QueryContext> query() {
			return getRuleContexts(QueryContext.class);
		}
		public QueryContext query(int i) {
			return getRuleContext(QueryContext.class,i);
		}
		public List<ErrorContext> error() {
			return getRuleContexts(ErrorContext.class);
		}
		public ErrorContext error(int i) {
			return getRuleContext(ErrorContext.class,i);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public PartitionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPartition(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PartitionContext partition() throws RecognitionException {
		PartitionContext _localctx = new PartitionContext(_ctx, getState());
		enterRule(_localctx, 62, RULE_partition);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(597);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(594);
				annotation();
				}
				}
				setState(599);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(600);
			match(PARTITION);
			setState(601);
			match(WITH);
			setState(602);
			match(OPEN_PAR);
			setState(603);
			partition_with_stream();
			setState(608);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(604);
				match(COMMA);
				setState(605);
				partition_with_stream();
				}
				}
				setState(610);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(611);
			match(CLOSE_PAR);
			setState(612);
			match(BEGIN);
			setState(615);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case AT_SYMBOL:
			case FROM:
				{
				setState(613);
				query();
				}
				break;
			case UNEXPECTED_CHAR:
				{
				setState(614);
				error();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(624);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					{
					{
					setState(617);
					match(SCOL);
					setState(620);
					_errHandler.sync(this);
					switch (_input.LA(1)) {
					case AT_SYMBOL:
					case FROM:
						{
						setState(618);
						query();
						}
						break;
					case UNEXPECTED_CHAR:
						{
						setState(619);
						error();
						}
						break;
					default:
						throw new NoViableAltException(this);
					}
					}
					} 
				}
				setState(626);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,46,_ctx);
			}
			setState(628);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(627);
				match(SCOL);
				}
			}

			setState(630);
			match(END);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_finalContext extends ParserRuleContext {
		public PartitionContext partition() {
			return getRuleContext(PartitionContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Partition_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPartition_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_finalContext partition_final() throws RecognitionException {
		Partition_finalContext _localctx = new Partition_finalContext(_ctx, getState());
		enterRule(_localctx, 64, RULE_partition_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(632);
			partition();
			setState(634);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(633);
				match(SCOL);
				}
			}

			setState(636);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Partition_with_streamContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode OF() { return getToken(SiddhiQLParser.OF, 0); }
		public Stream_idContext stream_id() {
			return getRuleContext(Stream_idContext.class,0);
		}
		public Condition_rangesContext condition_ranges() {
			return getRuleContext(Condition_rangesContext.class,0);
		}
		public Partition_with_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_partition_with_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPartition_with_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Partition_with_streamContext partition_with_stream() throws RecognitionException {
		Partition_with_streamContext _localctx = new Partition_with_streamContext(_ctx, getState());
		enterRule(_localctx, 66, RULE_partition_with_stream);
		try {
			setState(646);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,49,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(638);
				attribute();
				setState(639);
				match(OF);
				setState(640);
				stream_id();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(642);
				condition_ranges();
				setState(643);
				match(OF);
				setState(644);
				stream_id();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_rangesContext extends ParserRuleContext {
		public List<Condition_rangeContext> condition_range() {
			return getRuleContexts(Condition_rangeContext.class);
		}
		public Condition_rangeContext condition_range(int i) {
			return getRuleContext(Condition_rangeContext.class,i);
		}
		public List<TerminalNode> OR() { return getTokens(SiddhiQLParser.OR); }
		public TerminalNode OR(int i) {
			return getToken(SiddhiQLParser.OR, i);
		}
		public Condition_rangesContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_ranges; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitCondition_ranges(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_rangesContext condition_ranges() throws RecognitionException {
		Condition_rangesContext _localctx = new Condition_rangesContext(_ctx, getState());
		enterRule(_localctx, 68, RULE_condition_ranges);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(648);
			condition_range();
			setState(653);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==OR) {
				{
				{
				setState(649);
				match(OR);
				setState(650);
				condition_range();
				}
				}
				setState(655);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Condition_rangeContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Condition_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_condition_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitCondition_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Condition_rangeContext condition_range() throws RecognitionException {
		Condition_rangeContext _localctx = new Condition_rangeContext(_ctx, getState());
		enterRule(_localctx, 70, RULE_condition_range);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(656);
			expression();
			setState(657);
			match(AS);
			setState(658);
			string_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_finalContext extends ParserRuleContext {
		public QueryContext query() {
			return getRuleContext(QueryContext.class,0);
		}
		public TerminalNode EOF() { return getToken(SiddhiQLParser.EOF, 0); }
		public Query_finalContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_final; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_final(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_finalContext query_final() throws RecognitionException {
		Query_finalContext _localctx = new Query_finalContext(_ctx, getState());
		enterRule(_localctx, 72, RULE_query_final);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(660);
			query();
			setState(662);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SCOL) {
				{
				setState(661);
				match(SCOL);
				}
			}

			setState(664);
			match(EOF);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class QueryContext extends ParserRuleContext {
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Query_inputContext query_input() {
			return getRuleContext(Query_inputContext.class,0);
		}
		public Query_outputContext query_output() {
			return getRuleContext(Query_outputContext.class,0);
		}
		public List<AnnotationContext> annotation() {
			return getRuleContexts(AnnotationContext.class);
		}
		public AnnotationContext annotation(int i) {
			return getRuleContext(AnnotationContext.class,i);
		}
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Output_rateContext output_rate() {
			return getRuleContext(Output_rateContext.class,0);
		}
		public QueryContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery(this);
			else return visitor.visitChildren(this);
		}
	}

	public final QueryContext query() throws RecognitionException {
		QueryContext _localctx = new QueryContext(_ctx, getState());
		enterRule(_localctx, 74, RULE_query);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(669);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==AT_SYMBOL) {
				{
				{
				setState(666);
				annotation();
				}
				}
				setState(671);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			setState(672);
			match(FROM);
			setState(673);
			query_input();
			setState(675);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==SELECT) {
				{
				setState(674);
				query_section();
				}
			}

			setState(678);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OUTPUT) {
				{
				setState(677);
				output_rate();
				}
			}

			setState(680);
			query_output();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_inputContext extends ParserRuleContext {
		public Standard_streamContext standard_stream() {
			return getRuleContext(Standard_streamContext.class,0);
		}
		public Join_streamContext join_stream() {
			return getRuleContext(Join_streamContext.class,0);
		}
		public Pattern_streamContext pattern_stream() {
			return getRuleContext(Pattern_streamContext.class,0);
		}
		public Sequence_streamContext sequence_stream() {
			return getRuleContext(Sequence_streamContext.class,0);
		}
		public Anonymous_streamContext anonymous_stream() {
			return getRuleContext(Anonymous_streamContext.class,0);
		}
		public Query_inputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_input; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_input(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_inputContext query_input() throws RecognitionException {
		Query_inputContext _localctx = new Query_inputContext(_ctx, getState());
		enterRule(_localctx, 76, RULE_query_input);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(687);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,55,_ctx) ) {
			case 1:
				{
				setState(682);
				standard_stream();
				}
				break;
			case 2:
				{
				setState(683);
				join_stream();
				}
				break;
			case 3:
				{
				setState(684);
				pattern_stream();
				}
				break;
			case 4:
				{
				setState(685);
				sequence_stream();
				}
				break;
			case 5:
				{
				setState(686);
				anonymous_stream();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Standard_streamContext extends ParserRuleContext {
		public Basic_source_stream_handlersContext pre_window_handlers;
		public Basic_source_stream_handlersContext post_window_handlers;
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public List<Basic_source_stream_handlersContext> basic_source_stream_handlers() {
			return getRuleContexts(Basic_source_stream_handlersContext.class);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers(int i) {
			return getRuleContext(Basic_source_stream_handlersContext.class,i);
		}
		public Standard_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStandard_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_streamContext standard_stream() throws RecognitionException {
		Standard_streamContext _localctx = new Standard_streamContext(_ctx, getState());
		enterRule(_localctx, 78, RULE_standard_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(689);
			source();
			setState(691);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,56,_ctx) ) {
			case 1:
				{
				setState(690);
				((Standard_streamContext)_localctx).pre_window_handlers = basic_source_stream_handlers();
				}
				break;
			}
			setState(694);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,57,_ctx) ) {
			case 1:
				{
				setState(693);
				window();
				}
				break;
			}
			setState(697);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE_BRACKETS || _la==HASH) {
				{
				setState(696);
				((Standard_streamContext)_localctx).post_window_handlers = basic_source_stream_handlers();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_streamContext extends ParserRuleContext {
		public Join_sourceContext left_source;
		public Join_sourceContext right_source;
		public Token right_unidirectional;
		public Token left_unidirectional;
		public List<Join_sourceContext> join_source() {
			return getRuleContexts(Join_sourceContext.class);
		}
		public Join_sourceContext join_source(int i) {
			return getRuleContext(Join_sourceContext.class,i);
		}
		public JoinContext join() {
			return getRuleContext(JoinContext.class,0);
		}
		public TerminalNode UNIDIRECTIONAL() { return getToken(SiddhiQLParser.UNIDIRECTIONAL, 0); }
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Within_time_rangeContext within_time_range() {
			return getRuleContext(Within_time_rangeContext.class,0);
		}
		public PerContext per() {
			return getRuleContext(PerContext.class,0);
		}
		public Join_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitJoin_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_streamContext join_stream() throws RecognitionException {
		Join_streamContext _localctx = new Join_streamContext(_ctx, getState());
		enterRule(_localctx, 80, RULE_join_stream);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(699);
			((Join_streamContext)_localctx).left_source = join_source();
			setState(709);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
				{
				setState(700);
				join();
				setState(701);
				((Join_streamContext)_localctx).right_source = join_source();
				setState(703);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==UNIDIRECTIONAL) {
					{
					setState(702);
					((Join_streamContext)_localctx).right_unidirectional = match(UNIDIRECTIONAL);
					}
				}

				}
				break;
			case UNIDIRECTIONAL:
				{
				setState(705);
				((Join_streamContext)_localctx).left_unidirectional = match(UNIDIRECTIONAL);
				setState(706);
				join();
				setState(707);
				((Join_streamContext)_localctx).right_source = join_source();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			setState(713);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ON) {
				{
				setState(711);
				match(ON);
				setState(712);
				expression();
				}
			}

			setState(718);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==WITHIN) {
				{
				setState(715);
				within_time_range();
				setState(716);
				per();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Join_sourceContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers() {
			return getRuleContext(Basic_source_stream_handlersContext.class,0);
		}
		public WindowContext window() {
			return getRuleContext(WindowContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public AliasContext alias() {
			return getRuleContext(AliasContext.class,0);
		}
		public Join_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitJoin_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Join_sourceContext join_source() throws RecognitionException {
		Join_sourceContext _localctx = new Join_sourceContext(_ctx, getState());
		enterRule(_localctx, 82, RULE_join_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(720);
			source();
			setState(722);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,63,_ctx) ) {
			case 1:
				{
				setState(721);
				basic_source_stream_handlers();
				}
				break;
			}
			setState(725);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(724);
				window();
				}
			}

			setState(729);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==AS) {
				{
				setState(727);
				match(AS);
				setState(728);
				alias();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_streamContext extends ParserRuleContext {
		public Every_pattern_source_chainContext every_pattern_source_chain() {
			return getRuleContext(Every_pattern_source_chainContext.class,0);
		}
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Absent_pattern_source_chainContext absent_pattern_source_chain() {
			return getRuleContext(Absent_pattern_source_chainContext.class,0);
		}
		public Pattern_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_streamContext pattern_stream() throws RecognitionException {
		Pattern_streamContext _localctx = new Pattern_streamContext(_ctx, getState());
		enterRule(_localctx, 84, RULE_pattern_stream);
		int _la;
		try {
			setState(739);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,68,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(731);
				every_pattern_source_chain(0);
				setState(733);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(732);
					within_time();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(735);
				absent_pattern_source_chain();
				setState(737);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(736);
					within_time();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Every_pattern_source_chainContext extends ParserRuleContext {
		public List<Every_pattern_source_chainContext> every_pattern_source_chain() {
			return getRuleContexts(Every_pattern_source_chainContext.class);
		}
		public Every_pattern_source_chainContext every_pattern_source_chain(int i) {
			return getRuleContext(Every_pattern_source_chainContext.class,i);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Pattern_source_chainContext pattern_source_chain() {
			return getRuleContext(Pattern_source_chainContext.class,0);
		}
		public Pattern_sourceContext pattern_source() {
			return getRuleContext(Pattern_sourceContext.class,0);
		}
		public Every_pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_pattern_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvery_pattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Every_pattern_source_chainContext every_pattern_source_chain() throws RecognitionException {
		return every_pattern_source_chain(0);
	}

	private Every_pattern_source_chainContext every_pattern_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Every_pattern_source_chainContext _localctx = new Every_pattern_source_chainContext(_ctx, _parentState);
		Every_pattern_source_chainContext _prevctx = _localctx;
		int _startState = 86;
		enterRecursionRule(_localctx, 86, RULE_every_pattern_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(754);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,69,_ctx) ) {
			case 1:
				{
				setState(742);
				match(OPEN_PAR);
				setState(743);
				every_pattern_source_chain(0);
				setState(744);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(746);
				match(EVERY);
				setState(747);
				match(OPEN_PAR);
				setState(748);
				pattern_source_chain(0);
				setState(749);
				match(CLOSE_PAR);
				}
				break;
			case 3:
				{
				setState(751);
				pattern_source_chain(0);
				}
				break;
			case 4:
				{
				setState(752);
				match(EVERY);
				setState(753);
				pattern_source();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(761);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Every_pattern_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_every_pattern_source_chain);
					setState(756);
					if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
					setState(757);
					match(FOLLOWED_BY);
					setState(758);
					every_pattern_source_chain(4);
					}
					} 
				}
				setState(763);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,70,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Pattern_source_chainContext extends ParserRuleContext {
		public List<Pattern_source_chainContext> pattern_source_chain() {
			return getRuleContexts(Pattern_source_chainContext.class);
		}
		public Pattern_source_chainContext pattern_source_chain(int i) {
			return getRuleContext(Pattern_source_chainContext.class,i);
		}
		public Pattern_sourceContext pattern_source() {
			return getRuleContext(Pattern_sourceContext.class,0);
		}
		public Pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_source_chainContext pattern_source_chain() throws RecognitionException {
		return pattern_source_chain(0);
	}

	private Pattern_source_chainContext pattern_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Pattern_source_chainContext _localctx = new Pattern_source_chainContext(_ctx, _parentState);
		Pattern_source_chainContext _prevctx = _localctx;
		int _startState = 88;
		enterRecursionRule(_localctx, 88, RULE_pattern_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(770);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,71,_ctx) ) {
			case 1:
				{
				setState(765);
				match(OPEN_PAR);
				setState(766);
				pattern_source_chain(0);
				setState(767);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(769);
				pattern_source();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(777);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Pattern_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_pattern_source_chain);
					setState(772);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(773);
					match(FOLLOWED_BY);
					setState(774);
					pattern_source_chain(3);
					}
					} 
				}
				setState(779);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,72,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Absent_pattern_source_chainContext extends ParserRuleContext {
		public Absent_pattern_source_chainContext absent_pattern_source_chain() {
			return getRuleContext(Absent_pattern_source_chainContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Every_absent_pattern_sourceContext every_absent_pattern_source() {
			return getRuleContext(Every_absent_pattern_sourceContext.class,0);
		}
		public Left_absent_pattern_sourceContext left_absent_pattern_source() {
			return getRuleContext(Left_absent_pattern_sourceContext.class,0);
		}
		public Right_absent_pattern_sourceContext right_absent_pattern_source() {
			return getRuleContext(Right_absent_pattern_sourceContext.class,0);
		}
		public Absent_pattern_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absent_pattern_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAbsent_pattern_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Absent_pattern_source_chainContext absent_pattern_source_chain() throws RecognitionException {
		Absent_pattern_source_chainContext _localctx = new Absent_pattern_source_chainContext(_ctx, getState());
		enterRule(_localctx, 90, RULE_absent_pattern_source_chain);
		int _la;
		try {
			setState(790);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,74,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(781);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EVERY) {
					{
					setState(780);
					match(EVERY);
					}
				}

				setState(783);
				match(OPEN_PAR);
				setState(784);
				absent_pattern_source_chain();
				setState(785);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(787);
				every_absent_pattern_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(788);
				left_absent_pattern_source(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(789);
				right_absent_pattern_source(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_absent_pattern_sourceContext extends ParserRuleContext {
		public List<Left_absent_pattern_sourceContext> left_absent_pattern_source() {
			return getRuleContexts(Left_absent_pattern_sourceContext.class);
		}
		public Left_absent_pattern_sourceContext left_absent_pattern_source(int i) {
			return getRuleContext(Left_absent_pattern_sourceContext.class,i);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Every_absent_pattern_sourceContext every_absent_pattern_source() {
			return getRuleContext(Every_absent_pattern_sourceContext.class,0);
		}
		public Every_pattern_source_chainContext every_pattern_source_chain() {
			return getRuleContext(Every_pattern_source_chainContext.class,0);
		}
		public Left_absent_pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_absent_pattern_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLeft_absent_pattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_absent_pattern_sourceContext left_absent_pattern_source() throws RecognitionException {
		return left_absent_pattern_source(0);
	}

	private Left_absent_pattern_sourceContext left_absent_pattern_source(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Left_absent_pattern_sourceContext _localctx = new Left_absent_pattern_sourceContext(_ctx, _parentState);
		Left_absent_pattern_sourceContext _prevctx = _localctx;
		int _startState = 92;
		enterRecursionRule(_localctx, 92, RULE_left_absent_pattern_source, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(808);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,76,_ctx) ) {
			case 1:
				{
				setState(794);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EVERY) {
					{
					setState(793);
					match(EVERY);
					}
				}

				setState(796);
				match(OPEN_PAR);
				setState(797);
				left_absent_pattern_source(0);
				setState(798);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(800);
				every_absent_pattern_source();
				setState(801);
				match(FOLLOWED_BY);
				setState(802);
				every_pattern_source_chain(0);
				}
				break;
			case 3:
				{
				setState(804);
				every_pattern_source_chain(0);
				setState(805);
				match(FOLLOWED_BY);
				setState(806);
				left_absent_pattern_source(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(818);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(816);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,77,_ctx) ) {
					case 1:
						{
						_localctx = new Left_absent_pattern_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_left_absent_pattern_source);
						setState(810);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(811);
						match(FOLLOWED_BY);
						setState(812);
						left_absent_pattern_source(4);
						}
						break;
					case 2:
						{
						_localctx = new Left_absent_pattern_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_left_absent_pattern_source);
						setState(813);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(814);
						match(FOLLOWED_BY);
						setState(815);
						every_absent_pattern_source();
						}
						break;
					}
					} 
				}
				setState(820);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,78,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Right_absent_pattern_sourceContext extends ParserRuleContext {
		public List<Right_absent_pattern_sourceContext> right_absent_pattern_source() {
			return getRuleContexts(Right_absent_pattern_sourceContext.class);
		}
		public Right_absent_pattern_sourceContext right_absent_pattern_source(int i) {
			return getRuleContext(Right_absent_pattern_sourceContext.class,i);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Every_pattern_source_chainContext every_pattern_source_chain() {
			return getRuleContext(Every_pattern_source_chainContext.class,0);
		}
		public Every_absent_pattern_sourceContext every_absent_pattern_source() {
			return getRuleContext(Every_absent_pattern_sourceContext.class,0);
		}
		public Right_absent_pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_absent_pattern_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitRight_absent_pattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_absent_pattern_sourceContext right_absent_pattern_source() throws RecognitionException {
		return right_absent_pattern_source(0);
	}

	private Right_absent_pattern_sourceContext right_absent_pattern_source(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Right_absent_pattern_sourceContext _localctx = new Right_absent_pattern_sourceContext(_ctx, _parentState);
		Right_absent_pattern_sourceContext _prevctx = _localctx;
		int _startState = 94;
		enterRecursionRule(_localctx, 94, RULE_right_absent_pattern_source, _p);
		int _la;
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(837);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,80,_ctx) ) {
			case 1:
				{
				setState(823);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==EVERY) {
					{
					setState(822);
					match(EVERY);
					}
				}

				setState(825);
				match(OPEN_PAR);
				setState(826);
				right_absent_pattern_source(0);
				setState(827);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(829);
				every_pattern_source_chain(0);
				setState(830);
				match(FOLLOWED_BY);
				setState(831);
				every_absent_pattern_source();
				}
				break;
			case 3:
				{
				setState(833);
				every_absent_pattern_source();
				setState(834);
				match(FOLLOWED_BY);
				setState(835);
				right_absent_pattern_source(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(847);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(845);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,81,_ctx) ) {
					case 1:
						{
						_localctx = new Right_absent_pattern_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_right_absent_pattern_source);
						setState(839);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(840);
						match(FOLLOWED_BY);
						setState(841);
						right_absent_pattern_source(4);
						}
						break;
					case 2:
						{
						_localctx = new Right_absent_pattern_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_right_absent_pattern_source);
						setState(842);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(843);
						match(FOLLOWED_BY);
						setState(844);
						every_pattern_source_chain(0);
						}
						break;
					}
					} 
				}
				setState(849);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,82,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Pattern_sourceContext extends ParserRuleContext {
		public Logical_stateful_sourceContext logical_stateful_source() {
			return getRuleContext(Logical_stateful_sourceContext.class,0);
		}
		public Pattern_collection_stateful_sourceContext pattern_collection_stateful_source() {
			return getRuleContext(Pattern_collection_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Logical_absent_stateful_sourceContext logical_absent_stateful_source() {
			return getRuleContext(Logical_absent_stateful_sourceContext.class,0);
		}
		public Pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_sourceContext pattern_source() throws RecognitionException {
		Pattern_sourceContext _localctx = new Pattern_sourceContext(_ctx, getState());
		enterRule(_localctx, 96, RULE_pattern_source);
		try {
			setState(854);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,83,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(850);
				logical_stateful_source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(851);
				pattern_collection_stateful_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(852);
				standard_stateful_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(853);
				logical_absent_stateful_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_stateful_sourceContext extends ParserRuleContext {
		public List<Standard_stateful_sourceContext> standard_stateful_source() {
			return getRuleContexts(Standard_stateful_sourceContext.class);
		}
		public Standard_stateful_sourceContext standard_stateful_source(int i) {
			return getRuleContext(Standard_stateful_sourceContext.class,i);
		}
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public Logical_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_stateful_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLogical_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_stateful_sourceContext logical_stateful_source() throws RecognitionException {
		Logical_stateful_sourceContext _localctx = new Logical_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 98, RULE_logical_stateful_source);
		try {
			setState(864);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,84,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(856);
				standard_stateful_source();
				setState(857);
				match(AND);
				setState(858);
				standard_stateful_source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(860);
				standard_stateful_source();
				setState(861);
				match(OR);
				setState(862);
				standard_stateful_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Logical_absent_stateful_sourceContext extends ParserRuleContext {
		public Logical_absent_stateful_sourceContext logical_absent_stateful_source() {
			return getRuleContext(Logical_absent_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public Basic_sourceContext basic_source() {
			return getRuleContext(Basic_sourceContext.class,0);
		}
		public List<Basic_absent_pattern_sourceContext> basic_absent_pattern_source() {
			return getRuleContexts(Basic_absent_pattern_sourceContext.class);
		}
		public Basic_absent_pattern_sourceContext basic_absent_pattern_source(int i) {
			return getRuleContext(Basic_absent_pattern_sourceContext.class,i);
		}
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public Logical_absent_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_logical_absent_stateful_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLogical_absent_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Logical_absent_stateful_sourceContext logical_absent_stateful_source() throws RecognitionException {
		Logical_absent_stateful_sourceContext _localctx = new Logical_absent_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 100, RULE_logical_absent_stateful_source);
		try {
			setState(904);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,85,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(866);
				match(OPEN_PAR);
				setState(867);
				logical_absent_stateful_source();
				setState(868);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(870);
				standard_stateful_source();
				setState(871);
				match(AND);
				setState(872);
				match(NOT);
				setState(873);
				basic_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(875);
				match(NOT);
				setState(876);
				basic_source();
				setState(877);
				match(AND);
				setState(878);
				standard_stateful_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(880);
				standard_stateful_source();
				setState(881);
				match(AND);
				setState(882);
				basic_absent_pattern_source();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(884);
				basic_absent_pattern_source();
				setState(885);
				match(AND);
				setState(886);
				standard_stateful_source();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(888);
				basic_absent_pattern_source();
				setState(889);
				match(AND);
				setState(890);
				basic_absent_pattern_source();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(892);
				standard_stateful_source();
				setState(893);
				match(OR);
				setState(894);
				basic_absent_pattern_source();
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(896);
				basic_absent_pattern_source();
				setState(897);
				match(OR);
				setState(898);
				standard_stateful_source();
				}
				break;
			case 9:
				enterOuterAlt(_localctx, 9);
				{
				setState(900);
				basic_absent_pattern_source();
				setState(901);
				match(OR);
				setState(902);
				basic_absent_pattern_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Every_absent_pattern_sourceContext extends ParserRuleContext {
		public Basic_absent_pattern_sourceContext basic_absent_pattern_source() {
			return getRuleContext(Basic_absent_pattern_sourceContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Every_absent_pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_absent_pattern_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvery_absent_pattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Every_absent_pattern_sourceContext every_absent_pattern_source() throws RecognitionException {
		Every_absent_pattern_sourceContext _localctx = new Every_absent_pattern_sourceContext(_ctx, getState());
		enterRule(_localctx, 102, RULE_every_absent_pattern_source);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(907);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==EVERY) {
				{
				setState(906);
				match(EVERY);
				}
			}

			setState(909);
			basic_absent_pattern_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_absent_pattern_sourceContext extends ParserRuleContext {
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public Basic_sourceContext basic_source() {
			return getRuleContext(Basic_sourceContext.class,0);
		}
		public For_timeContext for_time() {
			return getRuleContext(For_timeContext.class,0);
		}
		public Basic_absent_pattern_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_absent_pattern_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_absent_pattern_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_absent_pattern_sourceContext basic_absent_pattern_source() throws RecognitionException {
		Basic_absent_pattern_sourceContext _localctx = new Basic_absent_pattern_sourceContext(_ctx, getState());
		enterRule(_localctx, 104, RULE_basic_absent_pattern_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(911);
			match(NOT);
			setState(912);
			basic_source();
			setState(913);
			for_time();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Pattern_collection_stateful_sourceContext extends ParserRuleContext {
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public Pattern_collection_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_pattern_collection_stateful_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPattern_collection_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Pattern_collection_stateful_sourceContext pattern_collection_stateful_source() throws RecognitionException {
		Pattern_collection_stateful_sourceContext _localctx = new Pattern_collection_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 106, RULE_pattern_collection_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(915);
			standard_stateful_source();
			setState(916);
			match(LT);
			setState(917);
			collect();
			setState(918);
			match(GT);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Standard_stateful_sourceContext extends ParserRuleContext {
		public Basic_sourceContext basic_source() {
			return getRuleContext(Basic_sourceContext.class,0);
		}
		public EventContext event() {
			return getRuleContext(EventContext.class,0);
		}
		public Standard_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_standard_stateful_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStandard_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Standard_stateful_sourceContext standard_stateful_source() throws RecognitionException {
		Standard_stateful_sourceContext _localctx = new Standard_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 108, RULE_standard_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(923);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,87,_ctx) ) {
			case 1:
				{
				setState(920);
				event();
				setState(921);
				match(ASSIGN);
				}
				break;
			}
			setState(925);
			basic_source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_sourceContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public Basic_source_stream_handlersContext basic_source_stream_handlers() {
			return getRuleContext(Basic_source_stream_handlersContext.class,0);
		}
		public Basic_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_sourceContext basic_source() throws RecognitionException {
		Basic_sourceContext _localctx = new Basic_sourceContext(_ctx, getState());
		enterRule(_localctx, 110, RULE_basic_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(927);
			source();
			setState(929);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,88,_ctx) ) {
			case 1:
				{
				setState(928);
				basic_source_stream_handlers();
				}
				break;
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_source_stream_handlersContext extends ParserRuleContext {
		public List<Basic_source_stream_handlerContext> basic_source_stream_handler() {
			return getRuleContexts(Basic_source_stream_handlerContext.class);
		}
		public Basic_source_stream_handlerContext basic_source_stream_handler(int i) {
			return getRuleContext(Basic_source_stream_handlerContext.class,i);
		}
		public Basic_source_stream_handlersContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source_stream_handlers; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_source_stream_handlers(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_source_stream_handlersContext basic_source_stream_handlers() throws RecognitionException {
		Basic_source_stream_handlersContext _localctx = new Basic_source_stream_handlersContext(_ctx, getState());
		enterRule(_localctx, 112, RULE_basic_source_stream_handlers);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(932); 
			_errHandler.sync(this);
			_alt = 1;
			do {
				switch (_alt) {
				case 1:
					{
					{
					setState(931);
					basic_source_stream_handler();
					}
					}
					break;
				default:
					throw new NoViableAltException(this);
				}
				setState(934); 
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,89,_ctx);
			} while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER );
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Basic_source_stream_handlerContext extends ParserRuleContext {
		public FilterContext filter() {
			return getRuleContext(FilterContext.class,0);
		}
		public Stream_functionContext stream_function() {
			return getRuleContext(Stream_functionContext.class,0);
		}
		public Basic_source_stream_handlerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_basic_source_stream_handler; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_source_stream_handler(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Basic_source_stream_handlerContext basic_source_stream_handler() throws RecognitionException {
		Basic_source_stream_handlerContext _localctx = new Basic_source_stream_handlerContext(_ctx, getState());
		enterRule(_localctx, 114, RULE_basic_source_stream_handler);
		try {
			setState(938);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,90,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(936);
				filter();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(937);
				stream_function();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_streamContext extends ParserRuleContext {
		public Every_sequence_source_chainContext every_sequence_source_chain() {
			return getRuleContext(Every_sequence_source_chainContext.class,0);
		}
		public Within_timeContext within_time() {
			return getRuleContext(Within_timeContext.class,0);
		}
		public Every_absent_sequence_source_chainContext every_absent_sequence_source_chain() {
			return getRuleContext(Every_absent_sequence_source_chainContext.class,0);
		}
		public Sequence_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_streamContext sequence_stream() throws RecognitionException {
		Sequence_streamContext _localctx = new Sequence_streamContext(_ctx, getState());
		enterRule(_localctx, 116, RULE_sequence_stream);
		int _la;
		try {
			setState(948);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,93,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(940);
				every_sequence_source_chain();
				setState(942);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(941);
					within_time();
					}
				}

				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(944);
				every_absent_sequence_source_chain();
				setState(946);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==WITHIN) {
					{
					setState(945);
					within_time();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Every_sequence_source_chainContext extends ParserRuleContext {
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Sequence_source_chainContext sequence_source_chain() {
			return getRuleContext(Sequence_source_chainContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Every_sequence_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_sequence_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvery_sequence_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Every_sequence_source_chainContext every_sequence_source_chain() throws RecognitionException {
		Every_sequence_source_chainContext _localctx = new Every_sequence_source_chainContext(_ctx, getState());
		enterRule(_localctx, 118, RULE_every_sequence_source_chain);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(951);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,94,_ctx) ) {
			case 1:
				{
				setState(950);
				match(EVERY);
				}
				break;
			}
			setState(953);
			sequence_source();
			setState(954);
			match(COMMA);
			setState(955);
			sequence_source_chain(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Every_absent_sequence_source_chainContext extends ParserRuleContext {
		public Absent_sequence_source_chainContext absent_sequence_source_chain() {
			return getRuleContext(Absent_sequence_source_chainContext.class,0);
		}
		public Sequence_source_chainContext sequence_source_chain() {
			return getRuleContext(Sequence_source_chainContext.class,0);
		}
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Every_absent_sequence_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_every_absent_sequence_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvery_absent_sequence_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Every_absent_sequence_source_chainContext every_absent_sequence_source_chain() throws RecognitionException {
		Every_absent_sequence_source_chainContext _localctx = new Every_absent_sequence_source_chainContext(_ctx, getState());
		enterRule(_localctx, 120, RULE_every_absent_sequence_source_chain);
		try {
			setState(971);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,97,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(958);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,95,_ctx) ) {
				case 1:
					{
					setState(957);
					match(EVERY);
					}
					break;
				}
				setState(960);
				absent_sequence_source_chain();
				setState(961);
				match(COMMA);
				setState(962);
				sequence_source_chain(0);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(965);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,96,_ctx) ) {
				case 1:
					{
					setState(964);
					match(EVERY);
					}
					break;
				}
				setState(967);
				sequence_source();
				setState(968);
				match(COMMA);
				setState(969);
				absent_sequence_source_chain();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Absent_sequence_source_chainContext extends ParserRuleContext {
		public Absent_sequence_source_chainContext absent_sequence_source_chain() {
			return getRuleContext(Absent_sequence_source_chainContext.class,0);
		}
		public Basic_absent_pattern_sourceContext basic_absent_pattern_source() {
			return getRuleContext(Basic_absent_pattern_sourceContext.class,0);
		}
		public Left_absent_sequence_sourceContext left_absent_sequence_source() {
			return getRuleContext(Left_absent_sequence_sourceContext.class,0);
		}
		public Right_absent_sequence_sourceContext right_absent_sequence_source() {
			return getRuleContext(Right_absent_sequence_sourceContext.class,0);
		}
		public Absent_sequence_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_absent_sequence_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAbsent_sequence_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Absent_sequence_source_chainContext absent_sequence_source_chain() throws RecognitionException {
		Absent_sequence_source_chainContext _localctx = new Absent_sequence_source_chainContext(_ctx, getState());
		enterRule(_localctx, 122, RULE_absent_sequence_source_chain);
		try {
			setState(980);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,98,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(973);
				match(OPEN_PAR);
				setState(974);
				absent_sequence_source_chain();
				setState(975);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(977);
				basic_absent_pattern_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(978);
				left_absent_sequence_source(0);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(979);
				right_absent_sequence_source(0);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Left_absent_sequence_sourceContext extends ParserRuleContext {
		public List<Left_absent_sequence_sourceContext> left_absent_sequence_source() {
			return getRuleContexts(Left_absent_sequence_sourceContext.class);
		}
		public Left_absent_sequence_sourceContext left_absent_sequence_source(int i) {
			return getRuleContext(Left_absent_sequence_sourceContext.class,i);
		}
		public Basic_absent_pattern_sourceContext basic_absent_pattern_source() {
			return getRuleContext(Basic_absent_pattern_sourceContext.class,0);
		}
		public Sequence_source_chainContext sequence_source_chain() {
			return getRuleContext(Sequence_source_chainContext.class,0);
		}
		public Left_absent_sequence_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_left_absent_sequence_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLeft_absent_sequence_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Left_absent_sequence_sourceContext left_absent_sequence_source() throws RecognitionException {
		return left_absent_sequence_source(0);
	}

	private Left_absent_sequence_sourceContext left_absent_sequence_source(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Left_absent_sequence_sourceContext _localctx = new Left_absent_sequence_sourceContext(_ctx, _parentState);
		Left_absent_sequence_sourceContext _prevctx = _localctx;
		int _startState = 124;
		enterRecursionRule(_localctx, 124, RULE_left_absent_sequence_source, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(995);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,99,_ctx) ) {
			case 1:
				{
				setState(983);
				match(OPEN_PAR);
				setState(984);
				left_absent_sequence_source(0);
				setState(985);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(987);
				basic_absent_pattern_source();
				setState(988);
				match(COMMA);
				setState(989);
				sequence_source_chain(0);
				}
				break;
			case 3:
				{
				setState(991);
				sequence_source_chain(0);
				setState(992);
				match(COMMA);
				setState(993);
				left_absent_sequence_source(1);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1005);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1003);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,100,_ctx) ) {
					case 1:
						{
						_localctx = new Left_absent_sequence_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_left_absent_sequence_source);
						setState(997);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(998);
						match(COMMA);
						setState(999);
						left_absent_sequence_source(4);
						}
						break;
					case 2:
						{
						_localctx = new Left_absent_sequence_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_left_absent_sequence_source);
						setState(1000);
						if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
						setState(1001);
						match(COMMA);
						setState(1002);
						basic_absent_pattern_source();
						}
						break;
					}
					} 
				}
				setState(1007);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,101,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Right_absent_sequence_sourceContext extends ParserRuleContext {
		public List<Right_absent_sequence_sourceContext> right_absent_sequence_source() {
			return getRuleContexts(Right_absent_sequence_sourceContext.class);
		}
		public Right_absent_sequence_sourceContext right_absent_sequence_source(int i) {
			return getRuleContext(Right_absent_sequence_sourceContext.class,i);
		}
		public Sequence_source_chainContext sequence_source_chain() {
			return getRuleContext(Sequence_source_chainContext.class,0);
		}
		public Basic_absent_pattern_sourceContext basic_absent_pattern_source() {
			return getRuleContext(Basic_absent_pattern_sourceContext.class,0);
		}
		public Right_absent_sequence_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_right_absent_sequence_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitRight_absent_sequence_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Right_absent_sequence_sourceContext right_absent_sequence_source() throws RecognitionException {
		return right_absent_sequence_source(0);
	}

	private Right_absent_sequence_sourceContext right_absent_sequence_source(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Right_absent_sequence_sourceContext _localctx = new Right_absent_sequence_sourceContext(_ctx, _parentState);
		Right_absent_sequence_sourceContext _prevctx = _localctx;
		int _startState = 126;
		enterRecursionRule(_localctx, 126, RULE_right_absent_sequence_source, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1021);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,102,_ctx) ) {
			case 1:
				{
				setState(1009);
				match(OPEN_PAR);
				setState(1010);
				right_absent_sequence_source(0);
				setState(1011);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1013);
				sequence_source_chain(0);
				setState(1014);
				match(COMMA);
				setState(1015);
				basic_absent_pattern_source();
				}
				break;
			case 3:
				{
				setState(1017);
				basic_absent_pattern_source();
				setState(1018);
				match(COMMA);
				setState(1019);
				right_absent_sequence_source(2);
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1031);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1029);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,103,_ctx) ) {
					case 1:
						{
						_localctx = new Right_absent_sequence_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_right_absent_sequence_source);
						setState(1023);
						if (!(precpred(_ctx, 3))) throw new FailedPredicateException(this, "precpred(_ctx, 3)");
						setState(1024);
						match(COMMA);
						setState(1025);
						right_absent_sequence_source(4);
						}
						break;
					case 2:
						{
						_localctx = new Right_absent_sequence_sourceContext(_parentctx, _parentState);
						pushNewRecursionContext(_localctx, _startState, RULE_right_absent_sequence_source);
						setState(1026);
						if (!(precpred(_ctx, 1))) throw new FailedPredicateException(this, "precpred(_ctx, 1)");
						setState(1027);
						match(COMMA);
						setState(1028);
						sequence_source_chain(0);
						}
						break;
					}
					} 
				}
				setState(1033);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,104,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sequence_source_chainContext extends ParserRuleContext {
		public List<Sequence_source_chainContext> sequence_source_chain() {
			return getRuleContexts(Sequence_source_chainContext.class);
		}
		public Sequence_source_chainContext sequence_source_chain(int i) {
			return getRuleContext(Sequence_source_chainContext.class,i);
		}
		public Sequence_sourceContext sequence_source() {
			return getRuleContext(Sequence_sourceContext.class,0);
		}
		public Sequence_source_chainContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_source_chain; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_source_chain(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_source_chainContext sequence_source_chain() throws RecognitionException {
		return sequence_source_chain(0);
	}

	private Sequence_source_chainContext sequence_source_chain(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Sequence_source_chainContext _localctx = new Sequence_source_chainContext(_ctx, _parentState);
		Sequence_source_chainContext _prevctx = _localctx;
		int _startState = 128;
		enterRecursionRule(_localctx, 128, RULE_sequence_source_chain, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1040);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,105,_ctx) ) {
			case 1:
				{
				setState(1035);
				match(OPEN_PAR);
				setState(1036);
				sequence_source_chain(0);
				setState(1037);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				setState(1039);
				sequence_source();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1047);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					{
					_localctx = new Sequence_source_chainContext(_parentctx, _parentState);
					pushNewRecursionContext(_localctx, _startState, RULE_sequence_source_chain);
					setState(1042);
					if (!(precpred(_ctx, 2))) throw new FailedPredicateException(this, "precpred(_ctx, 2)");
					setState(1043);
					match(COMMA);
					setState(1044);
					sequence_source_chain(3);
					}
					} 
				}
				setState(1049);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,106,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Sequence_sourceContext extends ParserRuleContext {
		public Logical_stateful_sourceContext logical_stateful_source() {
			return getRuleContext(Logical_stateful_sourceContext.class,0);
		}
		public Sequence_collection_stateful_sourceContext sequence_collection_stateful_source() {
			return getRuleContext(Sequence_collection_stateful_sourceContext.class,0);
		}
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public Logical_absent_stateful_sourceContext logical_absent_stateful_source() {
			return getRuleContext(Logical_absent_stateful_sourceContext.class,0);
		}
		public Sequence_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_sourceContext sequence_source() throws RecognitionException {
		Sequence_sourceContext _localctx = new Sequence_sourceContext(_ctx, getState());
		enterRule(_localctx, 130, RULE_sequence_source);
		try {
			setState(1054);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,107,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1050);
				logical_stateful_source();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1051);
				sequence_collection_stateful_source();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1052);
				standard_stateful_source();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1053);
				logical_absent_stateful_source();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Sequence_collection_stateful_sourceContext extends ParserRuleContext {
		public Token zero_or_more;
		public Token zero_or_one;
		public Token one_or_more;
		public Standard_stateful_sourceContext standard_stateful_source() {
			return getRuleContext(Standard_stateful_sourceContext.class,0);
		}
		public CollectContext collect() {
			return getRuleContext(CollectContext.class,0);
		}
		public Sequence_collection_stateful_sourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_sequence_collection_stateful_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSequence_collection_stateful_source(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Sequence_collection_stateful_sourceContext sequence_collection_stateful_source() throws RecognitionException {
		Sequence_collection_stateful_sourceContext _localctx = new Sequence_collection_stateful_sourceContext(_ctx, getState());
		enterRule(_localctx, 132, RULE_sequence_collection_stateful_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1056);
			standard_stateful_source();
			setState(1064);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LT:
				{
				setState(1057);
				match(LT);
				setState(1058);
				collect();
				setState(1059);
				match(GT);
				}
				break;
			case STAR:
				{
				setState(1061);
				((Sequence_collection_stateful_sourceContext)_localctx).zero_or_more = match(STAR);
				}
				break;
			case QUESTION:
				{
				setState(1062);
				((Sequence_collection_stateful_sourceContext)_localctx).zero_or_one = match(QUESTION);
				}
				break;
			case PLUS:
				{
				setState(1063);
				((Sequence_collection_stateful_sourceContext)_localctx).one_or_more = match(PLUS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Anonymous_streamContext extends ParserRuleContext {
		public Anonymous_streamContext anonymous_stream() {
			return getRuleContext(Anonymous_streamContext.class,0);
		}
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public Query_inputContext query_input() {
			return getRuleContext(Query_inputContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public Query_sectionContext query_section() {
			return getRuleContext(Query_sectionContext.class,0);
		}
		public Output_rateContext output_rate() {
			return getRuleContext(Output_rateContext.class,0);
		}
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public Anonymous_streamContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_anonymous_stream; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnonymous_stream(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Anonymous_streamContext anonymous_stream() throws RecognitionException {
		Anonymous_streamContext _localctx = new Anonymous_streamContext(_ctx, getState());
		enterRule(_localctx, 134, RULE_anonymous_stream);
		int _la;
		try {
			setState(1082);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case OPEN_PAR:
				enterOuterAlt(_localctx, 1);
				{
				setState(1066);
				match(OPEN_PAR);
				setState(1067);
				anonymous_stream();
				setState(1068);
				match(CLOSE_PAR);
				}
				break;
			case FROM:
				enterOuterAlt(_localctx, 2);
				{
				setState(1070);
				match(FROM);
				setState(1071);
				query_input();
				setState(1073);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SELECT) {
					{
					setState(1072);
					query_section();
					}
				}

				setState(1076);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OUTPUT) {
					{
					setState(1075);
					output_rate();
					}
				}

				setState(1078);
				match(RETURN);
				setState(1080);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (EVENTS - 54)) | (1L << (EXPIRED - 54)) | (1L << (CURRENT - 54)) | (1L << (ALL - 54)))) != 0)) {
					{
					setState(1079);
					output_event_type();
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class FilterContext extends ParserRuleContext {
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public FilterContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_filter; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFilter(this);
			else return visitor.visitChildren(this);
		}
	}

	public final FilterContext filter() throws RecognitionException {
		FilterContext _localctx = new FilterContext(_ctx, getState());
		enterRule(_localctx, 136, RULE_filter);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1085);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HASH) {
				{
				setState(1084);
				match(HASH);
				}
			}

			setState(1087);
			match(OPEN_SQUARE_BRACKETS);
			setState(1088);
			expression();
			setState(1089);
			match(CLOSE_SQUARE_BRACKETS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stream_functionContext extends ParserRuleContext {
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Stream_functionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_function; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStream_function(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_functionContext stream_function() throws RecognitionException {
		Stream_functionContext _localctx = new Stream_functionContext(_ctx, getState());
		enterRule(_localctx, 138, RULE_stream_function);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1091);
			match(HASH);
			setState(1092);
			function_operation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class WindowContext extends ParserRuleContext {
		public TerminalNode WINDOW() { return getToken(SiddhiQLParser.WINDOW, 0); }
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public WindowContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_window; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWindow(this);
			else return visitor.visitChildren(this);
		}
	}

	public final WindowContext window() throws RecognitionException {
		WindowContext _localctx = new WindowContext(_ctx, getState());
		enterRule(_localctx, 140, RULE_window);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1094);
			match(HASH);
			setState(1095);
			match(WINDOW);
			setState(1096);
			match(DOT);
			setState(1097);
			function_operation();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_by_query_selectionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SiddhiQLParser.SELECT, 0); }
		public Group_byContext group_by() {
			return getRuleContext(Group_byContext.class,0);
		}
		public List<Output_attributeContext> output_attribute() {
			return getRuleContexts(Output_attributeContext.class);
		}
		public Output_attributeContext output_attribute(int i) {
			return getRuleContext(Output_attributeContext.class,i);
		}
		public Group_by_query_selectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by_query_selection; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitGroup_by_query_selection(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_by_query_selectionContext group_by_query_selection() throws RecognitionException {
		Group_by_query_selectionContext _localctx = new Group_by_query_selectionContext(_ctx, getState());
		enterRule(_localctx, 142, RULE_group_by_query_selection);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1099);
			match(SELECT);
			setState(1109);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(1100);
				match(STAR);
				}
				break;
			case T__0:
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				{
				{
				setState(1101);
				output_attribute();
				setState(1106);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1102);
					match(COMMA);
					setState(1103);
					output_attribute();
					}
					}
					setState(1108);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1112);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1111);
				group_by();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_sectionContext extends ParserRuleContext {
		public TerminalNode SELECT() { return getToken(SiddhiQLParser.SELECT, 0); }
		public Group_byContext group_by() {
			return getRuleContext(Group_byContext.class,0);
		}
		public HavingContext having() {
			return getRuleContext(HavingContext.class,0);
		}
		public Order_byContext order_by() {
			return getRuleContext(Order_byContext.class,0);
		}
		public LimitContext limit() {
			return getRuleContext(LimitContext.class,0);
		}
		public OffsetContext offset() {
			return getRuleContext(OffsetContext.class,0);
		}
		public List<Output_attributeContext> output_attribute() {
			return getRuleContexts(Output_attributeContext.class);
		}
		public Output_attributeContext output_attribute(int i) {
			return getRuleContext(Output_attributeContext.class,i);
		}
		public Query_sectionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_section; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_section(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_sectionContext query_section() throws RecognitionException {
		Query_sectionContext _localctx = new Query_sectionContext(_ctx, getState());
		enterRule(_localctx, 144, RULE_query_section);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			{
			setState(1114);
			match(SELECT);
			setState(1124);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STAR:
				{
				setState(1115);
				match(STAR);
				}
				break;
			case T__0:
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				{
				{
				setState(1116);
				output_attribute();
				setState(1121);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1117);
					match(COMMA);
					setState(1118);
					output_attribute();
					}
					}
					setState(1123);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
			}
			setState(1127);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==GROUP) {
				{
				setState(1126);
				group_by();
				}
			}

			setState(1130);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==HAVING) {
				{
				setState(1129);
				having();
				}
			}

			setState(1133);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ORDER) {
				{
				setState(1132);
				order_by();
				}
			}

			setState(1136);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==LIMIT) {
				{
				setState(1135);
				limit();
				}
			}

			setState(1139);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OFFSET) {
				{
				setState(1138);
				offset();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Group_byContext extends ParserRuleContext {
		public TerminalNode GROUP() { return getToken(SiddhiQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public List<Attribute_referenceContext> attribute_reference() {
			return getRuleContexts(Attribute_referenceContext.class);
		}
		public Attribute_referenceContext attribute_reference(int i) {
			return getRuleContext(Attribute_referenceContext.class,i);
		}
		public Group_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_group_by; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitGroup_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Group_byContext group_by() throws RecognitionException {
		Group_byContext _localctx = new Group_byContext(_ctx, getState());
		enterRule(_localctx, 146, RULE_group_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1141);
			match(GROUP);
			setState(1142);
			match(BY);
			setState(1143);
			attribute_reference();
			setState(1148);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1144);
				match(COMMA);
				setState(1145);
				attribute_reference();
				}
				}
				setState(1150);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class HavingContext extends ParserRuleContext {
		public TerminalNode HAVING() { return getToken(SiddhiQLParser.HAVING, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public HavingContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_having; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitHaving(this);
			else return visitor.visitChildren(this);
		}
	}

	public final HavingContext having() throws RecognitionException {
		HavingContext _localctx = new HavingContext(_ctx, getState());
		enterRule(_localctx, 148, RULE_having);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1151);
			match(HAVING);
			setState(1152);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_byContext extends ParserRuleContext {
		public TerminalNode ORDER() { return getToken(SiddhiQLParser.ORDER, 0); }
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public List<Order_by_referenceContext> order_by_reference() {
			return getRuleContexts(Order_by_referenceContext.class);
		}
		public Order_by_referenceContext order_by_reference(int i) {
			return getRuleContext(Order_by_referenceContext.class,i);
		}
		public Order_byContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOrder_by(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_byContext order_by() throws RecognitionException {
		Order_byContext _localctx = new Order_byContext(_ctx, getState());
		enterRule(_localctx, 150, RULE_order_by);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1154);
			match(ORDER);
			setState(1155);
			match(BY);
			setState(1156);
			order_by_reference();
			setState(1161);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1157);
				match(COMMA);
				setState(1158);
				order_by_reference();
				}
				}
				setState(1163);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Order_by_referenceContext extends ParserRuleContext {
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public OrderContext order() {
			return getRuleContext(OrderContext.class,0);
		}
		public Order_by_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order_by_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOrder_by_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Order_by_referenceContext order_by_reference() throws RecognitionException {
		Order_by_referenceContext _localctx = new Order_by_referenceContext(_ctx, getState());
		enterRule(_localctx, 152, RULE_order_by_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1164);
			attribute_reference();
			setState(1166);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==ASC || _la==DESC) {
				{
				setState(1165);
				order();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OrderContext extends ParserRuleContext {
		public TerminalNode ASC() { return getToken(SiddhiQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SiddhiQLParser.DESC, 0); }
		public OrderContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_order; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOrder(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OrderContext order() throws RecognitionException {
		OrderContext _localctx = new OrderContext(_ctx, getState());
		enterRule(_localctx, 154, RULE_order);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1168);
			_la = _input.LA(1);
			if ( !(_la==ASC || _la==DESC) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class LimitContext extends ParserRuleContext {
		public TerminalNode LIMIT() { return getToken(SiddhiQLParser.LIMIT, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public LimitContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_limit; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitLimit(this);
			else return visitor.visitChildren(this);
		}
	}

	public final LimitContext limit() throws RecognitionException {
		LimitContext _localctx = new LimitContext(_ctx, getState());
		enterRule(_localctx, 156, RULE_limit);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1170);
			match(LIMIT);
			setState(1171);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class OffsetContext extends ParserRuleContext {
		public TerminalNode OFFSET() { return getToken(SiddhiQLParser.OFFSET, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public OffsetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_offset; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOffset(this);
			else return visitor.visitChildren(this);
		}
	}

	public final OffsetContext offset() throws RecognitionException {
		OffsetContext _localctx = new OffsetContext(_ctx, getState());
		enterRule(_localctx, 158, RULE_offset);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1173);
			match(OFFSET);
			setState(1174);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Query_outputContext extends ParserRuleContext {
		public TerminalNode INSERT() { return getToken(SiddhiQLParser.INSERT, 0); }
		public TerminalNode INTO() { return getToken(SiddhiQLParser.INTO, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public Output_event_typeContext output_event_type() {
			return getRuleContext(Output_event_typeContext.class,0);
		}
		public TerminalNode DELETE() { return getToken(SiddhiQLParser.DELETE, 0); }
		public TerminalNode FOR() { return getToken(SiddhiQLParser.FOR, 0); }
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(SiddhiQLParser.UPDATE, 0); }
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public Query_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_query_output; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitQuery_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Query_outputContext query_output() throws RecognitionException {
		Query_outputContext _localctx = new Query_outputContext(_ctx, getState());
		enterRule(_localctx, 160, RULE_query_output);
		int _la;
		try {
			setState(1223);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,135,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1176);
				match(INSERT);
				setState(1178);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (EVENTS - 54)) | (1L << (EXPIRED - 54)) | (1L << (CURRENT - 54)) | (1L << (ALL - 54)))) != 0)) {
					{
					setState(1177);
					output_event_type();
					}
				}

				setState(1180);
				match(INTO);
				setState(1181);
				target();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1182);
				match(DELETE);
				setState(1183);
				target();
				setState(1186);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1184);
					match(FOR);
					setState(1185);
					output_event_type();
					}
				}

				setState(1190);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1188);
					match(ON);
					setState(1189);
					expression();
					}
				}

				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1192);
				match(UPDATE);
				setState(1193);
				match(OR);
				setState(1194);
				match(INSERT);
				setState(1195);
				match(INTO);
				setState(1196);
				target();
				setState(1199);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1197);
					match(FOR);
					setState(1198);
					output_event_type();
					}
				}

				setState(1202);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1201);
					set_clause();
					}
				}

				setState(1204);
				match(ON);
				setState(1205);
				expression();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1207);
				match(UPDATE);
				setState(1208);
				target();
				setState(1211);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==FOR) {
					{
					setState(1209);
					match(FOR);
					setState(1210);
					output_event_type();
					}
				}

				setState(1214);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1213);
					set_clause();
					}
				}

				setState(1216);
				match(ON);
				setState(1217);
				expression();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1219);
				match(RETURN);
				setState(1221);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 54)) & ~0x3f) == 0 && ((1L << (_la - 54)) & ((1L << (EVENTS - 54)) | (1L << (EXPIRED - 54)) | (1L << (CURRENT - 54)) | (1L << (ALL - 54)))) != 0)) {
					{
					setState(1220);
					output_event_type();
					}
				}

				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Store_query_outputContext extends ParserRuleContext {
		public TerminalNode DELETE() { return getToken(SiddhiQLParser.DELETE, 0); }
		public TargetContext target() {
			return getRuleContext(TargetContext.class,0);
		}
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public TerminalNode UPDATE() { return getToken(SiddhiQLParser.UPDATE, 0); }
		public Set_clauseContext set_clause() {
			return getRuleContext(Set_clauseContext.class,0);
		}
		public Store_query_outputContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_store_query_output; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStore_query_output(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Store_query_outputContext store_query_output() throws RecognitionException {
		Store_query_outputContext _localctx = new Store_query_outputContext(_ctx, getState());
		enterRule(_localctx, 162, RULE_store_query_output);
		int _la;
		try {
			setState(1239);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case DELETE:
				enterOuterAlt(_localctx, 1);
				{
				setState(1225);
				match(DELETE);
				setState(1226);
				target();
				setState(1229);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==ON) {
					{
					setState(1227);
					match(ON);
					setState(1228);
					expression();
					}
				}

				}
				break;
			case UPDATE:
				enterOuterAlt(_localctx, 2);
				{
				setState(1231);
				match(UPDATE);
				setState(1232);
				target();
				setState(1234);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==SET) {
					{
					setState(1233);
					set_clause();
					}
				}

				setState(1236);
				match(ON);
				setState(1237);
				expression();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_clauseContext extends ParserRuleContext {
		public TerminalNode SET() { return getToken(SiddhiQLParser.SET, 0); }
		public List<Set_assignmentContext> set_assignment() {
			return getRuleContexts(Set_assignmentContext.class);
		}
		public Set_assignmentContext set_assignment(int i) {
			return getRuleContext(Set_assignmentContext.class,i);
		}
		public Set_clauseContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_clause; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSet_clause(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_clauseContext set_clause() throws RecognitionException {
		Set_clauseContext _localctx = new Set_clauseContext(_ctx, getState());
		enterRule(_localctx, 164, RULE_set_clause);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1241);
			match(SET);
			setState(1242);
			set_assignment();
			setState(1247);
			_errHandler.sync(this);
			_la = _input.LA(1);
			while (_la==COMMA) {
				{
				{
				setState(1243);
				match(COMMA);
				setState(1244);
				set_assignment();
				}
				}
				setState(1249);
				_errHandler.sync(this);
				_la = _input.LA(1);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Set_assignmentContext extends ParserRuleContext {
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public Set_assignmentContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_set_assignment; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSet_assignment(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Set_assignmentContext set_assignment() throws RecognitionException {
		Set_assignmentContext _localctx = new Set_assignmentContext(_ctx, getState());
		enterRule(_localctx, 166, RULE_set_assignment);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1250);
			attribute_reference();
			setState(1251);
			match(ASSIGN);
			setState(1252);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_event_typeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SiddhiQLParser.ALL, 0); }
		public TerminalNode EVENTS() { return getToken(SiddhiQLParser.EVENTS, 0); }
		public TerminalNode EXPIRED() { return getToken(SiddhiQLParser.EXPIRED, 0); }
		public TerminalNode CURRENT() { return getToken(SiddhiQLParser.CURRENT, 0); }
		public Output_event_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_event_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_event_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_event_typeContext output_event_type() throws RecognitionException {
		Output_event_typeContext _localctx = new Output_event_typeContext(_ctx, getState());
		enterRule(_localctx, 168, RULE_output_event_type);
		int _la;
		try {
			setState(1262);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ALL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1254);
				match(ALL);
				setState(1255);
				match(EVENTS);
				}
				break;
			case EXPIRED:
				enterOuterAlt(_localctx, 2);
				{
				setState(1256);
				match(EXPIRED);
				setState(1257);
				match(EVENTS);
				}
				break;
			case EVENTS:
			case CURRENT:
				enterOuterAlt(_localctx, 3);
				{
				setState(1259);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==CURRENT) {
					{
					setState(1258);
					match(CURRENT);
					}
				}

				setState(1261);
				match(EVENTS);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_rateContext extends ParserRuleContext {
		public TerminalNode OUTPUT() { return getToken(SiddhiQLParser.OUTPUT, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode EVENTS() { return getToken(SiddhiQLParser.EVENTS, 0); }
		public Output_rate_typeContext output_rate_type() {
			return getRuleContext(Output_rate_typeContext.class,0);
		}
		public TerminalNode SNAPSHOT() { return getToken(SiddhiQLParser.SNAPSHOT, 0); }
		public Output_rateContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_rate; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_rate(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_rateContext output_rate() throws RecognitionException {
		Output_rateContext _localctx = new Output_rateContext(_ctx, getState());
		enterRule(_localctx, 170, RULE_output_rate);
		int _la;
		try {
			setState(1278);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,144,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1264);
				match(OUTPUT);
				setState(1266);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LAST - 77)) | (1L << (ALL - 77)) | (1L << (FIRST - 77)))) != 0)) {
					{
					setState(1265);
					output_rate_type();
					}
				}

				setState(1268);
				match(EVERY);
				setState(1272);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,143,_ctx) ) {
				case 1:
					{
					setState(1269);
					time_value();
					}
					break;
				case 2:
					{
					setState(1270);
					match(INT_LITERAL);
					setState(1271);
					match(EVENTS);
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1274);
				match(OUTPUT);
				setState(1275);
				match(SNAPSHOT);
				setState(1276);
				match(EVERY);
				setState(1277);
				time_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_rate_typeContext extends ParserRuleContext {
		public TerminalNode ALL() { return getToken(SiddhiQLParser.ALL, 0); }
		public TerminalNode LAST() { return getToken(SiddhiQLParser.LAST, 0); }
		public TerminalNode FIRST() { return getToken(SiddhiQLParser.FIRST, 0); }
		public Output_rate_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_rate_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_rate_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_rate_typeContext output_rate_type() throws RecognitionException {
		Output_rate_typeContext _localctx = new Output_rate_typeContext(_ctx, getState());
		enterRule(_localctx, 172, RULE_output_rate_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1280);
			_la = _input.LA(1);
			if ( !(((((_la - 77)) & ~0x3f) == 0 && ((1L << (_la - 77)) & ((1L << (LAST - 77)) | (1L << (ALL - 77)) | (1L << (FIRST - 77)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class For_timeContext extends ParserRuleContext {
		public TerminalNode FOR() { return getToken(SiddhiQLParser.FOR, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public For_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_for_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFor_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final For_timeContext for_time() throws RecognitionException {
		For_timeContext _localctx = new For_timeContext(_ctx, getState());
		enterRule(_localctx, 174, RULE_for_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1282);
			match(FOR);
			setState(1283);
			time_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Within_timeContext extends ParserRuleContext {
		public TerminalNode WITHIN() { return getToken(SiddhiQLParser.WITHIN, 0); }
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public Within_timeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_time; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWithin_time(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_timeContext within_time() throws RecognitionException {
		Within_timeContext _localctx = new Within_timeContext(_ctx, getState());
		enterRule(_localctx, 176, RULE_within_time);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1285);
			match(WITHIN);
			setState(1286);
			time_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Within_time_rangeContext extends ParserRuleContext {
		public ExpressionContext start_pattern;
		public ExpressionContext end_pattern;
		public TerminalNode WITHIN() { return getToken(SiddhiQLParser.WITHIN, 0); }
		public List<ExpressionContext> expression() {
			return getRuleContexts(ExpressionContext.class);
		}
		public ExpressionContext expression(int i) {
			return getRuleContext(ExpressionContext.class,i);
		}
		public Within_time_rangeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_within_time_range; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWithin_time_range(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Within_time_rangeContext within_time_range() throws RecognitionException {
		Within_time_rangeContext _localctx = new Within_time_rangeContext(_ctx, getState());
		enterRule(_localctx, 178, RULE_within_time_range);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1288);
			match(WITHIN);
			setState(1289);
			((Within_time_rangeContext)_localctx).start_pattern = expression();
			setState(1292);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==COMMA) {
				{
				setState(1290);
				match(COMMA);
				setState(1291);
				((Within_time_rangeContext)_localctx).end_pattern = expression();
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class PerContext extends ParserRuleContext {
		public TerminalNode PER() { return getToken(SiddhiQLParser.PER, 0); }
		public ExpressionContext expression() {
			return getRuleContext(ExpressionContext.class,0);
		}
		public PerContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_per; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitPer(this);
			else return visitor.visitChildren(this);
		}
	}

	public final PerContext per() throws RecognitionException {
		PerContext _localctx = new PerContext(_ctx, getState());
		enterRule(_localctx, 180, RULE_per);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1294);
			match(PER);
			setState(1295);
			expression();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Output_attributeContext extends ParserRuleContext {
		public AttributeContext attribute() {
			return getRuleContext(AttributeContext.class,0);
		}
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Output_attributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_output_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOutput_attribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Output_attributeContext output_attribute() throws RecognitionException {
		Output_attributeContext _localctx = new Output_attributeContext(_ctx, getState());
		enterRule(_localctx, 182, RULE_output_attribute);
		try {
			setState(1302);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,146,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1297);
				attribute();
				setState(1298);
				match(AS);
				setState(1299);
				attribute_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1301);
				attribute_reference();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AttributeContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public AttributeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AttributeContext attribute() throws RecognitionException {
		AttributeContext _localctx = new AttributeContext(_ctx, getState());
		enterRule(_localctx, 184, RULE_attribute);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1304);
			math_operation(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class ExpressionContext extends ParserRuleContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public ExpressionContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_expression; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitExpression(this);
			else return visitor.visitChildren(this);
		}
	}

	public final ExpressionContext expression() throws RecognitionException {
		ExpressionContext _localctx = new ExpressionContext(_ctx, getState());
		enterRule(_localctx, 186, RULE_expression);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1306);
			math_operation(0);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Math_operationContext extends ParserRuleContext {
		public Math_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_math_operation; }
	 
		public Math_operationContext() { }
		public void copyFrom(Math_operationContext ctx) {
			super.copyFrom(ctx);
		}
	}
	public static class Multiplication_math_operationContext extends Math_operationContext {
		public Token multiply;
		public Token devide;
		public Token mod;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Multiplication_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMultiplication_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Greaterthan_lessthan_math_operationContext extends Math_operationContext {
		public Token gt_eq;
		public Token lt_eq;
		public Token gt;
		public Token lt;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Greaterthan_lessthan_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitGreaterthan_lessthan_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Basic_math_operationContext extends Math_operationContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Null_checkContext null_check() {
			return getRuleContext(Null_checkContext.class,0);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Constant_valueContext constant_value() {
			return getRuleContext(Constant_valueContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Basic_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBasic_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class In_math_operationContext extends Math_operationContext {
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public TerminalNode IN() { return getToken(SiddhiQLParser.IN, 0); }
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public In_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitIn_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Addition_math_operationContext extends Math_operationContext {
		public Token add;
		public Token substract;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Addition_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAddition_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class And_math_operationContext extends Math_operationContext {
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public And_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAnd_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Or_math_operationContext extends Math_operationContext {
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public Or_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitOr_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Equality_math_operationContext extends Math_operationContext {
		public Token eq;
		public Token not_eq;
		public List<Math_operationContext> math_operation() {
			return getRuleContexts(Math_operationContext.class);
		}
		public Math_operationContext math_operation(int i) {
			return getRuleContext(Math_operationContext.class,i);
		}
		public Equality_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEquality_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}
	public static class Not_math_operationContext extends Math_operationContext {
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public Math_operationContext math_operation() {
			return getRuleContext(Math_operationContext.class,0);
		}
		public Not_math_operationContext(Math_operationContext ctx) { copyFrom(ctx); }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitNot_math_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Math_operationContext math_operation() throws RecognitionException {
		return math_operation(0);
	}

	private Math_operationContext math_operation(int _p) throws RecognitionException {
		ParserRuleContext _parentctx = _ctx;
		int _parentState = getState();
		Math_operationContext _localctx = new Math_operationContext(_ctx, _parentState);
		Math_operationContext _prevctx = _localctx;
		int _startState = 188;
		enterRecursionRule(_localctx, 188, RULE_math_operation, _p);
		try {
			int _alt;
			enterOuterAlt(_localctx, 1);
			{
			setState(1319);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,147,_ctx) ) {
			case 1:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;

				setState(1309);
				match(OPEN_PAR);
				setState(1310);
				math_operation(0);
				setState(1311);
				match(CLOSE_PAR);
				}
				break;
			case 2:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1313);
				null_check();
				}
				break;
			case 3:
				{
				_localctx = new Not_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1314);
				match(NOT);
				setState(1315);
				math_operation(11);
				}
				break;
			case 4:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1316);
				function_operation();
				}
				break;
			case 5:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1317);
				constant_value();
				}
				break;
			case 6:
				{
				_localctx = new Basic_math_operationContext(_localctx);
				_ctx = _localctx;
				_prevctx = _localctx;
				setState(1318);
				attribute_reference();
				}
				break;
			}
			_ctx.stop = _input.LT(-1);
			setState(1359);
			_errHandler.sync(this);
			_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			while ( _alt!=2 && _alt!=org.antlr.v4.runtime.atn.ATN.INVALID_ALT_NUMBER ) {
				if ( _alt==1 ) {
					if ( _parseListeners!=null ) triggerExitRuleEvent();
					_prevctx = _localctx;
					{
					setState(1357);
					_errHandler.sync(this);
					switch ( getInterpreter().adaptivePredict(_input,152,_ctx) ) {
					case 1:
						{
						_localctx = new Multiplication_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1321);
						if (!(precpred(_ctx, 10))) throw new FailedPredicateException(this, "precpred(_ctx, 10)");
						setState(1325);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case STAR:
							{
							setState(1322);
							((Multiplication_math_operationContext)_localctx).multiply = match(STAR);
							}
							break;
						case DIV:
							{
							setState(1323);
							((Multiplication_math_operationContext)_localctx).devide = match(DIV);
							}
							break;
						case MOD:
							{
							setState(1324);
							((Multiplication_math_operationContext)_localctx).mod = match(MOD);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1327);
						math_operation(11);
						}
						break;
					case 2:
						{
						_localctx = new Addition_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1328);
						if (!(precpred(_ctx, 9))) throw new FailedPredicateException(this, "precpred(_ctx, 9)");
						setState(1331);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case PLUS:
							{
							setState(1329);
							((Addition_math_operationContext)_localctx).add = match(PLUS);
							}
							break;
						case MINUS:
							{
							setState(1330);
							((Addition_math_operationContext)_localctx).substract = match(MINUS);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1333);
						math_operation(10);
						}
						break;
					case 3:
						{
						_localctx = new Greaterthan_lessthan_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1334);
						if (!(precpred(_ctx, 8))) throw new FailedPredicateException(this, "precpred(_ctx, 8)");
						setState(1339);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case GT_EQ:
							{
							setState(1335);
							((Greaterthan_lessthan_math_operationContext)_localctx).gt_eq = match(GT_EQ);
							}
							break;
						case LT_EQ:
							{
							setState(1336);
							((Greaterthan_lessthan_math_operationContext)_localctx).lt_eq = match(LT_EQ);
							}
							break;
						case GT:
							{
							setState(1337);
							((Greaterthan_lessthan_math_operationContext)_localctx).gt = match(GT);
							}
							break;
						case LT:
							{
							setState(1338);
							((Greaterthan_lessthan_math_operationContext)_localctx).lt = match(LT);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1341);
						math_operation(9);
						}
						break;
					case 4:
						{
						_localctx = new Equality_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1342);
						if (!(precpred(_ctx, 7))) throw new FailedPredicateException(this, "precpred(_ctx, 7)");
						setState(1345);
						_errHandler.sync(this);
						switch (_input.LA(1)) {
						case EQ:
							{
							setState(1343);
							((Equality_math_operationContext)_localctx).eq = match(EQ);
							}
							break;
						case NOT_EQ:
							{
							setState(1344);
							((Equality_math_operationContext)_localctx).not_eq = match(NOT_EQ);
							}
							break;
						default:
							throw new NoViableAltException(this);
						}
						setState(1347);
						math_operation(8);
						}
						break;
					case 5:
						{
						_localctx = new And_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1348);
						if (!(precpred(_ctx, 5))) throw new FailedPredicateException(this, "precpred(_ctx, 5)");
						setState(1349);
						match(AND);
						setState(1350);
						math_operation(6);
						}
						break;
					case 6:
						{
						_localctx = new Or_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1351);
						if (!(precpred(_ctx, 4))) throw new FailedPredicateException(this, "precpred(_ctx, 4)");
						setState(1352);
						match(OR);
						setState(1353);
						math_operation(5);
						}
						break;
					case 7:
						{
						_localctx = new In_math_operationContext(new Math_operationContext(_parentctx, _parentState));
						pushNewRecursionContext(_localctx, _startState, RULE_math_operation);
						setState(1354);
						if (!(precpred(_ctx, 6))) throw new FailedPredicateException(this, "precpred(_ctx, 6)");
						setState(1355);
						match(IN);
						setState(1356);
						name();
						}
						break;
					}
					} 
				}
				setState(1361);
				_errHandler.sync(this);
				_alt = getInterpreter().adaptivePredict(_input,153,_ctx);
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			unrollRecursionContexts(_parentctx);
		}
		return _localctx;
	}

	public static class Function_operationContext extends ParserRuleContext {
		public Function_idContext function_id() {
			return getRuleContext(Function_idContext.class,0);
		}
		public Function_namespaceContext function_namespace() {
			return getRuleContext(Function_namespaceContext.class,0);
		}
		public Attribute_listContext attribute_list() {
			return getRuleContext(Attribute_listContext.class,0);
		}
		public Function_operationContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_operation; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_operation(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_operationContext function_operation() throws RecognitionException {
		Function_operationContext _localctx = new Function_operationContext(_ctx, getState());
		enterRule(_localctx, 190, RULE_function_operation);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1365);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,154,_ctx) ) {
			case 1:
				{
				setState(1362);
				function_namespace();
				setState(1363);
				match(COL);
				}
				break;
			}
			setState(1367);
			function_id();
			setState(1368);
			match(OPEN_PAR);
			setState(1370);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << T__0) | (1L << INT_LITERAL) | (1L << LONG_LITERAL) | (1L << FLOAT_LITERAL) | (1L << DOUBLE_LITERAL) | (1L << OPEN_PAR) | (1L << STAR) | (1L << PLUS) | (1L << MINUS) | (1L << HASH) | (1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << APP) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << ORDER) | (1L << LIMIT) | (1L << ASC) | (1L << DESC) | (1L << HAVING) | (1L << INSERT) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OR - 65)) | (1L << (AND - 65)) | (1L << (ON - 65)) | (1L << (IS - 65)) | (1L << (NOT - 65)) | (1L << (WITHIN - 65)) | (1L << (WITH - 65)) | (1L << (BEGIN - 65)) | (1L << (END - 65)) | (1L << (NULL - 65)) | (1L << (EVERY - 65)) | (1L << (LAST - 65)) | (1L << (ALL - 65)) | (1L << (FIRST - 65)) | (1L << (JOIN - 65)) | (1L << (INNER - 65)) | (1L << (OUTER - 65)) | (1L << (RIGHT - 65)) | (1L << (LEFT - 65)) | (1L << (FULL - 65)) | (1L << (UNIDIRECTIONAL - 65)) | (1L << (YEARS - 65)) | (1L << (MONTHS - 65)) | (1L << (WEEKS - 65)) | (1L << (DAYS - 65)) | (1L << (HOURS - 65)) | (1L << (MINUTES - 65)) | (1L << (SECONDS - 65)) | (1L << (MILLISECONDS - 65)) | (1L << (FALSE - 65)) | (1L << (TRUE - 65)) | (1L << (STRING - 65)) | (1L << (INT - 65)) | (1L << (LONG - 65)) | (1L << (FLOAT - 65)) | (1L << (DOUBLE - 65)) | (1L << (BOOL - 65)) | (1L << (OBJECT - 65)) | (1L << (ID_QUOTES - 65)) | (1L << (ID - 65)) | (1L << (STRING_LITERAL - 65)))) != 0)) {
				{
				setState(1369);
				attribute_list();
				}
			}

			setState(1372);
			match(CLOSE_PAR);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_listContext extends ParserRuleContext {
		public List<AttributeContext> attribute() {
			return getRuleContexts(AttributeContext.class);
		}
		public AttributeContext attribute(int i) {
			return getRuleContext(AttributeContext.class,i);
		}
		public Attribute_listContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_list; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_list(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_listContext attribute_list() throws RecognitionException {
		Attribute_listContext _localctx = new Attribute_listContext(_ctx, getState());
		enterRule(_localctx, 192, RULE_attribute_list);
		int _la;
		try {
			setState(1383);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case T__0:
			case INT_LITERAL:
			case LONG_LITERAL:
			case FLOAT_LITERAL:
			case DOUBLE_LITERAL:
			case OPEN_PAR:
			case PLUS:
			case MINUS:
			case HASH:
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				{
				setState(1374);
				attribute();
				setState(1379);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while (_la==COMMA) {
					{
					{
					setState(1375);
					match(COMMA);
					setState(1376);
					attribute();
					}
					}
					setState(1381);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				}
				break;
			case STAR:
				enterOuterAlt(_localctx, 2);
				{
				setState(1382);
				match(STAR);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Null_checkContext extends ParserRuleContext {
		public TerminalNode IS() { return getToken(SiddhiQLParser.IS, 0); }
		public TerminalNode NULL() { return getToken(SiddhiQLParser.NULL, 0); }
		public Stream_referenceContext stream_reference() {
			return getRuleContext(Stream_referenceContext.class,0);
		}
		public Attribute_referenceContext attribute_reference() {
			return getRuleContext(Attribute_referenceContext.class,0);
		}
		public Function_operationContext function_operation() {
			return getRuleContext(Function_operationContext.class,0);
		}
		public Null_checkContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_null_check; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitNull_check(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Null_checkContext null_check() throws RecognitionException {
		Null_checkContext _localctx = new Null_checkContext(_ctx, getState());
		enterRule(_localctx, 194, RULE_null_check);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1388);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,158,_ctx) ) {
			case 1:
				{
				setState(1385);
				stream_reference();
				}
				break;
			case 2:
				{
				setState(1386);
				attribute_reference();
				}
				break;
			case 3:
				{
				setState(1387);
				function_operation();
				}
				break;
			}
			setState(1390);
			match(IS);
			setState(1391);
			match(NULL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stream_referenceContext extends ParserRuleContext {
		public Token hash;
		public Token not;
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_indexContext attribute_index() {
			return getRuleContext(Attribute_indexContext.class,0);
		}
		public Stream_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStream_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_referenceContext stream_reference() throws RecognitionException {
		Stream_referenceContext _localctx = new Stream_referenceContext(_ctx, getState());
		enterRule(_localctx, 196, RULE_stream_reference);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1395);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(1393);
				((Stream_referenceContext)_localctx).hash = match(HASH);
				}
				break;
			case T__0:
				{
				setState(1394);
				((Stream_referenceContext)_localctx).not = match(T__0);
				}
				break;
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				break;
			default:
				break;
			}
			setState(1397);
			name();
			setState(1402);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==OPEN_SQUARE_BRACKETS) {
				{
				setState(1398);
				match(OPEN_SQUARE_BRACKETS);
				setState(1399);
				attribute_index();
				setState(1400);
				match(CLOSE_SQUARE_BRACKETS);
				}
			}

			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_referenceContext extends ParserRuleContext {
		public Token hash1;
		public Token not;
		public NameContext name1;
		public Attribute_indexContext attribute_index1;
		public Token hash2;
		public NameContext name2;
		public Attribute_indexContext attribute_index2;
		public Attribute_nameContext attribute_name() {
			return getRuleContext(Attribute_nameContext.class,0);
		}
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Attribute_indexContext> attribute_index() {
			return getRuleContexts(Attribute_indexContext.class);
		}
		public Attribute_indexContext attribute_index(int i) {
			return getRuleContext(Attribute_indexContext.class,i);
		}
		public Attribute_referenceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_reference; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_reference(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_referenceContext attribute_reference() throws RecognitionException {
		Attribute_referenceContext _localctx = new Attribute_referenceContext(_ctx, getState());
		enterRule(_localctx, 198, RULE_attribute_reference);
		int _la;
		try {
			setState(1429);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,165,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1406);
				_errHandler.sync(this);
				switch (_input.LA(1)) {
				case HASH:
					{
					setState(1404);
					((Attribute_referenceContext)_localctx).hash1 = match(HASH);
					}
					break;
				case T__0:
					{
					setState(1405);
					((Attribute_referenceContext)_localctx).not = match(T__0);
					}
					break;
				case STREAM:
				case DEFINE:
				case TABLE:
				case APP:
				case FROM:
				case PARTITION:
				case WINDOW:
				case SELECT:
				case GROUP:
				case BY:
				case ORDER:
				case LIMIT:
				case ASC:
				case DESC:
				case HAVING:
				case INSERT:
				case DELETE:
				case UPDATE:
				case RETURN:
				case EVENTS:
				case INTO:
				case OUTPUT:
				case EXPIRED:
				case CURRENT:
				case SNAPSHOT:
				case FOR:
				case RAW:
				case OF:
				case AS:
				case OR:
				case AND:
				case ON:
				case IS:
				case NOT:
				case WITHIN:
				case WITH:
				case BEGIN:
				case END:
				case NULL:
				case EVERY:
				case LAST:
				case ALL:
				case FIRST:
				case JOIN:
				case INNER:
				case OUTER:
				case RIGHT:
				case LEFT:
				case FULL:
				case UNIDIRECTIONAL:
				case YEARS:
				case MONTHS:
				case WEEKS:
				case DAYS:
				case HOURS:
				case MINUTES:
				case SECONDS:
				case MILLISECONDS:
				case FALSE:
				case TRUE:
				case STRING:
				case INT:
				case LONG:
				case FLOAT:
				case DOUBLE:
				case BOOL:
				case OBJECT:
				case ID_QUOTES:
				case ID:
					break;
				default:
					break;
				}
				setState(1408);
				((Attribute_referenceContext)_localctx).name1 = name();
				setState(1413);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==OPEN_SQUARE_BRACKETS) {
					{
					setState(1409);
					match(OPEN_SQUARE_BRACKETS);
					setState(1410);
					((Attribute_referenceContext)_localctx).attribute_index1 = attribute_index();
					setState(1411);
					match(CLOSE_SQUARE_BRACKETS);
					}
				}

				setState(1423);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==HASH) {
					{
					setState(1415);
					((Attribute_referenceContext)_localctx).hash2 = match(HASH);
					setState(1416);
					((Attribute_referenceContext)_localctx).name2 = name();
					setState(1421);
					_errHandler.sync(this);
					_la = _input.LA(1);
					if (_la==OPEN_SQUARE_BRACKETS) {
						{
						setState(1417);
						match(OPEN_SQUARE_BRACKETS);
						setState(1418);
						((Attribute_referenceContext)_localctx).attribute_index2 = attribute_index();
						setState(1419);
						match(CLOSE_SQUARE_BRACKETS);
						}
					}

					}
				}

				setState(1425);
				match(DOT);
				setState(1426);
				attribute_name();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1428);
				attribute_name();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_indexContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode LAST() { return getToken(SiddhiQLParser.LAST, 0); }
		public Attribute_indexContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_index; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_index(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_indexContext attribute_index() throws RecognitionException {
		Attribute_indexContext _localctx = new Attribute_indexContext(_ctx, getState());
		enterRule(_localctx, 200, RULE_attribute_index);
		int _la;
		try {
			setState(1437);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case INT_LITERAL:
				enterOuterAlt(_localctx, 1);
				{
				setState(1431);
				match(INT_LITERAL);
				}
				break;
			case LAST:
				enterOuterAlt(_localctx, 2);
				{
				setState(1432);
				match(LAST);
				setState(1435);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==MINUS) {
					{
					setState(1433);
					match(MINUS);
					setState(1434);
					match(INT_LITERAL);
					}
				}

				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_idContext function_id() throws RecognitionException {
		Function_idContext _localctx = new Function_idContext(_ctx, getState());
		enterRule(_localctx, 202, RULE_function_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1439);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Function_namespaceContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Function_namespaceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_function_namespace; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitFunction_namespace(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Function_namespaceContext function_namespace() throws RecognitionException {
		Function_namespaceContext _localctx = new Function_namespaceContext(_ctx, getState());
		enterRule(_localctx, 204, RULE_function_namespace);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1441);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Stream_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Stream_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_stream_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitStream_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Stream_idContext stream_id() throws RecognitionException {
		Stream_idContext _localctx = new Stream_idContext(_ctx, getState());
		enterRule(_localctx, 206, RULE_stream_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1443);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Source_idContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Source_idContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSource_id(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Source_idContext source_id() throws RecognitionException {
		Source_idContext _localctx = new Source_idContext(_ctx, getState());
		enterRule(_localctx, 208, RULE_source_id);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1445);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class AliasContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public AliasContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_alias; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAlias(this);
			else return visitor.visitChildren(this);
		}
	}

	public final AliasContext alias() throws RecognitionException {
		AliasContext _localctx = new AliasContext(_ctx, getState());
		enterRule(_localctx, 210, RULE_alias);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1447);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_nameContext extends ParserRuleContext {
		public List<NameContext> name() {
			return getRuleContexts(NameContext.class);
		}
		public NameContext name(int i) {
			return getRuleContext(NameContext.class,i);
		}
		public List<Property_separatorContext> property_separator() {
			return getRuleContexts(Property_separatorContext.class);
		}
		public Property_separatorContext property_separator(int i) {
			return getRuleContext(Property_separatorContext.class,i);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Property_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitProperty_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_nameContext property_name() throws RecognitionException {
		Property_nameContext _localctx = new Property_nameContext(_ctx, getState());
		enterRule(_localctx, 212, RULE_property_name);
		int _la;
		try {
			setState(1459);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1449);
				name();
				setState(1455);
				_errHandler.sync(this);
				_la = _input.LA(1);
				while ((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << DOT) | (1L << MINUS))) != 0)) {
					{
					{
					setState(1450);
					property_separator();
					setState(1451);
					name();
					}
					}
					setState(1457);
					_errHandler.sync(this);
					_la = _input.LA(1);
				}
				}
				break;
			case STRING_LITERAL:
				enterOuterAlt(_localctx, 2);
				{
				setState(1458);
				string_value();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_nameContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public Attribute_nameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_name(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_nameContext attribute_name() throws RecognitionException {
		Attribute_nameContext _localctx = new Attribute_nameContext(_ctx, getState());
		enterRule(_localctx, 214, RULE_attribute_name);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1461);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TypeContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public TypeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitType(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TypeContext type() throws RecognitionException {
		TypeContext _localctx = new TypeContext(_ctx, getState());
		enterRule(_localctx, 216, RULE_type);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1463);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_valueContext extends ParserRuleContext {
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Property_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitProperty_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_valueContext property_value() throws RecognitionException {
		Property_valueContext _localctx = new Property_valueContext(_ctx, getState());
		enterRule(_localctx, 218, RULE_property_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1465);
			string_value();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Property_separatorContext extends ParserRuleContext {
		public TerminalNode DOT() { return getToken(SiddhiQLParser.DOT, 0); }
		public TerminalNode MINUS() { return getToken(SiddhiQLParser.MINUS, 0); }
		public TerminalNode COL() { return getToken(SiddhiQLParser.COL, 0); }
		public Property_separatorContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_property_separator; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitProperty_separator(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Property_separatorContext property_separator() throws RecognitionException {
		Property_separatorContext _localctx = new Property_separatorContext(_ctx, getState());
		enterRule(_localctx, 220, RULE_property_separator);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1467);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << COL) | (1L << DOT) | (1L << MINUS))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class SourceContext extends ParserRuleContext {
		public Token inner;
		public Token fault;
		public Stream_idContext stream_id() {
			return getRuleContext(Stream_idContext.class,0);
		}
		public SourceContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_source; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSource(this);
			else return visitor.visitChildren(this);
		}
	}

	public final SourceContext source() throws RecognitionException {
		SourceContext _localctx = new SourceContext(_ctx, getState());
		enterRule(_localctx, 222, RULE_source);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1471);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case HASH:
				{
				setState(1469);
				((SourceContext)_localctx).inner = match(HASH);
				}
				break;
			case T__0:
				{
				setState(1470);
				((SourceContext)_localctx).fault = match(T__0);
				}
				break;
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
			case ID_QUOTES:
			case ID:
				break;
			default:
				break;
			}
			setState(1473);
			stream_id();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class TargetContext extends ParserRuleContext {
		public SourceContext source() {
			return getRuleContext(SourceContext.class,0);
		}
		public TargetContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_target; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitTarget(this);
			else return visitor.visitChildren(this);
		}
	}

	public final TargetContext target() throws RecognitionException {
		TargetContext _localctx = new TargetContext(_ctx, getState());
		enterRule(_localctx, 224, RULE_target);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1475);
			source();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class EventContext extends ParserRuleContext {
		public NameContext name() {
			return getRuleContext(NameContext.class,0);
		}
		public EventContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_event; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitEvent(this);
			else return visitor.visitChildren(this);
		}
	}

	public final EventContext event() throws RecognitionException {
		EventContext _localctx = new EventContext(_ctx, getState());
		enterRule(_localctx, 226, RULE_event);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1477);
			name();
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class NameContext extends ParserRuleContext {
		public IdContext id() {
			return getRuleContext(IdContext.class,0);
		}
		public KeywordContext keyword() {
			return getRuleContext(KeywordContext.class,0);
		}
		public NameContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_name; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitName(this);
			else return visitor.visitChildren(this);
		}
	}

	public final NameContext name() throws RecognitionException {
		NameContext _localctx = new NameContext(_ctx, getState());
		enterRule(_localctx, 228, RULE_name);
		try {
			setState(1481);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case ID_QUOTES:
			case ID:
				enterOuterAlt(_localctx, 1);
				{
				setState(1479);
				id();
				}
				break;
			case STREAM:
			case DEFINE:
			case TABLE:
			case APP:
			case FROM:
			case PARTITION:
			case WINDOW:
			case SELECT:
			case GROUP:
			case BY:
			case ORDER:
			case LIMIT:
			case ASC:
			case DESC:
			case HAVING:
			case INSERT:
			case DELETE:
			case UPDATE:
			case RETURN:
			case EVENTS:
			case INTO:
			case OUTPUT:
			case EXPIRED:
			case CURRENT:
			case SNAPSHOT:
			case FOR:
			case RAW:
			case OF:
			case AS:
			case OR:
			case AND:
			case ON:
			case IS:
			case NOT:
			case WITHIN:
			case WITH:
			case BEGIN:
			case END:
			case NULL:
			case EVERY:
			case LAST:
			case ALL:
			case FIRST:
			case JOIN:
			case INNER:
			case OUTER:
			case RIGHT:
			case LEFT:
			case FULL:
			case UNIDIRECTIONAL:
			case YEARS:
			case MONTHS:
			case WEEKS:
			case DAYS:
			case HOURS:
			case MINUTES:
			case SECONDS:
			case MILLISECONDS:
			case FALSE:
			case TRUE:
			case STRING:
			case INT:
			case LONG:
			case FLOAT:
			case DOUBLE:
			case BOOL:
			case OBJECT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1480);
				keyword();
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class CollectContext extends ParserRuleContext {
		public Token start;
		public Token end;
		public List<TerminalNode> INT_LITERAL() { return getTokens(SiddhiQLParser.INT_LITERAL); }
		public TerminalNode INT_LITERAL(int i) {
			return getToken(SiddhiQLParser.INT_LITERAL, i);
		}
		public CollectContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_collect; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitCollect(this);
			else return visitor.visitChildren(this);
		}
	}

	public final CollectContext collect() throws RecognitionException {
		CollectContext _localctx = new CollectContext(_ctx, getState());
		enterRule(_localctx, 230, RULE_collect);
		try {
			setState(1491);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,172,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1483);
				((CollectContext)_localctx).start = match(INT_LITERAL);
				setState(1484);
				match(COL);
				setState(1485);
				((CollectContext)_localctx).end = match(INT_LITERAL);
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1486);
				((CollectContext)_localctx).start = match(INT_LITERAL);
				setState(1487);
				match(COL);
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1488);
				match(COL);
				setState(1489);
				((CollectContext)_localctx).end = match(INT_LITERAL);
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1490);
				match(INT_LITERAL);
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Attribute_typeContext extends ParserRuleContext {
		public TerminalNode STRING() { return getToken(SiddhiQLParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SiddhiQLParser.INT, 0); }
		public TerminalNode INT8() { return getToken(SiddhiQLParser.INT8, 0); }
		public TerminalNode INT16() { return getToken(SiddhiQLParser.INT16, 0); }
		public TerminalNode INT32() { return getToken(SiddhiQLParser.INT32, 0); }
		public TerminalNode INT64() { return getToken(SiddhiQLParser.INT64, 0); }
		public TerminalNode INT128() { return getToken(SiddhiQLParser.INT128, 0); }
		public TerminalNode INT256() { return getToken(SiddhiQLParser.INT256, 0); }
		public TerminalNode LONG() { return getToken(SiddhiQLParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(SiddhiQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SiddhiQLParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(SiddhiQLParser.BOOL, 0); }
		public TerminalNode OBJECT() { return getToken(SiddhiQLParser.OBJECT, 0); }
		public Attribute_typeContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_attribute_type; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitAttribute_type(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Attribute_typeContext attribute_type() throws RecognitionException {
		Attribute_typeContext _localctx = new Attribute_typeContext(_ctx, getState());
		enterRule(_localctx, 232, RULE_attribute_type);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1493);
			_la = _input.LA(1);
			if ( !(((((_la - 97)) & ~0x3f) == 0 && ((1L << (_la - 97)) & ((1L << (STRING - 97)) | (1L << (INT - 97)) | (1L << (LONG - 97)) | (1L << (FLOAT - 97)) | (1L << (DOUBLE - 97)) | (1L << (BOOL - 97)) | (1L << (OBJECT - 97)) | (1L << (INT8 - 97)) | (1L << (INT16 - 97)) | (1L << (INT32 - 97)) | (1L << (INT64 - 97)) | (1L << (INT128 - 97)) | (1L << (INT256 - 97)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class JoinContext extends ParserRuleContext {
		public TerminalNode LEFT() { return getToken(SiddhiQLParser.LEFT, 0); }
		public TerminalNode OUTER() { return getToken(SiddhiQLParser.OUTER, 0); }
		public TerminalNode JOIN() { return getToken(SiddhiQLParser.JOIN, 0); }
		public TerminalNode RIGHT() { return getToken(SiddhiQLParser.RIGHT, 0); }
		public TerminalNode FULL() { return getToken(SiddhiQLParser.FULL, 0); }
		public TerminalNode INNER() { return getToken(SiddhiQLParser.INNER, 0); }
		public JoinContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_join; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitJoin(this);
			else return visitor.visitChildren(this);
		}
	}

	public final JoinContext join() throws RecognitionException {
		JoinContext _localctx = new JoinContext(_ctx, getState());
		enterRule(_localctx, 234, RULE_join);
		int _la;
		try {
			setState(1510);
			_errHandler.sync(this);
			switch (_input.LA(1)) {
			case LEFT:
				enterOuterAlt(_localctx, 1);
				{
				setState(1495);
				match(LEFT);
				setState(1496);
				match(OUTER);
				setState(1497);
				match(JOIN);
				}
				break;
			case RIGHT:
				enterOuterAlt(_localctx, 2);
				{
				setState(1498);
				match(RIGHT);
				setState(1499);
				match(OUTER);
				setState(1500);
				match(JOIN);
				}
				break;
			case FULL:
				enterOuterAlt(_localctx, 3);
				{
				setState(1501);
				match(FULL);
				setState(1502);
				match(OUTER);
				setState(1503);
				match(JOIN);
				}
				break;
			case OUTER:
				enterOuterAlt(_localctx, 4);
				{
				setState(1504);
				match(OUTER);
				setState(1505);
				match(JOIN);
				}
				break;
			case JOIN:
			case INNER:
				enterOuterAlt(_localctx, 5);
				{
				setState(1507);
				_errHandler.sync(this);
				_la = _input.LA(1);
				if (_la==INNER) {
					{
					setState(1506);
					match(INNER);
					}
				}

				setState(1509);
				match(JOIN);
				}
				break;
			default:
				throw new NoViableAltException(this);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Constant_valueContext extends ParserRuleContext {
		public Bool_valueContext bool_value() {
			return getRuleContext(Bool_valueContext.class,0);
		}
		public Signed_double_valueContext signed_double_value() {
			return getRuleContext(Signed_double_valueContext.class,0);
		}
		public Signed_float_valueContext signed_float_value() {
			return getRuleContext(Signed_float_valueContext.class,0);
		}
		public Signed_long_valueContext signed_long_value() {
			return getRuleContext(Signed_long_valueContext.class,0);
		}
		public Signed_int_valueContext signed_int_value() {
			return getRuleContext(Signed_int_valueContext.class,0);
		}
		public Time_valueContext time_value() {
			return getRuleContext(Time_valueContext.class,0);
		}
		public String_valueContext string_value() {
			return getRuleContext(String_valueContext.class,0);
		}
		public Constant_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_constant_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitConstant_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Constant_valueContext constant_value() throws RecognitionException {
		Constant_valueContext _localctx = new Constant_valueContext(_ctx, getState());
		enterRule(_localctx, 236, RULE_constant_value);
		try {
			setState(1519);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,175,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1512);
				bool_value();
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1513);
				signed_double_value();
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1514);
				signed_float_value();
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1515);
				signed_long_value();
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1516);
				signed_int_value();
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1517);
				time_value();
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1518);
				string_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class IdContext extends ParserRuleContext {
		public TerminalNode ID_QUOTES() { return getToken(SiddhiQLParser.ID_QUOTES, 0); }
		public TerminalNode ID() { return getToken(SiddhiQLParser.ID, 0); }
		public IdContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_id; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitId(this);
			else return visitor.visitChildren(this);
		}
	}

	public final IdContext id() throws RecognitionException {
		IdContext _localctx = new IdContext(_ctx, getState());
		enterRule(_localctx, 238, RULE_id);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1521);
			_la = _input.LA(1);
			if ( !(_la==ID_QUOTES || _la==ID) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class KeywordContext extends ParserRuleContext {
		public TerminalNode APP() { return getToken(SiddhiQLParser.APP, 0); }
		public TerminalNode STREAM() { return getToken(SiddhiQLParser.STREAM, 0); }
		public TerminalNode DEFINE() { return getToken(SiddhiQLParser.DEFINE, 0); }
		public TerminalNode TABLE() { return getToken(SiddhiQLParser.TABLE, 0); }
		public TerminalNode FROM() { return getToken(SiddhiQLParser.FROM, 0); }
		public TerminalNode PARTITION() { return getToken(SiddhiQLParser.PARTITION, 0); }
		public TerminalNode WINDOW() { return getToken(SiddhiQLParser.WINDOW, 0); }
		public TerminalNode SELECT() { return getToken(SiddhiQLParser.SELECT, 0); }
		public TerminalNode GROUP() { return getToken(SiddhiQLParser.GROUP, 0); }
		public TerminalNode BY() { return getToken(SiddhiQLParser.BY, 0); }
		public TerminalNode ORDER() { return getToken(SiddhiQLParser.ORDER, 0); }
		public TerminalNode ASC() { return getToken(SiddhiQLParser.ASC, 0); }
		public TerminalNode DESC() { return getToken(SiddhiQLParser.DESC, 0); }
		public TerminalNode LIMIT() { return getToken(SiddhiQLParser.LIMIT, 0); }
		public TerminalNode HAVING() { return getToken(SiddhiQLParser.HAVING, 0); }
		public TerminalNode INSERT() { return getToken(SiddhiQLParser.INSERT, 0); }
		public TerminalNode DELETE() { return getToken(SiddhiQLParser.DELETE, 0); }
		public TerminalNode UPDATE() { return getToken(SiddhiQLParser.UPDATE, 0); }
		public TerminalNode RETURN() { return getToken(SiddhiQLParser.RETURN, 0); }
		public TerminalNode EVENTS() { return getToken(SiddhiQLParser.EVENTS, 0); }
		public TerminalNode INTO() { return getToken(SiddhiQLParser.INTO, 0); }
		public TerminalNode OUTPUT() { return getToken(SiddhiQLParser.OUTPUT, 0); }
		public TerminalNode EXPIRED() { return getToken(SiddhiQLParser.EXPIRED, 0); }
		public TerminalNode CURRENT() { return getToken(SiddhiQLParser.CURRENT, 0); }
		public TerminalNode SNAPSHOT() { return getToken(SiddhiQLParser.SNAPSHOT, 0); }
		public TerminalNode FOR() { return getToken(SiddhiQLParser.FOR, 0); }
		public TerminalNode RAW() { return getToken(SiddhiQLParser.RAW, 0); }
		public TerminalNode OF() { return getToken(SiddhiQLParser.OF, 0); }
		public TerminalNode AS() { return getToken(SiddhiQLParser.AS, 0); }
		public TerminalNode OR() { return getToken(SiddhiQLParser.OR, 0); }
		public TerminalNode AND() { return getToken(SiddhiQLParser.AND, 0); }
		public TerminalNode ON() { return getToken(SiddhiQLParser.ON, 0); }
		public TerminalNode IS() { return getToken(SiddhiQLParser.IS, 0); }
		public TerminalNode NOT() { return getToken(SiddhiQLParser.NOT, 0); }
		public TerminalNode WITHIN() { return getToken(SiddhiQLParser.WITHIN, 0); }
		public TerminalNode WITH() { return getToken(SiddhiQLParser.WITH, 0); }
		public TerminalNode BEGIN() { return getToken(SiddhiQLParser.BEGIN, 0); }
		public TerminalNode END() { return getToken(SiddhiQLParser.END, 0); }
		public TerminalNode NULL() { return getToken(SiddhiQLParser.NULL, 0); }
		public TerminalNode EVERY() { return getToken(SiddhiQLParser.EVERY, 0); }
		public TerminalNode LAST() { return getToken(SiddhiQLParser.LAST, 0); }
		public TerminalNode ALL() { return getToken(SiddhiQLParser.ALL, 0); }
		public TerminalNode FIRST() { return getToken(SiddhiQLParser.FIRST, 0); }
		public TerminalNode JOIN() { return getToken(SiddhiQLParser.JOIN, 0); }
		public TerminalNode INNER() { return getToken(SiddhiQLParser.INNER, 0); }
		public TerminalNode OUTER() { return getToken(SiddhiQLParser.OUTER, 0); }
		public TerminalNode RIGHT() { return getToken(SiddhiQLParser.RIGHT, 0); }
		public TerminalNode LEFT() { return getToken(SiddhiQLParser.LEFT, 0); }
		public TerminalNode FULL() { return getToken(SiddhiQLParser.FULL, 0); }
		public TerminalNode UNIDIRECTIONAL() { return getToken(SiddhiQLParser.UNIDIRECTIONAL, 0); }
		public TerminalNode YEARS() { return getToken(SiddhiQLParser.YEARS, 0); }
		public TerminalNode MONTHS() { return getToken(SiddhiQLParser.MONTHS, 0); }
		public TerminalNode WEEKS() { return getToken(SiddhiQLParser.WEEKS, 0); }
		public TerminalNode DAYS() { return getToken(SiddhiQLParser.DAYS, 0); }
		public TerminalNode HOURS() { return getToken(SiddhiQLParser.HOURS, 0); }
		public TerminalNode MINUTES() { return getToken(SiddhiQLParser.MINUTES, 0); }
		public TerminalNode SECONDS() { return getToken(SiddhiQLParser.SECONDS, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SiddhiQLParser.MILLISECONDS, 0); }
		public TerminalNode FALSE() { return getToken(SiddhiQLParser.FALSE, 0); }
		public TerminalNode TRUE() { return getToken(SiddhiQLParser.TRUE, 0); }
		public TerminalNode STRING() { return getToken(SiddhiQLParser.STRING, 0); }
		public TerminalNode INT() { return getToken(SiddhiQLParser.INT, 0); }
		public TerminalNode LONG() { return getToken(SiddhiQLParser.LONG, 0); }
		public TerminalNode FLOAT() { return getToken(SiddhiQLParser.FLOAT, 0); }
		public TerminalNode DOUBLE() { return getToken(SiddhiQLParser.DOUBLE, 0); }
		public TerminalNode BOOL() { return getToken(SiddhiQLParser.BOOL, 0); }
		public TerminalNode OBJECT() { return getToken(SiddhiQLParser.OBJECT, 0); }
		public KeywordContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_keyword; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitKeyword(this);
			else return visitor.visitChildren(this);
		}
	}

	public final KeywordContext keyword() throws RecognitionException {
		KeywordContext _localctx = new KeywordContext(_ctx, getState());
		enterRule(_localctx, 240, RULE_keyword);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1523);
			_la = _input.LA(1);
			if ( !((((_la) & ~0x3f) == 0 && ((1L << _la) & ((1L << STREAM) | (1L << DEFINE) | (1L << TABLE) | (1L << APP) | (1L << FROM) | (1L << PARTITION) | (1L << WINDOW) | (1L << SELECT) | (1L << GROUP) | (1L << BY) | (1L << ORDER) | (1L << LIMIT) | (1L << ASC) | (1L << DESC) | (1L << HAVING) | (1L << INSERT) | (1L << DELETE) | (1L << UPDATE) | (1L << RETURN) | (1L << EVENTS) | (1L << INTO) | (1L << OUTPUT) | (1L << EXPIRED) | (1L << CURRENT) | (1L << SNAPSHOT) | (1L << FOR) | (1L << RAW) | (1L << OF) | (1L << AS))) != 0) || ((((_la - 65)) & ~0x3f) == 0 && ((1L << (_la - 65)) & ((1L << (OR - 65)) | (1L << (AND - 65)) | (1L << (ON - 65)) | (1L << (IS - 65)) | (1L << (NOT - 65)) | (1L << (WITHIN - 65)) | (1L << (WITH - 65)) | (1L << (BEGIN - 65)) | (1L << (END - 65)) | (1L << (NULL - 65)) | (1L << (EVERY - 65)) | (1L << (LAST - 65)) | (1L << (ALL - 65)) | (1L << (FIRST - 65)) | (1L << (JOIN - 65)) | (1L << (INNER - 65)) | (1L << (OUTER - 65)) | (1L << (RIGHT - 65)) | (1L << (LEFT - 65)) | (1L << (FULL - 65)) | (1L << (UNIDIRECTIONAL - 65)) | (1L << (YEARS - 65)) | (1L << (MONTHS - 65)) | (1L << (WEEKS - 65)) | (1L << (DAYS - 65)) | (1L << (HOURS - 65)) | (1L << (MINUTES - 65)) | (1L << (SECONDS - 65)) | (1L << (MILLISECONDS - 65)) | (1L << (FALSE - 65)) | (1L << (TRUE - 65)) | (1L << (STRING - 65)) | (1L << (INT - 65)) | (1L << (LONG - 65)) | (1L << (FLOAT - 65)) | (1L << (DOUBLE - 65)) | (1L << (BOOL - 65)) | (1L << (OBJECT - 65)))) != 0)) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Time_valueContext extends ParserRuleContext {
		public Year_valueContext year_value() {
			return getRuleContext(Year_valueContext.class,0);
		}
		public Month_valueContext month_value() {
			return getRuleContext(Month_valueContext.class,0);
		}
		public Week_valueContext week_value() {
			return getRuleContext(Week_valueContext.class,0);
		}
		public Day_valueContext day_value() {
			return getRuleContext(Day_valueContext.class,0);
		}
		public Hour_valueContext hour_value() {
			return getRuleContext(Hour_valueContext.class,0);
		}
		public Minute_valueContext minute_value() {
			return getRuleContext(Minute_valueContext.class,0);
		}
		public Second_valueContext second_value() {
			return getRuleContext(Second_valueContext.class,0);
		}
		public Millisecond_valueContext millisecond_value() {
			return getRuleContext(Millisecond_valueContext.class,0);
		}
		public Time_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_time_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitTime_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Time_valueContext time_value() throws RecognitionException {
		Time_valueContext _localctx = new Time_valueContext(_ctx, getState());
		enterRule(_localctx, 242, RULE_time_value);
		try {
			setState(1617);
			_errHandler.sync(this);
			switch ( getInterpreter().adaptivePredict(_input,204,_ctx) ) {
			case 1:
				enterOuterAlt(_localctx, 1);
				{
				setState(1525);
				year_value();
				setState(1527);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,176,_ctx) ) {
				case 1:
					{
					setState(1526);
					month_value();
					}
					break;
				}
				setState(1530);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,177,_ctx) ) {
				case 1:
					{
					setState(1529);
					week_value();
					}
					break;
				}
				setState(1533);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,178,_ctx) ) {
				case 1:
					{
					setState(1532);
					day_value();
					}
					break;
				}
				setState(1536);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,179,_ctx) ) {
				case 1:
					{
					setState(1535);
					hour_value();
					}
					break;
				}
				setState(1539);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,180,_ctx) ) {
				case 1:
					{
					setState(1538);
					minute_value();
					}
					break;
				}
				setState(1542);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,181,_ctx) ) {
				case 1:
					{
					setState(1541);
					second_value();
					}
					break;
				}
				setState(1545);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,182,_ctx) ) {
				case 1:
					{
					setState(1544);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 2:
				enterOuterAlt(_localctx, 2);
				{
				setState(1547);
				month_value();
				setState(1549);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,183,_ctx) ) {
				case 1:
					{
					setState(1548);
					week_value();
					}
					break;
				}
				setState(1552);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,184,_ctx) ) {
				case 1:
					{
					setState(1551);
					day_value();
					}
					break;
				}
				setState(1555);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,185,_ctx) ) {
				case 1:
					{
					setState(1554);
					hour_value();
					}
					break;
				}
				setState(1558);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,186,_ctx) ) {
				case 1:
					{
					setState(1557);
					minute_value();
					}
					break;
				}
				setState(1561);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,187,_ctx) ) {
				case 1:
					{
					setState(1560);
					second_value();
					}
					break;
				}
				setState(1564);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,188,_ctx) ) {
				case 1:
					{
					setState(1563);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 3:
				enterOuterAlt(_localctx, 3);
				{
				setState(1566);
				week_value();
				setState(1568);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,189,_ctx) ) {
				case 1:
					{
					setState(1567);
					day_value();
					}
					break;
				}
				setState(1571);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,190,_ctx) ) {
				case 1:
					{
					setState(1570);
					hour_value();
					}
					break;
				}
				setState(1574);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,191,_ctx) ) {
				case 1:
					{
					setState(1573);
					minute_value();
					}
					break;
				}
				setState(1577);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,192,_ctx) ) {
				case 1:
					{
					setState(1576);
					second_value();
					}
					break;
				}
				setState(1580);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,193,_ctx) ) {
				case 1:
					{
					setState(1579);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 4:
				enterOuterAlt(_localctx, 4);
				{
				setState(1582);
				day_value();
				setState(1584);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,194,_ctx) ) {
				case 1:
					{
					setState(1583);
					hour_value();
					}
					break;
				}
				setState(1587);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,195,_ctx) ) {
				case 1:
					{
					setState(1586);
					minute_value();
					}
					break;
				}
				setState(1590);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,196,_ctx) ) {
				case 1:
					{
					setState(1589);
					second_value();
					}
					break;
				}
				setState(1593);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,197,_ctx) ) {
				case 1:
					{
					setState(1592);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 5:
				enterOuterAlt(_localctx, 5);
				{
				setState(1595);
				hour_value();
				setState(1597);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,198,_ctx) ) {
				case 1:
					{
					setState(1596);
					minute_value();
					}
					break;
				}
				setState(1600);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,199,_ctx) ) {
				case 1:
					{
					setState(1599);
					second_value();
					}
					break;
				}
				setState(1603);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,200,_ctx) ) {
				case 1:
					{
					setState(1602);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 6:
				enterOuterAlt(_localctx, 6);
				{
				setState(1605);
				minute_value();
				setState(1607);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,201,_ctx) ) {
				case 1:
					{
					setState(1606);
					second_value();
					}
					break;
				}
				setState(1610);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,202,_ctx) ) {
				case 1:
					{
					setState(1609);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 7:
				enterOuterAlt(_localctx, 7);
				{
				setState(1612);
				second_value();
				setState(1614);
				_errHandler.sync(this);
				switch ( getInterpreter().adaptivePredict(_input,203,_ctx) ) {
				case 1:
					{
					setState(1613);
					millisecond_value();
					}
					break;
				}
				}
				break;
			case 8:
				enterOuterAlt(_localctx, 8);
				{
				setState(1616);
				millisecond_value();
				}
				break;
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Year_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode YEARS() { return getToken(SiddhiQLParser.YEARS, 0); }
		public Year_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_year_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitYear_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Year_valueContext year_value() throws RecognitionException {
		Year_valueContext _localctx = new Year_valueContext(_ctx, getState());
		enterRule(_localctx, 244, RULE_year_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1619);
			match(INT_LITERAL);
			setState(1620);
			match(YEARS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Month_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode MONTHS() { return getToken(SiddhiQLParser.MONTHS, 0); }
		public Month_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_month_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMonth_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Month_valueContext month_value() throws RecognitionException {
		Month_valueContext _localctx = new Month_valueContext(_ctx, getState());
		enterRule(_localctx, 246, RULE_month_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1622);
			match(INT_LITERAL);
			setState(1623);
			match(MONTHS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Week_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode WEEKS() { return getToken(SiddhiQLParser.WEEKS, 0); }
		public Week_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_week_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitWeek_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Week_valueContext week_value() throws RecognitionException {
		Week_valueContext _localctx = new Week_valueContext(_ctx, getState());
		enterRule(_localctx, 248, RULE_week_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1625);
			match(INT_LITERAL);
			setState(1626);
			match(WEEKS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Day_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode DAYS() { return getToken(SiddhiQLParser.DAYS, 0); }
		public Day_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_day_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitDay_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Day_valueContext day_value() throws RecognitionException {
		Day_valueContext _localctx = new Day_valueContext(_ctx, getState());
		enterRule(_localctx, 250, RULE_day_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1628);
			match(INT_LITERAL);
			setState(1629);
			match(DAYS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Hour_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode HOURS() { return getToken(SiddhiQLParser.HOURS, 0); }
		public Hour_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_hour_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitHour_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Hour_valueContext hour_value() throws RecognitionException {
		Hour_valueContext _localctx = new Hour_valueContext(_ctx, getState());
		enterRule(_localctx, 252, RULE_hour_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1631);
			match(INT_LITERAL);
			setState(1632);
			match(HOURS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Minute_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode MINUTES() { return getToken(SiddhiQLParser.MINUTES, 0); }
		public Minute_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_minute_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMinute_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Minute_valueContext minute_value() throws RecognitionException {
		Minute_valueContext _localctx = new Minute_valueContext(_ctx, getState());
		enterRule(_localctx, 254, RULE_minute_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1634);
			match(INT_LITERAL);
			setState(1635);
			match(MINUTES);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Second_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode SECONDS() { return getToken(SiddhiQLParser.SECONDS, 0); }
		public Second_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_second_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSecond_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Second_valueContext second_value() throws RecognitionException {
		Second_valueContext _localctx = new Second_valueContext(_ctx, getState());
		enterRule(_localctx, 256, RULE_second_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1637);
			match(INT_LITERAL);
			setState(1638);
			match(SECONDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Millisecond_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public TerminalNode MILLISECONDS() { return getToken(SiddhiQLParser.MILLISECONDS, 0); }
		public Millisecond_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_millisecond_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitMillisecond_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Millisecond_valueContext millisecond_value() throws RecognitionException {
		Millisecond_valueContext _localctx = new Millisecond_valueContext(_ctx, getState());
		enterRule(_localctx, 258, RULE_millisecond_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1640);
			match(INT_LITERAL);
			setState(1641);
			match(MILLISECONDS);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_double_valueContext extends ParserRuleContext {
		public TerminalNode DOUBLE_LITERAL() { return getToken(SiddhiQLParser.DOUBLE_LITERAL, 0); }
		public Signed_double_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_double_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_double_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_double_valueContext signed_double_value() throws RecognitionException {
		Signed_double_valueContext _localctx = new Signed_double_valueContext(_ctx, getState());
		enterRule(_localctx, 260, RULE_signed_double_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1644);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1643);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1646);
			match(DOUBLE_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_long_valueContext extends ParserRuleContext {
		public TerminalNode LONG_LITERAL() { return getToken(SiddhiQLParser.LONG_LITERAL, 0); }
		public Signed_long_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_long_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_long_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_long_valueContext signed_long_value() throws RecognitionException {
		Signed_long_valueContext _localctx = new Signed_long_valueContext(_ctx, getState());
		enterRule(_localctx, 262, RULE_signed_long_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1649);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1648);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1651);
			match(LONG_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_float_valueContext extends ParserRuleContext {
		public TerminalNode FLOAT_LITERAL() { return getToken(SiddhiQLParser.FLOAT_LITERAL, 0); }
		public Signed_float_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_float_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_float_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_float_valueContext signed_float_value() throws RecognitionException {
		Signed_float_valueContext _localctx = new Signed_float_valueContext(_ctx, getState());
		enterRule(_localctx, 264, RULE_signed_float_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1654);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1653);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1656);
			match(FLOAT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Signed_int_valueContext extends ParserRuleContext {
		public TerminalNode INT_LITERAL() { return getToken(SiddhiQLParser.INT_LITERAL, 0); }
		public Signed_int_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_signed_int_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitSigned_int_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Signed_int_valueContext signed_int_value() throws RecognitionException {
		Signed_int_valueContext _localctx = new Signed_int_valueContext(_ctx, getState());
		enterRule(_localctx, 266, RULE_signed_int_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1659);
			_errHandler.sync(this);
			_la = _input.LA(1);
			if (_la==PLUS || _la==MINUS) {
				{
				setState(1658);
				_la = _input.LA(1);
				if ( !(_la==PLUS || _la==MINUS) ) {
				_errHandler.recoverInline(this);
				}
				else {
					if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
					_errHandler.reportMatch(this);
					consume();
				}
				}
			}

			setState(1661);
			match(INT_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class Bool_valueContext extends ParserRuleContext {
		public TerminalNode TRUE() { return getToken(SiddhiQLParser.TRUE, 0); }
		public TerminalNode FALSE() { return getToken(SiddhiQLParser.FALSE, 0); }
		public Bool_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_bool_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitBool_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final Bool_valueContext bool_value() throws RecognitionException {
		Bool_valueContext _localctx = new Bool_valueContext(_ctx, getState());
		enterRule(_localctx, 268, RULE_bool_value);
		int _la;
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1663);
			_la = _input.LA(1);
			if ( !(_la==FALSE || _la==TRUE) ) {
			_errHandler.recoverInline(this);
			}
			else {
				if ( _input.LA(1)==Token.EOF ) matchedEOF = true;
				_errHandler.reportMatch(this);
				consume();
			}
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public static class String_valueContext extends ParserRuleContext {
		public TerminalNode STRING_LITERAL() { return getToken(SiddhiQLParser.STRING_LITERAL, 0); }
		public String_valueContext(ParserRuleContext parent, int invokingState) {
			super(parent, invokingState);
		}
		@Override public int getRuleIndex() { return RULE_string_value; }
		@Override
		public <T> T accept(ParseTreeVisitor<? extends T> visitor) {
			if ( visitor instanceof SiddhiQLVisitor ) return ((SiddhiQLVisitor<? extends T>)visitor).visitString_value(this);
			else return visitor.visitChildren(this);
		}
	}

	public final String_valueContext string_value() throws RecognitionException {
		String_valueContext _localctx = new String_valueContext(_ctx, getState());
		enterRule(_localctx, 270, RULE_string_value);
		try {
			enterOuterAlt(_localctx, 1);
			{
			setState(1665);
			match(STRING_LITERAL);
			}
		}
		catch (RecognitionException re) {
			_localctx.exception = re;
			_errHandler.reportError(this, re);
			_errHandler.recover(this, re);
		}
		finally {
			exitRule();
		}
		return _localctx;
	}

	public boolean sempred(RuleContext _localctx, int ruleIndex, int predIndex) {
		switch (ruleIndex) {
		case 43:
			return every_pattern_source_chain_sempred((Every_pattern_source_chainContext)_localctx, predIndex);
		case 44:
			return pattern_source_chain_sempred((Pattern_source_chainContext)_localctx, predIndex);
		case 46:
			return left_absent_pattern_source_sempred((Left_absent_pattern_sourceContext)_localctx, predIndex);
		case 47:
			return right_absent_pattern_source_sempred((Right_absent_pattern_sourceContext)_localctx, predIndex);
		case 62:
			return left_absent_sequence_source_sempred((Left_absent_sequence_sourceContext)_localctx, predIndex);
		case 63:
			return right_absent_sequence_source_sempred((Right_absent_sequence_sourceContext)_localctx, predIndex);
		case 64:
			return sequence_source_chain_sempred((Sequence_source_chainContext)_localctx, predIndex);
		case 94:
			return math_operation_sempred((Math_operationContext)_localctx, predIndex);
		}
		return true;
	}
	private boolean every_pattern_source_chain_sempred(Every_pattern_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 0:
			return precpred(_ctx, 3);
		}
		return true;
	}
	private boolean pattern_source_chain_sempred(Pattern_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 1:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean left_absent_pattern_source_sempred(Left_absent_pattern_sourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 2:
			return precpred(_ctx, 3);
		case 3:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean right_absent_pattern_source_sempred(Right_absent_pattern_sourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 4:
			return precpred(_ctx, 3);
		case 5:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean left_absent_sequence_source_sempred(Left_absent_sequence_sourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 6:
			return precpred(_ctx, 3);
		case 7:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean right_absent_sequence_source_sempred(Right_absent_sequence_sourceContext _localctx, int predIndex) {
		switch (predIndex) {
		case 8:
			return precpred(_ctx, 3);
		case 9:
			return precpred(_ctx, 1);
		}
		return true;
	}
	private boolean sequence_source_chain_sempred(Sequence_source_chainContext _localctx, int predIndex) {
		switch (predIndex) {
		case 10:
			return precpred(_ctx, 2);
		}
		return true;
	}
	private boolean math_operation_sempred(Math_operationContext _localctx, int predIndex) {
		switch (predIndex) {
		case 11:
			return precpred(_ctx, 10);
		case 12:
			return precpred(_ctx, 9);
		case 13:
			return precpred(_ctx, 8);
		case 14:
			return precpred(_ctx, 7);
		case 15:
			return precpred(_ctx, 5);
		case 16:
			return precpred(_ctx, 4);
		case 17:
			return precpred(_ctx, 6);
		}
		return true;
	}

	public static final String _serializedATN =
		"\3\u608b\ua72a\u8133\ub9ed\u417c\u3be7\u7786\u5964\3z\u0686\4\2\t\2\4"+
		"\3\t\3\4\4\t\4\4\5\t\5\4\6\t\6\4\7\t\7\4\b\t\b\4\t\t\t\4\n\t\n\4\13\t"+
		"\13\4\f\t\f\4\r\t\r\4\16\t\16\4\17\t\17\4\20\t\20\4\21\t\21\4\22\t\22"+
		"\4\23\t\23\4\24\t\24\4\25\t\25\4\26\t\26\4\27\t\27\4\30\t\30\4\31\t\31"+
		"\4\32\t\32\4\33\t\33\4\34\t\34\4\35\t\35\4\36\t\36\4\37\t\37\4 \t \4!"+
		"\t!\4\"\t\"\4#\t#\4$\t$\4%\t%\4&\t&\4\'\t\'\4(\t(\4)\t)\4*\t*\4+\t+\4"+
		",\t,\4-\t-\4.\t.\4/\t/\4\60\t\60\4\61\t\61\4\62\t\62\4\63\t\63\4\64\t"+
		"\64\4\65\t\65\4\66\t\66\4\67\t\67\48\t8\49\t9\4:\t:\4;\t;\4<\t<\4=\t="+
		"\4>\t>\4?\t?\4@\t@\4A\tA\4B\tB\4C\tC\4D\tD\4E\tE\4F\tF\4G\tG\4H\tH\4I"+
		"\tI\4J\tJ\4K\tK\4L\tL\4M\tM\4N\tN\4O\tO\4P\tP\4Q\tQ\4R\tR\4S\tS\4T\tT"+
		"\4U\tU\4V\tV\4W\tW\4X\tX\4Y\tY\4Z\tZ\4[\t[\4\\\t\\\4]\t]\4^\t^\4_\t_\4"+
		"`\t`\4a\ta\4b\tb\4c\tc\4d\td\4e\te\4f\tf\4g\tg\4h\th\4i\ti\4j\tj\4k\t"+
		"k\4l\tl\4m\tm\4n\tn\4o\to\4p\tp\4q\tq\4r\tr\4s\ts\4t\tt\4u\tu\4v\tv\4"+
		"w\tw\4x\tx\4y\ty\4z\tz\4{\t{\4|\t|\4}\t}\4~\t~\4\177\t\177\4\u0080\t\u0080"+
		"\4\u0081\t\u0081\4\u0082\t\u0082\4\u0083\t\u0083\4\u0084\t\u0084\4\u0085"+
		"\t\u0085\4\u0086\t\u0086\4\u0087\t\u0087\4\u0088\t\u0088\4\u0089\t\u0089"+
		"\3\2\3\2\3\2\3\3\3\3\3\4\3\4\7\4\u011a\n\4\f\4\16\4\u011d\13\4\3\4\3\4"+
		"\3\4\3\4\3\4\3\4\3\4\5\4\u0126\n\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\3\4\5\4"+
		"\u0130\n\4\7\4\u0132\n\4\f\4\16\4\u0135\13\4\3\4\3\4\3\4\5\4\u013a\n\4"+
		"\7\4\u013c\n\4\f\4\16\4\u013f\13\4\3\4\5\4\u0142\n\4\3\5\3\5\5\5\u0146"+
		"\n\5\3\6\3\6\5\6\u014a\n\6\3\6\3\6\3\7\7\7\u014f\n\7\f\7\16\7\u0152\13"+
		"\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\3\7\7\7\u015e\n\7\f\7\16\7\u0161"+
		"\13\7\3\7\3\7\3\b\3\b\5\b\u0167\n\b\3\b\3\b\3\t\7\t\u016c\n\t\f\t\16\t"+
		"\u016f\13\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\3\t\7\t\u017b\n\t\f\t"+
		"\16\t\u017e\13\t\3\t\3\t\3\n\3\n\5\n\u0184\n\n\3\n\3\n\3\13\7\13\u0189"+
		"\n\13\f\13\16\13\u018c\13\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3\13\3"+
		"\13\3\13\7\13\u0198\n\13\f\13\16\13\u019b\13\13\3\13\3\13\3\13\3\13\5"+
		"\13\u01a1\n\13\3\f\3\f\5\f\u01a5\n\f\3\f\3\f\3\r\3\r\3\r\5\r\u01ac\n\r"+
		"\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\3\r\5\r\u01ba\n\r\3\r\3\r"+
		"\3\r\3\r\5\r\u01c0\n\r\3\r\5\r\u01c3\n\r\3\16\3\16\3\16\5\16\u01c8\n\16"+
		"\3\16\3\16\5\16\u01cc\n\16\3\16\3\16\3\16\5\16\u01d1\n\16\3\17\3\17\5"+
		"\17\u01d5\n\17\3\17\3\17\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20\3\20"+
		"\3\20\3\21\3\21\3\22\3\22\3\23\3\23\3\24\3\24\5\24\u01eb\n\24\3\24\3\24"+
		"\3\25\3\25\3\25\3\25\3\25\3\25\3\25\5\25\u01f6\n\25\3\26\3\26\3\27\3\27"+
		"\5\27\u01fc\n\27\3\27\3\27\3\30\7\30\u0201\n\30\f\30\16\30\u0204\13\30"+
		"\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\3\30\5\30\u020f\n\30\3\30\3\30"+
		"\3\30\3\31\3\31\3\32\3\32\5\32\u0218\n\32\3\33\3\33\3\34\3\34\3\34\3\34"+
		"\3\35\3\35\3\35\7\35\u0223\n\35\f\35\16\35\u0226\13\35\3\36\3\36\3\36"+
		"\3\36\3\36\5\36\u022d\n\36\3\36\3\36\3\36\5\36\u0232\n\36\7\36\u0234\n"+
		"\36\f\36\16\36\u0237\13\36\3\36\3\36\5\36\u023b\n\36\3\37\3\37\3\37\3"+
		"\37\3\37\3\37\3\37\3\37\7\37\u0245\n\37\f\37\16\37\u0248\13\37\3\37\3"+
		"\37\5\37\u024c\n\37\3 \3 \3 \5 \u0251\n \3 \3 \3!\7!\u0256\n!\f!\16!\u0259"+
		"\13!\3!\3!\3!\3!\3!\3!\7!\u0261\n!\f!\16!\u0264\13!\3!\3!\3!\3!\5!\u026a"+
		"\n!\3!\3!\3!\5!\u026f\n!\7!\u0271\n!\f!\16!\u0274\13!\3!\5!\u0277\n!\3"+
		"!\3!\3\"\3\"\5\"\u027d\n\"\3\"\3\"\3#\3#\3#\3#\3#\3#\3#\3#\5#\u0289\n"+
		"#\3$\3$\3$\7$\u028e\n$\f$\16$\u0291\13$\3%\3%\3%\3%\3&\3&\5&\u0299\n&"+
		"\3&\3&\3\'\7\'\u029e\n\'\f\'\16\'\u02a1\13\'\3\'\3\'\3\'\5\'\u02a6\n\'"+
		"\3\'\5\'\u02a9\n\'\3\'\3\'\3(\3(\3(\3(\3(\5(\u02b2\n(\3)\3)\5)\u02b6\n"+
		")\3)\5)\u02b9\n)\3)\5)\u02bc\n)\3*\3*\3*\3*\5*\u02c2\n*\3*\3*\3*\3*\5"+
		"*\u02c8\n*\3*\3*\5*\u02cc\n*\3*\3*\3*\5*\u02d1\n*\3+\3+\5+\u02d5\n+\3"+
		"+\5+\u02d8\n+\3+\3+\5+\u02dc\n+\3,\3,\5,\u02e0\n,\3,\3,\5,\u02e4\n,\5"+
		",\u02e6\n,\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\3-\5-\u02f5\n-\3-\3-\3"+
		"-\7-\u02fa\n-\f-\16-\u02fd\13-\3.\3.\3.\3.\3.\3.\5.\u0305\n.\3.\3.\3."+
		"\7.\u030a\n.\f.\16.\u030d\13.\3/\5/\u0310\n/\3/\3/\3/\3/\3/\3/\3/\5/\u0319"+
		"\n/\3\60\3\60\5\60\u031d\n\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60\3\60"+
		"\3\60\3\60\3\60\3\60\5\60\u032b\n\60\3\60\3\60\3\60\3\60\3\60\3\60\7\60"+
		"\u0333\n\60\f\60\16\60\u0336\13\60\3\61\3\61\5\61\u033a\n\61\3\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\3\61\5\61\u0348\n\61\3\61"+
		"\3\61\3\61\3\61\3\61\3\61\7\61\u0350\n\61\f\61\16\61\u0353\13\61\3\62"+
		"\3\62\3\62\3\62\5\62\u0359\n\62\3\63\3\63\3\63\3\63\3\63\3\63\3\63\3\63"+
		"\5\63\u0363\n\63\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64"+
		"\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\3\64\5\64"+
		"\u038b\n\64\3\65\5\65\u038e\n\65\3\65\3\65\3\66\3\66\3\66\3\66\3\67\3"+
		"\67\3\67\3\67\3\67\38\38\38\58\u039e\n8\38\38\39\39\59\u03a4\n9\3:\6:"+
		"\u03a7\n:\r:\16:\u03a8\3;\3;\5;\u03ad\n;\3<\3<\5<\u03b1\n<\3<\3<\5<\u03b5"+
		"\n<\5<\u03b7\n<\3=\5=\u03ba\n=\3=\3=\3=\3=\3>\5>\u03c1\n>\3>\3>\3>\3>"+
		"\3>\5>\u03c8\n>\3>\3>\3>\3>\5>\u03ce\n>\3?\3?\3?\3?\3?\3?\3?\5?\u03d7"+
		"\n?\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\3@\5@\u03e6\n@\3@\3@\3@\3@\3@"+
		"\3@\7@\u03ee\n@\f@\16@\u03f1\13@\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3A\3"+
		"A\5A\u0400\nA\3A\3A\3A\3A\3A\3A\7A\u0408\nA\fA\16A\u040b\13A\3B\3B\3B"+
		"\3B\3B\3B\5B\u0413\nB\3B\3B\3B\7B\u0418\nB\fB\16B\u041b\13B\3C\3C\3C\3"+
		"C\5C\u0421\nC\3D\3D\3D\3D\3D\3D\3D\3D\5D\u042b\nD\3E\3E\3E\3E\3E\3E\3"+
		"E\5E\u0434\nE\3E\5E\u0437\nE\3E\3E\5E\u043b\nE\5E\u043d\nE\3F\5F\u0440"+
		"\nF\3F\3F\3F\3F\3G\3G\3G\3H\3H\3H\3H\3H\3I\3I\3I\3I\3I\7I\u0453\nI\fI"+
		"\16I\u0456\13I\5I\u0458\nI\3I\5I\u045b\nI\3J\3J\3J\3J\3J\7J\u0462\nJ\f"+
		"J\16J\u0465\13J\5J\u0467\nJ\3J\5J\u046a\nJ\3J\5J\u046d\nJ\3J\5J\u0470"+
		"\nJ\3J\5J\u0473\nJ\3J\5J\u0476\nJ\3K\3K\3K\3K\3K\7K\u047d\nK\fK\16K\u0480"+
		"\13K\3L\3L\3L\3M\3M\3M\3M\3M\7M\u048a\nM\fM\16M\u048d\13M\3N\3N\5N\u0491"+
		"\nN\3O\3O\3P\3P\3P\3Q\3Q\3Q\3R\3R\5R\u049d\nR\3R\3R\3R\3R\3R\3R\5R\u04a5"+
		"\nR\3R\3R\5R\u04a9\nR\3R\3R\3R\3R\3R\3R\3R\5R\u04b2\nR\3R\5R\u04b5\nR"+
		"\3R\3R\3R\3R\3R\3R\3R\5R\u04be\nR\3R\5R\u04c1\nR\3R\3R\3R\3R\3R\5R\u04c8"+
		"\nR\5R\u04ca\nR\3S\3S\3S\3S\5S\u04d0\nS\3S\3S\3S\5S\u04d5\nS\3S\3S\3S"+
		"\5S\u04da\nS\3T\3T\3T\3T\7T\u04e0\nT\fT\16T\u04e3\13T\3U\3U\3U\3U\3V\3"+
		"V\3V\3V\3V\5V\u04ee\nV\3V\5V\u04f1\nV\3W\3W\5W\u04f5\nW\3W\3W\3W\3W\5"+
		"W\u04fb\nW\3W\3W\3W\3W\5W\u0501\nW\3X\3X\3Y\3Y\3Y\3Z\3Z\3Z\3[\3[\3[\3"+
		"[\5[\u050f\n[\3\\\3\\\3\\\3]\3]\3]\3]\3]\5]\u0519\n]\3^\3^\3_\3_\3`\3"+
		"`\3`\3`\3`\3`\3`\3`\3`\3`\3`\5`\u052a\n`\3`\3`\3`\3`\5`\u0530\n`\3`\3"+
		"`\3`\3`\5`\u0536\n`\3`\3`\3`\3`\3`\3`\5`\u053e\n`\3`\3`\3`\3`\5`\u0544"+
		"\n`\3`\3`\3`\3`\3`\3`\3`\3`\3`\3`\7`\u0550\n`\f`\16`\u0553\13`\3a\3a\3"+
		"a\5a\u0558\na\3a\3a\3a\5a\u055d\na\3a\3a\3b\3b\3b\7b\u0564\nb\fb\16b\u0567"+
		"\13b\3b\5b\u056a\nb\3c\3c\3c\5c\u056f\nc\3c\3c\3c\3d\3d\5d\u0576\nd\3"+
		"d\3d\3d\3d\3d\5d\u057d\nd\3e\3e\5e\u0581\ne\3e\3e\3e\3e\3e\5e\u0588\n"+
		"e\3e\3e\3e\3e\3e\3e\5e\u0590\ne\5e\u0592\ne\3e\3e\3e\3e\5e\u0598\ne\3"+
		"f\3f\3f\3f\5f\u059e\nf\5f\u05a0\nf\3g\3g\3h\3h\3i\3i\3j\3j\3k\3k\3l\3"+
		"l\3l\3l\7l\u05b0\nl\fl\16l\u05b3\13l\3l\5l\u05b6\nl\3m\3m\3n\3n\3o\3o"+
		"\3p\3p\3q\3q\5q\u05c2\nq\3q\3q\3r\3r\3s\3s\3t\3t\5t\u05cc\nt\3u\3u\3u"+
		"\3u\3u\3u\3u\3u\5u\u05d6\nu\3v\3v\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w\3w"+
		"\5w\u05e6\nw\3w\5w\u05e9\nw\3x\3x\3x\3x\3x\3x\3x\5x\u05f2\nx\3y\3y\3z"+
		"\3z\3{\3{\5{\u05fa\n{\3{\5{\u05fd\n{\3{\5{\u0600\n{\3{\5{\u0603\n{\3{"+
		"\5{\u0606\n{\3{\5{\u0609\n{\3{\5{\u060c\n{\3{\3{\5{\u0610\n{\3{\5{\u0613"+
		"\n{\3{\5{\u0616\n{\3{\5{\u0619\n{\3{\5{\u061c\n{\3{\5{\u061f\n{\3{\3{"+
		"\5{\u0623\n{\3{\5{\u0626\n{\3{\5{\u0629\n{\3{\5{\u062c\n{\3{\5{\u062f"+
		"\n{\3{\3{\5{\u0633\n{\3{\5{\u0636\n{\3{\5{\u0639\n{\3{\5{\u063c\n{\3{"+
		"\3{\5{\u0640\n{\3{\5{\u0643\n{\3{\5{\u0646\n{\3{\3{\5{\u064a\n{\3{\5{"+
		"\u064d\n{\3{\3{\5{\u0651\n{\3{\5{\u0654\n{\3|\3|\3|\3}\3}\3}\3~\3~\3~"+
		"\3\177\3\177\3\177\3\u0080\3\u0080\3\u0080\3\u0081\3\u0081\3\u0081\3\u0082"+
		"\3\u0082\3\u0082\3\u0083\3\u0083\3\u0083\3\u0084\5\u0084\u066f\n\u0084"+
		"\3\u0084\3\u0084\3\u0085\5\u0085\u0674\n\u0085\3\u0085\3\u0085\3\u0086"+
		"\5\u0086\u0679\n\u0086\3\u0086\3\u0086\3\u0087\5\u0087\u067e\n\u0087\3"+
		"\u0087\3\u0087\3\u0088\3\u0088\3\u0089\3\u0089\3\u0089\2\nXZ^`~\u0080"+
		"\u0082\u00be\u008a\2\4\6\b\n\f\16\20\22\24\26\30\32\34\36 \"$&(*,.\60"+
		"\62\64\668:<>@BDFHJLNPRTVXZ\\^`bdfhjlnprtvxz|~\u0080\u0082\u0084\u0086"+
		"\u0088\u008a\u008c\u008e\u0090\u0092\u0094\u0096\u0098\u009a\u009c\u009e"+
		"\u00a0\u00a2\u00a4\u00a6\u00a8\u00aa\u00ac\u00ae\u00b0\u00b2\u00b4\u00b6"+
		"\u00b8\u00ba\u00bc\u00be\u00c0\u00c2\u00c4\u00c6\u00c8\u00ca\u00cc\u00ce"+
		"\u00d0\u00d2\u00d4\u00d6\u00d8\u00da\u00dc\u00de\u00e0\u00e2\u00e4\u00e6"+
		"\u00e8\u00ea\u00ec\u00ee\u00f0\u00f2\u00f4\u00f6\u00f8\u00fa\u00fc\u00fe"+
		"\u0100\u0102\u0104\u0106\u0108\u010a\u010c\u010e\u0110\2\13\3\2Y_\3\2"+
		"\60\61\3\2OQ\5\2\b\b\n\n\25\25\4\2ciuz\3\2mn\b\2!\"%.\60\65\67ACDFi\4"+
		"\2\23\23\25\25\3\2ab\2\u0718\2\u0112\3\2\2\2\4\u0115\3\2\2\2\6\u011b\3"+
		"\2\2\2\b\u0145\3\2\2\2\n\u0147\3\2\2\2\f\u0150\3\2\2\2\16\u0164\3\2\2"+
		"\2\20\u016d\3\2\2\2\22\u0181\3\2\2\2\24\u018a\3\2\2\2\26\u01a2\3\2\2\2"+
		"\30\u01c2\3\2\2\2\32\u01c4\3\2\2\2\34\u01d2\3\2\2\2\36\u01d8\3\2\2\2 "+
		"\u01e2\3\2\2\2\"\u01e4\3\2\2\2$\u01e6\3\2\2\2&\u01e8\3\2\2\2(\u01ee\3"+
		"\2\2\2*\u01f7\3\2\2\2,\u01f9\3\2\2\2.\u0202\3\2\2\2\60\u0213\3\2\2\2\62"+
		"\u0217\3\2\2\2\64\u0219\3\2\2\2\66\u021b\3\2\2\28\u021f\3\2\2\2:\u0227"+
		"\3\2\2\2<\u023c\3\2\2\2>\u0250\3\2\2\2@\u0257\3\2\2\2B\u027a\3\2\2\2D"+
		"\u0288\3\2\2\2F\u028a\3\2\2\2H\u0292\3\2\2\2J\u0296\3\2\2\2L\u029f\3\2"+
		"\2\2N\u02b1\3\2\2\2P\u02b3\3\2\2\2R\u02bd\3\2\2\2T\u02d2\3\2\2\2V\u02e5"+
		"\3\2\2\2X\u02f4\3\2\2\2Z\u0304\3\2\2\2\\\u0318\3\2\2\2^\u032a\3\2\2\2"+
		"`\u0347\3\2\2\2b\u0358\3\2\2\2d\u0362\3\2\2\2f\u038a\3\2\2\2h\u038d\3"+
		"\2\2\2j\u0391\3\2\2\2l\u0395\3\2\2\2n\u039d\3\2\2\2p\u03a1\3\2\2\2r\u03a6"+
		"\3\2\2\2t\u03ac\3\2\2\2v\u03b6\3\2\2\2x\u03b9\3\2\2\2z\u03cd\3\2\2\2|"+
		"\u03d6\3\2\2\2~\u03e5\3\2\2\2\u0080\u03ff\3\2\2\2\u0082\u0412\3\2\2\2"+
		"\u0084\u0420\3\2\2\2\u0086\u0422\3\2\2\2\u0088\u043c\3\2\2\2\u008a\u043f"+
		"\3\2\2\2\u008c\u0445\3\2\2\2\u008e\u0448\3\2\2\2\u0090\u044d\3\2\2\2\u0092"+
		"\u045c\3\2\2\2\u0094\u0477\3\2\2\2\u0096\u0481\3\2\2\2\u0098\u0484\3\2"+
		"\2\2\u009a\u048e\3\2\2\2\u009c\u0492\3\2\2\2\u009e\u0494\3\2\2\2\u00a0"+
		"\u0497\3\2\2\2\u00a2\u04c9\3\2\2\2\u00a4\u04d9\3\2\2\2\u00a6\u04db\3\2"+
		"\2\2\u00a8\u04e4\3\2\2\2\u00aa\u04f0\3\2\2\2\u00ac\u0500\3\2\2\2\u00ae"+
		"\u0502\3\2\2\2\u00b0\u0504\3\2\2\2\u00b2\u0507\3\2\2\2\u00b4\u050a\3\2"+
		"\2\2\u00b6\u0510\3\2\2\2\u00b8\u0518\3\2\2\2\u00ba\u051a\3\2\2\2\u00bc"+
		"\u051c\3\2\2\2\u00be\u0529\3\2\2\2\u00c0\u0557\3\2\2\2\u00c2\u0569\3\2"+
		"\2\2\u00c4\u056e\3\2\2\2\u00c6\u0575\3\2\2\2\u00c8\u0597\3\2\2\2\u00ca"+
		"\u059f\3\2\2\2\u00cc\u05a1\3\2\2\2\u00ce\u05a3\3\2\2\2\u00d0\u05a5\3\2"+
		"\2\2\u00d2\u05a7\3\2\2\2\u00d4\u05a9\3\2\2\2\u00d6\u05b5\3\2\2\2\u00d8"+
		"\u05b7\3\2\2\2\u00da\u05b9\3\2\2\2\u00dc\u05bb\3\2\2\2\u00de\u05bd\3\2"+
		"\2\2\u00e0\u05c1\3\2\2\2\u00e2\u05c5\3\2\2\2\u00e4\u05c7\3\2\2\2\u00e6"+
		"\u05cb\3\2\2\2\u00e8\u05d5\3\2\2\2\u00ea\u05d7\3\2\2\2\u00ec\u05e8\3\2"+
		"\2\2\u00ee\u05f1\3\2\2\2\u00f0\u05f3\3\2\2\2\u00f2\u05f5\3\2\2\2\u00f4"+
		"\u0653\3\2\2\2\u00f6\u0655\3\2\2\2\u00f8\u0658\3\2\2\2\u00fa\u065b\3\2"+
		"\2\2\u00fc\u065e\3\2\2\2\u00fe\u0661\3\2\2\2\u0100\u0664\3\2\2\2\u0102"+
		"\u0667\3\2\2\2\u0104\u066a\3\2\2\2\u0106\u066e\3\2\2\2\u0108\u0673\3\2"+
		"\2\2\u010a\u0678\3\2\2\2\u010c\u067d\3\2\2\2\u010e\u0681\3\2\2\2\u0110"+
		"\u0683\3\2\2\2\u0112\u0113\5\6\4\2\u0113\u0114\7\2\2\3\u0114\3\3\2\2\2"+
		"\u0115\u0116\7s\2\2\u0116\5\3\2\2\2\u0117\u011a\5<\37\2\u0118\u011a\5"+
		"\4\3\2\u0119\u0117\3\2\2\2\u0119\u0118\3\2\2\2\u011a\u011d\3\2\2\2\u011b"+
		"\u0119\3\2\2\2\u011b\u011c\3\2\2\2\u011c\u0125\3\2\2\2\u011d\u011b\3\2"+
		"\2\2\u011e\u0126\5\f\7\2\u011f\u0126\5\20\t\2\u0120\u0126\5(\25\2\u0121"+
		"\u0126\5\36\20\2\u0122\u0126\5\24\13\2\u0123\u0126\5.\30\2\u0124\u0126"+
		"\5\4\3\2\u0125\u011e\3\2\2\2\u0125\u011f\3\2\2\2\u0125\u0120\3\2\2\2\u0125"+
		"\u0121\3\2\2\2\u0125\u0122\3\2\2\2\u0125\u0123\3\2\2\2\u0125\u0124\3\2"+
		"\2\2\u0126\u0133\3\2\2\2\u0127\u012f\7\t\2\2\u0128\u0130\5\f\7\2\u0129"+
		"\u0130\5\20\t\2\u012a\u0130\5(\25\2\u012b\u0130\5\36\20\2\u012c\u0130"+
		"\5\24\13\2\u012d\u0130\5.\30\2\u012e\u0130\5\4\3\2\u012f\u0128\3\2\2\2"+
		"\u012f\u0129\3\2\2\2\u012f\u012a\3\2\2\2\u012f\u012b\3\2\2\2\u012f\u012c"+
		"\3\2\2\2\u012f\u012d\3\2\2\2\u012f\u012e\3\2\2\2\u0130\u0132\3\2\2\2\u0131"+
		"\u0127\3\2\2\2\u0132\u0135\3\2\2\2\u0133\u0131\3\2\2\2\u0133\u0134\3\2"+
		"\2\2\u0134\u013d\3\2\2\2\u0135\u0133\3\2\2\2\u0136\u0139\7\t\2\2\u0137"+
		"\u013a\5\b\5\2\u0138\u013a\5\4\3\2\u0139\u0137\3\2\2\2\u0139\u0138\3\2"+
		"\2\2\u013a\u013c\3\2\2\2\u013b\u0136\3\2\2\2\u013c\u013f\3\2\2\2\u013d"+
		"\u013b\3\2\2\2\u013d\u013e\3\2\2\2\u013e\u0141\3\2\2\2\u013f\u013d\3\2"+
		"\2\2\u0140\u0142\7\t\2\2\u0141\u0140\3\2\2\2\u0141\u0142\3\2\2\2\u0142"+
		"\7\3\2\2\2\u0143\u0146\5L\'\2\u0144\u0146\5@!\2\u0145\u0143\3\2\2\2\u0145"+
		"\u0144\3\2\2\2\u0146\t\3\2\2\2\u0147\u0149\5\f\7\2\u0148\u014a\7\t\2\2"+
		"\u0149\u0148\3\2\2\2\u0149\u014a\3\2\2\2\u014a\u014b\3\2\2\2\u014b\u014c"+
		"\7\2\2\3\u014c\13\3\2\2\2\u014d\u014f\5:\36\2\u014e\u014d\3\2\2\2\u014f"+
		"\u0152\3\2\2\2\u0150\u014e\3\2\2\2\u0150\u0151\3\2\2\2\u0151\u0153\3\2"+
		"\2\2\u0152\u0150\3\2\2\2\u0153\u0154\7\"\2\2\u0154\u0155\7!\2\2\u0155"+
		"\u0156\5\u00e0q\2\u0156\u0157\7\f\2\2\u0157\u0158\5\u00d8m\2\u0158\u015f"+
		"\5\u00eav\2\u0159\u015a\7\20\2\2\u015a\u015b\5\u00d8m\2\u015b\u015c\5"+
		"\u00eav\2\u015c\u015e\3\2\2\2\u015d\u0159\3\2\2\2\u015e\u0161\3\2\2\2"+
		"\u015f\u015d\3\2\2\2\u015f\u0160\3\2\2\2\u0160\u0162\3\2\2\2\u0161\u015f"+
		"\3\2\2\2\u0162\u0163\7\r\2\2\u0163\r\3\2\2\2\u0164\u0166\5\20\t\2\u0165"+
		"\u0167\7\t\2\2\u0166\u0165\3\2\2\2\u0166\u0167\3\2\2\2\u0167\u0168\3\2"+
		"\2\2\u0168\u0169\7\2\2\3\u0169\17\3\2\2\2\u016a\u016c\5:\36\2\u016b\u016a"+
		"\3\2\2\2\u016c\u016f\3\2\2\2\u016d\u016b\3\2\2\2\u016d\u016e\3\2\2\2\u016e"+
		"\u0170\3\2\2\2\u016f\u016d\3\2\2\2\u0170\u0171\7\"\2\2\u0171\u0172\7%"+
		"\2\2\u0172\u0173\5\u00e0q\2\u0173\u0174\7\f\2\2\u0174\u0175\5\u00d8m\2"+
		"\u0175\u017c\5\u00eav\2\u0176\u0177\7\20\2\2\u0177\u0178\5\u00d8m\2\u0178"+
		"\u0179\5\u00eav\2\u0179\u017b\3\2\2\2\u017a\u0176\3\2\2\2\u017b\u017e"+
		"\3\2\2\2\u017c\u017a\3\2\2\2\u017c\u017d\3\2\2\2\u017d\u017f\3\2\2\2\u017e"+
		"\u017c\3\2\2\2\u017f\u0180\7\r\2\2\u0180\21\3\2\2\2\u0181\u0183\5\24\13"+
		"\2\u0182\u0184\7\t\2\2\u0183\u0182\3\2\2\2\u0183\u0184\3\2\2\2\u0184\u0185"+
		"\3\2\2\2\u0185\u0186\7\2\2\3\u0186\23\3\2\2\2\u0187\u0189\5:\36\2\u0188"+
		"\u0187\3\2\2\2\u0189\u018c\3\2\2\2\u018a\u0188\3\2\2\2\u018a\u018b\3\2"+
		"\2\2\u018b\u018d\3\2\2\2\u018c\u018a\3\2\2\2\u018d\u018e\7\"\2\2\u018e"+
		"\u018f\7)\2\2\u018f\u0190\5\u00e0q\2\u0190\u0191\7\f\2\2\u0191\u0192\5"+
		"\u00d8m\2\u0192\u0199\5\u00eav\2\u0193\u0194\7\20\2\2\u0194\u0195\5\u00d8"+
		"m\2\u0195\u0196\5\u00eav\2\u0196\u0198\3\2\2\2\u0197\u0193\3\2\2\2\u0198"+
		"\u019b\3\2\2\2\u0199\u0197\3\2\2\2\u0199\u019a\3\2\2\2\u019a\u019c\3\2"+
		"\2\2\u019b\u0199\3\2\2\2\u019c\u019d\7\r\2\2\u019d\u01a0\5\u00c0a\2\u019e"+
		"\u019f\7:\2\2\u019f\u01a1\5\u00aaV\2\u01a0\u019e\3\2\2\2\u01a0\u01a1\3"+
		"\2\2\2\u01a1\25\3\2\2\2\u01a2\u01a4\5\30\r\2\u01a3\u01a5\7\t\2\2\u01a4"+
		"\u01a3\3\2\2\2\u01a4\u01a5\3\2\2\2\u01a5\u01a6\3\2\2\2\u01a6\u01a7\7\2"+
		"\2\3\u01a7\27\3\2\2\2\u01a8\u01a9\7\'\2\2\u01a9\u01ab\5\32\16\2\u01aa"+
		"\u01ac\5\u0092J\2\u01ab\u01aa\3\2\2\2\u01ab\u01ac\3\2\2\2\u01ac\u01c3"+
		"\3\2\2\2\u01ad\u01ae\5\u0092J\2\u01ae\u01af\7\63\2\2\u01af\u01b0\79\2"+
		"\2\u01b0\u01b1\5\u00e2r\2\u01b1\u01c3\3\2\2\2\u01b2\u01b3\5\u0092J\2\u01b3"+
		"\u01b4\7\65\2\2\u01b4\u01b5\7C\2\2\u01b5\u01b6\7\63\2\2\u01b6\u01b7\7"+
		"9\2\2\u01b7\u01b9\5\u00e2r\2\u01b8\u01ba\5\u00a6T\2\u01b9\u01b8\3\2\2"+
		"\2\u01b9\u01ba\3\2\2\2\u01ba\u01bb\3\2\2\2\u01bb\u01bc\7F\2\2\u01bc\u01bd"+
		"\5\u00bc_\2\u01bd\u01c3\3\2\2\2\u01be\u01c0\5\u0092J\2\u01bf\u01be\3\2"+
		"\2\2\u01bf\u01c0\3\2\2\2\u01c0\u01c1\3\2\2\2\u01c1\u01c3\5\u00a4S\2\u01c2"+
		"\u01a8\3\2\2\2\u01c2\u01ad\3\2\2\2\u01c2\u01b2\3\2\2\2\u01c2\u01bf\3\2"+
		"\2\2\u01c3\31\3\2\2\2\u01c4\u01c7\5\u00d2j\2\u01c5\u01c6\7A\2\2\u01c6"+
		"\u01c8\5\u00d4k\2\u01c7\u01c5\3\2\2\2\u01c7\u01c8\3\2\2\2\u01c8\u01cb"+
		"\3\2\2\2\u01c9\u01ca\7F\2\2\u01ca\u01cc\5\u00bc_\2\u01cb\u01c9\3\2\2\2"+
		"\u01cb\u01cc\3\2\2\2\u01cc\u01d0\3\2\2\2\u01cd\u01ce\5\u00b4[\2\u01ce"+
		"\u01cf\5\u00b6\\\2\u01cf\u01d1\3\2\2\2\u01d0\u01cd\3\2\2\2\u01d0\u01d1"+
		"\3\2\2\2\u01d1\33\3\2\2\2\u01d2\u01d4\5\36\20\2\u01d3\u01d5\7\t\2\2\u01d4"+
		"\u01d3\3\2\2\2\u01d4\u01d5\3\2\2\2\u01d5\u01d6\3\2\2\2\u01d6\u01d7\7\2"+
		"\2\3\u01d7\35\3\2\2\2\u01d8\u01d9\7\"\2\2\u01d9\u01da\7#\2\2\u01da\u01db"+
		"\5 \21\2\u01db\u01dc\7\16\2\2\u01dc\u01dd\5\"\22\2\u01dd\u01de\7\17\2"+
		"\2\u01de\u01df\7\67\2\2\u01df\u01e0\5\u00eav\2\u01e0\u01e1\5$\23\2\u01e1"+
		"\37\3\2\2\2\u01e2\u01e3\5\u00f0y\2\u01e3!\3\2\2\2\u01e4\u01e5\5\u00f0"+
		"y\2\u01e5#\3\2\2\2\u01e6\u01e7\7t\2\2\u01e7%\3\2\2\2\u01e8\u01ea\5(\25"+
		"\2\u01e9\u01eb\7\t\2\2\u01ea\u01e9\3\2\2\2\u01ea\u01eb\3\2\2\2\u01eb\u01ec"+
		"\3\2\2\2\u01ec\u01ed\7\2\2\3\u01ed\'\3\2\2\2\u01ee\u01ef\7\"\2\2\u01ef"+
		"\u01f0\7$\2\2\u01f0\u01f1\5*\26\2\u01f1\u01f5\7B\2\2\u01f2\u01f3\7N\2"+
		"\2\u01f3\u01f6\5\u00f4{\2\u01f4\u01f6\5\u0110\u0089\2\u01f5\u01f2\3\2"+
		"\2\2\u01f5\u01f4\3\2\2\2\u01f6)\3\2\2\2\u01f7\u01f8\5\u00f0y\2\u01f8+"+
		"\3\2\2\2\u01f9\u01fb\5.\30\2\u01fa\u01fc\7\t\2\2\u01fb\u01fa\3\2\2\2\u01fb"+
		"\u01fc\3\2\2\2\u01fc\u01fd\3\2\2\2\u01fd\u01fe\7\2\2\3\u01fe-\3\2\2\2"+
		"\u01ff\u0201\5:\36\2\u0200\u01ff\3\2\2\2\u0201\u0204\3\2\2\2\u0202\u0200"+
		"\3\2\2\2\u0202\u0203\3\2\2\2\u0203\u0205\3\2\2\2\u0204\u0202\3\2\2\2\u0205"+
		"\u0206\7\"\2\2\u0206\u0207\7j\2\2\u0207\u0208\5\60\31\2\u0208\u0209\7"+
		"\'\2\2\u0209\u020a\5P)\2\u020a\u020b\5\u0090I\2\u020b\u020e\7k\2\2\u020c"+
		"\u020d\7,\2\2\u020d\u020f\5\u00c8e\2\u020e\u020c\3\2\2\2\u020e\u020f\3"+
		"\2\2\2\u020f\u0210\3\2\2\2\u0210\u0211\7N\2\2\u0211\u0212\5\62\32\2\u0212"+
		"/\3\2\2\2\u0213\u0214\5\u00f0y\2\u0214\61\3\2\2\2\u0215\u0218\5\66\34"+
		"\2\u0216\u0218\58\35\2\u0217\u0215\3\2\2\2\u0217\u0216\3\2\2\2\u0218\63"+
		"\3\2\2\2\u0219\u021a\t\2\2\2\u021a\65\3\2\2\2\u021b\u021c\5\64\33\2\u021c"+
		"\u021d\7\13\2\2\u021d\u021e\5\64\33\2\u021e\67\3\2\2\2\u021f\u0224\5\64"+
		"\33\2\u0220\u0221\7\20\2\2\u0221\u0223\5\64\33\2\u0222\u0220\3\2\2\2\u0223"+
		"\u0226\3\2\2\2\u0224\u0222\3\2\2\2\u0224\u0225\3\2\2\2\u02259\3\2\2\2"+
		"\u0226\u0224\3\2\2\2\u0227\u0228\7\36\2\2\u0228\u023a\5\u00e6t\2\u0229"+
		"\u022c\7\f\2\2\u022a\u022d\5> \2\u022b\u022d\5:\36\2\u022c\u022a\3\2\2"+
		"\2\u022c\u022b\3\2\2\2\u022d\u0235\3\2\2\2\u022e\u0231\7\20\2\2\u022f"+
		"\u0232\5> \2\u0230\u0232\5:\36\2\u0231\u022f\3\2\2\2\u0231\u0230\3\2\2"+
		"\2\u0232\u0234\3\2\2\2\u0233\u022e\3\2\2\2\u0234\u0237\3\2\2\2\u0235\u0233"+
		"\3\2\2\2\u0235\u0236\3\2\2\2\u0236\u0238\3\2\2\2\u0237\u0235\3\2\2\2\u0238"+
		"\u0239\7\r\2\2\u0239\u023b\3\2\2\2\u023a\u0229\3\2\2\2\u023a\u023b\3\2"+
		"\2\2\u023b;\3\2\2\2\u023c\u023d\7\36\2\2\u023d\u023e\7&\2\2\u023e\u023f"+
		"\7\b\2\2\u023f\u024b\5\u00e6t\2\u0240\u0241\7\f\2\2\u0241\u0246\5> \2"+
		"\u0242\u0243\7\20\2\2\u0243\u0245\5> \2\u0244\u0242\3\2\2\2\u0245\u0248"+
		"\3\2\2\2\u0246\u0244\3\2\2\2\u0246\u0247\3\2\2\2\u0247\u0249\3\2\2\2\u0248"+
		"\u0246\3\2\2\2\u0249\u024a\7\r\2\2\u024a\u024c\3\2\2\2\u024b\u0240\3\2"+
		"\2\2\u024b\u024c\3\2\2\2\u024c=\3\2\2\2\u024d\u024e\5\u00d6l\2\u024e\u024f"+
		"\7\21\2\2\u024f\u0251\3\2\2\2\u0250\u024d\3\2\2\2\u0250\u0251\3\2\2\2"+
		"\u0251\u0252\3\2\2\2\u0252\u0253\5\u00dco\2\u0253?\3\2\2\2\u0254\u0256"+
		"\5:\36\2\u0255\u0254\3\2\2\2\u0256\u0259\3\2\2\2\u0257\u0255\3\2\2\2\u0257"+
		"\u0258\3\2\2\2\u0258\u025a\3\2\2\2\u0259\u0257\3\2\2\2\u025a\u025b\7("+
		"\2\2\u025b\u025c\7J\2\2\u025c\u025d\7\f\2\2\u025d\u0262\5D#\2\u025e\u025f"+
		"\7\20\2\2\u025f\u0261\5D#\2\u0260\u025e\3\2\2\2\u0261\u0264\3\2\2\2\u0262"+
		"\u0260\3\2\2\2\u0262\u0263\3\2\2\2\u0263\u0265\3\2\2\2\u0264\u0262\3\2"+
		"\2\2\u0265\u0266\7\r\2\2\u0266\u0269\7K\2\2\u0267\u026a\5L\'\2\u0268\u026a"+
		"\5\4\3\2\u0269\u0267\3\2\2\2\u0269\u0268\3\2\2\2\u026a\u0272\3\2\2\2\u026b"+
		"\u026e\7\t\2\2\u026c\u026f\5L\'\2\u026d\u026f\5\4\3\2\u026e\u026c\3\2"+
		"\2\2\u026e\u026d\3\2\2\2\u026f\u0271\3\2\2\2\u0270\u026b\3\2\2\2\u0271"+
		"\u0274\3\2\2\2\u0272\u0270\3\2\2\2\u0272\u0273\3\2\2\2\u0273\u0276\3\2"+
		"\2\2\u0274\u0272\3\2\2\2\u0275\u0277\7\t\2\2\u0276\u0275\3\2\2\2\u0276"+
		"\u0277\3\2\2\2\u0277\u0278\3\2\2\2\u0278\u0279\7L\2\2\u0279A\3\2\2\2\u027a"+
		"\u027c\5@!\2\u027b\u027d\7\t\2\2\u027c\u027b\3\2\2\2\u027c\u027d\3\2\2"+
		"\2\u027d\u027e\3\2\2\2\u027e\u027f\7\2\2\3\u027fC\3\2\2\2\u0280\u0281"+
		"\5\u00ba^\2\u0281\u0282\7@\2\2\u0282\u0283\5\u00d0i\2\u0283\u0289\3\2"+
		"\2\2\u0284\u0285\5F$\2\u0285\u0286\7@\2\2\u0286\u0287\5\u00d0i\2\u0287"+
		"\u0289\3\2\2\2\u0288\u0280\3\2\2\2\u0288\u0284\3\2\2\2\u0289E\3\2\2\2"+
		"\u028a\u028f\5H%\2\u028b\u028c\7C\2\2\u028c\u028e\5H%\2\u028d\u028b\3"+
		"\2\2\2\u028e\u0291\3\2\2\2\u028f\u028d\3\2\2\2\u028f\u0290\3\2\2\2\u0290"+
		"G\3\2\2\2\u0291\u028f\3\2\2\2\u0292\u0293\5\u00bc_\2\u0293\u0294\7A\2"+
		"\2\u0294\u0295\5\u0110\u0089\2\u0295I\3\2\2\2\u0296\u0298\5L\'\2\u0297"+
		"\u0299\7\t\2\2\u0298\u0297\3\2\2\2\u0298\u0299\3\2\2\2\u0299\u029a\3\2"+
		"\2\2\u029a\u029b\7\2\2\3\u029bK\3\2\2\2\u029c\u029e\5:\36\2\u029d\u029c"+
		"\3\2\2\2\u029e\u02a1\3\2\2\2\u029f\u029d\3\2\2\2\u029f\u02a0\3\2\2\2\u02a0"+
		"\u02a2\3\2\2\2\u02a1\u029f\3\2\2\2\u02a2\u02a3\7\'\2\2\u02a3\u02a5\5N"+
		"(\2\u02a4\u02a6\5\u0092J\2\u02a5\u02a4\3\2\2\2\u02a5\u02a6\3\2\2\2\u02a6"+
		"\u02a8\3\2\2\2\u02a7\u02a9\5\u00acW\2\u02a8\u02a7\3\2\2\2\u02a8\u02a9"+
		"\3\2\2\2\u02a9\u02aa\3\2\2\2\u02aa\u02ab\5\u00a2R\2\u02abM\3\2\2\2\u02ac"+
		"\u02b2\5P)\2\u02ad\u02b2\5R*\2\u02ae\u02b2\5V,\2\u02af\u02b2\5v<\2\u02b0"+
		"\u02b2\5\u0088E\2\u02b1\u02ac\3\2\2\2\u02b1\u02ad\3\2\2\2\u02b1\u02ae"+
		"\3\2\2\2\u02b1\u02af\3\2\2\2\u02b1\u02b0\3\2\2\2\u02b2O\3\2\2\2\u02b3"+
		"\u02b5\5\u00e0q\2\u02b4\u02b6\5r:\2\u02b5\u02b4\3\2\2\2\u02b5\u02b6\3"+
		"\2\2\2\u02b6\u02b8\3\2\2\2\u02b7\u02b9\5\u008eH\2\u02b8\u02b7\3\2\2\2"+
		"\u02b8\u02b9\3\2\2\2\u02b9\u02bb\3\2\2\2\u02ba\u02bc\5r:\2\u02bb\u02ba"+
		"\3\2\2\2\u02bb\u02bc\3\2\2\2\u02bcQ\3\2\2\2\u02bd\u02c7\5T+\2\u02be\u02bf"+
		"\5\u00ecw\2\u02bf\u02c1\5T+\2\u02c0\u02c2\7X\2\2\u02c1\u02c0\3\2\2\2\u02c1"+
		"\u02c2\3\2\2\2\u02c2\u02c8\3\2\2\2\u02c3\u02c4\7X\2\2\u02c4\u02c5\5\u00ec"+
		"w\2\u02c5\u02c6\5T+\2\u02c6\u02c8\3\2\2\2\u02c7\u02be\3\2\2\2\u02c7\u02c3"+
		"\3\2\2\2\u02c8\u02cb\3\2\2\2\u02c9\u02ca\7F\2\2\u02ca\u02cc\5\u00bc_\2"+
		"\u02cb\u02c9\3\2\2\2\u02cb\u02cc\3\2\2\2\u02cc\u02d0\3\2\2\2\u02cd\u02ce"+
		"\5\u00b4[\2\u02ce\u02cf\5\u00b6\\\2\u02cf\u02d1\3\2\2\2\u02d0\u02cd\3"+
		"\2\2\2\u02d0\u02d1\3\2\2\2\u02d1S\3\2\2\2\u02d2\u02d4\5\u00e0q\2\u02d3"+
		"\u02d5\5r:\2\u02d4\u02d3\3\2\2\2\u02d4\u02d5\3\2\2\2\u02d5\u02d7\3\2\2"+
		"\2\u02d6\u02d8\5\u008eH\2\u02d7\u02d6\3\2\2\2\u02d7\u02d8\3\2\2\2\u02d8"+
		"\u02db\3\2\2\2\u02d9\u02da\7A\2\2\u02da\u02dc\5\u00d4k\2\u02db\u02d9\3"+
		"\2\2\2\u02db\u02dc\3\2\2\2\u02dcU\3\2\2\2\u02dd\u02df\5X-\2\u02de\u02e0"+
		"\5\u00b2Z\2\u02df\u02de\3\2\2\2\u02df\u02e0\3\2\2\2\u02e0\u02e6\3\2\2"+
		"\2\u02e1\u02e3\5\\/\2\u02e2\u02e4\5\u00b2Z\2\u02e3\u02e2\3\2\2\2\u02e3"+
		"\u02e4\3\2\2\2\u02e4\u02e6\3\2\2\2\u02e5\u02dd\3\2\2\2\u02e5\u02e1\3\2"+
		"\2\2\u02e6W\3\2\2\2\u02e7\u02e8\b-\1\2\u02e8\u02e9\7\f\2\2\u02e9\u02ea"+
		"\5X-\2\u02ea\u02eb\7\r\2\2\u02eb\u02f5\3\2\2\2\u02ec\u02ed\7N\2\2\u02ed"+
		"\u02ee\7\f\2\2\u02ee\u02ef\5Z.\2\u02ef\u02f0\7\r\2\2\u02f0\u02f5\3\2\2"+
		"\2\u02f1\u02f5\5Z.\2\u02f2\u02f3\7N\2\2\u02f3\u02f5\5b\62\2\u02f4\u02e7"+
		"\3\2\2\2\u02f4\u02ec\3\2\2\2\u02f4\u02f1\3\2\2\2\u02f4\u02f2\3\2\2\2\u02f5"+
		"\u02fb\3\2\2\2\u02f6\u02f7\f\5\2\2\u02f7\u02f8\7\37\2\2\u02f8\u02fa\5"+
		"X-\6\u02f9\u02f6\3\2\2\2\u02fa\u02fd\3\2\2\2\u02fb\u02f9\3\2\2\2\u02fb"+
		"\u02fc\3\2\2\2\u02fcY\3\2\2\2\u02fd\u02fb\3\2\2\2\u02fe\u02ff\b.\1\2\u02ff"+
		"\u0300\7\f\2\2\u0300\u0301\5Z.\2\u0301\u0302\7\r\2\2\u0302\u0305\3\2\2"+
		"\2\u0303\u0305\5b\62\2\u0304\u02fe\3\2\2\2\u0304\u0303\3\2\2\2\u0305\u030b"+
		"\3\2\2\2\u0306\u0307\f\4\2\2\u0307\u0308\7\37\2\2\u0308\u030a\5Z.\5\u0309"+
		"\u0306\3\2\2\2\u030a\u030d\3\2\2\2\u030b\u0309\3\2\2\2\u030b\u030c\3\2"+
		"\2\2\u030c[\3\2\2\2\u030d\u030b\3\2\2\2\u030e\u0310\7N\2\2\u030f\u030e"+
		"\3\2\2\2\u030f\u0310\3\2\2\2\u0310\u0311\3\2\2\2\u0311\u0312\7\f\2\2\u0312"+
		"\u0313\5\\/\2\u0313\u0314\7\r\2\2\u0314\u0319\3\2\2\2\u0315\u0319\5h\65"+
		"\2\u0316\u0319\5^\60\2\u0317\u0319\5`\61\2\u0318\u030f\3\2\2\2\u0318\u0315"+
		"\3\2\2\2\u0318\u0316\3\2\2\2\u0318\u0317\3\2\2\2\u0319]\3\2\2\2\u031a"+
		"\u031c\b\60\1\2\u031b\u031d\7N\2\2\u031c\u031b\3\2\2\2\u031c\u031d\3\2"+
		"\2\2\u031d\u031e\3\2\2\2\u031e\u031f\7\f\2\2\u031f\u0320\5^\60\2\u0320"+
		"\u0321\7\r\2\2\u0321\u032b\3\2\2\2\u0322\u0323\5h\65\2\u0323\u0324\7\37"+
		"\2\2\u0324\u0325\5X-\2\u0325\u032b\3\2\2\2\u0326\u0327\5X-\2\u0327\u0328"+
		"\7\37\2\2\u0328\u0329\5^\60\3\u0329\u032b\3\2\2\2\u032a\u031a\3\2\2\2"+
		"\u032a\u0322\3\2\2\2\u032a\u0326\3\2\2\2\u032b\u0334\3\2\2\2\u032c\u032d"+
		"\f\5\2\2\u032d\u032e\7\37\2\2\u032e\u0333\5^\60\6\u032f\u0330\f\4\2\2"+
		"\u0330\u0331\7\37\2\2\u0331\u0333\5h\65\2\u0332\u032c\3\2\2\2\u0332\u032f"+
		"\3\2\2\2\u0333\u0336\3\2\2\2\u0334\u0332\3\2\2\2\u0334\u0335\3\2\2\2\u0335"+
		"_\3\2\2\2\u0336\u0334\3\2\2\2\u0337\u0339\b\61\1\2\u0338\u033a\7N\2\2"+
		"\u0339\u0338\3\2\2\2\u0339\u033a\3\2\2\2\u033a\u033b\3\2\2\2\u033b\u033c"+
		"\7\f\2\2\u033c\u033d\5`\61\2\u033d\u033e\7\r\2\2\u033e\u0348\3\2\2\2\u033f"+
		"\u0340\5X-\2\u0340\u0341\7\37\2\2\u0341\u0342\5h\65\2\u0342\u0348\3\2"+
		"\2\2\u0343\u0344\5h\65\2\u0344\u0345\7\37\2\2\u0345\u0346\5`\61\4\u0346"+
		"\u0348\3\2\2\2\u0347\u0337\3\2\2\2\u0347\u033f\3\2\2\2\u0347\u0343\3\2"+
		"\2\2\u0348\u0351\3\2\2\2\u0349\u034a\f\5\2\2\u034a\u034b\7\37\2\2\u034b"+
		"\u0350\5`\61\6\u034c\u034d\f\3\2\2\u034d\u034e\7\37\2\2\u034e\u0350\5"+
		"X-\2\u034f\u0349\3\2\2\2\u034f\u034c\3\2\2\2\u0350\u0353\3\2\2\2\u0351"+
		"\u034f\3\2\2\2\u0351\u0352\3\2\2\2\u0352a\3\2\2\2\u0353\u0351\3\2\2\2"+
		"\u0354\u0359\5d\63\2\u0355\u0359\5l\67\2\u0356\u0359\5n8\2\u0357\u0359"+
		"\5f\64\2\u0358\u0354\3\2\2\2\u0358\u0355\3\2\2\2\u0358\u0356\3\2\2\2\u0358"+
		"\u0357\3\2\2\2\u0359c\3\2\2\2\u035a\u035b\5n8\2\u035b\u035c\7D\2\2\u035c"+
		"\u035d\5n8\2\u035d\u0363\3\2\2\2\u035e\u035f\5n8\2\u035f\u0360\7C\2\2"+
		"\u0360\u0361\5n8\2\u0361\u0363\3\2\2\2\u0362\u035a\3\2\2\2\u0362\u035e"+
		"\3\2\2\2\u0363e\3\2\2\2\u0364\u0365\7\f\2\2\u0365\u0366\5f\64\2\u0366"+
		"\u0367\7\r\2\2\u0367\u038b\3\2\2\2\u0368\u0369\5n8\2\u0369\u036a\7D\2"+
		"\2\u036a\u036b\7H\2\2\u036b\u036c\5p9\2\u036c\u038b\3\2\2\2\u036d\u036e"+
		"\7H\2\2\u036e\u036f\5p9\2\u036f\u0370\7D\2\2\u0370\u0371\5n8\2\u0371\u038b"+
		"\3\2\2\2\u0372\u0373\5n8\2\u0373\u0374\7D\2\2\u0374\u0375\5j\66\2\u0375"+
		"\u038b\3\2\2\2\u0376\u0377\5j\66\2\u0377\u0378\7D\2\2\u0378\u0379\5n8"+
		"\2\u0379\u038b\3\2\2\2\u037a\u037b\5j\66\2\u037b\u037c\7D\2\2\u037c\u037d"+
		"\5j\66\2\u037d\u038b\3\2\2\2\u037e\u037f\5n8\2\u037f\u0380\7C\2\2\u0380"+
		"\u0381\5j\66\2\u0381\u038b\3\2\2\2\u0382\u0383\5j\66\2\u0383\u0384\7C"+
		"\2\2\u0384\u0385\5n8\2\u0385\u038b\3\2\2\2\u0386\u0387\5j\66\2\u0387\u0388"+
		"\7C\2\2\u0388\u0389\5j\66\2\u0389\u038b\3\2\2\2\u038a\u0364\3\2\2\2\u038a"+
		"\u0368\3\2\2\2\u038a\u036d\3\2\2\2\u038a\u0372\3\2\2\2\u038a\u0376\3\2"+
		"\2\2\u038a\u037a\3\2\2\2\u038a\u037e\3\2\2\2\u038a\u0382\3\2\2\2\u038a"+
		"\u0386\3\2\2\2\u038bg\3\2\2\2\u038c\u038e\7N\2\2\u038d\u038c\3\2\2\2\u038d"+
		"\u038e\3\2\2\2\u038e\u038f\3\2\2\2\u038f\u0390\5j\66\2\u0390i\3\2\2\2"+
		"\u0391\u0392\7H\2\2\u0392\u0393\5p9\2\u0393\u0394\5\u00b0Y\2\u0394k\3"+
		"\2\2\2\u0395\u0396\5n8\2\u0396\u0397\7\30\2\2\u0397\u0398\5\u00e8u\2\u0398"+
		"\u0399\7\32\2\2\u0399m\3\2\2\2\u039a\u039b\5\u00e4s\2\u039b\u039c\7\21"+
		"\2\2\u039c\u039e\3\2\2\2\u039d\u039a\3\2\2\2\u039d\u039e\3\2\2\2\u039e"+
		"\u039f\3\2\2\2\u039f\u03a0\5p9\2\u03a0o\3\2\2\2\u03a1\u03a3\5\u00e0q\2"+
		"\u03a2\u03a4\5r:\2\u03a3\u03a2\3\2\2\2\u03a3\u03a4\3\2\2\2\u03a4q\3\2"+
		"\2\2\u03a5\u03a7\5t;\2\u03a6\u03a5\3\2\2\2\u03a7\u03a8\3\2\2\2\u03a8\u03a6"+
		"\3\2\2\2\u03a8\u03a9\3\2\2\2\u03a9s\3\2\2\2\u03aa\u03ad\5\u008aF\2\u03ab"+
		"\u03ad\5\u008cG\2\u03ac\u03aa\3\2\2\2\u03ac\u03ab\3\2\2\2\u03adu\3\2\2"+
		"\2\u03ae\u03b0\5x=\2\u03af\u03b1\5\u00b2Z\2\u03b0\u03af\3\2\2\2\u03b0"+
		"\u03b1\3\2\2\2\u03b1\u03b7\3\2\2\2\u03b2\u03b4\5z>\2\u03b3\u03b5\5\u00b2"+
		"Z\2\u03b4\u03b3\3\2\2\2\u03b4\u03b5\3\2\2\2\u03b5\u03b7\3\2\2\2\u03b6"+
		"\u03ae\3\2\2\2\u03b6\u03b2\3\2\2\2\u03b7w\3\2\2\2\u03b8\u03ba\7N\2\2\u03b9"+
		"\u03b8\3\2\2\2\u03b9\u03ba\3\2\2\2\u03ba\u03bb\3\2\2\2\u03bb\u03bc\5\u0084"+
		"C\2\u03bc\u03bd\7\20\2\2\u03bd\u03be\5\u0082B\2\u03bey\3\2\2\2\u03bf\u03c1"+
		"\7N\2\2\u03c0\u03bf\3\2\2\2\u03c0\u03c1\3\2\2\2\u03c1\u03c2\3\2\2\2\u03c2"+
		"\u03c3\5|?\2\u03c3\u03c4\7\20\2\2\u03c4\u03c5\5\u0082B\2\u03c5\u03ce\3"+
		"\2\2\2\u03c6\u03c8\7N\2\2\u03c7\u03c6\3\2\2\2\u03c7\u03c8\3\2\2\2\u03c8"+
		"\u03c9\3\2\2\2\u03c9\u03ca\5\u0084C\2\u03ca\u03cb\7\20\2\2\u03cb\u03cc"+
		"\5|?\2\u03cc\u03ce\3\2\2\2\u03cd\u03c0\3\2\2\2\u03cd\u03c7\3\2\2\2\u03ce"+
		"{\3\2\2\2\u03cf\u03d0\7\f\2\2\u03d0\u03d1\5|?\2\u03d1\u03d2\7\r\2\2\u03d2"+
		"\u03d7\3\2\2\2\u03d3\u03d7\5j\66\2\u03d4\u03d7\5~@\2\u03d5\u03d7\5\u0080"+
		"A\2\u03d6\u03cf\3\2\2\2\u03d6\u03d3\3\2\2\2\u03d6\u03d4\3\2\2\2\u03d6"+
		"\u03d5\3\2\2\2\u03d7}\3\2\2\2\u03d8\u03d9\b@\1\2\u03d9\u03da\7\f\2\2\u03da"+
		"\u03db\5~@\2\u03db\u03dc\7\r\2\2\u03dc\u03e6\3\2\2\2\u03dd\u03de\5j\66"+
		"\2\u03de\u03df\7\20\2\2\u03df\u03e0\5\u0082B\2\u03e0\u03e6\3\2\2\2\u03e1"+
		"\u03e2\5\u0082B\2\u03e2\u03e3\7\20\2\2\u03e3\u03e4\5~@\3\u03e4\u03e6\3"+
		"\2\2\2\u03e5\u03d8\3\2\2\2\u03e5\u03dd\3\2\2\2\u03e5\u03e1\3\2\2\2\u03e6"+
		"\u03ef\3\2\2\2\u03e7\u03e8\f\5\2\2\u03e8\u03e9\7\20\2\2\u03e9\u03ee\5"+
		"~@\6\u03ea\u03eb\f\4\2\2\u03eb\u03ec\7\20\2\2\u03ec\u03ee\5j\66\2\u03ed"+
		"\u03e7\3\2\2\2\u03ed\u03ea\3\2\2\2\u03ee\u03f1\3\2\2\2\u03ef\u03ed\3\2"+
		"\2\2\u03ef\u03f0\3\2\2\2\u03f0\177\3\2\2\2\u03f1\u03ef\3\2\2\2\u03f2\u03f3"+
		"\bA\1\2\u03f3\u03f4\7\f\2\2\u03f4\u03f5\5\u0080A\2\u03f5\u03f6\7\r\2\2"+
		"\u03f6\u0400\3\2\2\2\u03f7\u03f8\5\u0082B\2\u03f8\u03f9\7\20\2\2\u03f9"+
		"\u03fa\5j\66\2\u03fa\u0400\3\2\2\2\u03fb\u03fc\5j\66\2\u03fc\u03fd\7\20"+
		"\2\2\u03fd\u03fe\5\u0080A\4\u03fe\u0400\3\2\2\2\u03ff\u03f2\3\2\2\2\u03ff"+
		"\u03f7\3\2\2\2\u03ff\u03fb\3\2\2\2\u0400\u0409\3\2\2\2\u0401\u0402\f\5"+
		"\2\2\u0402\u0403\7\20\2\2\u0403\u0408\5\u0080A\6\u0404\u0405\f\3\2\2\u0405"+
		"\u0406\7\20\2\2\u0406\u0408\5\u0082B\2\u0407\u0401\3\2\2\2\u0407\u0404"+
		"\3\2\2\2\u0408\u040b\3\2\2\2\u0409\u0407\3\2\2\2\u0409\u040a\3\2\2\2\u040a"+
		"\u0081\3\2\2\2\u040b\u0409\3\2\2\2\u040c\u040d\bB\1\2\u040d\u040e\7\f"+
		"\2\2\u040e\u040f\5\u0082B\2\u040f\u0410\7\r\2\2\u0410\u0413\3\2\2\2\u0411"+
		"\u0413\5\u0084C\2\u0412\u040c\3\2\2\2\u0412\u0411\3\2\2\2\u0413\u0419"+
		"\3\2\2\2\u0414\u0415\f\4\2\2\u0415\u0416\7\20\2\2\u0416\u0418\5\u0082"+
		"B\5\u0417\u0414\3\2\2\2\u0418\u041b\3\2\2\2\u0419\u0417\3\2\2\2\u0419"+
		"\u041a\3\2\2\2\u041a\u0083\3\2\2\2\u041b\u0419\3\2\2\2\u041c\u0421\5d"+
		"\63\2\u041d\u0421\5\u0086D\2\u041e\u0421\5n8\2\u041f\u0421\5f\64\2\u0420"+
		"\u041c\3\2\2\2\u0420\u041d\3\2\2\2\u0420\u041e\3\2\2\2\u0420\u041f\3\2"+
		"\2\2\u0421\u0085\3\2\2\2\u0422\u042a\5n8\2\u0423\u0424\7\30\2\2\u0424"+
		"\u0425\5\u00e8u\2\u0425\u0426\7\32\2\2\u0426\u042b\3\2\2\2\u0427\u042b"+
		"\7\22\2\2\u0428\u042b\7\24\2\2\u0429\u042b\7\23\2\2\u042a\u0423\3\2\2"+
		"\2\u042a\u0427\3\2\2\2\u042a\u0428\3\2\2\2\u042a\u0429\3\2\2\2\u042b\u0087"+
		"\3\2\2\2\u042c\u042d\7\f\2\2\u042d\u042e\5\u0088E\2\u042e\u042f\7\r\2"+
		"\2\u042f\u043d\3\2\2\2\u0430\u0431\7\'\2\2\u0431\u0433\5N(\2\u0432\u0434"+
		"\5\u0092J\2\u0433\u0432\3\2\2\2\u0433\u0434\3\2\2\2\u0434\u0436\3\2\2"+
		"\2\u0435\u0437\5\u00acW\2\u0436\u0435\3\2\2\2\u0436\u0437\3\2\2\2\u0437"+
		"\u0438\3\2\2\2\u0438\u043a\7\67\2\2\u0439\u043b\5\u00aaV\2\u043a\u0439"+
		"\3\2\2\2\u043a\u043b\3\2\2\2\u043b\u043d\3\2\2\2\u043c\u042c\3\2\2\2\u043c"+
		"\u0430\3\2\2\2\u043d\u0089\3\2\2\2\u043e\u0440\7 \2\2\u043f\u043e\3\2"+
		"\2\2\u043f\u0440\3\2\2\2\u0440\u0441\3\2\2\2\u0441\u0442\7\16\2\2\u0442"+
		"\u0443\5\u00bc_\2\u0443\u0444\7\17\2\2\u0444\u008b\3\2\2\2\u0445\u0446"+
		"\7 \2\2\u0446\u0447\5\u00c0a\2\u0447\u008d\3\2\2\2\u0448\u0449\7 \2\2"+
		"\u0449\u044a\7)\2\2\u044a\u044b\7\n\2\2\u044b\u044c\5\u00c0a\2\u044c\u008f"+
		"\3\2\2\2\u044d\u0457\7*\2\2\u044e\u0458\7\22\2\2\u044f\u0454\5\u00b8]"+
		"\2\u0450\u0451\7\20\2\2\u0451\u0453\5\u00b8]\2\u0452\u0450\3\2\2\2\u0453"+
		"\u0456\3\2\2\2\u0454\u0452\3\2\2\2\u0454\u0455\3\2\2\2\u0455\u0458\3\2"+
		"\2\2\u0456\u0454\3\2\2\2\u0457\u044e\3\2\2\2\u0457\u044f\3\2\2\2\u0458"+
		"\u045a\3\2\2\2\u0459\u045b\5\u0094K\2\u045a\u0459\3\2\2\2\u045a\u045b"+
		"\3\2\2\2\u045b\u0091\3\2\2\2\u045c\u0466\7*\2\2\u045d\u0467\7\22\2\2\u045e"+
		"\u0463\5\u00b8]\2\u045f\u0460\7\20\2\2\u0460\u0462\5\u00b8]\2\u0461\u045f"+
		"\3\2\2\2\u0462\u0465\3\2\2\2\u0463\u0461\3\2\2\2\u0463\u0464\3\2\2\2\u0464"+
		"\u0467\3\2\2\2\u0465\u0463\3\2\2\2\u0466\u045d\3\2\2\2\u0466\u045e\3\2"+
		"\2\2\u0467\u0469\3\2\2\2\u0468\u046a\5\u0094K\2\u0469\u0468\3\2\2\2\u0469"+
		"\u046a\3\2\2\2\u046a\u046c\3\2\2\2\u046b\u046d\5\u0096L\2\u046c\u046b"+
		"\3\2\2\2\u046c\u046d\3\2\2\2\u046d\u046f\3\2\2\2\u046e\u0470\5\u0098M"+
		"\2\u046f\u046e\3\2\2\2\u046f\u0470\3\2\2\2\u0470\u0472\3\2\2\2\u0471\u0473"+
		"\5\u009eP\2\u0472\u0471\3\2\2\2\u0472\u0473\3\2\2\2\u0473\u0475\3\2\2"+
		"\2\u0474\u0476\5\u00a0Q\2\u0475\u0474\3\2\2\2\u0475\u0476\3\2\2\2\u0476"+
		"\u0093\3\2\2\2\u0477\u0478\7+\2\2\u0478\u0479\7,\2\2\u0479\u047e\5\u00c8"+
		"e\2\u047a\u047b\7\20\2\2\u047b\u047d\5\u00c8e\2\u047c\u047a\3\2\2\2\u047d"+
		"\u0480\3\2\2\2\u047e\u047c\3\2\2\2\u047e\u047f\3\2\2\2\u047f\u0095\3\2"+
		"\2\2\u0480\u047e\3\2\2\2\u0481\u0482\7\62\2\2\u0482\u0483\5\u00bc_\2\u0483"+
		"\u0097\3\2\2\2\u0484\u0485\7-\2\2\u0485\u0486\7,\2\2\u0486\u048b\5\u009a"+
		"N\2\u0487\u0488\7\20\2\2\u0488\u048a\5\u009aN\2\u0489\u0487\3\2\2\2\u048a"+
		"\u048d\3\2\2\2\u048b\u0489\3\2\2\2\u048b\u048c\3\2\2\2\u048c\u0099\3\2"+
		"\2\2\u048d\u048b\3\2\2\2\u048e\u0490\5\u00c8e\2\u048f\u0491\5\u009cO\2"+
		"\u0490\u048f\3\2\2\2\u0490\u0491\3\2\2\2\u0491\u009b\3\2\2\2\u0492\u0493"+
		"\t\3\2\2\u0493\u009d\3\2\2\2\u0494\u0495\7.\2\2\u0495\u0496\5\u00bc_\2"+
		"\u0496\u009f\3\2\2\2\u0497\u0498\7/\2\2\u0498\u0499\5\u00bc_\2\u0499\u00a1"+
		"\3\2\2\2\u049a\u049c\7\63\2\2\u049b\u049d\5\u00aaV\2\u049c\u049b\3\2\2"+
		"\2\u049c\u049d\3\2\2\2\u049d\u049e\3\2\2\2\u049e\u049f\79\2\2\u049f\u04ca"+
		"\5\u00e2r\2\u04a0\u04a1\7\64\2\2\u04a1\u04a4\5\u00e2r\2\u04a2\u04a3\7"+
		">\2\2\u04a3\u04a5\5\u00aaV\2\u04a4\u04a2\3\2\2\2\u04a4\u04a5\3\2\2\2\u04a5"+
		"\u04a8\3\2\2\2\u04a6\u04a7\7F\2\2\u04a7\u04a9\5\u00bc_\2\u04a8\u04a6\3"+
		"\2\2\2\u04a8\u04a9\3\2\2\2\u04a9\u04ca\3\2\2\2\u04aa\u04ab\7\65\2\2\u04ab"+
		"\u04ac\7C\2\2\u04ac\u04ad\7\63\2\2\u04ad\u04ae\79\2\2\u04ae\u04b1\5\u00e2"+
		"r\2\u04af\u04b0\7>\2\2\u04b0\u04b2\5\u00aaV\2\u04b1\u04af\3\2\2\2\u04b1"+
		"\u04b2\3\2\2\2\u04b2\u04b4\3\2\2\2\u04b3\u04b5\5\u00a6T\2\u04b4\u04b3"+
		"\3\2\2\2\u04b4\u04b5\3\2\2\2\u04b5\u04b6\3\2\2\2\u04b6\u04b7\7F\2\2\u04b7"+
		"\u04b8\5\u00bc_\2\u04b8\u04ca\3\2\2\2\u04b9\u04ba\7\65\2\2\u04ba\u04bd"+
		"\5\u00e2r\2\u04bb\u04bc\7>\2\2\u04bc\u04be\5\u00aaV\2\u04bd\u04bb\3\2"+
		"\2\2\u04bd\u04be\3\2\2\2\u04be\u04c0\3\2\2\2\u04bf\u04c1\5\u00a6T\2\u04c0"+
		"\u04bf\3\2\2\2\u04c0\u04c1\3\2\2\2\u04c1\u04c2\3\2\2\2\u04c2\u04c3\7F"+
		"\2\2\u04c3\u04c4\5\u00bc_\2\u04c4\u04ca\3\2\2\2\u04c5\u04c7\7\67\2\2\u04c6"+
		"\u04c8\5\u00aaV\2\u04c7\u04c6\3\2\2\2\u04c7\u04c8\3\2\2\2\u04c8\u04ca"+
		"\3\2\2\2\u04c9\u049a\3\2\2\2\u04c9\u04a0\3\2\2\2\u04c9\u04aa\3\2\2\2\u04c9"+
		"\u04b9\3\2\2\2\u04c9\u04c5\3\2\2\2\u04ca\u00a3\3\2\2\2\u04cb\u04cc\7\64"+
		"\2\2\u04cc\u04cf\5\u00e2r\2\u04cd\u04ce\7F\2\2\u04ce\u04d0\5\u00bc_\2"+
		"\u04cf\u04cd\3\2\2\2\u04cf\u04d0\3\2\2\2\u04d0\u04da\3\2\2\2\u04d1\u04d2"+
		"\7\65\2\2\u04d2\u04d4\5\u00e2r\2\u04d3\u04d5\5\u00a6T\2\u04d4\u04d3\3"+
		"\2\2\2\u04d4\u04d5\3\2\2\2\u04d5\u04d6\3\2\2\2\u04d6\u04d7\7F\2\2\u04d7"+
		"\u04d8\5\u00bc_\2\u04d8\u04da\3\2\2\2\u04d9\u04cb\3\2\2\2\u04d9\u04d1"+
		"\3\2\2\2\u04da\u00a5\3\2\2\2\u04db\u04dc\7\66\2\2\u04dc\u04e1\5\u00a8"+
		"U\2\u04dd\u04de\7\20\2\2\u04de\u04e0\5\u00a8U\2\u04df\u04dd\3\2\2\2\u04e0"+
		"\u04e3\3\2\2\2\u04e1\u04df\3\2\2\2\u04e1\u04e2\3\2\2\2\u04e2\u00a7\3\2"+
		"\2\2\u04e3\u04e1\3\2\2\2\u04e4\u04e5\5\u00c8e\2\u04e5\u04e6\7\21\2\2\u04e6"+
		"\u04e7\5\u00bc_\2\u04e7\u00a9\3\2\2\2\u04e8\u04e9\7P\2\2\u04e9\u04f1\7"+
		"8\2\2\u04ea\u04eb\7;\2\2\u04eb\u04f1\78\2\2\u04ec\u04ee\7<\2\2\u04ed\u04ec"+
		"\3\2\2\2\u04ed\u04ee\3\2\2\2\u04ee\u04ef\3\2\2\2\u04ef\u04f1\78\2\2\u04f0"+
		"\u04e8\3\2\2\2\u04f0\u04ea\3\2\2\2\u04f0\u04ed\3\2\2\2\u04f1\u00ab\3\2"+
		"\2\2\u04f2\u04f4\7:\2\2\u04f3\u04f5\5\u00aeX\2\u04f4\u04f3\3\2\2\2\u04f4"+
		"\u04f5\3\2\2\2\u04f5\u04f6\3\2\2\2\u04f6\u04fa\7N\2\2\u04f7\u04fb\5\u00f4"+
		"{\2\u04f8\u04f9\7\4\2\2\u04f9\u04fb\78\2\2\u04fa\u04f7\3\2\2\2\u04fa\u04f8"+
		"\3\2\2\2\u04fb\u0501\3\2\2\2\u04fc\u04fd\7:\2\2\u04fd\u04fe\7=\2\2\u04fe"+
		"\u04ff\7N\2\2\u04ff\u0501\5\u00f4{\2\u0500\u04f2\3\2\2\2\u0500\u04fc\3"+
		"\2\2\2\u0501\u00ad\3\2\2\2\u0502\u0503\t\4\2\2\u0503\u00af\3\2\2\2\u0504"+
		"\u0505\7>\2\2\u0505\u0506\5\u00f4{\2\u0506\u00b1\3\2\2\2\u0507\u0508\7"+
		"I\2\2\u0508\u0509\5\u00f4{\2\u0509\u00b3\3\2\2\2\u050a\u050b\7I\2\2\u050b"+
		"\u050e\5\u00bc_\2\u050c\u050d\7\20\2\2\u050d\u050f\5\u00bc_\2\u050e\u050c"+
		"\3\2\2\2\u050e\u050f\3\2\2\2\u050f\u00b5\3\2\2\2\u0510\u0511\7l\2\2\u0511"+
		"\u0512\5\u00bc_\2\u0512\u00b7\3\2\2\2\u0513\u0514\5\u00ba^\2\u0514\u0515"+
		"\7A\2\2\u0515\u0516\5\u00d8m\2\u0516\u0519\3\2\2\2\u0517\u0519\5\u00c8"+
		"e\2\u0518\u0513\3\2\2\2\u0518\u0517\3\2\2\2\u0519\u00b9\3\2\2\2\u051a"+
		"\u051b\5\u00be`\2\u051b\u00bb\3\2\2\2\u051c\u051d\5\u00be`\2\u051d\u00bd"+
		"\3\2\2\2\u051e\u051f\b`\1\2\u051f\u0520\7\f\2\2\u0520\u0521\5\u00be`\2"+
		"\u0521\u0522\7\r\2\2\u0522\u052a\3\2\2\2\u0523\u052a\5\u00c4c\2\u0524"+
		"\u0525\7H\2\2\u0525\u052a\5\u00be`\r\u0526\u052a\5\u00c0a\2\u0527\u052a"+
		"\5\u00eex\2\u0528\u052a\5\u00c8e\2\u0529\u051e\3\2\2\2\u0529\u0523\3\2"+
		"\2\2\u0529\u0524\3\2\2\2\u0529\u0526\3\2\2\2\u0529\u0527\3\2\2\2\u0529"+
		"\u0528\3\2\2\2\u052a\u0551\3\2\2\2\u052b\u052f\f\f\2\2\u052c\u0530\7\22"+
		"\2\2\u052d\u0530\7\26\2\2\u052e\u0530\7\27\2\2\u052f\u052c\3\2\2\2\u052f"+
		"\u052d\3\2\2\2\u052f\u052e\3\2\2\2\u0530\u0531\3\2\2\2\u0531\u0550\5\u00be"+
		"`\r\u0532\u0535\f\13\2\2\u0533\u0536\7\23\2\2\u0534\u0536\7\25\2\2\u0535"+
		"\u0533\3\2\2\2\u0535\u0534\3\2\2\2\u0536\u0537\3\2\2\2\u0537\u0550\5\u00be"+
		"`\f\u0538\u053d\f\n\2\2\u0539\u053e\7\33\2\2\u053a\u053e\7\31\2\2\u053b"+
		"\u053e\7\32\2\2\u053c\u053e\7\30\2\2\u053d\u0539\3\2\2\2\u053d\u053a\3"+
		"\2\2\2\u053d\u053b\3\2\2\2\u053d\u053c\3\2\2\2\u053e\u053f\3\2\2\2\u053f"+
		"\u0550\5\u00be`\13\u0540\u0543\f\t\2\2\u0541\u0544\7\34\2\2\u0542\u0544"+
		"\7\35\2\2\u0543\u0541\3\2\2\2\u0543\u0542\3\2\2\2\u0544\u0545\3\2\2\2"+
		"\u0545\u0550\5\u00be`\n\u0546\u0547\f\7\2\2\u0547\u0548\7D\2\2\u0548\u0550"+
		"\5\u00be`\b\u0549\u054a\f\6\2\2\u054a\u054b\7C\2\2\u054b\u0550\5\u00be"+
		"`\7\u054c\u054d\f\b\2\2\u054d\u054e\7E\2\2\u054e\u0550\5\u00e6t\2\u054f"+
		"\u052b\3\2\2\2\u054f\u0532\3\2\2\2\u054f\u0538\3\2\2\2\u054f\u0540\3\2"+
		"\2\2\u054f\u0546\3\2\2\2\u054f\u0549\3\2\2\2\u054f\u054c\3\2\2\2\u0550"+
		"\u0553\3\2\2\2\u0551\u054f\3\2\2\2\u0551\u0552\3\2\2\2\u0552\u00bf\3\2"+
		"\2\2\u0553\u0551\3\2\2\2\u0554\u0555\5\u00ceh\2\u0555\u0556\7\b\2\2\u0556"+
		"\u0558\3\2\2\2\u0557\u0554\3\2\2\2\u0557\u0558\3\2\2\2\u0558\u0559\3\2"+
		"\2\2\u0559\u055a\5\u00ccg\2\u055a\u055c\7\f\2\2\u055b\u055d\5\u00c2b\2"+
		"\u055c\u055b\3\2\2\2\u055c\u055d\3\2\2\2\u055d\u055e\3\2\2\2\u055e\u055f"+
		"\7\r\2\2\u055f\u00c1\3\2\2\2\u0560\u0565\5\u00ba^\2\u0561\u0562\7\20\2"+
		"\2\u0562\u0564\5\u00ba^\2\u0563\u0561\3\2\2\2\u0564\u0567\3\2\2\2\u0565"+
		"\u0563\3\2\2\2\u0565\u0566\3\2\2\2\u0566\u056a\3\2\2\2\u0567\u0565\3\2"+
		"\2\2\u0568\u056a\7\22\2\2\u0569\u0560\3\2\2\2\u0569\u0568\3\2\2\2\u056a"+
		"\u00c3\3\2\2\2\u056b\u056f\5\u00c6d\2\u056c\u056f\5\u00c8e\2\u056d\u056f"+
		"\5\u00c0a\2\u056e\u056b\3\2\2\2\u056e\u056c\3\2\2\2\u056e\u056d\3\2\2"+
		"\2\u056f\u0570\3\2\2\2\u0570\u0571\7G\2\2\u0571\u0572\7M\2\2\u0572\u00c5"+
		"\3\2\2\2\u0573\u0576\7 \2\2\u0574\u0576\7\3\2\2\u0575\u0573\3\2\2\2\u0575"+
		"\u0574\3\2\2\2\u0575\u0576\3\2\2\2\u0576\u0577\3\2\2\2\u0577\u057c\5\u00e6"+
		"t\2\u0578\u0579\7\16\2\2\u0579\u057a\5\u00caf\2\u057a\u057b\7\17\2\2\u057b"+
		"\u057d\3\2\2\2\u057c\u0578\3\2\2\2\u057c\u057d\3\2\2\2\u057d\u00c7\3\2"+
		"\2\2\u057e\u0581\7 \2\2\u057f\u0581\7\3\2\2\u0580\u057e\3\2\2\2\u0580"+
		"\u057f\3\2\2\2\u0580\u0581\3\2\2\2\u0581\u0582\3\2\2\2\u0582\u0587\5\u00e6"+
		"t\2\u0583\u0584\7\16\2\2\u0584\u0585\5\u00caf\2\u0585\u0586\7\17\2\2\u0586"+
		"\u0588\3\2\2\2\u0587\u0583\3\2\2\2\u0587\u0588\3\2\2\2\u0588\u0591\3\2"+
		"\2\2\u0589\u058a\7 \2\2\u058a\u058f\5\u00e6t\2\u058b\u058c\7\16\2\2\u058c"+
		"\u058d\5\u00caf\2\u058d\u058e\7\17\2\2\u058e\u0590\3\2\2\2\u058f\u058b"+
		"\3\2\2\2\u058f\u0590\3\2\2\2\u0590\u0592\3\2\2\2\u0591\u0589\3\2\2\2\u0591"+
		"\u0592\3\2\2\2\u0592\u0593\3\2\2\2\u0593\u0594\7\n\2\2\u0594\u0595\5\u00d8"+
		"m\2\u0595\u0598\3\2\2\2\u0596\u0598\5\u00d8m\2\u0597\u0580\3\2\2\2\u0597"+
		"\u0596\3\2\2\2\u0598\u00c9\3\2\2\2\u0599\u05a0\7\4\2\2\u059a\u059d\7O"+
		"\2\2\u059b\u059c\7\25\2\2\u059c\u059e\7\4\2\2\u059d\u059b\3\2\2\2\u059d"+
		"\u059e\3\2\2\2\u059e\u05a0\3\2\2\2\u059f\u0599\3\2\2\2\u059f\u059a\3\2"+
		"\2\2\u05a0\u00cb\3\2\2\2\u05a1\u05a2\5\u00e6t\2\u05a2\u00cd\3\2\2\2\u05a3"+
		"\u05a4\5\u00e6t\2\u05a4\u00cf\3\2\2\2\u05a5\u05a6\5\u00e6t\2\u05a6\u00d1"+
		"\3\2\2\2\u05a7\u05a8\5\u00e6t\2\u05a8\u00d3\3\2\2\2\u05a9\u05aa\5\u00e6"+
		"t\2\u05aa\u00d5\3\2\2\2\u05ab\u05b1\5\u00e6t\2\u05ac\u05ad\5\u00dep\2"+
		"\u05ad\u05ae\5\u00e6t\2\u05ae\u05b0\3\2\2\2\u05af\u05ac\3\2\2\2\u05b0"+
		"\u05b3\3\2\2\2\u05b1\u05af\3\2\2\2\u05b1\u05b2\3\2\2\2\u05b2\u05b6\3\2"+
		"\2\2\u05b3\u05b1\3\2\2\2\u05b4\u05b6\5\u0110\u0089\2\u05b5\u05ab\3\2\2"+
		"\2\u05b5\u05b4\3\2\2\2\u05b6\u00d7\3\2\2\2\u05b7\u05b8\5\u00e6t\2\u05b8"+
		"\u00d9\3\2\2\2\u05b9\u05ba\5\u00e6t\2\u05ba\u00db\3\2\2\2\u05bb\u05bc"+
		"\5\u0110\u0089\2\u05bc\u00dd\3\2\2\2\u05bd\u05be\t\5\2\2\u05be\u00df\3"+
		"\2\2\2\u05bf\u05c2\7 \2\2\u05c0\u05c2\7\3\2\2\u05c1\u05bf\3\2\2\2\u05c1"+
		"\u05c0\3\2\2\2\u05c1\u05c2\3\2\2\2\u05c2\u05c3\3\2\2\2\u05c3\u05c4\5\u00d0"+
		"i\2\u05c4\u00e1\3\2\2\2\u05c5\u05c6\5\u00e0q\2\u05c6\u00e3\3\2\2\2\u05c7"+
		"\u05c8\5\u00e6t\2\u05c8\u00e5\3\2\2\2\u05c9\u05cc\5\u00f0y\2\u05ca\u05cc"+
		"\5\u00f2z\2\u05cb\u05c9\3\2\2\2\u05cb\u05ca\3\2\2\2\u05cc\u00e7\3\2\2"+
		"\2\u05cd\u05ce\7\4\2\2\u05ce\u05cf\7\b\2\2\u05cf\u05d6\7\4\2\2\u05d0\u05d1"+
		"\7\4\2\2\u05d1\u05d6\7\b\2\2\u05d2\u05d3\7\b\2\2\u05d3\u05d6\7\4\2\2\u05d4"+
		"\u05d6\7\4\2\2\u05d5\u05cd\3\2\2\2\u05d5\u05d0\3\2\2\2\u05d5\u05d2\3\2"+
		"\2\2\u05d5\u05d4\3\2\2\2\u05d6\u00e9\3\2\2\2\u05d7\u05d8\t\6\2\2\u05d8"+
		"\u00eb\3\2\2\2\u05d9\u05da\7V\2\2\u05da\u05db\7T\2\2\u05db\u05e9\7R\2"+
		"\2\u05dc\u05dd\7U\2\2\u05dd\u05de\7T\2\2\u05de\u05e9\7R\2\2\u05df\u05e0"+
		"\7W\2\2\u05e0\u05e1\7T\2\2\u05e1\u05e9\7R\2\2\u05e2\u05e3\7T\2\2\u05e3"+
		"\u05e9\7R\2\2\u05e4\u05e6\7S\2\2\u05e5\u05e4\3\2\2\2\u05e5\u05e6\3\2\2"+
		"\2\u05e6\u05e7\3\2\2\2\u05e7\u05e9\7R\2\2\u05e8\u05d9\3\2\2\2\u05e8\u05dc"+
		"\3\2\2\2\u05e8\u05df\3\2\2\2\u05e8\u05e2\3\2\2\2\u05e8\u05e5\3\2\2\2\u05e9"+
		"\u00ed\3\2\2\2\u05ea\u05f2\5\u010e\u0088\2\u05eb\u05f2\5\u0106\u0084\2"+
		"\u05ec\u05f2\5\u010a\u0086\2\u05ed\u05f2\5\u0108\u0085\2\u05ee\u05f2\5"+
		"\u010c\u0087\2\u05ef\u05f2\5\u00f4{\2\u05f0\u05f2\5\u0110\u0089\2\u05f1"+
		"\u05ea\3\2\2\2\u05f1\u05eb\3\2\2\2\u05f1\u05ec\3\2\2\2\u05f1\u05ed\3\2"+
		"\2\2\u05f1\u05ee\3\2\2\2\u05f1\u05ef\3\2\2\2\u05f1\u05f0\3\2\2\2\u05f2"+
		"\u00ef\3\2\2\2\u05f3\u05f4\t\7\2\2\u05f4\u00f1\3\2\2\2\u05f5\u05f6\t\b"+
		"\2\2\u05f6\u00f3\3\2\2\2\u05f7\u05f9\5\u00f6|\2\u05f8\u05fa\5\u00f8}\2"+
		"\u05f9\u05f8\3\2\2\2\u05f9\u05fa\3\2\2\2\u05fa\u05fc\3\2\2\2\u05fb\u05fd"+
		"\5\u00fa~\2\u05fc\u05fb\3\2\2\2\u05fc\u05fd\3\2\2\2\u05fd\u05ff\3\2\2"+
		"\2\u05fe\u0600\5\u00fc\177\2\u05ff\u05fe\3\2\2\2\u05ff\u0600\3\2\2\2\u0600"+
		"\u0602\3\2\2\2\u0601\u0603\5\u00fe\u0080\2\u0602\u0601\3\2\2\2\u0602\u0603"+
		"\3\2\2\2\u0603\u0605\3\2\2\2\u0604\u0606\5\u0100\u0081\2\u0605\u0604\3"+
		"\2\2\2\u0605\u0606\3\2\2\2\u0606\u0608\3\2\2\2\u0607\u0609\5\u0102\u0082"+
		"\2\u0608\u0607\3\2\2\2\u0608\u0609\3\2\2\2\u0609\u060b\3\2\2\2\u060a\u060c"+
		"\5\u0104\u0083\2\u060b\u060a\3\2\2\2\u060b\u060c\3\2\2\2\u060c\u0654\3"+
		"\2\2\2\u060d\u060f\5\u00f8}\2\u060e\u0610\5\u00fa~\2\u060f\u060e\3\2\2"+
		"\2\u060f\u0610\3\2\2\2\u0610\u0612\3\2\2\2\u0611\u0613\5\u00fc\177\2\u0612"+
		"\u0611\3\2\2\2\u0612\u0613\3\2\2\2\u0613\u0615\3\2\2\2\u0614\u0616\5\u00fe"+
		"\u0080\2\u0615\u0614\3\2\2\2\u0615\u0616\3\2\2\2\u0616\u0618\3\2\2\2\u0617"+
		"\u0619\5\u0100\u0081\2\u0618\u0617\3\2\2\2\u0618\u0619\3\2\2\2\u0619\u061b"+
		"\3\2\2\2\u061a\u061c\5\u0102\u0082\2\u061b\u061a\3\2\2\2\u061b\u061c\3"+
		"\2\2\2\u061c\u061e\3\2\2\2\u061d\u061f\5\u0104\u0083\2\u061e\u061d\3\2"+
		"\2\2\u061e\u061f\3\2\2\2\u061f\u0654\3\2\2\2\u0620\u0622\5\u00fa~\2\u0621"+
		"\u0623\5\u00fc\177\2\u0622\u0621\3\2\2\2\u0622\u0623\3\2\2\2\u0623\u0625"+
		"\3\2\2\2\u0624\u0626\5\u00fe\u0080\2\u0625\u0624\3\2\2\2\u0625\u0626\3"+
		"\2\2\2\u0626\u0628\3\2\2\2\u0627\u0629\5\u0100\u0081\2\u0628\u0627\3\2"+
		"\2\2\u0628\u0629\3\2\2\2\u0629\u062b\3\2\2\2\u062a\u062c\5\u0102\u0082"+
		"\2\u062b\u062a\3\2\2\2\u062b\u062c\3\2\2\2\u062c\u062e\3\2\2\2\u062d\u062f"+
		"\5\u0104\u0083\2\u062e\u062d\3\2\2\2\u062e\u062f\3\2\2\2\u062f\u0654\3"+
		"\2\2\2\u0630\u0632\5\u00fc\177\2\u0631\u0633\5\u00fe\u0080\2\u0632\u0631"+
		"\3\2\2\2\u0632\u0633\3\2\2\2\u0633\u0635\3\2\2\2\u0634\u0636\5\u0100\u0081"+
		"\2\u0635\u0634\3\2\2\2\u0635\u0636\3\2\2\2\u0636\u0638\3\2\2\2\u0637\u0639"+
		"\5\u0102\u0082\2\u0638\u0637\3\2\2\2\u0638\u0639\3\2\2\2\u0639\u063b\3"+
		"\2\2\2\u063a\u063c\5\u0104\u0083\2\u063b\u063a\3\2\2\2\u063b\u063c\3\2"+
		"\2\2\u063c\u0654\3\2\2\2\u063d\u063f\5\u00fe\u0080\2\u063e\u0640\5\u0100"+
		"\u0081\2\u063f\u063e\3\2\2\2\u063f\u0640\3\2\2\2\u0640\u0642\3\2\2\2\u0641"+
		"\u0643\5\u0102\u0082\2\u0642\u0641\3\2\2\2\u0642\u0643\3\2\2\2\u0643\u0645"+
		"\3\2\2\2\u0644\u0646\5\u0104\u0083\2\u0645\u0644\3\2\2\2\u0645\u0646\3"+
		"\2\2\2\u0646\u0654\3\2\2\2\u0647\u0649\5\u0100\u0081\2\u0648\u064a\5\u0102"+
		"\u0082\2\u0649\u0648\3\2\2\2\u0649\u064a\3\2\2\2\u064a\u064c\3\2\2\2\u064b"+
		"\u064d\5\u0104\u0083\2\u064c\u064b\3\2\2\2\u064c\u064d\3\2\2\2\u064d\u0654"+
		"\3\2\2\2\u064e\u0650\5\u0102\u0082\2\u064f\u0651\5\u0104\u0083\2\u0650"+
		"\u064f\3\2\2\2\u0650\u0651\3\2\2\2\u0651\u0654\3\2\2\2\u0652\u0654\5\u0104"+
		"\u0083\2\u0653\u05f7\3\2\2\2\u0653\u060d\3\2\2\2\u0653\u0620\3\2\2\2\u0653"+
		"\u0630\3\2\2\2\u0653\u063d\3\2\2\2\u0653\u0647\3\2\2\2\u0653\u064e\3\2"+
		"\2\2\u0653\u0652\3\2\2\2\u0654\u00f5\3\2\2\2\u0655\u0656\7\4\2\2\u0656"+
		"\u0657\7Y\2\2\u0657\u00f7\3\2\2\2\u0658\u0659\7\4\2\2\u0659\u065a\7Z\2"+
		"\2\u065a\u00f9\3\2\2\2\u065b\u065c\7\4\2\2\u065c\u065d\7[\2\2\u065d\u00fb"+
		"\3\2\2\2\u065e\u065f\7\4\2\2\u065f\u0660\7\\\2\2\u0660\u00fd\3\2\2\2\u0661"+
		"\u0662\7\4\2\2\u0662\u0663\7]\2\2\u0663\u00ff\3\2\2\2\u0664\u0665\7\4"+
		"\2\2\u0665\u0666\7^\2\2\u0666\u0101\3\2\2\2\u0667\u0668\7\4\2\2\u0668"+
		"\u0669\7_\2\2\u0669\u0103\3\2\2\2\u066a\u066b\7\4\2\2\u066b\u066c\7`\2"+
		"\2\u066c\u0105\3\2\2\2\u066d\u066f\t\t\2\2\u066e\u066d\3\2\2\2\u066e\u066f"+
		"\3\2\2\2\u066f\u0670\3\2\2\2\u0670\u0671\7\7\2\2\u0671\u0107\3\2\2\2\u0672"+
		"\u0674\t\t\2\2\u0673\u0672\3\2\2\2\u0673\u0674\3\2\2\2\u0674\u0675\3\2"+
		"\2\2\u0675\u0676\7\5\2\2\u0676\u0109\3\2\2\2\u0677\u0679\t\t\2\2\u0678"+
		"\u0677\3\2\2\2\u0678\u0679\3\2\2\2\u0679\u067a\3\2\2\2\u067a\u067b\7\6"+
		"\2\2\u067b\u010b\3\2\2\2\u067c\u067e\t\t\2\2\u067d\u067c\3\2\2\2\u067d"+
		"\u067e\3\2\2\2\u067e\u067f\3\2\2\2\u067f\u0680\7\4\2\2\u0680\u010d\3\2"+
		"\2\2\u0681\u0682\t\n\2\2\u0682\u010f\3\2\2\2\u0683\u0684\7o\2\2\u0684"+
		"\u0111\3\2\2\2\u00d3\u0119\u011b\u0125\u012f\u0133\u0139\u013d\u0141\u0145"+
		"\u0149\u0150\u015f\u0166\u016d\u017c\u0183\u018a\u0199\u01a0\u01a4\u01ab"+
		"\u01b9\u01bf\u01c2\u01c7\u01cb\u01d0\u01d4\u01ea\u01f5\u01fb\u0202\u020e"+
		"\u0217\u0224\u022c\u0231\u0235\u023a\u0246\u024b\u0250\u0257\u0262\u0269"+
		"\u026e\u0272\u0276\u027c\u0288\u028f\u0298\u029f\u02a5\u02a8\u02b1\u02b5"+
		"\u02b8\u02bb\u02c1\u02c7\u02cb\u02d0\u02d4\u02d7\u02db\u02df\u02e3\u02e5"+
		"\u02f4\u02fb\u0304\u030b\u030f\u0318\u031c\u032a\u0332\u0334\u0339\u0347"+
		"\u034f\u0351\u0358\u0362\u038a\u038d\u039d\u03a3\u03a8\u03ac\u03b0\u03b4"+
		"\u03b6\u03b9\u03c0\u03c7\u03cd\u03d6\u03e5\u03ed\u03ef\u03ff\u0407\u0409"+
		"\u0412\u0419\u0420\u042a\u0433\u0436\u043a\u043c\u043f\u0454\u0457\u045a"+
		"\u0463\u0466\u0469\u046c\u046f\u0472\u0475\u047e\u048b\u0490\u049c\u04a4"+
		"\u04a8\u04b1\u04b4\u04bd\u04c0\u04c7\u04c9\u04cf\u04d4\u04d9\u04e1\u04ed"+
		"\u04f0\u04f4\u04fa\u0500\u050e\u0518\u0529\u052f\u0535\u053d\u0543\u054f"+
		"\u0551\u0557\u055c\u0565\u0569\u056e\u0575\u057c\u0580\u0587\u058f\u0591"+
		"\u0597\u059d\u059f\u05b1\u05b5\u05c1\u05cb\u05d5\u05e5\u05e8\u05f1\u05f9"+
		"\u05fc\u05ff\u0602\u0605\u0608\u060b\u060f\u0612\u0615\u0618\u061b\u061e"+
		"\u0622\u0625\u0628\u062b\u062e\u0632\u0635\u0638\u063b\u063f\u0642\u0645"+
		"\u0649\u064c\u0650\u0653\u066e\u0673\u0678\u067d";
	public static final ATN _ATN =
		new ATNDeserializer().deserialize(_serializedATN.toCharArray());
	static {
		_decisionToDFA = new DFA[_ATN.getNumberOfDecisions()];
		for (int i = 0; i < _ATN.getNumberOfDecisions(); i++) {
			_decisionToDFA[i] = new DFA(_ATN.getDecisionState(i), i);
		}
	}
}