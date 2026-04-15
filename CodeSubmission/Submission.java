class Submission {
private Integer submissionId;
private String code;
private Boolean result;

public Submission(Integer submissionId, String code) {
    this.submissionId = submissionId;
    this.code = code;
}
public void evaluate(Problem problem) {
    result = problem.evaluate(code);
}
public void display() {
    System.out.println("Submission ID: " + submissionId);
    System.out.println("Result: " + result);
}
}