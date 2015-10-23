package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvRenderCalendar2 {
		public static void show(NString pQuery,NNumber pMinMonth,NNumber pMinRow,NNumber pMaxMonths,NNumber pMaxRows,NString pMondayFridayOnly,NString pMonthFontFace,NString pMonthFontSize,NString pMonthFontColor,NString pDayFontFace,NString pDayFontSize,NString pDayFontColor,NString pCellFontFace,NString pCellFontSize,NString pCellFontColor,NString pPageWidth,NString pHeadingBgcolor,NString pTableBgcolor,NString pTableCattributes,NString pShowMonthAboveTab,NString pNonCurrMonthAttr,NString pCurrDayAttr,NString pMinBlankCellHeight,NString pCarotCharacter,NString pCalendarDayDateFmt,NDate pCurLocalDate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_RENDER_CALENDAR2.SHOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_MIN_MONTH", pMinMonth);
			cmd.addParameter("@P_MIN_ROW", pMinRow);
			cmd.addParameter("@P_MAX_MONTHS", pMaxMonths);
			cmd.addParameter("@P_MAX_ROWS", pMaxRows);
			cmd.addParameter("@P_MONDAY_FRIDAY_ONLY", pMondayFridayOnly);
			cmd.addParameter("@P_MONTH_FONT_FACE", pMonthFontFace);
			cmd.addParameter("@P_MONTH_FONT_SIZE", pMonthFontSize);
			cmd.addParameter("@P_MONTH_FONT_COLOR", pMonthFontColor);
			cmd.addParameter("@P_DAY_FONT_FACE", pDayFontFace);
			cmd.addParameter("@P_DAY_FONT_SIZE", pDayFontSize);
			cmd.addParameter("@P_DAY_FONT_COLOR", pDayFontColor);
			cmd.addParameter("@P_CELL_FONT_FACE", pCellFontFace);
			cmd.addParameter("@P_CELL_FONT_SIZE", pCellFontSize);
			cmd.addParameter("@P_CELL_FONT_COLOR", pCellFontColor);
			cmd.addParameter("@P_PAGE_WIDTH", pPageWidth);
			cmd.addParameter("@P_HEADING_BGCOLOR", pHeadingBgcolor);
			cmd.addParameter("@P_TABLE_BGCOLOR", pTableBgcolor);
			cmd.addParameter("@P_TABLE_CATTRIBUTES", pTableCattributes);
			cmd.addParameter("@P_SHOW_MONTH_ABOVE_TAB", pShowMonthAboveTab);
			cmd.addParameter("@P_NON_CURR_MONTH_ATTR", pNonCurrMonthAttr);
			cmd.addParameter("@P_CURR_DAY_ATTR", pCurrDayAttr);
			cmd.addParameter("@P_MIN_BLANK_CELL_HEIGHT", pMinBlankCellHeight);
			cmd.addParameter("@P_CAROT_CHARACTER", pCarotCharacter);
			cmd.addParameter("@P_CALENDAR_DAY_DATE_FMT", pCalendarDayDateFmt);
			cmd.addParameter("@P_CUR_LOCAL_DATE", pCurLocalDate);
				
			cmd.execute();


		}
		
	
	
	
}
