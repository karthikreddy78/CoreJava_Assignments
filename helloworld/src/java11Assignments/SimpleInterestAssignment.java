package java11Assignments;

/*
 * There are a few limitations of using var in lambda.

For example, we cannot use var for some parameters and skip for others:

(var s1, s2) -> s1 + s2
Similarly, we cannot mix var with explicit types:

(var s1, String s2) -> s1 + s2
Finally, even though we can skip the parentheses in single parameter lambda:

s1 -> s1.toUpperCase()
we cannot skip them while using var:

var s1 -> s1.toUpperCase()
 */


interface SimpleInterest
{
	public double si(double p,double r,double t);
}
public class SimpleInterestAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		SimpleInterest s=(var p,var r,var t)->p*r*t/100;
		System.out.println(s.si(2000, 3, 1));
	}

}
