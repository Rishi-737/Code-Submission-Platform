class HardProblem extends Problem {
public HardProblem(String title) {
    super(title);
}
Boolean evaluate(String code) {
    return code.length() > 10;
}
}