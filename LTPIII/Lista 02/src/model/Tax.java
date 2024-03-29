package model;

public class Tax {
	private String abbr, name;
	private double aliquot;

	public Tax(String abbr, String name, double aliquot) throws Exception {
		setAbbr(abbr);
		setName(name);
		setAliquot(aliquot);
	}

	@Override
	public boolean equals(Object obj) {
		if (obj == null)
			return false;
		if (!(obj instanceof Tax))
			return false;

		Tax tax = (Tax) obj;

		return this.abbr.equals(tax.abbr);
	}

	public double calculate(Product p) {
		return p.getCostPrice() * aliquot;

	}
	
	public double calculateIss(Product p) {
		return (p.getCostPrice() + (p.getProfit() * p.getCostPrice())) * aliquot;
	}
	
	private void setAliquot(double aliquot) {
		this.aliquot = aliquot / 100;
	}

	private void setName(String name) throws Exception {

		if (name == null || name.equals(""))
			throw new Exception("Nome Inválido!");

		this.name = name;
	}

	private void setAbbr(String abbr) throws Exception {

		if (abbr == null || abbr.equals(""))
			throw new Exception("Sigla Inválida!");

		this.abbr = abbr;
	}
	
	public void updateAliquot(double newAliquot) {
	    setAliquot(newAliquot);
	}

	public String getAbbr() {
		return abbr;
	}
	
	


}
