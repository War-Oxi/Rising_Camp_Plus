import java.math.BigDecimal;

public class Main {
	public static void main(String[] args) {
		// 부동소수점 부정확함 오류 발생
		System.out.println(34.56789876 + 34.2234);

		// BigDecimal 사용. (변경 불가능 한 값. immutable Value)
		BigDecimal number1 = new BigDecimal("34.56789876");
		BigDecimal number2 = new BigDecimal("34.2234");

		System.out.println(number1.add(number2));
	}
}
