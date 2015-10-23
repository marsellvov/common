package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class WwvFlowSvg {
		public static void chart(NNumber pRegionId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SVG.CHART", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REGION_ID", pRegionId);
				
			cmd.execute();


		}
		
		public static NString FgetSharedStyles(NString pType,NString pXAxisTitleFontFace,NString pXAxisTitleFontSize,NString pXAxisTitleFontColor,NString pYAxisTitleFontFace,NString pYAxisTitleFontSize,NString pYAxisTitleFontColor,NString pLabelFontFace,NString pLabelFontSize,NString pLabelFontColor,NString pValueFontFace,NString pValueFontSize,NString pValueFontColor) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SVG.GET_SHARED_STYLES", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TYPE", pType);
			cmd.addParameter("@P_X_AXIS_TITLE_FONT_FACE", pXAxisTitleFontFace);
			cmd.addParameter("@P_X_AXIS_TITLE_FONT_SIZE", pXAxisTitleFontSize);
			cmd.addParameter("@P_X_AXIS_TITLE_FONT_COLOR", pXAxisTitleFontColor);
			cmd.addParameter("@P_Y_AXIS_TITLE_FONT_FACE", pYAxisTitleFontFace);
			cmd.addParameter("@P_Y_AXIS_TITLE_FONT_SIZE", pYAxisTitleFontSize);
			cmd.addParameter("@P_Y_AXIS_TITLE_FONT_COLOR", pYAxisTitleFontColor);
			cmd.addParameter("@P_LABEL_FONT_FACE", pLabelFontFace);
			cmd.addParameter("@P_LABEL_FONT_SIZE", pLabelFontSize);
			cmd.addParameter("@P_LABEL_FONT_COLOR", pLabelFontColor);
			cmd.addParameter("@P_VALUE_FONT_FACE", pValueFontFace);
			cmd.addParameter("@P_VALUE_FONT_SIZE", pValueFontSize);
			cmd.addParameter("@P_VALUE_FONT_COLOR", pValueFontColor);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void initColors() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SVG.INIT_COLORS", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void migrateSvgToFlash(NNumber pRegionId,NNumber pFlowId,NNumber pPageId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SVG.MIGRATE_SVG_TO_FLASH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_FLOW_ID", pFlowId);
			cmd.addParameter("@P_PAGE_ID", pPageId);
				
			cmd.execute();


		}
		
		public static void setAttributes(NNumber pRegionId,NString pQuery,NString pChartType,NString pNoDataFound) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("WWV_FLOW_SVG.SET_ATTRIBUTES", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_REGION_ID", pRegionId);
			cmd.addParameter("@P_QUERY", pQuery);
			cmd.addParameter("@P_CHART_TYPE", pChartType);
			cmd.addParameter("@P_NO_DATA_FOUND", pNoDataFound);
				
			cmd.execute();


		}
		
	
	
	
}
