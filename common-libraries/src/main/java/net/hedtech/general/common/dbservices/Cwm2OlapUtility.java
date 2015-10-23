package net.hedtech.general.common.dbservices;

import java.util.*;
import morphis.foundations.core.appdatalayer.*;
import morphis.foundations.core.appdatalayer.data.*;
import morphis.foundations.core.appdatalayer.data.types.*;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordField;
import morphis.foundations.core.appdatalayer.data.types.configuration.DbRecordType;
import morphis.foundations.core.types.*;
import morphis.foundations.core.util.Ref;


public class Cwm2OlapUtility {
		public static NString FcheckNameTypeParameter(NString pParameterName,NString pParameterValue,NString pParameterWildcardAllowed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.CHECK_NAME_TYPE_PARAMETER", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_PARAMETER_NAME", pParameterName);
			cmd.addParameter("@P_PARAMETER_VALUE", pParameterValue);
			cmd.addParameter("@P_PARAMETER_WILDCARD_ALLOWED", pParameterWildcardAllowed);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void checkParameterMaxLength(NString pParameterName,NString pParameterValue,NNumber pParameterMaxLength,NString pWildcardAllowed) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.CHECK_PARAMETER_MAX_LENGTH", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_PARAMETER_NAME", pParameterName);
			cmd.addParameter("@P_PARAMETER_VALUE", pParameterValue);
			cmd.addParameter("@P_PARAMETER_MAX_LENGTH", pParameterMaxLength);
			cmd.addParameter("@P_WILDCARD_ALLOWED", pWildcardAllowed);
				
			cmd.execute();


		}
		
		public static void clearDbmsoutputBuffer() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.CLEAR_DBMSOUTPUT_BUFFER", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dropClass(NNumber pClassIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CLASS_IRID", pClassIrid);
				
			cmd.execute();


		}
		
		public static void dropClassEntry(NNumber pIrid,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CLASS_ENTRY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IRID", pIrid);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();


		}
		
		public static void dropClassEntryClass(NNumber pIrid,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CLASS_ENTRY_CLASS", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IRID", pIrid);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();


		}
		
		public static void dropClassEntryElement(NNumber pIrid,NString pName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CLASS_ENTRY_ELEMENT", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_IRID", pIrid);
			cmd.addParameter("@P_NAME", pName);
				
			cmd.execute();


		}
		
		public static void dropCube(NNumber pCubeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CUBE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
				
			cmd.execute();


		}
		
		public static void dropCubedimensionuse(NNumber pCubedimensionuseIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CUBEDIMENSIONUSE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBEDIMENSIONUSE_IRID", pCubedimensionuseIrid);
				
			cmd.execute();


		}
		
		public static void dropCubedimensionuseCIrid(NNumber pCubeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CUBEDIMENSIONUSE_C_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
				
			cmd.execute();


		}
		
		public static void dropCubedimensionuseDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_CUBEDIMENSIONUSE_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropDimension(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_DIMENSION", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropDimensionattrDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_DIMENSIONATTR_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropDimensionattribute(NNumber pDimensionattributeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_DIMENSIONATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSIONATTRIBUTE_IRID", pDimensionattributeIrid);
				
			cmd.execute();


		}
		
		public static void dropHierarchy(NNumber pHierarchyIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_HIERARCHY", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HIERARCHY_IRID", pHierarchyIrid);
				
			cmd.execute();


		}
		
		public static void dropHierarchyDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_HIERARCHY_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropHierlevelrel(NNumber pHierlevelrelIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_HIERLEVELREL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HIERLEVELREL_IRID", pHierlevelrelIrid);
				
			cmd.execute();


		}
		
		public static void dropHierlevelrelDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_HIERLEVELREL_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropHierlevelrelHIrid(NNumber pHierarchyIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_HIERLEVELREL_H_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HIERARCHY_IRID", pHierarchyIrid);
				
			cmd.execute();


		}
		
		public static void dropHierlevelrelLIrid(NNumber pLevelIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_HIERLEVELREL_L_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LEVEL_IRID", pLevelIrid);
				
			cmd.execute();


		}
		
		public static void dropLevel(NNumber pLevelIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_LEVEL", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LEVEL_IRID", pLevelIrid);
				
			cmd.execute();


		}
		
		public static void dropLevelDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_LEVEL_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropLevelattribute(NNumber pLevelattributeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_LEVELATTRIBUTE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LEVELATTRIBUTE_IRID", pLevelattributeIrid);
				
			cmd.execute();


		}
		
		public static void dropLevelattributeDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_LEVELATTRIBUTE_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void dropLevelattributeDaIrid(NNumber pDimensionattributeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_LEVELATTRIBUTE_DA_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSIONATTRIBUTE_IRID", pDimensionattributeIrid);
				
			cmd.execute();


		}
		
		public static void dropLevelattributeLIrid(NNumber pLevelIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_LEVELATTRIBUTE_L_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LEVEL_IRID", pLevelIrid);
				
			cmd.execute();


		}
		
		public static void dropMeasure(NNumber pMeasureIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_MEASURE", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MEASURE_IRID", pMeasureIrid);
				
			cmd.execute();


		}
		
		public static void dropMeasureCIrid(NNumber pCubeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_MEASURE_C_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
				
			cmd.execute();


		}
		
		public static void dropValFactdimhiertplsdtl() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DROP_VAL_FACTDIMHIERTPLSDTL", DbManager.getDataBaseFactory());
			
				
			cmd.execute();


		}
		
		public static void dumpDbmsoutputBuffer(NString pDirectoryAlias,NString pFileName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.DUMP_DBMSOUTPUT_BUFFER", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIRECTORY_ALIAS", pDirectoryAlias);
			cmd.addParameter("@P_FILE_NAME", pFileName);
				
			cmd.execute();


		}
		
		public static NString FgetAccessRights(NString pModel,NString pEntityType,NString pEntityOwner,NString pEntityName,NNumber pEntityIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_ACCESS_RIGHTS", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MODEL", pModel);
			cmd.addParameter("@P_ENTITY_TYPE", pEntityType);
			cmd.addParameter("@P_ENTITY_OWNER", pEntityOwner);
			cmd.addParameter("@P_ENTITY_NAME", pEntityName);
			cmd.addParameter("@P_ENTITY_IRID", pEntityIrid);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetClassEntryIridEIrid(NNumber pElementIrid,NString pName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CLASS_ENTRY_IRID_E_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ELEMENT_IRID", pElementIrid);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetClassEntryIridEcIrid(NNumber pElementIrid,NNumber pClassIrid,NString pName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CLASS_ENTRY_IRID_EC_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_ELEMENT_IRID", pElementIrid);
			cmd.addParameter("@P_CLASS_IRID", pClassIrid);
			cmd.addParameter("@P_NAME", pName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetClassIrid(NString pClassName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CLASS_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CLASS_NAME", pClassName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetClassName(NNumber pClassIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CLASS_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CLASS_IRID", pClassIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetClassTypeIrid(NBool pLogException,NBool pForUpdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CLASS_TYPE_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetCubeIrid(NString pCubeOwner,NString pCubeName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CUBE_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CUBE_OWNER", pCubeOwner);
			cmd.addParameter("@P_CUBE_NAME", pCubeName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetCubeName(NNumber pCubeIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CUBE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetCubedimensionuseIrid(NNumber pCubeIrid,NNumber pDimensionIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_CUBEDIMENSIONUSE_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetDimensionIrid(NString pDimensionOwner,NString pDimensionName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_DIMENSION_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_OWNER", pDimensionOwner);
			cmd.addParameter("@P_DIMENSION_NAME", pDimensionName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetDimensionName(NNumber pDimensionIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_DIMENSION_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetDimensionattributeIrid(NNumber pDimensionIrid,NString pDimensionattributeName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_DIMENSIONATTRIBUTE_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_DIMENSIONATTRIBUTE_NAME", pDimensionattributeName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetDimensionattributeName(NNumber pDimensionattributeIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_DIMENSIONATTRIBUTE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_DIMENSIONATTRIBUTE_IRID", pDimensionattributeIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetHierarchyIrid(NNumber pDimensionIrid,NString pHierarchyName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_HIERARCHY_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_HIERARCHY_NAME", pHierarchyName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetHierarchyName(NNumber pHierarchyIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_HIERARCHY_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HIERARCHY_IRID", pHierarchyIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetHierlevelrelCName(NNumber pHierlevelrelIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_HIERLEVELREL_C_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HIERLEVELREL_IRID", pHierlevelrelIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetHierlevelrelIridCIrid(NNumber pDimensionIrid,NNumber pHierarchyIrid,NNumber pChildLevelIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_HIERLEVELREL_IRID_C_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_HIERARCHY_IRID", pHierarchyIrid);
			cmd.addParameter("@P_CHILD_LEVEL_IRID", pChildLevelIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NNumber FgetHierlevelrelIridPIrid(NNumber pDimensionIrid,NNumber pHierarchyIrid,NNumber pParentLevelIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_HIERLEVELREL_IRID_P_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_HIERARCHY_IRID", pHierarchyIrid);
			cmd.addParameter("@P_PARENT_LEVEL_IRID", pParentLevelIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetHierlevelrelPName(NNumber pHierlevelrelIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_HIERLEVELREL_P_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_HIERLEVELREL_IRID", pHierlevelrelIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetLevelIrid(NNumber pDimensionIrid,NString pLevelName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_LEVEL_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_LEVEL_NAME", pLevelName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetLevelName(NNumber pLevelIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_LEVEL_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LEVEL_IRID", pLevelIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetLevelattributeIrid(NNumber pDimensionIrid,NNumber pDimensionattributeIrid,NNumber pLevelIrid,NString pLevelattributeName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_LEVELATTRIBUTE_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
			cmd.addParameter("@P_DIMENSIONATTRIBUTE_IRID", pDimensionattributeIrid);
			cmd.addParameter("@P_LEVEL_IRID", pLevelIrid);
			cmd.addParameter("@P_LEVELATTRIBUTE_NAME", pLevelattributeName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetLevelattributeName(NNumber pLevelattributeIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_LEVELATTRIBUTE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_LEVELATTRIBUTE_IRID", pLevelattributeIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NNumber FgetMeasureIrid(NNumber pCubeIrid,NString pMeasureName,NBool pLogException,NBool pForUpdate,NBool pWaitForLock) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_MEASURE_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
			cmd.addParameter("@P_MEASURE_NAME", pMeasureName);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
			cmd.addParameter("@P_WAIT_FOR_LOCK", pWaitForLock);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetMeasureName(NNumber pMeasureIrid,NBool pLogException) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_MEASURE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_MEASURE_IRID", pMeasureIrid);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void getObjectId(NString pSourceOwner,NString pSourceName,Ref<NNumber> pSourceId,Ref<NNumber> pSourceType,Ref<NString> pObjectOwner,Ref<NString> pObjectName,Ref<NNumber> pObjectId,Ref<NNumber> pObjectType) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_OBJECT_ID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SOURCE_OWNER", pSourceOwner);
			cmd.addParameter("@P_SOURCE_NAME", pSourceName);
			cmd.addParameter("@P_SOURCE_ID", NNumber.class);
			cmd.addParameter("@P_SOURCE_TYPE", NNumber.class);
			cmd.addParameter("@P_OBJECT_OWNER", NString.class);
			cmd.addParameter("@P_OBJECT_NAME", NString.class);
			cmd.addParameter("@P_OBJECT_ID", NNumber.class);
			cmd.addParameter("@P_OBJECT_TYPE", NNumber.class);
				
			cmd.execute();
			pSourceId.val = cmd.getParameterValue("@P_SOURCE_ID", NNumber.class);
			pSourceType.val = cmd.getParameterValue("@P_SOURCE_TYPE", NNumber.class);
			pObjectOwner.val = cmd.getParameterValue("@P_OBJECT_OWNER", NString.class);
			pObjectName.val = cmd.getParameterValue("@P_OBJECT_NAME", NString.class);
			pObjectId.val = cmd.getParameterValue("@P_OBJECT_ID", NNumber.class);
			pObjectType.val = cmd.getParameterValue("@P_OBJECT_TYPE", NNumber.class);


		}
		
		public static NNumber FgetProjectIrid(NBool pLogException,NBool pForUpdate) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_PROJECT_IRID", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NNumber.class);
			cmd.addParameter("@P_LOG_EXCEPTION", pLogException);
			cmd.addParameter("@P_FOR_UPDATE", pForUpdate);
				
			cmd.execute();

			return cmd.getReturnValue(NNumber.class);

		}
		
		public static NString FgetTableName(NNumber pTableId) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_TABLE_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
			cmd.addParameter("@P_TABLE_ID", pTableId);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static NString FgetUserName() {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.GET_USER_NAME", DbManager.getDataBaseFactory());
			
			cmd.addReturnParameter(NString.class);
				
			cmd.execute();

			return cmd.getReturnValue(NString.class);

		}
		
		public static void setCubeInvalid(NNumber pCubeIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_CUBE_INVALID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_CUBE_IRID", pCubeIrid);
				
			cmd.execute();


		}
		
		public static void setCubeInvalidDIrid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_CUBE_INVALID_D_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void setCubeInvalidMIrid(NNumber pMeasureIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_CUBE_INVALID_M_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_MEASURE_IRID", pMeasureIrid);
				
			cmd.execute();


		}
		
		public static void setDebugOff(NString pSwitchName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_DEBUG_OFF", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SWITCH_NAME", pSwitchName);
				
			cmd.execute();


		}
		
		public static void setDebugOn(NString pSwitchName) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_DEBUG_ON", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_SWITCH_NAME", pSwitchName);
				
			cmd.execute();


		}
		
		public static void setDimensionInvalid(NNumber pDimensionIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_DIMENSION_INVALID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_DIMENSION_IRID", pDimensionIrid);
				
			cmd.execute();


		}
		
		public static void setDimensionInvalidHIrid(NNumber pHierarchyIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_DIMENSION_INVALID_H_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_HIERARCHY_IRID", pHierarchyIrid);
				
			cmd.execute();


		}
		
		public static void setDimensionInvalidLIrid(NNumber pLevelIrid) {
			
			IDataCommand cmd = DbManager.getDataAccessFactory().createDataCommand("CWM2_OLAP_UTILITY.SET_DIMENSION_INVALID_L_IRID", DbManager.getDataBaseFactory());
			
			cmd.addParameter("@P_LEVEL_IRID", pLevelIrid);
				
			cmd.execute();


		}
		
	
	
	@DbRecordType(id="TDhRecordRow", dataSourceName="T_DH_RECORD")
	public static class TDhRecordRow
	{
		@DbRecordField(dataSourceName="V_DIMENSION")
		public NNumber VDimension;
		@DbRecordField(dataSourceName="V_DIMENSION_IRID")
		public NNumber VDimensionIrid;
		@DbRecordField(dataSourceName="V_DIMENSION_NAME")
		public NString VDimensionName;
		@DbRecordField(dataSourceName="V_HIERARCHY")
		public NNumber VHierarchy;
		@DbRecordField(dataSourceName="V_HIERARCHY_IRID")
		public NNumber VHierarchyIrid;
		@DbRecordField(dataSourceName="V_HIERARCHY_NAME")
		public NString VHierarchyName;
	}

	
	
}
