package ereditarietà;

public class Cantante implements IInterfaccia {

	private String genereCanzone;

	@Override
	public void voce() {
		System.out.println("che bello cantare la mattina");

	}

	@Override
	public void gerereMusicale() {
		System.out.println("RAP");

	}

	public String getGenereCanzone() {
		return genereCanzone;
	}

	public void setGenereCanzone(String genereCanzone) {
		this.genereCanzone = genereCanzone;
	}

}
