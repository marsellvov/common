package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class CtxDoc {
		public static void filter(NString indexName,NString textkey,NString restab,NNumber queryId,NBool plaintext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@PLAINTEXT", plaintext);
				
			cmd.execute();


		}
		
		public static void filter(NString indexName,NString textkey,Ref<NString> restab,NBool plaintext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.FILTER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@RESTAB", restab, true);
			cmd.addParameter("@PLAINTEXT", plaintext);
				
			cmd.execute();
			restab.val = cmd.getParameterValue("@RESTAB", NString.class);


		}
		
		public static void gist(NString indexName,NString textkey,NString restab,NNumber queryId,NString glevel,NString pov,NNumber numparagraphs,NNumber maxpercent,NNumber numThemes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.GIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@GLEVEL", glevel);
			cmd.addParameter("@POV", pov);
			cmd.addParameter("@NUMPARAGRAPHS", numparagraphs);
			cmd.addParameter("@MAXPERCENT", maxpercent);
			cmd.addParameter("@NUM_THEMES", numThemes);
				
			cmd.execute();


		}
		
		public static void gist(NString indexName,NString textkey,Ref<NString> restab,NString glevel,NString pov,NNumber numparagraphs,NNumber maxpercent,NNumber numThemes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.GIST", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@RESTAB", restab, true);
			cmd.addParameter("@GLEVEL", glevel);
			cmd.addParameter("@POV", pov);
			cmd.addParameter("@NUMPARAGRAPHS", numparagraphs);
			cmd.addParameter("@MAXPERCENT", maxpercent);
			cmd.addParameter("@NUM_THEMES", numThemes);
				
			cmd.execute();
			restab.val = cmd.getParameterValue("@RESTAB", NString.class);


		}
		
		public static void highlight(NString indexName,NString textkey,NString textQuery,NString restab,NNumber queryId,NBool plaintext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.HIGHLIGHT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@PLAINTEXT", plaintext);
				
			cmd.execute();


		}
		
//		public static void highlight(NString indexName,NString textkey,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.HIGHLIGHT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@TEXTKEY", textkey);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
		public static void highlightClobQuery(NString indexName,NString textkey,NString textQuery,NString restab,NNumber queryId,NBool plaintext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.HIGHLIGHT_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@PLAINTEXT", plaintext);
				
			cmd.execute();


		}
		
