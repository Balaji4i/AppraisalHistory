package model.vo;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.adf.share.ADFContext;

import oracle.jbo.Row;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.ViewCriteria;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.ViewObjectImpl;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Oct 09 15:33:28 IST 2019
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class ApprisalHisHdr_VORowImpl extends ViewRowImpl {


    public static final int ENTITY_APPRISALHISHDR_EO = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    protected enum AttributesEnum {
        AppraisalComments,
        AppraisalDate,
        AppraisalFeedback,
        AppraisalHistHdrId,
        AppraisalPeriodEndDate,
        AppraisalPeriodStartDate,
        AppraisalPurpose,
        BusinessGroupName,
        Initiator,
        OverallRating,
        PersonId,
        SuggestedFinalRating,
        PlanName,
        Trans_Name,
        Trans_No,
        Trans_Email,
        Trans_BusinessGroup,
        AppraiseeName,
        EmailAddress,
        EmployeeNumber,
        EmployeeType,
        HistoricalType,
        MainAppraiserId,
        ApprisalHisLine_VO,
        Employee_View_ROVO,
        Oando_AM_ApprisalHisHdr_VO1,
        Oando_AM_BusinessGrpROVO1,
        Oando_AM_PlanName_LOV1,
        Oando_AM_PlanNameROVO1;
        private static AttributesEnum[] vals = null;
        ;
        private static final int firstIndex = 0;

        protected int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        protected static final int firstIndex() {
            return firstIndex;
        }

        protected static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        protected static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int APPRAISALCOMMENTS = AttributesEnum.AppraisalComments.index();
    public static final int APPRAISALDATE = AttributesEnum.AppraisalDate.index();
    public static final int APPRAISALFEEDBACK = AttributesEnum.AppraisalFeedback.index();
    public static final int APPRAISALHISTHDRID = AttributesEnum.AppraisalHistHdrId.index();
    public static final int APPRAISALPERIODENDDATE = AttributesEnum.AppraisalPeriodEndDate.index();
    public static final int APPRAISALPERIODSTARTDATE = AttributesEnum.AppraisalPeriodStartDate.index();
    public static final int APPRAISALPURPOSE = AttributesEnum.AppraisalPurpose.index();
    public static final int BUSINESSGROUPNAME = AttributesEnum.BusinessGroupName.index();
    public static final int INITIATOR = AttributesEnum.Initiator.index();
    public static final int OVERALLRATING = AttributesEnum.OverallRating.index();
    public static final int PERSONID = AttributesEnum.PersonId.index();
    public static final int SUGGESTEDFINALRATING = AttributesEnum.SuggestedFinalRating.index();
    public static final int PLANNAME = AttributesEnum.PlanName.index();
    public static final int TRANS_NAME = AttributesEnum.Trans_Name.index();
    public static final int TRANS_NO = AttributesEnum.Trans_No.index();
    public static final int TRANS_EMAIL = AttributesEnum.Trans_Email.index();
    public static final int TRANS_BUSINESSGROUP = AttributesEnum.Trans_BusinessGroup.index();
    public static final int APPRAISEENAME = AttributesEnum.AppraiseeName.index();
    public static final int EMAILADDRESS = AttributesEnum.EmailAddress.index();
    public static final int EMPLOYEENUMBER = AttributesEnum.EmployeeNumber.index();
    public static final int EMPLOYEETYPE = AttributesEnum.EmployeeType.index();
    public static final int HISTORICALTYPE = AttributesEnum.HistoricalType.index();
    public static final int MAINAPPRAISERID = AttributesEnum.MainAppraiserId.index();
    public static final int APPRISALHISLINE_VO = AttributesEnum.ApprisalHisLine_VO.index();
    public static final int EMPLOYEE_VIEW_ROVO = AttributesEnum.Employee_View_ROVO.index();
    public static final int OANDO_AM_APPRISALHISHDR_VO1 = AttributesEnum.Oando_AM_ApprisalHisHdr_VO1.index();
    public static final int OANDO_AM_BUSINESSGRPROVO1 = AttributesEnum.Oando_AM_BusinessGrpROVO1.index();
    public static final int OANDO_AM_PLANNAME_LOV1 = AttributesEnum.Oando_AM_PlanName_LOV1.index();
    public static final int OANDO_AM_PLANNAMEROVO1 = AttributesEnum.Oando_AM_PlanNameROVO1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public ApprisalHisHdr_VORowImpl() {
    }

    /**
     * Gets ApprisalHisHdr_EO entity object.
     * @return the ApprisalHisHdr_EO
     */
    public EntityImpl getApprisalHisHdr_EO() {
        return (EntityImpl) getEntity(ENTITY_APPRISALHISHDR_EO);
    }


    /**
     * Gets the attribute value for the calculated attribute AppraisalComments.
     * @return the AppraisalComments
     */
    public String getAppraisalComments() {
        return (String) getAttributeInternal(APPRAISALCOMMENTS);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_COMMENTS using the alias name AppraisalComments.
     * @param value value to set the APPRAISAL_COMMENTS
     */
    public void setAppraisalComments(String value) {
        setAttributeInternal(APPRAISALCOMMENTS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraisalDate.
     * @return the AppraisalDate
     */
    public Timestamp getAppraisalDate() {
        return (Timestamp) getAttributeInternal(APPRAISALDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_DATE using the alias name AppraisalDate.
     * @param value value to set the APPRAISAL_DATE
     */
    public void setAppraisalDate(Timestamp value) {
        setAttributeInternal(APPRAISALDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraisalFeedback.
     * @return the AppraisalFeedback
     */
    public String getAppraisalFeedback() {
        return (String) getAttributeInternal(APPRAISALFEEDBACK);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_FEEDBACK using the alias name AppraisalFeedback.
     * @param value value to set the APPRAISAL_FEEDBACK
     */
    public void setAppraisalFeedback(String value) {
        setAttributeInternal(APPRAISALFEEDBACK, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraisalHistHdrId.
     * @return the AppraisalHistHdrId
     */
    public BigDecimal getAppraisalHistHdrId() {
        return (BigDecimal) getAttributeInternal(APPRAISALHISTHDRID);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_HIST_HDR_ID using the alias name AppraisalHistHdrId.
     * @param value value to set the APPRAISAL_HIST_HDR_ID
     */
    public void setAppraisalHistHdrId(BigDecimal value) {
        setAttributeInternal(APPRAISALHISTHDRID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraisalPeriodEndDate.
     * @return the AppraisalPeriodEndDate
     */
    public Timestamp getAppraisalPeriodEndDate() {
        return (Timestamp) getAttributeInternal(APPRAISALPERIODENDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_PERIOD_END_DATE using the alias name AppraisalPeriodEndDate.
     * @param value value to set the APPRAISAL_PERIOD_END_DATE
     */
    public void setAppraisalPeriodEndDate(Timestamp value) {
        setAttributeInternal(APPRAISALPERIODENDDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraisalPeriodStartDate.
     * @return the AppraisalPeriodStartDate
     */
    public Timestamp getAppraisalPeriodStartDate() {
        return (Timestamp) getAttributeInternal(APPRAISALPERIODSTARTDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_PERIOD_START_DATE using the alias name AppraisalPeriodStartDate.
     * @param value value to set the APPRAISAL_PERIOD_START_DATE
     */
    public void setAppraisalPeriodStartDate(Timestamp value) {
        setAttributeInternal(APPRAISALPERIODSTARTDATE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraisalPurpose.
     * @return the AppraisalPurpose
     */
    public String getAppraisalPurpose() {
        return (String) getAttributeInternal(APPRAISALPURPOSE);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISAL_PURPOSE using the alias name AppraisalPurpose.
     * @param value value to set the APPRAISAL_PURPOSE
     */
    public void setAppraisalPurpose(String value) {
        setAttributeInternal(APPRAISALPURPOSE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute BusinessGroupName.
     * @return the BusinessGroupName
     */
    public String getBusinessGroupName() {
        return (String) getAttributeInternal(BUSINESSGROUPNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for BUSINESS_GROUP_NAME using the alias name BusinessGroupName.
     * @param value value to set the BUSINESS_GROUP_NAME
     */
    public void setBusinessGroupName(String value) {
        setAttributeInternal(BUSINESSGROUPNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Initiator.
     * @return the Initiator
     */
    public String getInitiator() {
        return (String) getAttributeInternal(INITIATOR);
    }

    /**
     * Sets <code>value</code> as attribute value for INITIATOR using the alias name Initiator.
     * @param value value to set the INITIATOR
     */
    public void setInitiator(String value) {
        setAttributeInternal(INITIATOR, value);
    }

    /**
     * Gets the attribute value for the calculated attribute OverallRating.
     * @return the OverallRating
     */
    public String getOverallRating() {
        return (String) getAttributeInternal(OVERALLRATING);
    }

    /**
     * Sets <code>value</code> as attribute value for OVERALL_RATING using the alias name OverallRating.
     * @param value value to set the OVERALL_RATING
     */
    public void setOverallRating(String value) {
        setAttributeInternal(OVERALLRATING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PersonId.
     * @return the PersonId
     */
    public BigDecimal getPersonId() {
        return (BigDecimal) getAttributeInternal(PERSONID);
    }

    /**
     * Sets <code>value</code> as attribute value for PERSON_ID using the alias name PersonId.
     * @param value value to set the PERSON_ID
     */
    public void setPersonId(BigDecimal value) {
        setAttributeInternal(PERSONID, value);
    }

    /**
     * Gets the attribute value for the calculated attribute SuggestedFinalRating.
     * @return the SuggestedFinalRating
     */
    public BigDecimal getSuggestedFinalRating() {
        return (BigDecimal) getAttributeInternal(SUGGESTEDFINALRATING);
    }

    /**
     * Sets <code>value</code> as attribute value for SUGGESTED_FINAL_RATING using the alias name SuggestedFinalRating.
     * @param value value to set the SUGGESTED_FINAL_RATING
     */
    public void setSuggestedFinalRating(BigDecimal value) {
        setAttributeInternal(SUGGESTEDFINALRATING, value);
    }

    /**
     * Gets the attribute value for the calculated attribute PlanName.
     * @return the PlanName
     */
    public String getPlanName() {
        return (String) getAttributeInternal(PLANNAME);
    }

    /**
     * Sets <code>value</code> as attribute value for PLAN_NAME using the alias name PlanName.
     * @param value value to set the PLAN_NAME
     */
    public void setPlanName(String value) {
        setAttributeInternal(PLANNAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute AppraiseeName.
     * @return the AppraiseeName
     */
    public String getAppraiseeName() {
        return (String) getAttributeInternal(APPRAISEENAME);
    }

    /**
     * Sets <code>value</code> as attribute value for APPRAISEE_NAME using the alias name AppraiseeName.
     * @param value value to set the APPRAISEE_NAME
     */
    public void setAppraiseeName(String value) {
        setAttributeInternal(APPRAISEENAME, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmailAddress.
     * @return the EmailAddress
     */
    public String getEmailAddress() {
        return (String) getAttributeInternal(EMAILADDRESS);
    }

    /**
     * Sets <code>value</code> as attribute value for EMAIL_ADDRESS using the alias name EmailAddress.
     * @param value value to set the EMAIL_ADDRESS
     */
    public void setEmailAddress(String value) {
        setAttributeInternal(EMAILADDRESS, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeNumber.
     * @return the EmployeeNumber
     */
    public BigDecimal getEmployeeNumber() {
        return (BigDecimal) getAttributeInternal(EMPLOYEENUMBER);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_NUMBER using the alias name EmployeeNumber.
     * @param value value to set the EMPLOYEE_NUMBER
     */
    public void setEmployeeNumber(BigDecimal value) {
        setAttributeInternal(EMPLOYEENUMBER, value);
    }

    /**
     * Gets the attribute value for the calculated attribute EmployeeType.
     * @return the EmployeeType
     */
    public String getEmployeeType() {
        return (String) getAttributeInternal(EMPLOYEETYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for EMPLOYEE_TYPE using the alias name EmployeeType.
     * @param value value to set the EMPLOYEE_TYPE
     */
    public void setEmployeeType(String value) {
        setAttributeInternal(EMPLOYEETYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute HistoricalType.
     * @return the HistoricalType
     */
    public String getHistoricalType() {
        return (String) getAttributeInternal(HISTORICALTYPE);
    }

    /**
     * Sets <code>value</code> as attribute value for HISTORICAL_TYPE using the alias name HistoricalType.
     * @param value value to set the HISTORICAL_TYPE
     */
    public void setHistoricalType(String value) {
        setAttributeInternal(HISTORICALTYPE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute MainAppraiserId.
     * @return the MainAppraiserId
     */
    public BigDecimal getMainAppraiserId() {
        return (BigDecimal) getAttributeInternal(MAINAPPRAISERID);
    }

    /**
     * Sets <code>value</code> as attribute value for MAIN_APPRAISER_ID using the alias name MainAppraiserId.
     * @param value value to set the MAIN_APPRAISER_ID
     */
    public void setMainAppraiserId(BigDecimal value) {
        setAttributeInternal(MAINAPPRAISERID, value);
    }


    /**
     * Gets the attribute value for the calculated attribute Trans_Name.
     * @return the Trans_Name
     */
    public String getTrans_Name() {
        BigDecimal id = null;
               String FullName = null;
        BigDecimal personId = new BigDecimal(0);
        personId = (BigDecimal) ADFContext.getCurrent()
                                          .getSessionScope()
                                          .get("personId");
        if (personId != null) {
                FullName = (String) (String) ADFContext.getCurrent()
                                              .getSessionScope()
                                              .get("DisplayName");
            return FullName;
        }else {
        return (String) getAttributeInternal(TRANS_NAME);
            }
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Name.
     * @param value value to set the  Trans_Name
     */
    public void setTrans_Name(String value) {
       
        setAttributeInternal(TRANS_NAME, value);
    }
  


    /**
     * Gets the attribute value for the calculated attribute Trans_No.
     * @return the Trans_No
     */
    public String getTrans_No() {
        BigDecimal id = null;
               String PersonNumber = null;
        BigDecimal personId = new BigDecimal(0);
        personId = (BigDecimal) ADFContext.getCurrent()
                                          .getSessionScope()
                                          .get("personId");
        if (personId != null) {
            PersonNumber = (String) ADFContext.getCurrent()
                                              .getSessionScope()
                                              .get("PersonNumber");
            return PersonNumber;
        } else {
        return (String) getAttributeInternal(TRANS_NO);
    }}

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_No.
     * @param value value to set the  Trans_No
     */
    public void setTrans_No(String value) {
        setAttributeInternal(TRANS_NO, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_Email.
     * @return the Trans_Email
     */
    public String getTrans_Email() {
        BigDecimal id = null;
               String EmailAddress = null;
        BigDecimal personId = new BigDecimal(0);
        personId = (BigDecimal) ADFContext.getCurrent()
                                          .getSessionScope()
                                          .get("personId");
                   if (personId != null) {
               
                       EmailAddress =  (String) ADFContext.getCurrent()
                                              .getSessionScope()
                                              .get("EmailAddress");
                   
                       return EmailAddress;
                   } else {
        return (String) getAttributeInternal(TRANS_EMAIL);}
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_Email.
     * @param value value to set the  Trans_Email
     */
    public void setTrans_Email(String value) {
        setAttributeInternal(TRANS_EMAIL, value);
    }

    /**
     * Gets the attribute value for the calculated attribute Trans_BusinessGroup.
     * @return the Trans_BusinessGroup
     */
    public String getTrans_BusinessGroup() {
        BigDecimal id = null;
               String BusinessGroup = null;
        BigDecimal personId = new BigDecimal(0);
        personId = (BigDecimal) ADFContext.getCurrent()
                                          .getSessionScope()
                                          .get("personId");
        if (personId != null) {
       
            BusinessGroup = (String)  ADFContext.getCurrent()
                                              .getSessionScope()
                                              .get("BusinessUnitName");
        
            return BusinessGroup;
        } else {
        return (String) getAttributeInternal(TRANS_BUSINESSGROUP);}
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute Trans_BusinessGroup.
     * @param value value to set the  Trans_BusinessGroup
     */
    public void setTrans_BusinessGroup(String value) {
        setAttributeInternal(TRANS_BUSINESSGROUP, value);
    }


    /**
     * Gets the associated <code>RowIterator</code> using master-detail link ApprisalHisLine_VO.
     */
    public RowIterator getApprisalHisLine_VO() {
        return (RowIterator) getAttributeInternal(APPRISALHISLINE_VO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Employee_View_ROVO.
     */
    public RowSet getEmployee_View_ROVO() {
        return (RowSet) getAttributeInternal(EMPLOYEE_VIEW_ROVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Oando_AM_ApprisalHisHdr_VO1.
     */
    public RowSet getOando_AM_ApprisalHisHdr_VO1() {
        return (RowSet) getAttributeInternal(OANDO_AM_APPRISALHISHDR_VO1);
    }


    /**
     * Gets the view accessor <code>RowSet</code> Oando_AM_BusinessGrpROVO1.
     */
    public RowSet getOando_AM_BusinessGrpROVO1() {
        return (RowSet) getAttributeInternal(OANDO_AM_BUSINESSGRPROVO1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Oando_AM_PlanName_LOV1.
     */
    public RowSet getOando_AM_PlanName_LOV1() {
        return (RowSet) getAttributeInternal(OANDO_AM_PLANNAME_LOV1);
    }

    /**
     * Gets the view accessor <code>RowSet</code> Oando_AM_PlanNameROVO1.
     */
    public RowSet getOando_AM_PlanNameROVO1() {
        return (RowSet) getAttributeInternal(OANDO_AM_PLANNAMEROVO1);
    }
}

