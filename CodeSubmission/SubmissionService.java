class SubmissionService {
public void submitCode(String code) {
    System.out.println("Code submitted: " + code);
}
public void submitCode(String code, String language) {
    System.out.println("Code submitted in " + language);
}
}