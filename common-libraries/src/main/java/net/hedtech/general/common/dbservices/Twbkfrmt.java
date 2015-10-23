package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Twbkfrmt {
		public static NString fConverttextareatags(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_CONVERTTEXTAREATAGS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fConverturlspaces(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_CONVERTURLSPACES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fDisplaySsbField(NString pPackageProcedure,NString pColumn,NString pDebug) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_DISPLAY_SSB_FIELD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PACKAGE_PROCEDURE", pPackageProcedure);
			cmd.addParameter("@P_COLUMN", pColumn);
			cmd.addParameter("@P_DEBUG", pDebug);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEncode(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_ENCODE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEncodeurl(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_ENCODEURL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static List<MsgtabRow> fErrMsgRemoveDelimTbl(NString pErrorMessage) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_ERR_MSG_REMOVE_DELIM_TBL", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(List<MsgtabRow>.class);
//			cmd.addParameter("@P_ERROR_MESSAGE", pErrorMessage);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(List<MsgtabRow>.class);
//
//		}
		
		public static NString fEscTextJs(NString pStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_ESC_TEXT_JS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_STR", pStr);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fEscape(NString textIn,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_ESCAPE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT_IN", textIn);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormdatetext(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMDATETEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormhidden(NString cname,NString cvalue,NString cattributes,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMHIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormlabel(NString cvalue,NString idname,NString visible,NString printrequired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMLABEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@IDNAME", idname);
			cmd.addParameter("@VISIBLE", visible);
			cmd.addParameter("@PRINTREQUIRED", printrequired);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormopen(NString curl,NString cmethod,NString ctarget,NString cenctype,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURL", curl);
			cmd.addParameter("@CMETHOD", cmethod);
			cmd.addParameter("@CTARGET", ctarget);
			cmd.addParameter("@CENCTYPE", cenctype);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormreset(NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMRESET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormsubmit(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMSUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fFormtext(NString cname,NString csize,NString cmaxlength,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_FORMTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CSIZE", csize);
			cmd.addParameter("@CMAXLENGTH", cmaxlength);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fHeadercaps(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_HEADERCAPS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fImagelink(NString url,NString imagename,NString anchorname,NString target,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_IMAGELINK", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@URL", url);
			cmd.addParameter("@IMAGENAME", imagename);
			cmd.addParameter("@ANCHORNAME", anchorname);
			cmd.addParameter("@TARGET", target);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fObject(NString nameIn,NString typeIn,NString dataIn,NString titleIn,NString alignIn,NString usemapIn,NString hspaceIn,NString vspaceIn,NString borderIn,NString attributesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_OBJECT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@DATA_IN", dataIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@ALIGN_IN", alignIn);
			cmd.addParameter("@USEMAP_IN", usemapIn);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@BORDER_IN", borderIn);
			cmd.addParameter("@ATTRIBUTES_IN", attributesIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fObjectclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_OBJECTCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fObjectopen(NString nameIn,NString typeIn,NString dataIn,NString titleIn,NString alignIn,NString usemapIn,NString hspaceIn,NString vspaceIn,NString borderIn,NString attributesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_OBJECTOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@DATA_IN", dataIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@ALIGN_IN", alignIn);
			cmd.addParameter("@USEMAP_IN", usemapIn);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@BORDER_IN", borderIn);
			cmd.addParameter("@ATTRIBUTES_IN", attributesIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintFlag() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINT_FLAG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintanchor(NString curl,NString ctext,NString cname,NString ctarget,NString cattributes,NString fontsize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTANCHOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CURL", curl);
			cmd.addParameter("@CTEXT", ctext);
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CTARGET", ctarget);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@FONTSIZE", fontsize);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintbold(NString text,NString classIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTBOLD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CLASS_IN", classIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintbullet() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTBULLET", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintdivider() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTDIVIDER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintheader(NNumber nsize,NString cheader,NString calign,NString cnowrap,NString cclear,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTHEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@NSIZE", nsize);
			cmd.addParameter("@CHEADER", cheader);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CCLEAR", cclear);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintimage(NString imagename,NString hspaceIn,NString vspaceIn,NString cismap,NString cusemap,NString pAltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@IMAGENAME", imagename);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@CISMAP", cismap);
			cmd.addParameter("@CUSEMAP", cusemap);
			cmd.addParameter("@P_ALT_TEXT", pAltText);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintrequired() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTREQUIRED", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintspacer(NString hspace,NString vspace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTSPACER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@HSPACE", hspace);
			cmd.addParameter("@VSPACE", vspace);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrintstrong(NString text,NString cattributes,NString classIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTSTRONG", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@CLASS_IN", classIn);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fPrinttext(NString text,NString classIn,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_PRINTTEXT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CLASS_IN", classIn);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTableclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLECLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledata(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NString datatype,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATA", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@DATATYPE", datatype);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataclose(NString datatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATACLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DATATYPE", datatype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatadead(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATADEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatadeadclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATADEADCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatadeadopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATADEADOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataheader(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAHEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataheaderclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAHEADERCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataheaderopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAHEADEROPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatahighlight(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAHIGHLIGHT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatahighlightclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAHIGHLIGHTCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatahighlightopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAHIGHLIGHTOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatalabel(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATALABEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatalabelclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATALABELCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatalabelopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATALABELOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NString datatype,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@DATATYPE", datatype);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataseparator(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATASEPARATOR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataseparatorclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATASEPARATORCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledataseparatoropen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATASEPARATOROPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatawhite(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAWHITE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatawhiteclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAWHITECLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTabledatawhiteopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEDATAWHITEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTablehead(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NString datatype,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEHEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@DATATYPE", datatype);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTableheadclose(NString datatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEHEADCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@DATATYPE", datatype);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTableheader(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEHEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTableheadopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NString datatype,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEHEADOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@DATATYPE", datatype);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTableopen(NString tabletype,NString cattributes,NString cellpadding,NString ccaption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@TABLETYPE", tabletype);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@CELLPADDING", cellpadding);
			cmd.addParameter("@CCAPTION", ccaption);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTablerowclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEROWCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTablerowopen(NString calign,NString cvalign,NString cdp,NString cnowrap,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TABLEROWOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CVALIGN", cvalign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTddead(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDDEAD", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTddeadclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDDEADCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTddeadopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDDEADOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdheader(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDHEADER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdheaderclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDHEADERCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdheaderopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDHEADEROPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdhilite(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDHILITE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdhiliteclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDHILITECLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdhiliteopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDHILITEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdlabel(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDLABEL", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdlabelclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDLABELCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdlabelopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDLABELOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdsep(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDSEP", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdsepclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDSEPCLOSE", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString fTdsepopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.F_TDSEPOPEN", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void pBottomrightborder(NString borderType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_BOTTOMRIGHTBORDER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BORDER_TYPE", borderType);
				
			cmd.execute();


		}
		
		public static void pCloseTab() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_CLOSE_TAB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pDisphelp(NString pagenameIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_DISPHELP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@PAGENAME_IN", pagenameIn);
				
			cmd.execute();


		}
		
		public static void pFormdatetext(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMDATETEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormhidden(NString cname,NString cvalue,NString cattributes,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMHIDDEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();


		}
		
		public static void pFormlabel(NString cvalue,NString idname,NString visible,NString printrequired) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMLABEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@IDNAME", idname);
			cmd.addParameter("@VISIBLE", visible);
			cmd.addParameter("@PRINTREQUIRED", printrequired);
				
			cmd.execute();


		}
		
		public static void pFormopen(NString curl,NString cmethod,NString ctarget,NString cenctype,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURL", curl);
			cmd.addParameter("@CMETHOD", cmethod);
			cmd.addParameter("@CTARGET", ctarget);
			cmd.addParameter("@CENCTYPE", cenctype);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormradiorow(NString cname,NString cnameReq,NString cvalue,NString clabelDesc,NString cdeflabel,NString creqdInd,NString cmsgFlag,NString noRespFlag,NString ccolspan,NString cattributes,NString cradioVal1,NString cradioDesc1,NString cradioVal2,NString cradioDesc2,NString cradioDesc3) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMRADIOROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CNAME_REQ", cnameReq);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CLABEL_DESC", clabelDesc);
			cmd.addParameter("@CDEFLABEL", cdeflabel);
			cmd.addParameter("@CREQD_IND", creqdInd);
			cmd.addParameter("@CMSG_FLAG", cmsgFlag);
			cmd.addParameter("@NO_RESP_FLAG", noRespFlag);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@CRADIO_VAL1", cradioVal1);
			cmd.addParameter("@CRADIO_DESC1", cradioDesc1);
			cmd.addParameter("@CRADIO_VAL2", cradioVal2);
			cmd.addParameter("@CRADIO_DESC2", cradioDesc2);
			cmd.addParameter("@CRADIO_DESC3", cradioDesc3);
				
			cmd.execute();


		}
		
		public static void pFormreset(NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMRESET", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormselectday(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMSELECTDAY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormselectmonth(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMSELECTMONTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormsubmit(NString cname,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMSUBMIT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormtext(NString cname,NString csize,NString cmaxlength,NString cvalue,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CSIZE", csize);
			cmd.addParameter("@CMAXLENGTH", cmaxlength);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pFormtextrow(NString cname,NString cnameReq,NString csize,NString cmaxlength,NString cvalue,NString clabelDesc,NString cdeflabel,NString creqdInd,NString cmsgFlag,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_FORMTEXTROW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CNAME_REQ", cnameReq);
			cmd.addParameter("@CSIZE", csize);
			cmd.addParameter("@CMAXLENGTH", cmaxlength);
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CLABEL_DESC", clabelDesc);
			cmd.addParameter("@CDEFLABEL", cdeflabel);
			cmd.addParameter("@CREQD_IND", creqdInd);
			cmd.addParameter("@CMSG_FLAG", cmsgFlag);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pHeadercaps(NString stringIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_HEADERCAPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@STRING_IN", stringIn);
				
			cmd.execute();


		}
		
		public static void pImagelink(NString url,NString imagename,NString anchorname,NString target,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_IMAGELINK", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@URL", url);
			cmd.addParameter("@IMAGENAME", imagename);
			cmd.addParameter("@ANCHORNAME", anchorname);
			cmd.addParameter("@TARGET", target);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pInitTab() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_INIT_TAB", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pObject(NString nameIn,NString typeIn,NString dataIn,NString titleIn,NString alignIn,NString usemapIn,NString hspaceIn,NString vspaceIn,NString borderIn,NString attributesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_OBJECT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@DATA_IN", dataIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@ALIGN_IN", alignIn);
			cmd.addParameter("@USEMAP_IN", usemapIn);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@BORDER_IN", borderIn);
			cmd.addParameter("@ATTRIBUTES_IN", attributesIn);
				
			cmd.execute();


		}
		
		public static void pObjectclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_OBJECTCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pObjectopen(NString nameIn,NString typeIn,NString dataIn,NString titleIn,NString alignIn,NString usemapIn,NString hspaceIn,NString vspaceIn,NString borderIn,NString attributesIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_OBJECTOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME_IN", nameIn);
			cmd.addParameter("@TYPE_IN", typeIn);
			cmd.addParameter("@DATA_IN", dataIn);
			cmd.addParameter("@TITLE_IN", titleIn);
			cmd.addParameter("@ALIGN_IN", alignIn);
			cmd.addParameter("@USEMAP_IN", usemapIn);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@BORDER_IN", borderIn);
			cmd.addParameter("@ATTRIBUTES_IN", attributesIn);
				
			cmd.execute();


		}
		
		public static void pParagraph(NNumber whitespaceIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PARAGRAPH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@WHITESPACE_IN", whitespaceIn);
				
			cmd.execute();


		}
		
		public static void pPrintFlag() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINT_FLAG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintanchor(NString curl,NString ctext,NString cname,NString ctarget,NString cattributes,NString fontsize) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTANCHOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CURL", curl);
			cmd.addParameter("@CTEXT", ctext);
			cmd.addParameter("@CNAME", cname);
			cmd.addParameter("@CTARGET", ctarget);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@FONTSIZE", fontsize);
				
			cmd.execute();


		}
		
		public static void pPrintapimessages() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTAPIMESSAGES", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintbold(NString text,NString classIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTBOLD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CLASS_IN", classIn);
				
			cmd.execute();


		}
		
		public static void pPrintbullet() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTBULLET", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintdivider() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTDIVIDER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintheader(NNumber nsize,NString cheader,NString calign,NString cnowrap,NString cclear,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTHEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NSIZE", nsize);
			cmd.addParameter("@CHEADER", cheader);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CCLEAR", cclear);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pPrintimage(NString imagename,NString hspaceIn,NString vspaceIn,NString cismap,NString cusemap,NString pAltText) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTIMAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@IMAGENAME", imagename);
			cmd.addParameter("@HSPACE_IN", hspaceIn);
			cmd.addParameter("@VSPACE_IN", vspaceIn);
			cmd.addParameter("@CISMAP", cismap);
			cmd.addParameter("@CUSEMAP", cusemap);
			cmd.addParameter("@P_ALT_TEXT", pAltText);
				
			cmd.execute();


		}
		
		public static void pPrintmenu(NString _name,NString displayType,NString classIn,NString numInRow,NBool validateLinks,NString mapTitle,NString ccaption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTMENU", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@NAME", _name);
			cmd.addParameter("@DISPLAY_TYPE", displayType);
			cmd.addParameter("@CLASS_IN", classIn);
			cmd.addParameter("@NUM_IN_ROW", numInRow);
			cmd.addParameter("@VALIDATE_LINKS", validateLinks);
			cmd.addParameter("@MAP_TITLE", mapTitle);
			cmd.addParameter("@CCAPTION", ccaption);
				
			cmd.execute();


		}
		
		public static void pPrintmessage(NString message,NString messageType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTMESSAGE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MESSAGE", message);
			cmd.addParameter("@MESSAGE_TYPE", messageType);
				
			cmd.execute();


		}
		
		public static void pPrintrequiredmsg() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTREQUIREDMSG", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pPrintspacer(NString hspace,NString vspace) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTSPACER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@HSPACE", hspace);
			cmd.addParameter("@VSPACE", vspace);
				
			cmd.execute();


		}
		
		public static void pPrintstrong(NString text,NString cattributes,NString classIn) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTSTRONG", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@CLASS_IN", classIn);
				
			cmd.execute();


		}
		
		public static void pPrinttext(NString text,NString classIn,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRINTTEXT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CLASS_IN", classIn);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();


		}
		
		public static void pPrn(NString text,NString classIn,NString bypassEsc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_PRN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TEXT", text);
			cmd.addParameter("@CLASS_IN", classIn);
			cmd.addParameter("@BYPASS_ESC", bypassEsc);
				
			cmd.execute();


		}
		
		public static void pSetTab(NString pTabname,NString pCurrTabname,NString pUrl,NString pUrlText,NString pAttribStr) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_SET_TAB", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TABNAME", pTabname);
			cmd.addParameter("@P_CURR_TABNAME", pCurrTabname);
			cmd.addParameter("@P_URL", pUrl);
			cmd.addParameter("@P_URL_TEXT", pUrlText);
			cmd.addParameter("@P_ATTRIB_STR", pAttribStr);
				
			cmd.execute();


		}
		
		public static void pStoreapimessages(NString message) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_STOREAPIMESSAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@MESSAGE", message);
				
			cmd.execute();


		}
		
		public static void pTableclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLECLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledata(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NString datatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATA", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@DATATYPE", datatype);
				
			cmd.execute();


		}
		
		public static void pTabledataclose(NString datatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATACLOSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@DATATYPE", datatype);
				
			cmd.execute();


		}
		
		public static void pTabledatadead(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATADEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledatadeadclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATADEADCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledatadeadopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATADEADOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledataheader(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAHEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();


		}
		
		public static void pTabledataheaderclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAHEADERCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledataheaderopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAHEADEROPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();


		}
		
		public static void pTabledatahighlight(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAHIGHLIGHT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledatahighlightclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAHIGHLIGHTCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledatahighlightopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAHIGHLIGHTOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledatalabel(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATALABEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();


		}
		
		public static void pTabledatalabelclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATALABELCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledatalabelopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NBool ovrrTextStyle) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATALABELOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@OVRR_TEXT_STYLE", ovrrTextStyle);
				
			cmd.execute();


		}
		
		public static void pTabledataopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes,NString datatype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@DATATYPE", datatype);
				
			cmd.execute();


		}
		
		public static void pTabledataseparator(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATASEPARATOR", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledataseparatorclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATASEPARATORCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledataseparatoropen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATASEPARATOROPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledatawhite(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAWHITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTabledatawhiteclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAWHITECLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTabledatawhiteopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEDATAWHITEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTableheader(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEHEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTableopen(NString tabletype,NString cattributes,NString cellpadding,NString ccaption) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@TABLETYPE", tabletype);
			cmd.addParameter("@CATTRIBUTES", cattributes);
			cmd.addParameter("@CELLPADDING", cellpadding);
			cmd.addParameter("@CCAPTION", ccaption);
				
			cmd.execute();


		}
		
		public static void pTablerowclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEROWCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTablerowopen(NString calign,NString cvalign,NString cdp,NString cnowrap,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TABLEROWOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CVALIGN", cvalign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTddead(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDDEAD", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTddeadclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDDEADCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTddeadopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDDEADOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdheader(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDHEADER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdheaderclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDHEADERCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTdheaderopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDHEADEROPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdhilite(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDHILITE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdhiliteclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDHILITECLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTdhiliteopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDHILITEOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdlabel(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDLABEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdlabelclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDLABELCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTdlabelopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDLABELOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdsep(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDSEP", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTdsepclose() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDSEPCLOSE", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void pTdsepopen(NString cvalue,NString calign,NString cdp,NString cnowrap,NString crowspan,NString ccolspan,NString cattributes) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TDSEPOPEN", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@CVALUE", cvalue);
			cmd.addParameter("@CALIGN", calign);
			cmd.addParameter("@CDP", cdp);
			cmd.addParameter("@CNOWRAP", cnowrap);
			cmd.addParameter("@CROWSPAN", crowspan);
			cmd.addParameter("@CCOLSPAN", ccolspan);
			cmd.addParameter("@CATTRIBUTES", cattributes);
				
			cmd.execute();


		}
		
		public static void pTopleftborder(NString borderType,NString label) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("TWBKFRMT.P_TOPLEFTBORDER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@BORDER_TYPE", borderType);
			cmd.addParameter("@LABEL", label);
				
			cmd.execute();


		}
		
	
	
	
}
