package domain;

public class Department {

    private String deptId;      //부서아이디
    private String deptName;    //부서명
    private String superDeptId;  //상위부서아이디
    private String superDeptName;  //상위부서명
    private String depth;           //부서레벨
    private String description;     //부서설명

    public String getDeptId() {
        return deptId;
    }

    public void setDeptId(String deptId) {
        this.deptId = deptId;
    }

    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    public String getSuperDeptId() {
        return superDeptId;
    }

    public void setSuperDeptId(String superDeptId) {
        this.superDeptId = superDeptId;
    }

    public String getSuperDeptName() {
        return superDeptName;
    }

    public void setSuperDeptName(String superDeptName) {
        this.superDeptName = superDeptName;
    }

    public String getDepth() {
        return depth;
    }

    public void setDepth(String depth) {
        this.depth = depth;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
