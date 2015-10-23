package net.hedtech.general.common.libraries.Soqolib.model;

import java.util.Hashtable;

import morphis.foundations.core.appsupportlib.model.*;
import morphis.foundations.core.appsupportlib.runtime.*;

import net.hedtech.general.common.libraries.Goqolib.model.GSdkey;
import net.hedtech.general.common.libraries.Goqolib.model.GOptBlock;
import net.hedtech.general.common.libraries.Goqolib.model.GExtendedSearchBlock;

public class SoqolibModel extends FormPartModel {
	
  public SoqolibModel(ITaskPart task){
    super(task);
    }

  public GSdkey getGSdkey() 
  {
    return (GSdkey) getBusinessObject("G$_SDKEY");
  }

  public IDBBusinessObject getGSdisp() 
  {
    return (IDBBusinessObject) getBusinessObject("G$_SDISP");
  }

  public GOptBlock getGOptBlock() 
  {
    return (GOptBlock) getBusinessObject("G$_OPT_BLOCK");
  }

  public Dummy getDummy() 
  {
    return (Dummy) getBusinessObject("DUMMY");
  }

  public SSobctrlBlock getSSobctrlBlock() 
  {
    return (SSobctrlBlock) getBusinessObject("S$_SOBCTRL_BLOCK");
  }

  public SCurriculumHoldItems getSCurriculumHoldItems() 
  {
    return (SCurriculumHoldItems) getBusinessObject("S$_CURRICULUM_HOLD_ITEMS");
  }

  public SCurriculumChange getSCurriculumChange() 
  {
    return (SCurriculumChange) getBusinessObject("S$_CURRICULUM_CHANGE");
  }

  public SCurrProcBlock getSCurrProcBlock() 
  {
    return (SCurrProcBlock) getBusinessObject("S$_CURR_PROC_BLOCK");
  }

  public IDBBusinessObject getSobcpln() 
  {
    return (IDBBusinessObject) getBusinessObject("SOBCPLN");
  }

  public SCurriculumFields getSCurriculumFields() 
  {
    return (SCurriculumFields) getBusinessObject("S$_CURRICULUM_FIELDS");
  }

  public SCommPlanBlock getSCommPlanBlock() 
  {
    return (SCommPlanBlock) getBusinessObject("S$_COMM_PLAN_BLOCK");
  }

  public IDBBusinessObject getSorainf() 
  {
    return (IDBBusinessObject) getBusinessObject("SORAINF");
  }

  public SCurricula getSCurricula() 
  {
    return (SCurricula) getBusinessObject("S$_CURRICULA");
  }

  public SCurriculaTraditional getSCurriculaTraditional() 
  {
    return (SCurriculaTraditional) getBusinessObject("S$_CURRICULA_TRADITIONAL");
  }

  public IDBBusinessObject getSorlcur() 
  {
    return (IDBBusinessObject) getBusinessObject("SORLCUR");
  }

  public IDBBusinessObject getSorlfos() 
  {
    return (IDBBusinessObject) getBusinessObject("SORLFOS");
  }

  public IDBBusinessObject getSorlcurLite() 
  {
    return (IDBBusinessObject) getBusinessObject("SORLCUR_LITE");
  }

  public IDBBusinessObject getSorlfosLite() 
  {
    return (IDBBusinessObject) getBusinessObject("SORLFOS_LITE");
  }

  public SAdminAssign getSAdminAssign() 
  {
    return (SAdminAssign) getBusinessObject("S$_ADMIN_ASSIGN");
  }

  public GExtendedSearchBlock getGExtendedSearchBlock() 
  {
    return (GExtendedSearchBlock) getBusinessObject("G$_EXTENDED_SEARCH_BLOCK");
  }

  public SCurriculaSummary getSCurriculaSummary() 
  {
    return (SCurriculaSummary) getBusinessObject("S$_CURRICULA_SUMMARY");
  }

  public SCurriculaLite getSCurriculaLite() 
  {
    return (SCurriculaLite) getBusinessObject("S$_CURRICULA_LITE");
  }

  public IDBBusinessObject getSovlcur() 
  {
    return (IDBBusinessObject) getBusinessObject("SOVLCUR");
  }

  public IDBBusinessObject getSovlfos() 
  {
    return (IDBBusinessObject) getBusinessObject("SOVLFOS");
  }

  public IDBBusinessObject getSgrstsp() 
  {
    return (IDBBusinessObject) getBusinessObject("SGRSTSP");
  }

  public SStudypath getSStudypath() 
  {
    return (SStudypath) getBusinessObject("S$_STUDYPATH");
  }


}