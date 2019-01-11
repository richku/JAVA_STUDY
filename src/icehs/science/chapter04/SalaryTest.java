package icehs.science.chapter04;

public class SalaryTest {

	public static void main(String[] args) {
		int monthlySal = 1000000;
		int annualBonusBeforeTax = monthlySal * 20 / 100 * 4;
		int annualBonusAfterTax = annualBonusBeforeTax - annualBonusBeforeTax * 55 / 1000;
		
		int annualSal = monthlySal * 12;
		int annualSalAfterTax = annualSal - annualSal * 10 / 100;
		int annualIncome = annualSalAfterTax + annualBonusAfterTax;
		
		System.out.println("연봉 : " + annualSal +", 세후 연봉 : " + annualSalAfterTax);
		System.out.println("보너스 : " + annualBonusBeforeTax +", 세후 보너스 : " + annualBonusAfterTax);
		System.out.println("지급액 : " + annualIncome);
		
		

	}

}
