package classi.smartphone;

public class Smartphone {

	private String marca, modello;
	private double prezzoDiLancio;
	private double numPollici;
	private double ram;
	private boolean touchscreen;

	public Smartphone() {
	}

	public Smartphone(String marca, String modello, double prezzoDiLancio, double numPollici, double ram,
			boolean touchscreen) {
		super();
		this.marca = marca;
		this.modello = modello;
		this.prezzoDiLancio = prezzoDiLancio;
		this.numPollici = numPollici;
		this.ram = ram;
		this.touchscreen = touchscreen;
	}

	public String getMarca() {
		return marca;
	}

	public String getModello() {
		return modello;
	}

	public double getPrezzoDiLancio() {
		return prezzoDiLancio;
	}

	public double getNumPollici() {
		return numPollici;
	}

	public double getRam() {
		return ram;
	}

	public boolean isTouchscreen() {
		return touchscreen;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public void setModello(String modello) {
		this.modello = modello;
	}

	public void setPrezzoDiLancio(double prezzoDiLancio) {
		this.prezzoDiLancio = prezzoDiLancio;
	}

	public void setNumPollici(double numPollici) {
		this.numPollici = numPollici;
	}

	public void setRam(double ram) {
		this.ram = ram;
	}

	public void setTouchscreen(boolean touchscreen) {
		this.touchscreen = touchscreen;
	}
	
	@Override
	public String toString() {
		return "Smartphone [marca=" + marca + ", modello=" + modello + ", prezzoDiLancio=" + prezzoDiLancio
				+ ", numPollici=" + numPollici + ", ram=" + ram + ", touchscreen=" + touchscreen + "]";
	}

	public String ottieniFasciaDiPrezzo(double prezzoDiLancio) {
		String fasciaAlta = "Fascia Alta";
		String fasciaMedia = "Fascia Media";
		String fasciaBassa = "Fascia Bassa";
		String fascia = "";
		
		if(prezzoDiLancio > 500) {System.out.println("smartophone con prezzo di fascia " + fasciaAlta);}
		if(prezzoDiLancio > 200 && prezzoDiLancio < 500) {System.out.println("smartophone con prezzo di fascia " +fasciaMedia);}
		if(prezzoDiLancio < 200) {System.out.println("smartophone con prezzo di fascia " + fasciaBassa);}
		
		return "";
	}
	
	public String ottieniTipologiaSmartphone(double numPollici) {
		
		String mini = "Mini";
		String normal = "Normal";
		String maxi = "Maxi";
		
		if(numPollici < 5) {System.out.println("smartophone con nun pollici " + mini);}
		if(numPollici > 5 && numPollici < 7) {System.out.println("smartophone con nun pollici " + normal);}
		if(numPollici > 7) {System.out.println("smartophone con nun pollici " + maxi);}
		
		return "";
		
	}

	
}
