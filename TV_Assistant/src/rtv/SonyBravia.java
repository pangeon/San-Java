package rtv;

public class SonyBravia implements TV, Phone {

	private Program p = new Program(1);
	private int volume = 0;
	private int brightness = 50;
	
	@Override
	public void call(int number) {
		
	}

	@Override
	public void setProgram(Program p) {
		this.p = p;
		System.out.println(p.getClass());
	}

	@Override
	public void changeVolume(int delta) {
	    int volume1 = this.volume + delta;
	    if (volume1 < 0) this.volume = 0;
	    else if (volume1 > 100) this.volume = 100;
	    else this.volume = volume1;
	    System.out.println("g³oœnoœæ: " + volume);
	 }

	@Override
	public void changeBritness(int delta) {
		int brightness1 = this.brightness + delta;
		if (brightness1 < 0) {
			this.brightness = 0;
		} else if (brightness1 > 100) {
			this.brightness = 100;
		} else {
			this.brightness = brightness1;
		}
		System.out.println("jasnoœæ: " + brightness);
	}

}