//		public static void highlightClobQuery(NString indexName,NString textkey,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.HIGHLIGHT_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@TEXTKEY", textkey);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
//		public static void ifilter(BLOB data,Ref<NString> text) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.IFILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@DATA", data);
//			cmd.addParameter("@TEXT", text, true);
//				
//			cmd.execute();
//			text.val = cmd.getParameterValue("@TEXT", NString.class);
//
//
//		}
		
		public static void markup(NString indexName,NString textkey,NString textQuery,NString restab,NNumber queryId,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.MARKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@PLAINTEXT", plaintext);
			cmd.addParameter("@TAGSET", tagset);
			cmd.addParameter("@STARTTAG", starttag);
			cmd.addParameter("@ENDTAG", endtag);
			cmd.addParameter("@PREVTAG", prevtag);
			cmd.addParameter("@NEXTTAG", nexttag);
				
			cmd.execute();


		}
		
		public static void markup(NString indexName,NString textkey,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.MARKUP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@RESTAB", restab, true);
			cmd.addParameter("@PLAINTEXT", plaintext);
			cmd.addParameter("@TAGSET", tagset);
			cmd.addParameter("@STARTTAG", starttag);
			cmd.addParameter("@ENDTAG", endtag);
			cmd.addParameter("@PREVTAG", prevtag);
			cmd.addParameter("@NEXTTAG", nexttag);
				
			cmd.execute();
			restab.val = cmd.getParameterValue("@RESTAB", NString.class);


		}
		
		public static void markupClobQuery(NString indexName,NString textkey,NString textQuery,NString restab,NNumber queryId,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.MARKUP_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@PLAINTEXT", plaintext);
			cmd.addParameter("@TAGSET", tagset);
			cmd.addParameter("@STARTTAG", starttag);
			cmd.addParameter("@ENDTAG", endtag);
			cmd.addParameter("@PREVTAG", prevtag);
			cmd.addParameter("@NEXTTAG", nexttag);
				
			cmd.execute();


		}
		
		public static void markupClobQuery(NString indexName,NString textkey,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.MARKUP_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@RESTAB", restab, true);
			cmd.addParameter("@PLAINTEXT", plaintext);
			cmd.addParameter("@TAGSET", tagset);
			cmd.addParameter("@STARTTAG", starttag);
			cmd.addParameter("@ENDTAG", endtag);
			cmd.addParameter("@PREVTAG", prevtag);
			cmd.addParameter("@NEXTTAG", nexttag);
				
			cmd.execute();
			restab.val = cmd.getParameterValue("@RESTAB", NString.class);


		}
		
		public static NString Fpkencode(NString pk1,NString pk2,NString pk3,NString pk4,NString pk5,NString pk6,NString pk7,NString pk8,NString pk9,NString pk10,NString pk11,NString pk12,NString pk13,NString pk14,NString pk15,NString pk16) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.PKENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@PK1", pk1);
			cmd.addParameter("@PK2", pk2);
			cmd.addParameter("@PK3", pk3);
			cmd.addParameter("@PK4", pk4);
			cmd.addParameter("@PK5", pk5);
			cmd.addParameter("@PK6", pk6);
			cmd.addParameter("@PK7", pk7);
			cmd.addParameter("@PK8", pk8);
			cmd.addParameter("@PK9", pk9);
			cmd.addParameter("@PK10", pk10);
			cmd.addParameter("@PK11", pk11);
			cmd.addParameter("@PK12", pk12);
			cmd.addParameter("@PK13", pk13);
			cmd.addParameter("@PK14", pk14);
			cmd.addParameter("@PK15", pk15);
			cmd.addParameter("@PK16", pk16);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static void policyFilter(NString policyName,NString document,Ref<NString> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyFilter(NString policyName,BLOB document,Ref<NString> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyFilter(NString policyName, document,Ref<NString> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyFilter(NString policyName,NString document,Ref<NString> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_FILTER", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyGist(NString policyName,NString document,Ref<NString> restab,NString glevel,NString pov,NNumber numparagraphs,NNumber maxpercent,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_GIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@GLEVEL", glevel);
//			cmd.addParameter("@POV", pov);
//			cmd.addParameter("@NUMPARAGRAPHS", numparagraphs);
//			cmd.addParameter("@MAXPERCENT", maxpercent);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyGist(NString policyName,NString document,Ref<NString> restab,NString glevel,NString pov,NNumber numparagraphs,NNumber maxpercent,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_GIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@GLEVEL", glevel);
//			cmd.addParameter("@POV", pov);
//			cmd.addParameter("@NUMPARAGRAPHS", numparagraphs);
//			cmd.addParameter("@MAXPERCENT", maxpercent);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyGist(NString policyName,BLOB document,Ref<NString> restab,NString glevel,NString pov,NNumber numparagraphs,NNumber maxpercent,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_GIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@GLEVEL", glevel);
//			cmd.addParameter("@POV", pov);
//			cmd.addParameter("@NUMPARAGRAPHS", numparagraphs);
//			cmd.addParameter("@MAXPERCENT", maxpercent);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyGist(NString policyName, document,Ref<NString> restab,NString glevel,NString pov,NNumber numparagraphs,NNumber maxpercent,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_GIST", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@GLEVEL", glevel);
//			cmd.addParameter("@POV", pov);
//			cmd.addParameter("@NUMPARAGRAPHS", numparagraphs);
//			cmd.addParameter("@MAXPERCENT", maxpercent);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyHighlight(NString policyName,NString document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlight(NString policyName,NString document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlight(NString policyName,BLOB document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlight(NString policyName, document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlightClobQuery(NString policyName,NString document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlightClobQuery(NString policyName,NString document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlightClobQuery(NString policyName,BLOB document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyHighlightClobQuery(NString policyName, document,NString textQuery,Ref<List<HighlightTabRow>> restab,NBool plaintext,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_HIGHLIGHT_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyMarkup(NString policyName,NString document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkup(NString policyName,NString document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkup(NString policyName,BLOB document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkup(NString policyName, document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkupClobQuery(NString policyName,NString document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkupClobQuery(NString policyName,NString document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkupClobQuery(NString policyName,BLOB document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static void policyMarkupClobQuery(NString policyName, document,NString textQuery,Ref<NString> restab,NBool plaintext,NString tagset,NString starttag,NString endtag,NString prevtag,NString nexttag,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_MARKUP_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@RESTAB", restab, true);
//			cmd.addParameter("@PLAINTEXT", plaintext);
//			cmd.addParameter("@TAGSET", tagset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@PREVTAG", prevtag);
//			cmd.addParameter("@NEXTTAG", nexttag);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			restab.val = cmd.getParameterValue("@RESTAB", NString.class);
//
//
//		}
//		
//		public static NString FpolicySnippet(NString policyName,NString document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FpolicySnippet(NString policyName,NString document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FpolicySnippet(NString policyName,BLOB document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FpolicySnippet(NString policyName, document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
//		public static NString FpolicySnippetClobQuery(NString policyName,NString document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FpolicySnippetClobQuery(NString policyName,NString document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FpolicySnippetClobQuery(NString policyName,BLOB document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static NString FpolicySnippetClobQuery(NString policyName, document,NString textQuery,NString language,NString format,NString charset,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_SNIPPET_CLOB_QUERY", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			cmd.addParameter("@TEXT_QUERY", textQuery);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//			cmd.addParameter("@STARTTAG", starttag);
//			cmd.addParameter("@ENDTAG", endtag);
//			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
//			cmd.addParameter("@SEPARATOR", separator);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
//		
//		public static void policyThemes(NString policyName,NString document,Ref<List<ThemeTabRow>> restab,NBool fullThemes,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_THEMES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@FULL_THEMES", fullThemes);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyThemes(NString policyName,NString document,Ref<List<ThemeTabRow>> restab,NBool fullThemes,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_THEMES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@FULL_THEMES", fullThemes);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyThemes(NString policyName,BLOB document,Ref<List<ThemeTabRow>> restab,NBool fullThemes,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_THEMES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@FULL_THEMES", fullThemes);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyThemes(NString policyName, document,Ref<List<ThemeTabRow>> restab,NBool fullThemes,NNumber numThemes,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_THEMES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@FULL_THEMES", fullThemes);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyTokens(NString policyName,NString document,Ref<List<TokenTabRow>> restab,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_TOKENS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyTokens(NString policyName,NString document,Ref<List<TokenTabRow>> restab,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_TOKENS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyTokens(NString policyName,BLOB document,Ref<List<TokenTabRow>> restab,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_TOKENS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
//		public static void policyTokens(NString policyName, document,Ref<List<TokenTabRow>> restab,NString language,NString format,NString charset) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.POLICY_TOKENS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@POLICY_NAME", policyName);
//			cmd.addParameter("@DOCUMENT", document);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@LANGUAGE", language);
//			cmd.addParameter("@FORMAT", format);
//			cmd.addParameter("@CHARSET", charset);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static void setKeyType(NString keyType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.SET_KEY_TYPE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@KEY_TYPE", keyType);
				
			cmd.execute();


		}
		
		public static NString Fsnippet(NString indexName,NString textkey,NString textQuery,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.SNIPPET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@STARTTAG", starttag);
			cmd.addParameter("@ENDTAG", endtag);
			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
			cmd.addParameter("@SEPARATOR", separator);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FsnippetClobQuery(NString indexName,NString textkey,NString textQuery,NString starttag,NString endtag,NBool entityTranslation,NString separator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.SNIPPET_CLOB_QUERY", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@TEXT_QUERY", textQuery);
			cmd.addParameter("@STARTTAG", starttag);
			cmd.addParameter("@ENDTAG", endtag);
			cmd.addParameter("@ENTITY_TRANSLATION", entityTranslation);
			cmd.addParameter("@SEPARATOR", separator);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void themes(NString indexName,NString textkey,NString restab,NNumber queryId,NBool fullThemes,NNumber numThemes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.THEMES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
			cmd.addParameter("@FULL_THEMES", fullThemes);
			cmd.addParameter("@NUM_THEMES", numThemes);
				
			cmd.execute();


		}
		
//		public static void themes(NString indexName,NString textkey,Ref<List<ThemeTabRow>> restab,NBool fullThemes,NNumber numThemes) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.THEMES", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@TEXTKEY", textkey);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//			cmd.addParameter("@FULL_THEMES", fullThemes);
//			cmd.addParameter("@NUM_THEMES", numThemes);
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
		
		public static void tokens(NString indexName,NString textkey,NString restab,NNumber queryId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.TOKENS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@INDEX_NAME", indexName);
			cmd.addParameter("@TEXTKEY", textkey);
			cmd.addParameter("@RESTAB", restab);
			cmd.addParameter("@QUERY_ID", queryId);
				
			cmd.execute();


		}
//		
//		public static void tokens(NString indexName,NString textkey,Ref<List<TokenTabRow>> restab) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CTX_DOC.TOKENS", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@INDEX_NAME", indexName);
//			cmd.addParameter("@TEXTKEY", textkey);
//			// cmd.addParameter(DbTypes.getTableType("RESTAB", "", restab.val, object.class , true));
//				
//			cmd.execute();
//			// restab.val = cmd.getTableParameterValue("@RESTAB", object.class);
//
//
//		}
//		
	
	
	@DbRecordType(id="HighlightRecRow", dataSourceName="HIGHLIGHT_REC")
	public static class HighlightRecRow
	{
		@DbRecordField(dataSourceName="OFFSET")
		public NNumber Offset;
		@DbRecordField(dataSourceName="LENGTH")
		public NNumber Length;
	}

	
	@DbRecordType(id="ThemeRecRow", dataSourceName="THEME_REC")
	public static class ThemeRecRow
	{
		@DbRecordField(dataSourceName="THEME")
		public NString Theme;
		@DbRecordField(dataSourceName="WEIGHT")
		public NNumber Weight;
	}

	
	@DbRecordType(id="TokenRecRow", dataSourceName="TOKEN_REC")
	public static class TokenRecRow
	{
		@DbRecordField(dataSourceName="TOKEN")
		public NString Token;
		@DbRecordField(dataSourceName="OFFSET")
		public NNumber Offset;
		@DbRecordField(dataSourceName="LENGTH")
		public NNumber Length;
	}

	
	
}
