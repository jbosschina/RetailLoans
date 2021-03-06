package sbilms;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class FinancialInfo implements java.io.Serializable
{

   static final long serialVersionUID = 1L;

   @org.kie.api.definition.type.Label("EMINMI Ratio")
   private java.lang.Double EMINMIRatio;
   @org.kie.api.definition.type.Label("GMI")
   private java.lang.Double GMI;
   @org.kie.api.definition.type.Label("NMI")
   private java.lang.Double NMI;
   @org.kie.api.definition.type.Label("NMIGMIRatio")
   private java.lang.Double NMIGMIRatio;
   @org.kie.api.definition.type.Label("cibilScore")
   private java.lang.Integer cibilScore;
   @org.kie.api.definition.type.Label("creditGrade")
   private java.lang.String creditGrade;
   @org.kie.api.definition.type.Label("RGScore")
   private java.lang.Integer RGScore;
   @org.kie.api.definition.type.Label("riskScore")
   private java.lang.Integer riskScore;
   @org.kie.api.definition.type.Label("existingTopupDisbursedMonths")
   private java.lang.Integer existingTopupDisbursedMonths;
   @org.kie.api.definition.type.Label("isSBISalaryAccount")
   private String isSBISalaryAccount;
   @org.kie.api.definition.type.Label("modeOfRepayment")
   private java.lang.String modeOfRepayment;
   @org.kie.api.definition.type.Label("loanTenure")
   private java.lang.Integer loanTenure;
   @org.kie.api.definition.type.Label("noOfXpressCreditTopups")
   private java.lang.Integer noOfXpressCreditTopups;
   @org.kie.api.definition.type.Label("xpressCreditTopupAllowed")
   private java.lang.Boolean xpressCreditTopupAllowed;
   @org.kie.api.definition.type.Label("salaryAccountPeriod")
   private java.lang.Integer salaryAccountPeriod;
   @org.kie.api.definition.type.Label("salaryAccountMandatory")
   private String salaryAccountMandatory;
   @org.kie.api.definition.type.Label("isDisbursementPeriodtoCheck")
   private java.lang.Boolean isDisbursementPeriodtoCheck;
   @org.kie.api.definition.type.Label("facilityTypeOfLOan")
   private java.lang.String facilityTypeOfLOan;

   @org.kie.api.definition.type.Label("Risk Scoring")
   private java.lang.Double riskScoring;

   @org.kie.api.definition.type.Label("Cibil Account status")
   private java.lang.String cibilAccountStatus;

   @org.kie.api.definition.type.Label("Number of Enquires within month")
   private java.lang.Integer numberOfEnquiresWithinMonth;

   @org.kie.api.definition.type.Label("Number of Overdue of the last 24 months")
   private java.lang.Integer numberOfOverdueLast24Months;

   @org.kie.api.definition.type.Label("CIRApproval")
   private java.lang.String CIRApproval;

   @org.kie.api.definition.type.Label("DPDMoreThan30Days")
   private boolean DPDMoreThan30Days;

   @org.kie.api.definition.type.Label("NoOfDPDOver60DaysinYears")
   private java.lang.Integer noOfDPDOver60DaysinYears;

   @org.kie.api.definition.type.Label("ElgibleLoanAmount")
   private java.lang.Double elgibleLoanAmount;

   @org.kie.api.definition.type.Label("existingEMIAmount")
   private java.lang.Double existingEMIAmount;

   @org.kie.api.definition.type.Label("BorrowerLoanSanction")
   private java.lang.String borrowerLoanSanction;

   @org.kie.api.definition.type.Label("Credit Rating")
   private java.lang.String creditRating;

   @org.kie.api.definition.type.Label("typeOfCheckOff")
   private java.lang.String typeOfCheckOff;

   @org.kie.api.definition.type.Label("typeofMCLR")
   private java.lang.String typeofMCLR;

   @org.kie.api.definition.type.Label("Spread")
   private java.lang.Character spread;

   @org.kie.api.definition.type.Label("Interest Rate")
   private java.lang.Double interestRate;

   public FinancialInfo()
   {
   }

   public java.lang.Double getEMINMIRatio()
   {
      return this.EMINMIRatio;
   }

   public void setEMINMIRatio(java.lang.Double EMINMIRatio)
   {
      this.EMINMIRatio = EMINMIRatio;
   }

   public java.lang.Double getGMI()
   {
      return this.GMI;
   }

   public void setGMI(java.lang.Double GMI)
   {
      this.GMI = GMI;
   }

   public java.lang.Double getNMI()
   {
      return this.NMI;
   }

   public void setNMI(java.lang.Double NMI)
   {
      this.NMI = NMI;
   }

   public java.lang.Double getNMIGMIRatio()
   {
      return this.NMIGMIRatio;
   }

   public void setNMIGMIRatio(java.lang.Double NMIGMIRatio)
   {
      this.NMIGMIRatio = NMIGMIRatio;
   }

   public java.lang.Integer getCibilScore()
   {
      return this.cibilScore;
   }

   public void setCibilScore(java.lang.Integer cibilScore)
   {
      this.cibilScore = cibilScore;
   }

   public java.lang.String getCreditGrade()
   {
      return this.creditGrade;
   }

   public void setCreditGrade(java.lang.String creditGrade)
   {
      this.creditGrade = creditGrade;
   }

   public java.lang.Integer getRGScore()
   {
      return this.RGScore;
   }

   public void setRGScore(java.lang.Integer RGScore)
   {
      this.RGScore = RGScore;
   }

   public java.lang.Integer getRiskScore()
   {
      return this.riskScore;
   }

   public void setRiskScore(java.lang.Integer riskScore)
   {
      this.riskScore = riskScore;
   }

   public java.lang.Integer getExistingTopupDisbursedMonths()
   {
      return this.existingTopupDisbursedMonths;
   }

   public void setExistingTopupDisbursedMonths(
         java.lang.Integer existingTopupDisbursedMonths)
   {
      this.existingTopupDisbursedMonths = existingTopupDisbursedMonths;
   }

   public java.lang.String getModeOfRepayment()
   {
      return this.modeOfRepayment;
   }

   public void setModeOfRepayment(java.lang.String modeOfRepayment)
   {
      this.modeOfRepayment = modeOfRepayment;
   }

   public java.lang.Integer getLoanTenure()
   {
      return this.loanTenure;
   }

   public void setLoanTenure(java.lang.Integer loanTenure)
   {
      this.loanTenure = loanTenure;
   }

   public java.lang.Integer getNoOfXpressCreditTopups()
   {
      return this.noOfXpressCreditTopups;
   }

   public void setNoOfXpressCreditTopups(
         java.lang.Integer noOfXpressCreditTopups)
   {
      this.noOfXpressCreditTopups = noOfXpressCreditTopups;
   }

   public java.lang.Boolean getXpressCreditTopupAllowed()
   {
      return this.xpressCreditTopupAllowed;
   }

   public void setXpressCreditTopupAllowed(
         java.lang.Boolean xpressCreditTopupAllowed)
   {
      this.xpressCreditTopupAllowed = xpressCreditTopupAllowed;
   }

   public java.lang.Integer getSalaryAccountPeriod()
   {
      return this.salaryAccountPeriod;
   }

   public void setSalaryAccountPeriod(java.lang.Integer salaryAccountPeriod)
   {
      this.salaryAccountPeriod = salaryAccountPeriod;
   }

   public java.lang.Boolean getIsDisbursementPeriodtoCheck()
   {
      return this.isDisbursementPeriodtoCheck;
   }

   public void setIsDisbursementPeriodtoCheck(
         java.lang.Boolean isDisbursementPeriodtoCheck)
   {
      this.isDisbursementPeriodtoCheck = isDisbursementPeriodtoCheck;
   }

   public java.lang.String getFacilityTypeOfLOan()
   {
      return this.facilityTypeOfLOan;
   }

   public void setFacilityTypeOfLOan(java.lang.String facilityTypeOfLOan)
   {
      this.facilityTypeOfLOan = facilityTypeOfLOan;
   }

   public java.lang.String getSalaryAccountMandatory()
   {
      return this.salaryAccountMandatory;
   }

   public void setSalaryAccountMandatory(java.lang.String salaryAccountMandatory)
   {
      this.salaryAccountMandatory = salaryAccountMandatory;
   }

   public java.lang.Double getRiskScoring()
   {
      return this.riskScoring;
   }

   public void setRiskScoring(java.lang.Double riskScoring)
   {
      this.riskScoring = riskScoring;
   }

   public java.lang.String getCibilAccountStatus()
   {
      return this.cibilAccountStatus;
   }

   public void setCibilAccountStatus(java.lang.String cibilAccountStatus)
   {
      this.cibilAccountStatus = cibilAccountStatus;
   }

   public java.lang.Integer getNumberOfEnquiresWithinMonth()
   {
      return this.numberOfEnquiresWithinMonth;
   }

   public void setNumberOfEnquiresWithinMonth(
         java.lang.Integer numberOfEnquiresWithinMonth)
   {
      this.numberOfEnquiresWithinMonth = numberOfEnquiresWithinMonth;
   }

   public java.lang.Integer getNumberOfOverdueLast24Months()
   {
      return this.numberOfOverdueLast24Months;
   }

   public void setNumberOfOverdueLast24Months(
         java.lang.Integer numberOfOverdueLast24Months)
   {
      this.numberOfOverdueLast24Months = numberOfOverdueLast24Months;
   }

   public java.lang.String getCIRApproval()
   {
      return this.CIRApproval;
   }

   public void setCIRApproval(java.lang.String CIRApproval)
   {
      this.CIRApproval = CIRApproval;
   }

   public boolean isDPDMoreThan30Days()
   {
      return this.DPDMoreThan30Days;
   }

   public void setDPDMoreThan30Days(boolean DPDMoreThan30Days)
   {
      this.DPDMoreThan30Days = DPDMoreThan30Days;
   }

   public java.lang.Integer getNoOfDPDOver60DaysinYears()
   {
      return this.noOfDPDOver60DaysinYears;
   }

   public void setNoOfDPDOver60DaysinYears(
         java.lang.Integer noOfDPDOver60DaysinYears)
   {
      this.noOfDPDOver60DaysinYears = noOfDPDOver60DaysinYears;
   }

   public java.lang.Double getElgibleLoanAmount()
   {
      return this.elgibleLoanAmount;
   }

   public void setElgibleLoanAmount(java.lang.Double elgibleLoanAmount)
   {
      this.elgibleLoanAmount = elgibleLoanAmount;
   }

   public java.lang.Double getExistingEMIAmount()
   {
      return this.existingEMIAmount;
   }

   public void setExistingEMIAmount(java.lang.Double existingEMIAmount)
   {
      this.existingEMIAmount = existingEMIAmount;
   }

   public java.lang.String getBorrowerLoanSanction()
   {
      return this.borrowerLoanSanction;
   }

   public void setBorrowerLoanSanction(java.lang.String borrowerLoanSanction)
   {
      this.borrowerLoanSanction = borrowerLoanSanction;
   }

   public java.lang.String getCreditRating()
   {
      return this.creditRating;
   }

   public void setCreditRating(java.lang.String creditRating)
   {
      this.creditRating = creditRating;
   }

   public java.lang.String getTypeOfCheckOff()
   {
      return this.typeOfCheckOff;
   }

   public void setTypeOfCheckOff(java.lang.String typeOfCheckOff)
   {
      this.typeOfCheckOff = typeOfCheckOff;
   }

   public java.lang.String getTypeofMCLR()
   {
      return this.typeofMCLR;
   }

   public void setTypeofMCLR(java.lang.String typeofMCLR)
   {
      this.typeofMCLR = typeofMCLR;
   }

   public java.lang.Character getSpread()
   {
      return this.spread;
   }

   public void setSpread(java.lang.Character spread)
   {
      this.spread = spread;
   }

   public java.lang.Double getInterestRate()
   {
      return this.interestRate;
   }

   public void setInterestRate(java.lang.Double interestRate)
   {
      this.interestRate = interestRate;
   }

   public java.lang.String getIsSBISalaryAccount()
   {
      return this.isSBISalaryAccount;
   }

   public void setIsSBISalaryAccount(java.lang.String isSBISalaryAccount)
   {
      this.isSBISalaryAccount = isSBISalaryAccount;
   }

   public FinancialInfo(java.lang.Double EMINMIRatio, java.lang.Double GMI,
         java.lang.Double NMI, java.lang.Double NMIGMIRatio,
         java.lang.Integer cibilScore, java.lang.String creditGrade,
         java.lang.Integer RGScore, java.lang.Integer riskScore,
         java.lang.Integer existingTopupDisbursedMonths,
         java.lang.String isSBISalaryAccount, java.lang.String modeOfRepayment,
         java.lang.Integer loanTenure, java.lang.Integer noOfXpressCreditTopups,
         java.lang.Boolean xpressCreditTopupAllowed,
         java.lang.Integer salaryAccountPeriod,
         java.lang.String salaryAccountMandatory,
         java.lang.Boolean isDisbursementPeriodtoCheck,
         java.lang.String facilityTypeOfLOan, java.lang.Double riskScoring,
         java.lang.String cibilAccountStatus,
         java.lang.Integer numberOfEnquiresWithinMonth,
         java.lang.Integer numberOfOverdueLast24Months,
         java.lang.String CIRApproval, boolean DPDMoreThan30Days,
         java.lang.Integer noOfDPDOver60DaysinYears,
         java.lang.Double elgibleLoanAmount, java.lang.Double existingEMIAmount,
         java.lang.String borrowerLoanSanction, java.lang.String creditRating,
         java.lang.String typeOfCheckOff, java.lang.String typeofMCLR,
         java.lang.Character spread, java.lang.Double interestRate)
   {
      this.EMINMIRatio = EMINMIRatio;
      this.GMI = GMI;
      this.NMI = NMI;
      this.NMIGMIRatio = NMIGMIRatio;
      this.cibilScore = cibilScore;
      this.creditGrade = creditGrade;
      this.RGScore = RGScore;
      this.riskScore = riskScore;
      this.existingTopupDisbursedMonths = existingTopupDisbursedMonths;
      this.isSBISalaryAccount = isSBISalaryAccount;
      this.modeOfRepayment = modeOfRepayment;
      this.loanTenure = loanTenure;
      this.noOfXpressCreditTopups = noOfXpressCreditTopups;
      this.xpressCreditTopupAllowed = xpressCreditTopupAllowed;
      this.salaryAccountPeriod = salaryAccountPeriod;
      this.salaryAccountMandatory = salaryAccountMandatory;
      this.isDisbursementPeriodtoCheck = isDisbursementPeriodtoCheck;
      this.facilityTypeOfLOan = facilityTypeOfLOan;
      this.riskScoring = riskScoring;
      this.cibilAccountStatus = cibilAccountStatus;
      this.numberOfEnquiresWithinMonth = numberOfEnquiresWithinMonth;
      this.numberOfOverdueLast24Months = numberOfOverdueLast24Months;
      this.CIRApproval = CIRApproval;
      this.DPDMoreThan30Days = DPDMoreThan30Days;
      this.noOfDPDOver60DaysinYears = noOfDPDOver60DaysinYears;
      this.elgibleLoanAmount = elgibleLoanAmount;
      this.existingEMIAmount = existingEMIAmount;
      this.borrowerLoanSanction = borrowerLoanSanction;
      this.creditRating = creditRating;
      this.typeOfCheckOff = typeOfCheckOff;
      this.typeofMCLR = typeofMCLR;
      this.spread = spread;
      this.interestRate = interestRate;
   }

}