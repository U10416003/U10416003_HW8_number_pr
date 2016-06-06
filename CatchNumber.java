import java.math.BigDecimal;

public class CatchNumber{
	public static double add(double n1,double n2){
	
	//create BigDecimal b1
	BigDecimal b1 = new BigDecimal(Double.toString(n1));

	//create BigDecimal b2
	BigDecimal b2 = new BigDecimal(Double.toString(n2));

	//Add b1 and b2
	return b1.add(b2).doubleValue();
	}
}