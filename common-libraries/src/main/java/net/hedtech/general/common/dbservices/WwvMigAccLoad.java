package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvMigAccLoad {
		public static void displayLoadConfirm(NNumber pFileId,NString pDateTimeFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.DISPLAY_LOAD_CONFIRM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FILE_ID", pFileId);
			cmd.addParameter("@P_DATE_TIME_FORMAT", pDateTimeFormat);
				
			cmd.execute();


		}
		
		public static void displayLoadInfo(NNumber pFileId,NString pDateTimeFormat) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.DISPLAY_LOAD_INFO", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_FILE_ID", pFileId);
			cmd.addParameter("@P_DATE_TIME_FORMAT", pDateTimeFormat);
				
			cmd.execute();


		}
		
		public static NString FescapeChar(NString ctext) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.ESCAPE_CHAR", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@CTEXT", ctext);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
//		public static NString FescapeChar(NString ctext) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.ESCAPE_CHAR", DbManager.getDataBaseFactory());
//			
//			cmd.addReturnParameter(NString.class);
//			cmd.addParameter("@CTEXT", ctext);
//				
//			cmd.execute();
//
//			return cmd.getReturnValue(NString.class);
//
//		}
		
		public static void insWwvMigAccColumns(NNumber pColid,NNumber pTblid,NNumber pDbid,NString pColname,NNumber pColtype,NString pColtypedesc,NNumber pColautoincr,NNumber pNextcountervalue,NNumber pMaxlengthsource,NNumber pAvglengthsource,NNumber pColtextsize,NNumber pAllowzerolength,NString pDefaultvalue,NNumber pColrequired,NNumber pColcollatingorder,NNumber pColordposition,NString pValidationrule,NString pValidationtext,NString pColumndescription,NNumber pColumnhidden,NNumber pColumnorder,NNumber pColumnwidth,NNumber pDecimalplaces,NString pForeignname,NNumber pValidateonset) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_COLUMNS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_COLID", pColid);
			cmd.addParameter("@P_TBLID", pTblid);
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_COLNAME", pColname);
			cmd.addParameter("@P_COLTYPE", pColtype);
			cmd.addParameter("@P_COLTYPEDESC", pColtypedesc);
			cmd.addParameter("@P_COLAUTOINCR", pColautoincr);
			cmd.addParameter("@P_NEXTCOUNTERVALUE", pNextcountervalue);
			cmd.addParameter("@P_MAXLENGTHSOURCE", pMaxlengthsource);
			cmd.addParameter("@P_AVGLENGTHSOURCE", pAvglengthsource);
			cmd.addParameter("@P_COLTEXTSIZE", pColtextsize);
			cmd.addParameter("@P_ALLOWZEROLENGTH", pAllowzerolength);
			cmd.addParameter("@P_DEFAULTVALUE", pDefaultvalue);
			cmd.addParameter("@P_COLREQUIRED", pColrequired);
			cmd.addParameter("@P_COLCOLLATINGORDER", pColcollatingorder);
			cmd.addParameter("@P_COLORDPOSITION", pColordposition);
			cmd.addParameter("@P_VALIDATIONRULE", pValidationrule);
			cmd.addParameter("@P_VALIDATIONTEXT", pValidationtext);
			cmd.addParameter("@P_COLUMNDESCRIPTION", pColumndescription);
			cmd.addParameter("@P_COLUMNHIDDEN", pColumnhidden);
			cmd.addParameter("@P_COLUMNORDER", pColumnorder);
			cmd.addParameter("@P_COLUMNWIDTH", pColumnwidth);
			cmd.addParameter("@P_DECIMALPLACES", pDecimalplaces);
			cmd.addParameter("@P_FOREIGNNAME", pForeignname);
			cmd.addParameter("@P_VALIDATEONSET", pValidateonset);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccForms(NNumber pDbid,NNumber pFormid,NString pFormname,NString pAfterdelconfirm,NString pAfterinsert,NString pAfterupdate,NNumber pAllowadditions,NNumber pAllowdeletions,NNumber pAllowedits,NNumber pAllowediting,NNumber pAllowfilters,NNumber pAllowupdating,NNumber pAutocenter,NNumber pAutoresize,NNumber pBackcolor,NString pBeforedelconfirm,NString pBeforeinsert,NString pBeforeupdate,NNumber pBorderstyle,NString pFormcaption,NNumber pClosebutton,NNumber pControlbox,NNumber pCount,NNumber pCurrentview,NNumber pCycle,NNumber pDataentry,NNumber pDatasheetbackcolor,NNumber pDatasheetcellseffect,NNumber pDatasheetfontheight,NNumber pDatasheetfontitalic,NString pDatasheetfontname,NNumber pDatasheetfontunderline,NNumber pDatasheetfontweight,NNumber pDatasheetforecolor,NNumber pDatasheetgridlinesbehavior,NNumber pDatasheetgridlinescolor,NNumber pDefaultediting,NNumber pDefaultview,NNumber pDividinglines,NNumber pFastlaserprinting,NString pFilter,NNumber pFilteron,NNumber pFrozencolumns,NNumber pGridx,NNumber pGridy,NNumber pHasmodule,NNumber pHelpcontextid,NString pHelpfile,NNumber pHwnd,NNumber pInsideheight,NNumber pInsidewidth,NNumber pKeypreview,NNumber pLayoutforprint,NNumber pLogicalpagewidth,NNumber pMaxbutton,NString pMenubar,NNumber pMinbutton,NNumber pMinmaxbuttons,NNumber pModal,NNumber pNavigationbuttons,NString pOnactivate,NString pOnapplyfilter,NString pOnclick,NString pOnclose,NString pOncurrent,NString pOndblclick,NString pOndeactivate,NString pOndelete,NString pOnerror,NString pOnfilter,NString pOngotfocus,NString pOnkeydown,NString pOnkeypress,NString pOnkeyup,NString pOnload,NString pOnlostfocus,NString pOnmousedown,NString pOnmousemove,NString pOnmouseup,NString pOnopen,NString pOnresize,NString pOntimer,NString pOnunload,NString pOpenargs,NString pOrderby,NNumber pOrderbyon,NNumber pPainting,NString pPalettesource,NString pPicture,NNumber pPicturealignment,NNumber pPicturesizemode,NNumber pPicturetiling,NNumber pPicturetype,NNumber pPopup,NNumber pRecordlocks,NNumber pRecordselectors,NNumber pRecordsettype,NString pRecordsource,NNumber pRowheight,NNumber pScrollbars,NNumber pShortcutmenu,NString pShortcutmenubar,NNumber pShowgrid,NString pTag,NNumber pTimerinterval,NString pToolbar,NNumber pViewsallowed,NNumber pVisible,NNumber pWhatsthisbutton,NNumber pWidth,NNumber pWindowheight,NNumber pWindowwidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_FORMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_FORMID", pFormid);
			cmd.addParameter("@P_FORMNAME", pFormname);
			cmd.addParameter("@P_AFTERDELCONFIRM", pAfterdelconfirm);
			cmd.addParameter("@P_AFTERINSERT", pAfterinsert);
			cmd.addParameter("@P_AFTERUPDATE", pAfterupdate);
			cmd.addParameter("@P_ALLOWADDITIONS", pAllowadditions);
			cmd.addParameter("@P_ALLOWDELETIONS", pAllowdeletions);
			cmd.addParameter("@P_ALLOWEDITS", pAllowedits);
			cmd.addParameter("@P_ALLOWEDITING", pAllowediting);
			cmd.addParameter("@P_ALLOWFILTERS", pAllowfilters);
			cmd.addParameter("@P_ALLOWUPDATING", pAllowupdating);
			cmd.addParameter("@P_AUTOCENTER", pAutocenter);
			cmd.addParameter("@P_AUTORESIZE", pAutoresize);
			cmd.addParameter("@P_BACKCOLOR", pBackcolor);
			cmd.addParameter("@P_BEFOREDELCONFIRM", pBeforedelconfirm);
			cmd.addParameter("@P_BEFOREINSERT", pBeforeinsert);
			cmd.addParameter("@P_BEFOREUPDATE", pBeforeupdate);
			cmd.addParameter("@P_BORDERSTYLE", pBorderstyle);
			cmd.addParameter("@P_FORMCAPTION", pFormcaption);
			cmd.addParameter("@P_CLOSEBUTTON", pClosebutton);
			cmd.addParameter("@P_CONTROLBOX", pControlbox);
			cmd.addParameter("@P_COUNT", pCount);
			cmd.addParameter("@P_CURRENTVIEW", pCurrentview);
			cmd.addParameter("@P_CYCLE", pCycle);
			cmd.addParameter("@P_DATAENTRY", pDataentry);
			cmd.addParameter("@P_DATASHEETBACKCOLOR", pDatasheetbackcolor);
			cmd.addParameter("@P_DATASHEETCELLSEFFECT", pDatasheetcellseffect);
			cmd.addParameter("@P_DATASHEETFONTHEIGHT", pDatasheetfontheight);
			cmd.addParameter("@P_DATASHEETFONTITALIC", pDatasheetfontitalic);
			cmd.addParameter("@P_DATASHEETFONTNAME", pDatasheetfontname);
			cmd.addParameter("@P_DATASHEETFONTUNDERLINE", pDatasheetfontunderline);
			cmd.addParameter("@P_DATASHEETFONTWEIGHT", pDatasheetfontweight);
			cmd.addParameter("@P_DATASHEETFORECOLOR", pDatasheetforecolor);
			cmd.addParameter("@P_DATASHEETGRIDLINESBEHAVIOR", pDatasheetgridlinesbehavior);
			cmd.addParameter("@P_DATASHEETGRIDLINESCOLOR", pDatasheetgridlinescolor);
			cmd.addParameter("@P_DEFAULTEDITING", pDefaultediting);
			cmd.addParameter("@P_DEFAULTVIEW", pDefaultview);
			cmd.addParameter("@P_DIVIDINGLINES", pDividinglines);
			cmd.addParameter("@P_FASTLASERPRINTING", pFastlaserprinting);
			cmd.addParameter("@P_FILTER", pFilter);
			cmd.addParameter("@P_FILTERON", pFilteron);
			cmd.addParameter("@P_FROZENCOLUMNS", pFrozencolumns);
			cmd.addParameter("@P_GRIDX", pGridx);
			cmd.addParameter("@P_GRIDY", pGridy);
			cmd.addParameter("@P_HASMODULE", pHasmodule);
			cmd.addParameter("@P_HELPCONTEXTID", pHelpcontextid);
			cmd.addParameter("@P_HELPFILE", pHelpfile);
			cmd.addParameter("@P_HWND", pHwnd);
			cmd.addParameter("@P_INSIDEHEIGHT", pInsideheight);
			cmd.addParameter("@P_INSIDEWIDTH", pInsidewidth);
			cmd.addParameter("@P_KEYPREVIEW", pKeypreview);
			cmd.addParameter("@P_LAYOUTFORPRINT", pLayoutforprint);
			cmd.addParameter("@P_LOGICALPAGEWIDTH", pLogicalpagewidth);
			cmd.addParameter("@P_MAXBUTTON", pMaxbutton);
			cmd.addParameter("@P_MENUBAR", pMenubar);
			cmd.addParameter("@P_MINBUTTON", pMinbutton);
			cmd.addParameter("@P_MINMAXBUTTONS", pMinmaxbuttons);
			cmd.addParameter("@P_MODAL", pModal);
			cmd.addParameter("@P_NAVIGATIONBUTTONS", pNavigationbuttons);
			cmd.addParameter("@P_ONACTIVATE", pOnactivate);
			cmd.addParameter("@P_ONAPPLYFILTER", pOnapplyfilter);
			cmd.addParameter("@P_ONCLICK", pOnclick);
			cmd.addParameter("@P_ONCLOSE", pOnclose);
			cmd.addParameter("@P_ONCURRENT", pOncurrent);
			cmd.addParameter("@P_ONDBLCLICK", pOndblclick);
			cmd.addParameter("@P_ONDEACTIVATE", pOndeactivate);
			cmd.addParameter("@P_ONDELETE", pOndelete);
			cmd.addParameter("@P_ONERROR", pOnerror);
			cmd.addParameter("@P_ONFILTER", pOnfilter);
			cmd.addParameter("@P_ONGOTFOCUS", pOngotfocus);
			cmd.addParameter("@P_ONKEYDOWN", pOnkeydown);
			cmd.addParameter("@P_ONKEYPRESS", pOnkeypress);
			cmd.addParameter("@P_ONKEYUP", pOnkeyup);
			cmd.addParameter("@P_ONLOAD", pOnload);
			cmd.addParameter("@P_ONLOSTFOCUS", pOnlostfocus);
			cmd.addParameter("@P_ONMOUSEDOWN", pOnmousedown);
			cmd.addParameter("@P_ONMOUSEMOVE", pOnmousemove);
			cmd.addParameter("@P_ONMOUSEUP", pOnmouseup);
			cmd.addParameter("@P_ONOPEN", pOnopen);
			cmd.addParameter("@P_ONRESIZE", pOnresize);
			cmd.addParameter("@P_ONTIMER", pOntimer);
			cmd.addParameter("@P_ONUNLOAD", pOnunload);
			cmd.addParameter("@P_OPENARGS", pOpenargs);
			cmd.addParameter("@P_ORDERBY", pOrderby);
			cmd.addParameter("@P_ORDERBYON", pOrderbyon);
			cmd.addParameter("@P_PAINTING", pPainting);
			cmd.addParameter("@P_PALETTESOURCE", pPalettesource);
			cmd.addParameter("@P_PICTURE", pPicture);
			cmd.addParameter("@P_PICTUREALIGNMENT", pPicturealignment);
			cmd.addParameter("@P_PICTURESIZEMODE", pPicturesizemode);
			cmd.addParameter("@P_PICTURETILING", pPicturetiling);
			cmd.addParameter("@P_PICTURETYPE", pPicturetype);
			cmd.addParameter("@P_POPUP", pPopup);
			cmd.addParameter("@P_RECORDLOCKS", pRecordlocks);
			cmd.addParameter("@P_RECORDSELECTORS", pRecordselectors);
			cmd.addParameter("@P_RECORDSETTYPE", pRecordsettype);
			cmd.addParameter("@P_RECORDSOURCE", pRecordsource);
			cmd.addParameter("@P_ROWHEIGHT", pRowheight);
			cmd.addParameter("@P_SCROLLBARS", pScrollbars);
			cmd.addParameter("@P_SHORTCUTMENU", pShortcutmenu);
			cmd.addParameter("@P_SHORTCUTMENUBAR", pShortcutmenubar);
			cmd.addParameter("@P_SHOWGRID", pShowgrid);
			cmd.addParameter("@P_TAG", pTag);
			cmd.addParameter("@P_TIMERINTERVAL", pTimerinterval);
			cmd.addParameter("@P_TOOLBAR", pToolbar);
			cmd.addParameter("@P_VIEWSALLOWED", pViewsallowed);
			cmd.addParameter("@P_VISIBLE", pVisible);
			cmd.addParameter("@P_WHATSTHISBUTTON", pWhatsthisbutton);
			cmd.addParameter("@P_WIDTH", pWidth);
			cmd.addParameter("@P_WINDOWHEIGHT", pWindowheight);
			cmd.addParameter("@P_WINDOWWIDTH", pWindowwidth);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccFormsControls(NNumber pDbid,NNumber pFormid,NNumber pControlid,NString pControlname,NNumber pControltype,NString pEventprocprefix,NNumber pInselection,NNumber pLeft,NString pParent,NNumber pSection,NString pTag,NNumber pTop,NNumber pVisible,NNumber pBackcolor,NNumber pBackstyle,NNumber pBoundcolumn,NString pCtrlcaption,NNumber pColumncount,NString pColumnheads,NString pColumnwidths,NString pControlsource,NString pControltiptext,NString pDefaultvalue,NNumber pDisplaywhen,NNumber pEnabled,NNumber pFontbold,NNumber pFontitalic,NString pFontname,NNumber pFontsize,NNumber pFontunderline,NNumber pFontwheight,NNumber pForecolor,NString pFormat,NNumber pHeight,NNumber pHelpcontextid,NNumber pLimittolist,NString pLinkchildfields,NString pLinkmasterfields,NNumber pListrows,NNumber pMultirow,NString pOnchange,NString pOnclick,NString pOndblclick,NString pOnkeydown,NString pOnkeypress,NString pOnkeyup,NString pOnmousedown,NString pOnmousemove,NString pOnmouseup,NNumber pOptionvalue,NNumber pPageindex,NString pPicture,NNumber pPicturealignment,NNumber pPictureresizemode,NNumber pPicturetiling,NNumber pPicturetype,NString pRowsource,NString pRowsourcetype,NString pShortcutmenubar,NString pSourceobject,NString pStatusbartext,NNumber pStyle,NNumber pTabfixedheight,NNumber pTabfixedwidth,NNumber pTabindex,NNumber pTabstop,NNumber pTextalign,NNumber pTextfontcharset,NNumber pWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_FORMS_CONTROLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_FORMID", pFormid);
			cmd.addParameter("@P_CONTROLID", pControlid);
			cmd.addParameter("@P_CONTROLNAME", pControlname);
			cmd.addParameter("@P_CONTROLTYPE", pControltype);
			cmd.addParameter("@P_EVENTPROCPREFIX", pEventprocprefix);
			cmd.addParameter("@P_INSELECTION", pInselection);
			cmd.addParameter("@P_LEFT", pLeft);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_SECTION", pSection);
			cmd.addParameter("@P_TAG", pTag);
			cmd.addParameter("@P_TOP", pTop);
			cmd.addParameter("@P_VISIBLE", pVisible);
			cmd.addParameter("@P_BACKCOLOR", pBackcolor);
			cmd.addParameter("@P_BACKSTYLE", pBackstyle);
			cmd.addParameter("@P_BOUNDCOLUMN", pBoundcolumn);
			cmd.addParameter("@P_CTRLCAPTION", pCtrlcaption);
			cmd.addParameter("@P_COLUMNCOUNT", pColumncount);
			cmd.addParameter("@P_COLUMNHEADS", pColumnheads);
			cmd.addParameter("@P_COLUMNWIDTHS", pColumnwidths);
			cmd.addParameter("@P_CONTROLSOURCE", pControlsource);
			cmd.addParameter("@P_CONTROLTIPTEXT", pControltiptext);
			cmd.addParameter("@P_DEFAULTVALUE", pDefaultvalue);
			cmd.addParameter("@P_DISPLAYWHEN", pDisplaywhen);
			cmd.addParameter("@P_ENABLED", pEnabled);
			cmd.addParameter("@P_FONTBOLD", pFontbold);
			cmd.addParameter("@P_FONTITALIC", pFontitalic);
			cmd.addParameter("@P_FONTNAME", pFontname);
			cmd.addParameter("@P_FONTSIZE", pFontsize);
			cmd.addParameter("@P_FONTUNDERLINE", pFontunderline);
			cmd.addParameter("@P_FONTWHEIGHT", pFontwheight);
			cmd.addParameter("@P_FORECOLOR", pForecolor);
			cmd.addParameter("@P_FORMAT", pFormat);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_HELPCONTEXTID", pHelpcontextid);
			cmd.addParameter("@P_LIMITTOLIST", pLimittolist);
			cmd.addParameter("@P_LINKCHILDFIELDS", pLinkchildfields);
			cmd.addParameter("@P_LINKMASTERFIELDS", pLinkmasterfields);
			cmd.addParameter("@P_LISTROWS", pListrows);
			cmd.addParameter("@P_MULTIROW", pMultirow);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONCLICK", pOnclick);
			cmd.addParameter("@P_ONDBLCLICK", pOndblclick);
			cmd.addParameter("@P_ONKEYDOWN", pOnkeydown);
			cmd.addParameter("@P_ONKEYPRESS", pOnkeypress);
			cmd.addParameter("@P_ONKEYUP", pOnkeyup);
			cmd.addParameter("@P_ONMOUSEDOWN", pOnmousedown);
			cmd.addParameter("@P_ONMOUSEMOVE", pOnmousemove);
			cmd.addParameter("@P_ONMOUSEUP", pOnmouseup);
			cmd.addParameter("@P_OPTIONVALUE", pOptionvalue);
			cmd.addParameter("@P_PAGEINDEX", pPageindex);
			cmd.addParameter("@P_PICTURE", pPicture);
			cmd.addParameter("@P_PICTUREALIGNMENT", pPicturealignment);
			cmd.addParameter("@P_PICTURERESIZEMODE", pPictureresizemode);
			cmd.addParameter("@P_PICTURETILING", pPicturetiling);
			cmd.addParameter("@P_PICTURETYPE", pPicturetype);
			cmd.addParameter("@P_ROWSOURCE", pRowsource);
			cmd.addParameter("@P_ROWSOURCETYPE", pRowsourcetype);
			cmd.addParameter("@P_SHORTCUTMENUBAR", pShortcutmenubar);
			cmd.addParameter("@P_SOURCEOBJECT", pSourceobject);
			cmd.addParameter("@P_STATUSBARTEXT", pStatusbartext);
			cmd.addParameter("@P_STYLE", pStyle);
			cmd.addParameter("@P_TABFIXEDHEIGHT", pTabfixedheight);
			cmd.addParameter("@P_TABFIXEDWIDTH", pTabfixedwidth);
			cmd.addParameter("@P_TABINDEX", pTabindex);
			cmd.addParameter("@P_TABSTOP", pTabstop);
			cmd.addParameter("@P_TEXTALIGN", pTextalign);
			cmd.addParameter("@P_TEXTFONTCHARSET", pTextfontcharset);
			cmd.addParameter("@P_WIDTH", pWidth);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccFormsModules(NNumber pDbid,NNumber pModuleid,NNumber pFormid,NString pModulename,NNumber pCountofdeclarationlines,NNumber pCountoflines,NString pLines,NNumber pModuletype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_FORMS_MODULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_MODULEID", pModuleid);
			cmd.addParameter("@P_FORMID", pFormid);
			cmd.addParameter("@P_MODULENAME", pModulename);
			cmd.addParameter("@P_COUNTOFDECLARATIONLINES", pCountofdeclarationlines);
			cmd.addParameter("@P_COUNTOFLINES", pCountoflines);
			cmd.addParameter("@P_LINES", pLines);
			cmd.addParameter("@P_MODULETYPE", pModuletype);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccFormsPerm(NNumber pDbid,NNumber pFormid,NNumber pUserid,NNumber pPermissionid,NNumber pPermission,NString pPermissionDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_FORMS_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_FORMID", pFormid);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_PERMISSIONID", pPermissionid);
			cmd.addParameter("@P_PERMISSION", pPermission);
			cmd.addParameter("@P_PERMISSION_DESC", pPermissionDesc);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccGroups(NNumber pGroupid,NString pGrpname,NNumber pDbid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_GROUPS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_GROUPID", pGroupid);
			cmd.addParameter("@P_GRPNAME", pGrpname);
			cmd.addParameter("@P_DBID", pDbid);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccGrpsmembers(NNumber pDbid,NNumber pGrpmbrid,NNumber pUserid,NNumber pGroupid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_GRPSMEMBERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_GRPMBRID", pGrpmbrid);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_GROUPID", pGroupid);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccIdxCols(NNumber pIndcolid,NNumber pIndid,NNumber pColid,NNumber pDbid,NNumber pColorder,NNumber pTblid,NString pColname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_IDX_COLS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INDCOLID", pIndcolid);
			cmd.addParameter("@P_INDID", pIndid);
			cmd.addParameter("@P_COLID", pColid);
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_COLORDER", pColorder);
			cmd.addParameter("@P_TBLID", pTblid);
			cmd.addParameter("@P_COLNAME", pColname);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccIndexes(NNumber pIndid,NNumber pTblid,NNumber pDbid,NString pIndname,NNumber pCnvindex,NNumber pIsprimary,NNumber pIsunique,NNumber pIsforeign,NNumber pIgnorenulls,NNumber pIsrequired,NNumber pDistinctcount,NNumber pIsclustered) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_INDEXES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_INDID", pIndid);
			cmd.addParameter("@P_TBLID", pTblid);
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_INDNAME", pIndname);
			cmd.addParameter("@P_CNVINDEX", pCnvindex);
			cmd.addParameter("@P_ISPRIMARY", pIsprimary);
			cmd.addParameter("@P_ISUNIQUE", pIsunique);
			cmd.addParameter("@P_ISFOREIGN", pIsforeign);
			cmd.addParameter("@P_IGNORENULLS", pIgnorenulls);
			cmd.addParameter("@P_ISREQUIRED", pIsrequired);
			cmd.addParameter("@P_DISTINCTCOUNT", pDistinctcount);
			cmd.addParameter("@P_ISCLUSTERED", pIsclustered);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccMdlPerm(NNumber pDbid,NNumber pModuleid,NNumber pUserid,NNumber pPermissionid,NNumber pPermission,NString pPermissionDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_MDL_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_MODULEID", pModuleid);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_PERMISSIONID", pPermissionid);
			cmd.addParameter("@P_PERMISSION", pPermission);
			cmd.addParameter("@P_PERMISSION_DESC", pPermissionDesc);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccModules(NNumber pDbid,NNumber pModuleid,NString pModulename,NNumber pCountofdeclarationlines,NNumber pCountoflines,NString pLines,NNumber pModuletype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_MODULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_MODULEID", pModuleid);
			cmd.addParameter("@P_MODULENAME", pModulename);
			cmd.addParameter("@P_COUNTOFDECLARATIONLINES", pCountofdeclarationlines);
			cmd.addParameter("@P_COUNTOFLINES", pCountoflines);
			cmd.addParameter("@P_LINES", pLines);
			cmd.addParameter("@P_MODULETYPE", pModuletype);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccPages(NNumber pDbid,NNumber pPageid,NString pPagename,NString pDatecreated,NString pDatemodified,NNumber pPagetype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_PAGES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_PAGEID", pPageid);
			cmd.addParameter("@P_PAGENAME", pPagename);
			cmd.addParameter("@P_DATECREATED", pDatecreated);
			cmd.addParameter("@P_DATEMODIFIED", pDatemodified);
			cmd.addParameter("@P_PAGETYPE", pPagetype);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccQueries(NNumber pDbid,NNumber pQryid,NString pQrytype,NString pQryname,NString pQrysql,NString pDatecreated,NString pQueryLastupdated,NNumber pMaxrecords,NNumber pOdbctimeout,NString pReturnsrecords,NString pUpdatable,NString pDateCreated,NString pDateModified) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_QUERIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_QRYID", pQryid);
			cmd.addParameter("@P_QRYTYPE", pQrytype);
			cmd.addParameter("@P_QRYNAME", pQryname);
			cmd.addParameter("@P_QRYSQL", pQrysql);
			cmd.addParameter("@P_DATECREATED", pDatecreated);
			cmd.addParameter("@P_QUERY_LASTUPDATED", pQueryLastupdated);
			cmd.addParameter("@P_MAXRECORDS", pMaxrecords);
			cmd.addParameter("@P_ODBCTIMEOUT", pOdbctimeout);
			cmd.addParameter("@P_RETURNSRECORDS", pReturnsrecords);
			cmd.addParameter("@P_UPDATABLE", pUpdatable);
			cmd.addParameter("@P_DATE_CREATED", pDateCreated);
			cmd.addParameter("@P_DATE_MODIFIED", pDateModified);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccRelCol(NNumber pDbid,NNumber pRelcolid,NNumber pRelid,NNumber pParentcolid,NNumber pChildcolid,NString pRelcolname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_REL_COL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_RELCOLID", pRelcolid);
			cmd.addParameter("@P_RELID", pRelid);
			cmd.addParameter("@P_PARENTCOLID", pParentcolid);
			cmd.addParameter("@P_CHILDCOLID", pChildcolid);
			cmd.addParameter("@P_RELCOLNAME", pRelcolname);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccRelations(NNumber pDbid,NNumber pRelid,NString pRelname,NNumber pParenttblid,NNumber pChildtblid,NNumber pIsunique,NNumber pIsenforced,NNumber pIsinherited,NNumber pIsupdatecascade,NNumber pIsdeletecascade,NNumber pCnvrelation) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_RELATIONS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_RELID", pRelid);
			cmd.addParameter("@P_RELNAME", pRelname);
			cmd.addParameter("@P_PARENTTBLID", pParenttblid);
			cmd.addParameter("@P_CHILDTBLID", pChildtblid);
			cmd.addParameter("@P_ISUNIQUE", pIsunique);
			cmd.addParameter("@P_ISENFORCED", pIsenforced);
			cmd.addParameter("@P_ISINHERITED", pIsinherited);
			cmd.addParameter("@P_ISUPDATECASCADE", pIsupdatecascade);
			cmd.addParameter("@P_ISDELETECASCADE", pIsdeletecascade);
			cmd.addParameter("@P_CNVRELATION", pCnvrelation);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccReports(NNumber pDbid,NNumber pReportid,NString pRepname,NNumber pBackcolor,NString pRepcaption,NNumber pCount,NNumber pDategrouping,NNumber pFastlaserprinting,NString pFilter,NNumber pFilteron,NNumber pGridx,NNumber pGridy,NNumber pGrpkeeptogether,NNumber pHasmodule,NNumber pHelpcontextid,NString pHelpfile,NNumber pHwnd,NNumber pLayoutforprint,NNumber pLogicalpagewidth,NNumber pMaxbutton,NString pMenubar,NNumber pMinbutton,NString pOnactivate,NString pOnclose,NString pOndeactivate,NString pOnerror,NString pOnnodata,NString pOnopen,NString pOnpage,NString pOrderby,NString pOrderbyon,NNumber pPagefooter,NNumber pPageheader,NNumber pPainting,NString pPalettesource,NString pPicture,NNumber pPicturealignment,NNumber pPicturesizemode,NNumber pPicturetiling,NNumber pPicturetype,NNumber pRecordlocks,NString pRecordsource,NString pShortcutmenubar,NString pTag,NString pToolbar,NNumber pVisible,NNumber pWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_REPORTS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_REPORTID", pReportid);
			cmd.addParameter("@P_REPNAME", pRepname);
			cmd.addParameter("@P_BACKCOLOR", pBackcolor);
			cmd.addParameter("@P_REPCAPTION", pRepcaption);
			cmd.addParameter("@P_COUNT", pCount);
			cmd.addParameter("@P_DATEGROUPING", pDategrouping);
			cmd.addParameter("@P_FASTLASERPRINTING", pFastlaserprinting);
			cmd.addParameter("@P_FILTER", pFilter);
			cmd.addParameter("@P_FILTERON", pFilteron);
			cmd.addParameter("@P_GRIDX", pGridx);
			cmd.addParameter("@P_GRIDY", pGridy);
			cmd.addParameter("@P_GRPKEEPTOGETHER", pGrpkeeptogether);
			cmd.addParameter("@P_HASMODULE", pHasmodule);
			cmd.addParameter("@P_HELPCONTEXTID", pHelpcontextid);
			cmd.addParameter("@P_HELPFILE", pHelpfile);
			cmd.addParameter("@P_HWND", pHwnd);
			cmd.addParameter("@P_LAYOUTFORPRINT", pLayoutforprint);
			cmd.addParameter("@P_LOGICALPAGEWIDTH", pLogicalpagewidth);
			cmd.addParameter("@P_MAXBUTTON", pMaxbutton);
			cmd.addParameter("@P_MENUBAR", pMenubar);
			cmd.addParameter("@P_MINBUTTON", pMinbutton);
			cmd.addParameter("@P_ONACTIVATE", pOnactivate);
			cmd.addParameter("@P_ONCLOSE", pOnclose);
			cmd.addParameter("@P_ONDEACTIVATE", pOndeactivate);
			cmd.addParameter("@P_ONERROR", pOnerror);
			cmd.addParameter("@P_ONNODATA", pOnnodata);
			cmd.addParameter("@P_ONOPEN", pOnopen);
			cmd.addParameter("@P_ONPAGE", pOnpage);
			cmd.addParameter("@P_ORDERBY", pOrderby);
			cmd.addParameter("@P_ORDERBYON", pOrderbyon);
			cmd.addParameter("@P_PAGEFOOTER", pPagefooter);
			cmd.addParameter("@P_PAGEHEADER", pPageheader);
			cmd.addParameter("@P_PAINTING", pPainting);
			cmd.addParameter("@P_PALETTESOURCE", pPalettesource);
			cmd.addParameter("@P_PICTURE", pPicture);
			cmd.addParameter("@P_PICTUREALIGNMENT", pPicturealignment);
			cmd.addParameter("@P_PICTURESIZEMODE", pPicturesizemode);
			cmd.addParameter("@P_PICTURETILING", pPicturetiling);
			cmd.addParameter("@P_PICTURETYPE", pPicturetype);
			cmd.addParameter("@P_RECORDLOCKS", pRecordlocks);
			cmd.addParameter("@P_RECORDSOURCE", pRecordsource);
			cmd.addParameter("@P_SHORTCUTMENUBAR", pShortcutmenubar);
			cmd.addParameter("@P_TAG", pTag);
			cmd.addParameter("@P_TOOLBAR", pToolbar);
			cmd.addParameter("@P_VISIBLE", pVisible);
			cmd.addParameter("@P_WIDTH", pWidth);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccRptCtl(NNumber pDbid,NNumber pReportid,NNumber pControlid,NString pControlname,NNumber pControltype,NString pEventprocprefix,NNumber pInselection,NNumber pLeft,NString pParent,NNumber pSection,NString pTag,NNumber pTop,NNumber pVisible,NNumber pBackcolor,NNumber pBackstyle,NNumber pBoundcolumn,NString pCtrlcaption,NNumber pColumncount,NString pColumnheads,NString pColumnwidths,NString pControlsource,NString pControltiptext,NString pDefaultvalue,NNumber pDisplaywhen,NNumber pEnabled,NNumber pFontbold,NNumber pFontitalic,NString pFontname,NNumber pFontsize,NNumber pFontunderline,NNumber pFontwheight,NNumber pForecolor,NString pFormat,NNumber pHeight,NNumber pHelpcontextid,NNumber pLimittolist,NString pLinkchildfields,NString pLinkmasterfields,NNumber pListrows,NNumber pMultirow,NString pOnchange,NString pOnclick,NString pOndblclick,NString pOnkeydown,NString pOnkeypress,NString pOnkeyup,NString pOnmousedown,NString pOnmousemove,NString pOnmouseup,NNumber pOptionvalue,NNumber pPageindex,NString pPicture,NNumber pPicturealignment,NNumber pPictureresizemode,NNumber pPicturetiling,NNumber pPicturetype,NString pRowsource,NString pRowsourcetype,NString pShortcutmenubar,NString pSourceobject,NString pStatusbartext,NNumber pStyle,NNumber pTabfixedheight,NNumber pTabfixedwidth,NNumber pTabindex,NNumber pTabstop,NNumber pTextalign,NNumber pTextfontcharset,NNumber pWidth) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_RPT_CTL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_REPORTID", pReportid);
			cmd.addParameter("@P_CONTROLID", pControlid);
			cmd.addParameter("@P_CONTROLNAME", pControlname);
			cmd.addParameter("@P_CONTROLTYPE", pControltype);
			cmd.addParameter("@P_EVENTPROCPREFIX", pEventprocprefix);
			cmd.addParameter("@P_INSELECTION", pInselection);
			cmd.addParameter("@P_LEFT", pLeft);
			cmd.addParameter("@P_PARENT", pParent);
			cmd.addParameter("@P_SECTION", pSection);
			cmd.addParameter("@P_TAG", pTag);
			cmd.addParameter("@P_TOP", pTop);
			cmd.addParameter("@P_VISIBLE", pVisible);
			cmd.addParameter("@P_BACKCOLOR", pBackcolor);
			cmd.addParameter("@P_BACKSTYLE", pBackstyle);
			cmd.addParameter("@P_BOUNDCOLUMN", pBoundcolumn);
			cmd.addParameter("@P_CTRLCAPTION", pCtrlcaption);
			cmd.addParameter("@P_COLUMNCOUNT", pColumncount);
			cmd.addParameter("@P_COLUMNHEADS", pColumnheads);
			cmd.addParameter("@P_COLUMNWIDTHS", pColumnwidths);
			cmd.addParameter("@P_CONTROLSOURCE", pControlsource);
			cmd.addParameter("@P_CONTROLTIPTEXT", pControltiptext);
			cmd.addParameter("@P_DEFAULTVALUE", pDefaultvalue);
			cmd.addParameter("@P_DISPLAYWHEN", pDisplaywhen);
			cmd.addParameter("@P_ENABLED", pEnabled);
			cmd.addParameter("@P_FONTBOLD", pFontbold);
			cmd.addParameter("@P_FONTITALIC", pFontitalic);
			cmd.addParameter("@P_FONTNAME", pFontname);
			cmd.addParameter("@P_FONTSIZE", pFontsize);
			cmd.addParameter("@P_FONTUNDERLINE", pFontunderline);
			cmd.addParameter("@P_FONTWHEIGHT", pFontwheight);
			cmd.addParameter("@P_FORECOLOR", pForecolor);
			cmd.addParameter("@P_FORMAT", pFormat);
			cmd.addParameter("@P_HEIGHT", pHeight);
			cmd.addParameter("@P_HELPCONTEXTID", pHelpcontextid);
			cmd.addParameter("@P_LIMITTOLIST", pLimittolist);
			cmd.addParameter("@P_LINKCHILDFIELDS", pLinkchildfields);
			cmd.addParameter("@P_LINKMASTERFIELDS", pLinkmasterfields);
			cmd.addParameter("@P_LISTROWS", pListrows);
			cmd.addParameter("@P_MULTIROW", pMultirow);
			cmd.addParameter("@P_ONCHANGE", pOnchange);
			cmd.addParameter("@P_ONCLICK", pOnclick);
			cmd.addParameter("@P_ONDBLCLICK", pOndblclick);
			cmd.addParameter("@P_ONKEYDOWN", pOnkeydown);
			cmd.addParameter("@P_ONKEYPRESS", pOnkeypress);
			cmd.addParameter("@P_ONKEYUP", pOnkeyup);
			cmd.addParameter("@P_ONMOUSEDOWN", pOnmousedown);
			cmd.addParameter("@P_ONMOUSEMOVE", pOnmousemove);
			cmd.addParameter("@P_ONMOUSEUP", pOnmouseup);
			cmd.addParameter("@P_OPTIONVALUE", pOptionvalue);
			cmd.addParameter("@P_PAGEINDEX", pPageindex);
			cmd.addParameter("@P_PICTURE", pPicture);
			cmd.addParameter("@P_PICTUREALIGNMENT", pPicturealignment);
			cmd.addParameter("@P_PICTURERESIZEMODE", pPictureresizemode);
			cmd.addParameter("@P_PICTURETILING", pPicturetiling);
			cmd.addParameter("@P_PICTURETYPE", pPicturetype);
			cmd.addParameter("@P_ROWSOURCE", pRowsource);
			cmd.addParameter("@P_ROWSOURCETYPE", pRowsourcetype);
			cmd.addParameter("@P_SHORTCUTMENUBAR", pShortcutmenubar);
			cmd.addParameter("@P_SOURCEOBJECT", pSourceobject);
			cmd.addParameter("@P_STATUSBARTEXT", pStatusbartext);
			cmd.addParameter("@P_STYLE", pStyle);
			cmd.addParameter("@P_TABFIXEDHEIGHT", pTabfixedheight);
			cmd.addParameter("@P_TABFIXEDWIDTH", pTabfixedwidth);
			cmd.addParameter("@P_TABINDEX", pTabindex);
			cmd.addParameter("@P_TABSTOP", pTabstop);
			cmd.addParameter("@P_TEXTALIGN", pTextalign);
			cmd.addParameter("@P_TEXTFONTCHARSET", pTextfontcharset);
			cmd.addParameter("@P_WIDTH", pWidth);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccRptPerms(NNumber pDbid,NNumber pReportid,NNumber pUserid,NNumber pPermissionid,NNumber pPermission,NString pPermissionDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_RPT_PERMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_REPORTID", pReportid);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_PERMISSIONID", pPermissionid);
			cmd.addParameter("@P_PERMISSION", pPermission);
			cmd.addParameter("@P_PERMISSION_DESC", pPermissionDesc);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccRptsModules(NNumber pDbid,NNumber pModuleid,NNumber pReportid,NString pModulename,NNumber pCountofdeclarationlines,NNumber pCountoflines,NString pLines,NNumber pModuletype) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_RPTS_MODULES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_MODULEID", pModuleid);
			cmd.addParameter("@P_REPORTID", pReportid);
			cmd.addParameter("@P_MODULENAME", pModulename);
			cmd.addParameter("@P_COUNTOFDECLARATIONLINES", pCountofdeclarationlines);
			cmd.addParameter("@P_COUNTOFLINES", pCountoflines);
			cmd.addParameter("@P_LINES", pLines);
			cmd.addParameter("@P_MODULETYPE", pModuletype);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccTabPerm(NNumber pDbid,NNumber pTblid,NNumber pUserid,NNumber pPermissionid,NNumber pPermission,NString pPermissionDesc) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_TAB_PERM", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_TBLID", pTblid);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_PERMISSIONID", pPermissionid);
			cmd.addParameter("@P_PERMISSION", pPermission);
			cmd.addParameter("@P_PERMISSION_DESC", pPermissionDesc);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccTables(NNumber pTblid,NNumber pDbid,NString pTblname,NNumber pPrimarykey,NNumber pCnvtablestruct,NNumber pCnvmovedata,NNumber pCnvri,NNumber pCnvvalidation,NNumber pCnvdefault,NNumber pCnvaddtimestamp,NNumber pAttachtablebacktoaccess,NNumber pSavepassword,NNumber pCnvmakeupdateable,NNumber pRetainlocalcopy,NNumber pSyncwithserver,NNumber pOwnerid,NString pValidationtext,NString pValidationrule,NNumber pNumberofrows,NNumber pCachingtable,NString pDescription,NNumber pAttributes,NNumber pConflicttable,NString pDatecreated,NString pLastupdated,NNumber pRecordcount,NNumber pOrderbyon,NNumber pReplicafilter,NString pSourcetablename,NNumber pUpdatable) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_TABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_TBLID", pTblid);
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_TBLNAME", pTblname);
			cmd.addParameter("@P_PRIMARYKEY", pPrimarykey);
			cmd.addParameter("@P_CNVTABLESTRUCT", pCnvtablestruct);
			cmd.addParameter("@P_CNVMOVEDATA", pCnvmovedata);
			cmd.addParameter("@P_CNVRI", pCnvri);
			cmd.addParameter("@P_CNVVALIDATION", pCnvvalidation);
			cmd.addParameter("@P_CNVDEFAULT", pCnvdefault);
			cmd.addParameter("@P_CNVADDTIMESTAMP", pCnvaddtimestamp);
			cmd.addParameter("@P_ATTACHTABLEBACKTOACCESS", pAttachtablebacktoaccess);
			cmd.addParameter("@P_SAVEPASSWORD", pSavepassword);
			cmd.addParameter("@P_CNVMAKEUPDATEABLE", pCnvmakeupdateable);
			cmd.addParameter("@P_RETAINLOCALCOPY", pRetainlocalcopy);
			cmd.addParameter("@P_SYNCWITHSERVER", pSyncwithserver);
			cmd.addParameter("@P_OWNERID", pOwnerid);
			cmd.addParameter("@P_VALIDATIONTEXT", pValidationtext);
			cmd.addParameter("@P_VALIDATIONRULE", pValidationrule);
			cmd.addParameter("@P_NUMBEROFROWS", pNumberofrows);
			cmd.addParameter("@P_CACHINGTABLE", pCachingtable);
			cmd.addParameter("@P_DESCRIPTION", pDescription);
			cmd.addParameter("@P_ATTRIBUTES", pAttributes);
			cmd.addParameter("@P_CONFLICTTABLE", pConflicttable);
			cmd.addParameter("@P_DATECREATED", pDatecreated);
			cmd.addParameter("@P_LASTUPDATED", pLastupdated);
			cmd.addParameter("@P_RECORDCOUNT", pRecordcount);
			cmd.addParameter("@P_ORDERBYON", pOrderbyon);
			cmd.addParameter("@P_REPLICAFILTER", pReplicafilter);
			cmd.addParameter("@P_SOURCETABLENAME", pSourcetablename);
			cmd.addParameter("@P_UPDATABLE", pUpdatable);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccUsers(NNumber pDbid,NNumber pUserid,NString pUsername) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACC_USERS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_USERID", pUserid);
			cmd.addParameter("@P_USERNAME", pUsername);
				
			cmd.execute();


		}
		
		public static void insWwvMigAccess(NNumber pDbid,NString pDbname,NString pDbsize,NString pDbpathname,NString pDbuser,NString pDbpassword,NNumber pIsappdb,NNumber pIsattacheddb,NNumber pConvertdb,NNumber pJetversion,NString pAccessversion,NNumber pBuild,NNumber pCollatingorder,NNumber pQuerytimeout,NString pStartupform,NNumber pStartupshowstatusbar) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_ACCESS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_DBNAME", pDbname);
			cmd.addParameter("@P_DBSIZE", pDbsize);
			cmd.addParameter("@P_DBPATHNAME", pDbpathname);
			cmd.addParameter("@P_DBUSER", pDbuser);
			cmd.addParameter("@P_DBPASSWORD", pDbpassword);
			cmd.addParameter("@P_ISAPPDB", pIsappdb);
			cmd.addParameter("@P_ISATTACHEDDB", pIsattacheddb);
			cmd.addParameter("@P_CONVERTDB", pConvertdb);
			cmd.addParameter("@P_JETVERSION", pJetversion);
			cmd.addParameter("@P_ACCESSVERSION", pAccessversion);
			cmd.addParameter("@P_BUILD", pBuild);
			cmd.addParameter("@P_COLLATINGORDER", pCollatingorder);
			cmd.addParameter("@P_QUERYTIMEOUT", pQuerytimeout);
			cmd.addParameter("@P_STARTUPFORM", pStartupform);
			cmd.addParameter("@P_STARTUPSHOWSTATUSBAR", pStartupshowstatusbar);
				
			cmd.execute();


		}
		
		public static void insWwvMigRevQueries(NNumber pProjectId,NNumber pDbid,NNumber pQryid,NString pOrigQryname,NString pMigTblname,NString pOrigSql,NString pMigSql,NString pOwner,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_REV_QUERIES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROJECT_ID", pProjectId);
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_QRYID", pQryid);
			cmd.addParameter("@P_ORIG_QRYNAME", pOrigQryname);
			cmd.addParameter("@P_MIG_TBLNAME", pMigTblname);
			cmd.addParameter("@P_ORIG_SQL", pOrigSql);
			cmd.addParameter("@P_MIG_SQL", pMigSql);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static void insWwvMigRevTables(NNumber pProjectId,NNumber pDbid,NNumber pTblid,NString pOrigTblname,NString pMigTblname,NString pOwner,NString pStatus) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.INS_WWV_MIG_REV_TABLES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PROJECT_ID", pProjectId);
			cmd.addParameter("@P_DBID", pDbid);
			cmd.addParameter("@P_TBLID", pTblid);
			cmd.addParameter("@P_ORIG_TBLNAME", pOrigTblname);
			cmd.addParameter("@P_MIG_TBLNAME", pMigTblname);
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_STATUS", pStatus);
				
			cmd.execute();


		}
		
		public static NBool FisAccessExport(NNumber pFileId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_MIG_ACC_LOAD.IS_ACCESS_EXPORT", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NBool.class);
			cmd.addParameter("@P_FILE_ID", pFileId);
				
			cmd.execute();

			return cmd.getReturnValue(NBool.class);

		}
		
	
	
	
}
