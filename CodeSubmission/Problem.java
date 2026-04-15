abstract class Problem {
protected String title;
public Problem(String title) {
    this.title = title;
}
abstract Boolean evaluate(String code); 
}
