package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvRenderChart2 {
//		public static void show(NString pQuery,List<WwvFlowGlobal.VcArr2Row> pParmNames,List<WwvFlowGlobal.VcArr2Row> pParmValues,NString pChartType,NString pBarImage,NString pChartTitle,NString pAxis,NNumber pScale,NNumber pBarWidth,NNumber pBarHeight,NString pNumMask,NString pFontSize,NString pFontColor,NString pFontFace,NNumber pMaxRows,NNumber pMinRow,NString pShowSummary,NString pImagePrefix,NString pUseFlowPagination) {
//			
//			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_RENDER_CHART2.SHOW", DbManager.getDataBaseFactory());
//			
//			cmd.addParameter("@P_QUERY", pQuery);
//			// cmd.addParameter(DbTypes.getTableType("P_PARM_NAMES", "", pParmNames, object.class));
//			// cmd.addParameter(DbTypes.getTableType("P_PARM_VALUES", "", pParmValues, object.class));
//			cmd.addParameter("@P_CHART_TYPE", pChartType);
//			cmd.addParameter("@P_BAR_IMAGE", pBarImage);
//			cmd.addParameter("@P_CHART_TITLE", pChartTitle);
//			cmd.addParameter("@P_AXIS", pAxis);
//			cmd.addParameter("@P_SCALE", pScale);
//			cmd.addParameter("@P_BAR_WIDTH", pBarWidth);
//			cmd.addParameter("@P_BAR_HEIGHT", pBarHeight);
//			cmd.addParameter("@P_NUM_MASK", pNumMask);
//			cmd.addParameter("@P_FONT_SIZE", pFontSize);
//			cmd.addParameter("@P_FONT_COLOR", pFontColor);
//			cmd.addParameter("@P_FONT_FACE", pFontFace);
//			cmd.addParameter("@P_MAX_ROWS", pMaxRows);
//			cmd.addParameter("@P_MIN_ROW", pMinRow);
//			cmd.addParameter("@P_SHOW_SUMMARY", pShowSummary);
//			cmd.addParameter("@P_IMAGE_PREFIX", pImagePrefix);
//			cmd.addParameter("@P_USE_FLOW_PAGINATION", pUseFlowPagination);
//				
//			cmd.execute();
//
//
//		}
		
		public static void show(NNumber pCursor,NString pChartType,NString pBarImage,NString pChartTitle,NString pAxis,NNumber pScale,NNumber pBarWidth,NNumber pBarHeight,NString pNumMask,NString pFontSize,NString pFontColor,NString pFontFace,NNumber pMaxRows,NNumber pMinRow,NString pShowSummary,NString pImagePrefix,NString pUseFlowPagination) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_RENDER_CHART2.SHOW", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CURSOR", pCursor);
			cmd.addParameter("@P_CHART_TYPE", pChartType);
			cmd.addParameter("@P_BAR_IMAGE", pBarImage);
			cmd.addParameter("@P_CHART_TITLE", pChartTitle);
			cmd.addParameter("@P_AXIS", pAxis);
			cmd.addParameter("@P_SCALE", pScale);
			cmd.addParameter("@P_BAR_WIDTH", pBarWidth);
			cmd.addParameter("@P_BAR_HEIGHT", pBarHeight);
			cmd.addParameter("@P_NUM_MASK", pNumMask);
			cmd.addParameter("@P_FONT_SIZE", pFontSize);
			cmd.addParameter("@P_FONT_COLOR", pFontColor);
			cmd.addParameter("@P_FONT_FACE", pFontFace);
			cmd.addParameter("@P_MAX_ROWS", pMaxRows);
			cmd.addParameter("@P_MIN_ROW", pMinRow);
			cmd.addParameter("@P_SHOW_SUMMARY", pShowSummary);
			cmd.addParameter("@P_IMAGE_PREFIX", pImagePrefix);
			cmd.addParameter("@P_USE_FLOW_PAGINATION", pUseFlowPagination);
				
			cmd.execute();


		}
		
		public static void showColors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_RENDER_CHART2.SHOW_COLORS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
	
	
	
}
