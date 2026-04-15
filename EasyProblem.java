class EasyProblem extends Problem {
public EasyProblem(String title) {
    super(title);
}
Boolean evaluate(String code) {
    return code.contains("return"); 
}
}

