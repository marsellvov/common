package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapClassify {
		public static void addEntityCardinalityUse(NString pOwner,NString pDimensionname,NString pHierarchyname,NString pLevelname,NNumber pEstcardinality) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CLASSIFY.ADD_ENTITY_CARDINALITY_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_DIMENSIONNAME", pDimensionname);
			cmd.addParameter("@P_HIERARCHYNAME", pHierarchyname);
			cmd.addParameter("@P_LEVELNAME", pLevelname);
			cmd.addParameter("@P_ESTCARDINALITY", pEstcardinality);
				
			cmd.execute();


		}
		
		public static void addEntityDefaultmemberUse(NString pOwner,NString pDimensionname,NString pHierarchyname,NString pDefaultmember,NString pDefaultmemberlevel,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CLASSIFY.ADD_ENTITY_DEFAULTMEMBER_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_DIMENSIONNAME", pDimensionname);
			cmd.addParameter("@P_HIERARCHYNAME", pHierarchyname);
			cmd.addParameter("@P_DEFAULTMEMBER", pDefaultmember);
			cmd.addParameter("@P_DEFAULTMEMBERLEVEL", pDefaultmemberlevel);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();


		}
		
		public static void addEntityDenseindicatorUse(NString pOwner,NString pCubename,NString pDimensionowner,NString pDimensionname,NString pDenseindicator) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CLASSIFY.ADD_ENTITY_DENSEINDICATOR_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_CUBENAME", pCubename);
			cmd.addParameter("@P_DIMENSIONOWNER", pDimensionowner);
			cmd.addParameter("@P_DIMENSIONNAME", pDimensionname);
			cmd.addParameter("@P_DENSEINDICATOR", pDenseindicator);
				
			cmd.execute();


		}
		
		public static void addEntityDescriptorUse(NString pDescname,NString pEntitytype,NString pEntityowner,NString pEntityname,NString pEntitychildname,NString pEntitysecondarychildname,NString pParametername,NString pParametervalue) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CLASSIFY.ADD_ENTITY_DESCRIPTOR_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DESCNAME", pDescname);
			cmd.addParameter("@P_ENTITYTYPE", pEntitytype);
			cmd.addParameter("@P_ENTITYOWNER", pEntityowner);
			cmd.addParameter("@P_ENTITYNAME", pEntityname);
			cmd.addParameter("@P_ENTITYCHILDNAME", pEntitychildname);
			cmd.addParameter("@P_ENTITYSECONDARYCHILDNAME", pEntitysecondarychildname);
			cmd.addParameter("@P_PARAMETERNAME", pParametername);
			cmd.addParameter("@P_PARAMETERVALUE", pParametervalue);
				
			cmd.execute();


		}
		
		public static void addEntityFactjoinUse(NString pOwner,NString pCubename,NString pDimensionowner,NString pDimensionname,NString pHierarchyname,NString pDimensiontblowner,NString pDimensiontblname,NString pDimensioncolname,NNumber pPosition) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CLASSIFY.ADD_ENTITY_FACTJOIN_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_OWNER", pOwner);
			cmd.addParameter("@P_CUBENAME", pCubename);
			cmd.addParameter("@P_DIMENSIONOWNER", pDimensionowner);
			cmd.addParameter("@P_DIMENSIONNAME", pDimensionname);
			cmd.addParameter("@P_HIERARCHYNAME", pHierarchyname);
			cmd.addParameter("@P_DIMENSIONTBLOWNER", pDimensiontblowner);
			cmd.addParameter("@P_DIMENSIONTBLNAME", pDimensiontblname);
			cmd.addParameter("@P_DIMENSIONCOLNAME", pDimensioncolname);
			cmd.addParameter("@P_POSITION", pPosition);
				
			cmd.execute();


		}
		
		public static void removeEntityDescriptorUse(NString pDescname,NString pEntitytype,NString pEntityowner,NString pEntityname,NString pEntitychildname,NString pEntitysecondarychildname) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_CLASSIFY.REMOVE_ENTITY_DESCRIPTOR_USE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DESCNAME", pDescname);
			cmd.addParameter("@P_ENTITYTYPE", pEntitytype);
			cmd.addParameter("@P_ENTITYOWNER", pEntityowner);
			cmd.addParameter("@P_ENTITYNAME", pEntityname);
			cmd.addParameter("@P_ENTITYCHILDNAME", pEntitychildname);
			cmd.addParameter("@P_ENTITYSECONDARYCHILDNAME", pEntitysecondarychildname);
				
			cmd.execute();


		}
		
	
	
	
}
