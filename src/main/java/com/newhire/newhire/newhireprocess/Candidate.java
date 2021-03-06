package com.newhire.newhire.newhireprocess;

/**
 * This class was automatically generated by the data modeler tool.
 * $HASH(c6e98d89ebfc766a39a8d3d20910dbae)
 */
@org.kie.api.definition.type.Label(value = "Candidate")
public class Candidate  implements java.io.Serializable {

    static final long serialVersionUID = 1L;
    
    @org.kie.api.definition.type.Label(value = "BackgroundCheck")
    @org.kie.api.definition.type.Position(value = 0)
    private java.lang.Boolean backgroundCheck;
    
    @org.kie.api.definition.type.Label(value = "CandidateType")
    @org.kie.api.definition.type.Position(value = 1)
    private java.lang.String candidateType;
    
    @org.kie.api.definition.type.Label(value = "CheckType")
    @org.kie.api.definition.type.Position(value = 2)
    private java.lang.String checkType;
    
    @org.kie.api.definition.type.Label(value = "ComplianceReview")
    @org.kie.api.definition.type.Position(value = 3)
    private java.lang.Boolean complianceReview;
    
    @org.kie.api.definition.type.Label(value = "Department")
    @org.kie.api.definition.type.Position(value = 4)
    private java.lang.String department;
    
    @org.kie.api.definition.type.Label(value = "Name")
    @org.kie.api.definition.type.Position(value = 5)
    private java.lang.String name;
    
    @org.kie.api.definition.type.Label(value = "ReferenceInterview")
    @org.kie.api.definition.type.Position(value = 6)
    private java.lang.Boolean referenceInterview;

    public Candidate() {
    }

    public Candidate(java.lang.Boolean backgroundCheck, java.lang.String candidateType, java.lang.String checkType, java.lang.Boolean complianceReview, java.lang.String department, java.lang.String name, java.lang.Boolean referenceInterview) {
        this.backgroundCheck = backgroundCheck;
        this.candidateType = candidateType;
        this.checkType = checkType;
        this.complianceReview = complianceReview;
        this.department = department;
        this.name = name;
        this.referenceInterview = referenceInterview;
    }


    
    public java.lang.Boolean getBackgroundCheck() {
        return this.backgroundCheck;
    }

    public void setBackgroundCheck(java.lang.Boolean backgroundCheck) {
        this.backgroundCheck = backgroundCheck;
    }
    
    public java.lang.String getCandidateType() {
        return this.candidateType;
    }

    public void setCandidateType(java.lang.String candidateType) {
        this.candidateType = candidateType;
    }
    
    public java.lang.String getCheckType() {
        return this.checkType;
    }

    public void setCheckType(java.lang.String checkType) {
        this.checkType = checkType;
    }
    
    public java.lang.Boolean getComplianceReview() {
        return this.complianceReview;
    }

    public void setComplianceReview(java.lang.Boolean complianceReview) {
        this.complianceReview = complianceReview;
    }
    
    public java.lang.String getDepartment() {
        return this.department;
    }

    public void setDepartment(java.lang.String department) {
        this.department = department;
    }
    
    public java.lang.String getName() {
        return this.name;
    }

    public void setName(java.lang.String name) {
        this.name = name;
    }
    
    public java.lang.Boolean getReferenceInterview() {
        return this.referenceInterview;
    }

    public void setReferenceInterview(java.lang.Boolean referenceInterview) {
        this.referenceInterview = referenceInterview;
    }
}