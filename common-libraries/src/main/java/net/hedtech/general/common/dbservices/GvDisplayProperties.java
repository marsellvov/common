package net.hedtech.general.common.dbservices;

import static morphis.foundations.core.types.Types.toDate;
import static morphis.foundations.core.types.Types.toNumber;
import static morphis.foundations.core.types.Types.toStr;

import java.util.*;

import net.hedtech.general.common.dbservices.Eokwtow.Paramtab;
import net.hedtech.general.common.dbservices.dbtypes.ParamInfoTypeRow;
import net.hedtech.general.common.dbservices.Nekrecs.AttributeRectypeRow;
import net.hedtech.general.common.dbservices.Nekrecs.PebemplRectypeRow;
import net.hedtech.general.common.dbservices.Nekrecs.PebemplRowtypeRow;
import net.hedtech.general.common.dbservices.dbtypes.GvrudfnRow;
import net.hedtech.general.common.dbservices.dbtypes.GvrudfnRow.TDisplayItems;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class GvDisplayProperties {
	
	public static void pGetDisplayItems(NString pObjsCode,NString pBlockName,NString pCurrentUser, Ref<TDisplayItems> pDefinitionRecords,Ref<NString> pSortOrder) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("GV_DISPLAY_PROPERTIES.P_GET_DISPLAY_ITEMS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@pOBJS_CODE", pObjsCode);
			cmd.addParameter("@pBLOCK_NAME", pBlockName);
			cmd.addParameter("@pCURRENT_USER", pCurrentUser);
			
//			cmd.addParameter(DbTypes.getCollectionType("pDefinitionRecords", pDefinitionRecords, GvrudfnRow.TDisplayItems.class, false));
			
			cmd.addParameter(DbTypes.getTableType("pDefinitionRecords", "GV_DISPLAY_PROPERTIES.t_display_items", TDisplayItems.class));
//			cmd.addParameter(DbTypes.createStructType("pDefinitionRecords", null, TDisplayItems.class, true));
			cmd.addParameter("@pSortOrder", NString.class);
				
//			cmd.execute();
//			pDefinitionRecords = cmd.getParameterValue("pDefinitionRecords", GvrudfnRow.TDisplayItems.class);
//			pSortOrder.val = cmd.getParameterValue("@pSortOrder", NString.class);
				

			
			
			
			
			cmd.execute();
			pDefinitionRecords.val = cmd.getParameterValue("pDefinitionRecords", TDisplayItems.class);			
			pSortOrder.val = cmd.getParameterValue("@pSortOrder", NString.class);

		}

//	PROCEDURE p_get_display_items(
//            pOBJS_CODE         IN  GVRUDFN.GVRUDFN_OBJS_CODE%TYPE,
//            pBLOCK_NAME        IN  GVRUDFN.GVRUDFN_BLOCK_NAME%TYPE,
//            pCURRENT_USER      IN  GVRDFNU.GVRDFNU_FGAC_USER_ID%TYPE,
//            pDefinitionRecords OUT t_display_items,
//            pSortOrder         OUT VARCHAR2
//);
	
	
	
}
